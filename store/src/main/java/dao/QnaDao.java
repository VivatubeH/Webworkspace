package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionUtils;
import vo.Qna;
import vo.QnaCategory;
import vo.User;

public class QnaDao {
	
	public Qna getQnaByNo(int no) throws SQLException {
		String sql = """
			select A.qna_no
					, A.qna_title
					, A.qna_question
					, A.qna_answer
					, A.qna_status
					, A.qna_created_date
					, A.qna_updated_date
					, A.qna_answered_date
					, B.cat_no
					, B.cat_name
					, A.user_no
					, A.qna_filename
			from store_qna_boards A, store_qna_categories B
			where A.qna_no = ?
			and A.cat_no = B.cat_no
		""";
		
		Qna qna = null;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			qna = new Qna();
			
			qna.setNo(rs.getInt("qna_no"));
			qna.setTitle(rs.getString("qna_title"));
			qna.setQuestion(rs.getString("qna_question"));
			qna.setAnswer(rs.getString("qna_answer"));
			qna.setStatus(rs.getString("qna_status"));
			qna.setCreatedDate(rs.getDate("qna_created_date"));
			qna.setUpdatedDate(rs.getDate("qna_updated_date"));
			qna.setAnsweredDate(rs.getDate("qna_answered_date"));
			
			QnaCategory cat = new QnaCategory();
			cat.setNo(rs.getInt("cat_no"));
			cat.setName(rs.getString("cat_name"));
			qna.setCategory(cat);
			
			User user = new User();
			user.setNo(rs.getInt("user_no"));
			qna.setUser(user);
			
			qna.setFilename(rs.getString("qna_filename"));
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		
		return qna;
	}
	
	public List<Qna> getQnaListByUserNo(int userNo, int begin, int end) throws SQLException {
		String sql = """
			select *
			from (
					select row_number() over (order by qna_no desc) rn
							, qna_no
							, qna_title
							, qna_status
							, qna_created_date
							, qna_answered_date
							, qna_filename
					from store_qna_boards
					where user_no = ?
					and qna_deleted = 'N'
			)
			where rn between ? and ?
		""";
		
		List<Qna> qnaList = new ArrayList<Qna>();
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, userNo);
		pstmt.setInt(2, begin);
		pstmt.setInt(3, end);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Qna qna = new Qna();
			qna.setNo(rs.getInt("qna_no"));
			qna.setTitle(rs.getString("qna_title"));
			qna.setStatus(rs.getString("qna_status"));
			qna.setCreatedDate(rs.getDate("qna_created_date"));
			qna.setAnsweredDate(rs.getDate("qna_answered_date"));
			qna.setFilename(rs.getString("qna_filename"));
			qnaList.add(qna);
		}
		rs.close();
		pstmt.close();
		con.close();		
		
		return qnaList;
	}
	
	/**
	 * 사용자번호를 전달받아서 해당 사용자가 작성한 1:1문의 갯수를 반환한다.
	 * @param userNo 사용자 번호
	 * @return 문의 갯수
	 * @throws SQLException
	 */
	public int getTotalRowsByUserNo(int userNo) throws SQLException {
		String sql = """
			select count(*) cnt
			from store_qna_boards
			where user_no = ?
			and qna_deleted = 'N'
		""";
		
		int totalRows = 0;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, userNo);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		totalRows = rs.getInt("cnt");
		
		rs.close();
		pstmt.close();
		con.close();
		
		return totalRows;
	}

	public List<QnaCategory> getAllQnaCategories() throws SQLException {
		String sql = """
			select *
			from store_qna_categories
			order by cat_no
		""";
		
		List<QnaCategory> categories = new ArrayList<QnaCategory>();
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			QnaCategory cat = new QnaCategory();
			cat.setNo(rs.getInt("cat_no"));
			cat.setName(rs.getString("cat_name"));
			
			categories.add(cat);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return categories;
	}
	
	public void insertQna(Qna qna) throws SQLException {
		String sql = """
			insert into store_qna_boards
			(qna_no, cat_no, qna_title, qna_question, user_no, qna_filename)
			values
			(store_qna_seq.nextval, ?,?,?,?,?)	
		""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, qna.getCategory().getNo());
		pstmt.setString(2, qna.getTitle());
		pstmt.setString(3, qna.getQuestion());
		pstmt.setInt(4, qna.getUser().getNo());
		pstmt.setString(5, qna.getFilename());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		
	}
}
