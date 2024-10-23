package hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hr.utils.ConnectionUtils;
import hr.vo.Dept;
import hr.vo.Emp;
import hr.vo.EmpDetail;
import hr.vo.EmpSalary;

public class EmpDao {

	public EmpSalary getEmpSalaryById(int empId) throws SQLException {
		String sql = """
				select *
				from emp_salary_view
				where emp_id = ?
			""";
			
		EmpSalary empSalary = null;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, empId);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			empSalary = new EmpSalary();
			
			empSalary.setId(rs.getInt("emp_id"));
			empSalary.setSalary(rs.getInt("salary"));
			empSalary.setAnnualSalary(rs.getInt("annual_salary"));
			empSalary.setCommissionPct(rs.getDouble("commission_pct"));
			empSalary.setGrade(rs.getString("grade"));
			
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return empSalary;
	}
	/**
	 * 직원아이디를 전달받아서 직원정보를 조회하고 반환한다.
	 * @param empId 조회할 직원의 아이디
	 * @return 직원정보
	 * @throws SQLException
	 */
	public Emp getEmployeeById(int empId) throws SQLException {
		String sql = """
			select *
			from employees
			where employee_id = ?
			""";
		Emp emp = null;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, empId);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			emp = new Emp();
			
			emp.setId(rs.getInt("EMPLOYEE_ID"));
			emp.setFirstName(rs.getString("FIRST_NAME"));
			emp.setLastName(rs.getString("LAST_NAME"));
			emp.setEmail(rs.getString("EMAIL"));
			emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			emp.setHireDate(rs.getDate("HIRE_DATE"));
			emp.setJobId(rs.getString("JOB_ID"));
			emp.setSalary(rs.getDouble("SALARY"));
			emp.setCommissonPct(rs.getDouble("COMMISSION_PCT"));
			emp.setManagerId(rs.getInt("MANAGER_ID"));
			emp.setDeptId(rs.getInt("DEPARTMENT_ID"));
				
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return emp;
	}
	/**
	 * 모든 직원정보를 조회해서 목록으로 반환한다.
	 * @return 모든 직원정보 목록
	 * @throws SQLException
	 */
	public List<Emp> getAllEmployees() throws SQLException {
		String sql = """
				SELECT *
				FROM EMPLOYEES
				ORDER BY EMPLOYEE_ID ASC
			""";
		
		List<Emp> employees = new ArrayList<Emp>();
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Emp emp = new Emp();
			emp.setId(rs.getInt("EMPLOYEE_ID"));
			emp.setFirstName(rs.getString("FIRST_NAME"));
			emp.setLastName(rs.getString("LAST_NAME"));
			emp.setEmail(rs.getString("EMAIL"));
			emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			emp.setHireDate(rs.getDate("HIRE_DATE"));
			emp.setJobId(rs.getString("JOB_ID"));
			emp.setSalary(rs.getDouble("SALARY"));
			emp.setCommissonPct(rs.getDouble("COMMISSION_PCT"));
			emp.setManagerId(rs.getInt("MANAGER_ID"));
			emp.setDeptId(rs.getInt("DEPARTMENT_ID"));
			
			employees.add(emp);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return employees;
	}
	/**
	 * 부서아이디를 전달받아서 소속부서가 일치하는 직원정보를 조회해서 반환한다.
	 * @param deptId 조회할 소속 부서아이디
	 * @return 해당 부서에 소속된 직원 목록
	 * @throws SQLException
	 */
	public List<Emp> getEmployeesByDeptId(int deptId) throws SQLException {
		List<Emp> employees = new ArrayList<Emp>();
		
		String sql = """
				SELECT *
				FROM EMPLOYEES
				WHERE DEPARTMENT_ID = ?
				order by employee_id asc
				""";
		// 연결하기
		Connection con = ConnectionUtils.getConnection();
		// 쿼리문 준비하기
		PreparedStatement pstmt = con.prepareStatement(sql);
		// 바인딩하기
		pstmt.setInt(1, deptId);
		// 쿼리 실행하고 결과집합 얻기
		ResultSet rs = pstmt.executeQuery(); 
		// 결과 집합에서 데이터 뽑아내기
		while(rs.next()) {
			Emp emp = new Emp();
			emp.setId(rs.getInt("EMPLOYEE_ID"));
			emp.setFirstName(rs.getString("FIRST_NAME"));
			emp.setLastName(rs.getString("LAST_NAME"));
			emp.setEmail(rs.getString("EMAIL"));
			emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			emp.setHireDate(rs.getDate("HIRE_DATE"));
			emp.setJobId(rs.getString("JOB_ID"));
			emp.setSalary(rs.getDouble("SALARY"));
			emp.setCommissonPct(rs.getDouble("COMMISSION_PCT"));
			emp.setManagerId(rs.getInt("MANAGER_ID"));
			emp.setDeptId(rs.getInt("DEPARTMENT_ID"));
			
			employees.add(emp);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return employees;
	}
	
	public List<EmpDetail> getEmployeeDetailsById(Dept id) throws SQLException {
		List<EmpDetail> empDetails = new ArrayList<EmpDetail>();
		String sql = """
				SELECT E.EMPLOYEE_ID id
			  , E.FIRST_NAME || ' ' || E.LAST_NAME name
              , E.EMAIL email
              , E.PHONE_NUMBER phoneNumber
              , E.SALARY salary
              , E.COMMISSION_PCT commissionPct
              , E.JOB_ID jobId
              , E.HIRE_DATE hireDate
              , D.DEPARTMENT_ID deptId
              , D.DEPARTMENT_NAME deptName
              , M.FIRST_NAME || ' ' || M.LAST_NAME managerName
              , L.CITY city
			  , E.SALARY * 12 + E.SALARY*12*NVL(E.COMMISSION_PCT, 0) annualSalary
			  , G.SAL_GRADE salGrade
			 FROM EMPLOYEES E
			 , DEPARTMENTS D
			 , EMPLOYEES M
			 , LOCATIONS L
			 , SALARY_GRADES G
			 WHERE E.EMPLOYEE_ID = ?
				AND
				E.DEPARTMENT_ID = D.DEPARTMENT_ID(+)
				AND
				D.MANAGER_ID = M.EMPLOYEE_ID(+)
				AND
				D.LOCATION_ID = L.LOCATION_ID(+)
				AND
				E.SALARY BETWEEN G.MIN_SALARY AND G.MAX_SALARY
				ORDER BY E.EMPLOYEE_ID, D.DEPARTMENT_ID;
				""";
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			EmpDetail emp = new EmpDetail();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setEmail(rs.getString("email"));
			emp.setPhoneNumber(rs.getString("phoneNumber"));
			emp.setSalary(rs.getInt("salary"));
			emp.setCommissionPct(rs.getDouble("commissionPct"));
			emp.setJobId(rs.getString("jobId"));
			emp.setHireDate(rs.getDate("hireDate"));
			emp.setDeptId(rs.getInt("deptId"));
			emp.setDeptName(rs.getString("deptName"));
			emp.setManagerName(rs.getString("managerName"));
			emp.setCity(rs.getString("city"));
			emp.setAnnualSalary(rs.getInt("annualSalary"));
			emp.setSalGrade(rs.getString("salGrade"));
			empDetails.add(emp);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return empDetails;
	}
}

