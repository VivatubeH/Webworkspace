package vo;

import java.util.Date;
import java.util.List;

public class Product {

	private int no;
	private String name;
	private int price;
	private int discountPrice;
	private int stock;
	private String description;
	private Date createdDate;
	private Date updatedDate;
	private Category category;
	private Company company;
	private Status status;
	private List<Benefit> benefits;
	private String filename;
	
	public Product() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}
	
	/**
	 * 텍스트의 줄바꿈문자를 br 태그로 변환해서 반환하는 메소드다.
	 * @return br태그가 포함된 문자열
	 */
	public String getHtmlDescription() {
		return description.replace(System.lineSeparator(), "<br>");
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Benefit> getBenefits() {
		return benefits;
	}

	public void setBenefits(List<Benefit> benefits) {
		this.benefits = benefits;
	}
	
	public boolean hasCategory(int categoryNo) {
		return categoryNo == category.getNo();
	}
	
	public boolean hasCompany(int companyNo) {
		return companyNo == company.getNo();
	}
	
	public boolean hasStatus(int statusNo) {
		return statusNo == status.getNo();
	}
	
	public boolean hasBenefit(int benefitNo) {
		for (Benefit benefit : benefits) {
			if (benefit.getNo() == benefitNo) {
				return true;
			}
		}
		return false;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", price=" + price + ", discountPrice=" + discountPrice
				+ ", stock=" + stock + ", description=" + description + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", category=" + category + ", company=" + company + ", status="
				+ status + ", benefits=" + benefits + ", filename=" + filename + "]";
	}
	
}
