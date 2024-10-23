package vo;

import java.util.Date;

public class Qna {

	private int no;
	private QnaCategory category;
	private String title;
	private String question;
	private String answer;
	private String status;
	private String deleted;
	private Date createdDate;
	private Date updatedDate;
	private Date answeredDate;
	private User user;
	private String filename;
	
	public Qna() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public QnaCategory getCategory() {
		return category;
	}

	public void setCategory(QnaCategory category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getAnsweredDate() {
		return answeredDate;
	}

	public void setAnsweredDate(Date answeredDate) {
		this.answeredDate = answeredDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFilename() {
		return filename;
	}

	public String getOriginalFilename() {
		return filename.substring(13);
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "Qna [no=" + no + ", category=" + category + ", title=" + title + ", question=" + question + ", answer="
				+ answer + ", status=" + status + ", deleted=" + deleted + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", answeredDate=" + answeredDate + ", user=" + user + ", filename="
				+ filename + "]";
	}
	
}
