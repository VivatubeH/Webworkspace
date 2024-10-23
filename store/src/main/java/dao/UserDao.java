package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.ConnectionUtils;
import vo.User;

public class UserDao {

	/**
	 * 아이디를 전달받아서 사용자정보를 조회해서 반환한다.
	 * @param id 조회할 사용자 아이디
	 * @return 사용자정보, null이 반환될 수 있다.
	 * @throws SQLException
	 */
	public User getUserById(String id) throws SQLException {
		String sql ="""
			select *
			from store_users
			where user_id = ?	
		""" ;
		
		User user = null;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
//			user = new User();
//			user.setNo(rs.getInt("user_no"));
//			user.setId(rs.getString("user_id"));
//			user.setPassword(rs.getString("user_password"));
//			user.setName(rs.getString("user_name"));
//			user.setEmail(rs.getString("user_email"));
//			user.setDisabled(rs.getString("user_disabled"));
//			user.setCreatedDate(rs.getDate("user_created_date"));
//			user.setUpdatedDate(rs.getDate("user_updated_date"));
			
			user = User.builder()
					.no(rs.getInt("user_no"))
					.id(rs.getString("user_id"))
					.password(rs.getString("user_password"))
					.name(rs.getString("user_name"))
					.email(rs.getString("user_email"))
					.disabled(rs.getString("user_disabled"))
					.createdDate(rs.getDate("user_created_date"))
					.updatedDate(rs.getDate("user_updated_date"))
					.build();
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return user;
	}
	
	/**
	 * 신규 사용자정보를 전달받아서 데이터베이스에 저장시킨다.
	 * @param user 신규 사용자 정보
	 * @throws SQLException
	 */
	public void insertUser(User user) throws SQLException {
		String sql = """
			insert into store_users
			(user_no
			 , user_id
			 , user_password
			 , user_name
			 , user_email)
			values
			(store_users_seq.nextval, ?,?,?,?)	
		""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getEmail());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();		
	}
}






