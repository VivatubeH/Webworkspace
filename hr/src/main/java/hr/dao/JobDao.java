package hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hr.utils.ConnectionUtils;
import hr.vo.Job;

public class JobDao {

	public List<Job> getAllJobs() throws SQLException {
		String sql = """
			SELECT *
			FROM JOBS
			ORDER BY JOB_ID	
		""";
		
		List<Job> jobs = new ArrayList<Job>();
		// 코딩하기
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Job job = new Job();
			job.setId(rs.getString("JOB_ID"));
			job.setTitle(rs.getString("JOB_TITLE"));
			job.setMinSalary(rs.getInt("MIN_SALARY"));
			job.setMaxSalary(rs.getInt("MAX_SALARY"));
			
			jobs.add(job);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return jobs;
	}
}
