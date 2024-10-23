package hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import hr.utils.ConnectionUtils;
import hr.vo.Dept;
import hr.vo.DeptDetail;
import hr.vo.DeptList;

public class DeptDao {
	
	public void updateDept(Dept dept) throws SQLException {
		String sql = """
				UPDATE DEPARTMENTS
				SET	
					DEPARTMENT_NAME = ?,
					MANAGER_ID = ?,
					LOCATION_ID = ?
				WHERE 
					DEPARTMENT_ID = ?
				""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dept.getName());
		pstmt.setInt(2, dept.getManagerId());
		pstmt.setInt(3, dept.getLocationId());
		pstmt.setInt(4, dept.getId());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
	
	public Dept getDeptById(int deptId) throws SQLException {
		String sql = """
				SELECT *
				FROM DEPARTMENTS
				WHERE DEPARTMENT_ID = ?
				""";
		
		Dept dept = null; 
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, deptId);
		pstmt.executeQuery();
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			dept = new Dept();
			dept.setId(rs.getInt("DEPARTMENT_ID"));
			dept.setName(rs.getString("DEPARTMENT_NAME"));
			dept.setManagerId(rs.getInt("MANAGER_ID"));
			dept.setLocationId(rs.getInt("LOCATION_ID"));
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return dept;
	}
	/**
	 * 새 부서정보가 있는 Dept 객체를 전달받아서 저장시킨다.
	 * @param dept 새 부서정보
	 * @throws SQLException
	 */
	public void insertDept(Dept dept) throws SQLException {
		String sql = """
				INSERT INTO DEPARTMENTS
				(DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
				VALUES
				(DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)
			""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dept.getName());
		pstmt.setInt(2, dept.getManagerId());
		pstmt.setInt(3, dept.getLocationId());
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();  
	}
	/**
	 * 부서아이디를 전달받아서 해당 부서의 상세정보를 반환한다.
	 * @param deptId 조회할 부서아이디
	 * @return 부서상세정보
	 * @throws SQLException
	 */
	public Optional<DeptDetail> getDeptDetail(int deptId) throws SQLException {
		 String sql = """
		 		SELECT *
		 		FROM DEPT_DETAIL_VIEW
		 		WHERE DEPARTMENT_ID = ?
		 		""";
		 
		 DeptDetail dept = null;
		 // 연결
		 Connection con = ConnectionUtils.getConnection();
		 // 쿼리 준비
		 PreparedStatement pstmt = con.prepareStatement(sql);
		 // 바인딩
		 pstmt.setInt(1, deptId);
		 // 결과 얻기
		 ResultSet rs = pstmt.executeQuery();
		 while(rs.next()) {
			 dept = new DeptDetail();
			 dept.setId(rs.getInt("department_id"));
			 dept.setName(rs.getString("department_name"));
			 dept.setManagerId(rs.getInt("manager_id"));
			 dept.setManagerName(rs.getString("first_name"));
			 dept.setCity(rs.getString("city"));
			 dept.setCountry(rs.getString("country_name"));
		 }
		 rs.close();
		 pstmt.close();
		 con.close();
		 
		 return Optional.ofNullable(dept);
	}
	
	/**
	 * 모든 부서정보를 반환한다.
	 * @return 부서목록
	 * @throws SQLException
	 */
	
	public List<DeptList> findAllDepts() throws SQLException {
		String sql = """
			SELECT DEPARTMENT_ID
				, DEPARTMENT_NAME
				, FIRST_NAME
				, CITY
				, CNT
				FROM DEPT_DETAIL_VIEW
				WHERE MANAGER_ID IS NOT NULL
				ORDER BY DEPARTMENT_ID ASC	
		""";
		
		List<DeptList> depts = new ArrayList<DeptList>();
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			DeptList vo = new DeptList();
			vo.setId(rs.getInt("department_id"));
			vo.setName(rs.getString("department_name"));
			vo.setManagerName(rs.getString("first_name"));
			vo.setCity(rs.getString("city"));
			vo.setCnt(rs.getInt("cnt"));
			
			depts.add(vo);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return depts;
	}
	
}
