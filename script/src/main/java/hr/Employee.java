package hr;

import java.util.Date;

public class Employee {

	private int id;
	private String firstName;
	private String jobId;
	private double salary;
	private Date hireDate;

	public Employee(int id, String firstName, String jobId, double salary, Date hireDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.jobId = jobId;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
}
