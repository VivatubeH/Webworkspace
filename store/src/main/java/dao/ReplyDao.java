package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionUtils;
import vo.Board;
import vo.Reply;
import vo.User;

public class ReplyDao {
	
	public void deleteReplyByNo(int replyNo) throws SQLException {
		String sql = """
			delete from store_board_replyes
			where reply_no = ?	
		""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, replyNo);
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
	
	public Reply getReplyByNo(int replyNo) throws SQLException {
		String sql = """
			select *
			from store_board_replyes
			where reply_no = ?
		""";
		
		Reply reply = null;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, replyNo);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			reply = new Reply();
			reply.setNo(rs.getInt("reply_no"));
			reply.setContent(rs.getString("reply_content"));
			reply.setCreatedDate(rs.getDate("reply_created_date"));
			reply.setUpdatedDate(rs.getDate("reply_updated_date"));
			
			Board board = new Board();
			board.setNo(rs.getInt("board_no"));
			reply.setBoard(board);

			User user = new User();
			user.setNo(rs.getInt("user_no"));
			reply.setUser(user);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return reply;
	}
	
	/**
	 * 게시글번호를 전달받아서 해당 게시글의 모든 댓글을 조회해서 반환한다.
	 * @param boardNo 게시글번호
	 * @return 댓글 목록
	 * @throws SQLException
	 */
	public List<Reply> getReplyListByBoardNo(int boardNo) throws SQLException {
		String sql = """
			select A.reply_no
					, A.reply_content
					, A.reply_created_date
					, B.user_no
					, B.user_name
			from store_board_replyes A, store_users B
			where A.board_no = ?
					and A.user_no = B.user_no
			order by A.reply_no asc
		""";
		
		List<Reply> replyList = new ArrayList<Reply>();
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, boardNo);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Reply reply = new Reply();
			reply.setNo(rs.getInt("reply_no"));
			reply.setContent(rs.getString("reply_content"));
			reply.setCreatedDate(rs.getDate("reply_created_date"));
			
			User user = new User();
			user.setNo(rs.getInt("user_no"));
			user.setName(rs.getString("user_name"));
			reply.setUser(user);
			
			replyList.add(reply);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return replyList;
	}

	/**
	 * 새 댓글정보를 전달받아서 테이블에 저장시킨다.
	 * @param reply 새 댓글정보
	 * @throws SQLException
	 */
	public void insertReply(Reply reply) throws SQLException {
		String sql = """
			insert into store_board_replyes
			(reply_no, reply_content, board_no, user_no)
			values
			(STORE_REPLIES_SEQ.nextval, ?, ?, ?)
		""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, reply.getContent());
		pstmt.setInt(2, reply.getBoard().getNo());
		pstmt.setInt(3, reply.getUser().getNo());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
}
