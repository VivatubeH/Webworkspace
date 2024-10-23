package hr.vo;

import java.util.Date;

public class EmpDetail {
	// 직원 아이디
	private int id;
	// 직원 이름
	private String name;
	// 직원 이메일
	private String email;
	// 직원 전화번호
	private String phoneNumber;
	// 직원 급여
	private int salary;
	// 직원 커미션
	private double commissionPct;
	// 직종 
	private String jobId;
	// 입사일
	private Date hireDate;
	// 소속 부서 아이디
	private int deptId;
	// 소속 부서명
	private String deptName;
	// 부서 관리자 이름
	private String managerName;
	// 소재지 도시명
	private String city;
	// 급여 등급
	private String salGrade;
	// 연봉
	private int annualSalary;
	
	public EmpDetail() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalGrade() {
		return salGrade;
	}

	public void setSalGrade(String salGrade) {
		this.salGrade = salGrade;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
}
