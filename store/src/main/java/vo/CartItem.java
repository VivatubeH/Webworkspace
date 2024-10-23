package vo;

import java.util.Date;

public class CartItem {

	private int no;
	private User user;
	private Product product;
	private int amount;
	private int price;
	private Date createdDate;
	private Date updatedDate;
	
	public CartItem() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	@Override
	public String toString() {
		return "CartItem [no=" + no + ", user=" + user + ", product=" + product + ", amount=" + amount + ", price="
				+ price + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
