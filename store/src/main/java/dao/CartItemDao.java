package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionUtils;
import vo.CartItem;
import vo.Product;

public class CartItemDao {
	
	public void updateCartItem(CartItem item) throws SQLException {
		String sql = """
				update store_cart_items
				set
					item_amount = ?
					, item_updated_date = sysdate
				where item_no = ?
			""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, item.getAmount());
		pstmt.setInt(2, item.getNo());
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}

	public CartItem getCartItemByUserNoAndProductNo(int userNo, int productNo) throws SQLException {
		String sql = """
				select *
				from store_cart_items
				where user_no = ? and product_no = ?
			""";
		
		CartItem item = null;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, userNo);
		pstmt.setInt(2, productNo);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			item = new CartItem();
			item.setNo(rs.getInt("item_no"));
			item.setAmount(rs.getInt("item_amount"));
			item.setPrice(rs.getInt("item_price"));
			
			Product product = new Product();
			product.setNo(rs.getInt("product_no"));
			item.setProduct(product);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return item;
	}
	/**
	 * 장바구니 아이템정보를 전달받아서 테이블에 추가한다.
	 * @param item	새 장바구니 아이템 정보
	 * @throws SQLException
	 */
	public void insertCartItem(CartItem item) throws SQLException {
		String sql = """
				insert into store_cart_items
				(item_no, user_no, product_no, item_amount, item_price)
				values
				(store_carts_seq.nextval, ?, ?, ?, ?)
			""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, item.getUser().getNo());
		pstmt.setInt(2, item.getProduct().getNo());
		pstmt.setInt(3, item.getAmount());
		pstmt.setInt(4, item.getPrice());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}	
	
	/**
	 * 사용자 번호를 전달받아서 해당 사용자의 모든 장바구니 아이템정보를 
	 * 조회해서 반환한다.
	 * @param userNo 사용자번호
	 * @return 해당 사용자의 장바구니 아이템 목록
	 * @throws SQLException
	 */
	public List<CartItem> getCartItemsByUserNo(int userNo) throws SQLException {
		String sql = """
			select A.item_no
					, B.product_no
					, B.product_name
					, A.item_amount
					, A.item_price
			from store_cart_items A, store_products B
			where A.user_no = ?
			and A.product_no = B.product_no
			order by item_no asc
		""";
		
		List<CartItem> items = new ArrayList<CartItem>();
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, userNo);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			CartItem item = new CartItem();
			item.setNo(rs.getInt("item_no"));
			item.setAmount(rs.getInt("item_amount"));
			item.setPrice(rs.getInt("item_price"));
			
			Product product = new Product();
			product.setNo(rs.getInt("product_no"));
			product.setName(rs.getString("product_name"));
			item.setProduct(product);
			
			items.add(item);
		}
		return items;
	}
	
	/**
	 * 장바구니 아이템정보를 전달받아서 해당 아이템을 삭제한다.
	 * @param itemNo 삭제할 장바구니 아이템번호
	 * @throws SQLException
	 */
	public void deleteCartItemByNo(int itemNo) throws SQLException {
		String sql = """
				delete from store_cart_items
				where item_no = ?
		""";
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, itemNo);
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
}
