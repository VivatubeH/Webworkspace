package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionUtils;
import vo.Benefit;
import vo.Category;
import vo.Company;
import vo.Product;
import vo.ProductBenefit;
import vo.Status;

public class ProductDao {

	/**
	 * 새 상품등록에 필요한 상품일련번호를 조회한다.
	 * @return 새 상품일련번호
	 * @throws SQLException
	 */
	public int getSequence() throws SQLException {
		String sql = """
			select STORE_PRODUCTS_SEQ.nextval
			from dual
		""";
		
		int productNo = 0;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			productNo = rs.getInt(1);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return productNo;
	}
	
	/**
	 * 새 상품정보를 전달받아서 테이블에 저장시킨다.
	 * @param product 새 상품정보
	 * @throws SQLException
	 */
	public void insertProduct(Product product) throws SQLException {
		String sql = """
			insert into store_products
			(product_no
			 , product_name
			 , product_price
			 , product_discount_price
			 , product_stock
			 , product_description
			 , product_category_no
			 , product_company_no
			 , product_status_no
			 , product_filename)
			values
			(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)	
		""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, product.getNo());
		pstmt.setString(2, product.getName());
		pstmt.setInt(3, product.getPrice());
		pstmt.setInt(4, product.getDiscountPrice());
		pstmt.setInt(5, product.getStock());
		pstmt.setString(6, product.getDescription());
		pstmt.setInt(7, product.getCategory().getNo());
		pstmt.setInt(8, product.getCompany().getNo());
		pstmt.setInt(9, product.getStatus().getNo());
		pstmt.setString(10, product.getFilename());
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
	
	/**
	 * 상품 추가 혜택정보를 전달받아서 테이블에 저장시킨다.
	 * @param productBenefit 상품 추가혜택정보(상품번호, 혜택번호 포함)
	 * @throws SQLException
	 */
	public void insertProductBenefit(ProductBenefit productBenefit) throws SQLException {
		String sql = """
			insert into store_product_benefits
			(product_no
			, benefit_no)
			values
			(?, ?)
		""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, productBenefit.getProductNo());
		pstmt.setInt(2, productBenefit.getBenefitNo());
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
	
	/**
	 * 전체 상품갯수를 조회해서 반환한다.
	 * @return 상품 갯수
	 * @throws SQLException
	 */
	public int getTotalRows() throws SQLException {
		String sql = """
			select count(*)
			from store_products				
		""";
		
		int totalRows = 0;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		totalRows = rs.getInt(1);
		
		rs.close();
		pstmt.close();
		con.close();
		
		return totalRows;
	}
	
	/**
	 * 조회범위를 전달받아서 범위에 맞는 상품목록을 조회해서 반환한다.
	 * @param begin 조회시작 일련번호
	 * @param end 조회끝 일련번호
	 * @return 조회범위에 맞는 상품정보 목록
	 * @throws SQLException
	 */
	public List<Product> getProducts(int begin, int end) throws SQLException {
		String sql = """
			select *
			from (
					select row_number() over (order by product_no desc) rownumber 
					    , p.product_no
						, p.product_name
						, p.product_price
						, p.product_discount_price
						, s.product_status_no
						, s.product_status_name
						, pc.product_company_no
                        , pc.product_company_name
                        , pa.product_category_no
                        , pa.product_category_name
					from store_products p, store_product_status s, store_product_companies pc, store_product_categories pa
					where p.product_status_no = s.product_status_no
                    and
                    p.product_company_no = pc.product_company_no
                    and
                    p.product_category_no = pa.product_category_no
			)
			where rownumber between ? and ?					
		""";
		
		List<Product> products = new ArrayList<>();
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, begin);
		pstmt.setInt(2, end);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Product product = new Product();
			product.setNo(rs.getInt("product_no"));
			product.setName(rs.getString("product_name"));
			product.setPrice(rs.getInt("product_price"));
			product.setDiscountPrice(rs.getInt("product_discount_price"));
			
			Status status = new Status();
			status.setNo(rs.getInt("product_status_no"));
			status.setName(rs.getString("product_status_name"));
			product.setStatus(status);
			
			Company company = new Company();
			company.setNo(rs.getInt("product_company_no"));
			company.setName(rs.getString("product_company_name"));
			product.setCompany(company);
			
			Category category = new Category();
			category.setNo(rs.getInt("product_category_no"));
			category.setName(rs.getString("product_category_name"));
			product.setCategory(category);
			
			products.add(product);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return products;
	}
	
	/**
	 * 상품번호를 전달받아서 해당 상품의 상세정보를 조회해서 반환한다.
	 * @param productNo 조회할 상품번호
	 * @return 상품 상세정보
	 * @throws SQLException
	 */
	public Product getProductByNo(int productNo) throws SQLException {
		String sql = """
			select p.product_no
			    , p.product_name
			    , p.product_price
			    , p.product_discount_price
			    , p.product_stock
			    , p.product_description
			    , p.product_created_date
			    , p.product_updated_date
			    , ca.product_category_no
			    , ca.product_category_name
			    , co.product_company_no
			    , co.product_company_name
			    , st.product_status_no
			    , st.product_status_name
			    , p.product_filename
			from store_products p
			    , store_product_categories ca
			    , store_product_companies co
			    , store_product_status st
			where p.product_no = ?
			    and p.product_category_no = ca.product_category_no
			    and p.product_company_no = co.product_company_no
			    and p.product_status_no = st.product_status_no
		""";
		
		Product product = null;
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, productNo);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			product = new Product();
			product.setNo(rs.getInt("product_no"));
			product.setName(rs.getString("product_name"));
			product.setPrice(rs.getInt("product_price"));
			product.setDiscountPrice(rs.getInt("product_discount_price"));
			product.setStock(rs.getInt("product_stock"));
			product.setDescription(rs.getString("product_description"));
			product.setCreatedDate(rs.getDate("product_created_date"));
			product.setUpdatedDate(rs.getDate("product_updated_date"));
			
			Category category = new Category();
			category.setNo(rs.getInt("product_category_no"));
			category.setName(rs.getString("product_category_name"));
			product.setCategory(category);
			
			Company company = new Company();
			company.setNo(rs.getInt("product_company_no"));
			company.setName(rs.getString("product_company_name"));
			product.setCompany(company);
			
			Status status = new Status();
			status.setNo(rs.getInt("product_status_no"));
			status.setName(rs.getString("product_status_name"));
			product.setStatus(status);
			
			product.setFilename(rs.getString("product_filename"));
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return product;
	}
	
	/**
	 * 상품번호를 전달받아서 해당 상품의 추가혜택정보를 전부 조회해서 반환한다.
	 * @param productNo 상품번호
	 * @return 상품의 추가혜택정보 목록
	 * @throws SQLException
	 */
	public List<Benefit> getBenefitsByProductNo(int productNo) throws SQLException {
		String sql = """
			select benefit_no
				, benefit_name
			from store_benefits
			where benefit_no in (select benefit_no
			                     from store_product_benefits
			                     where product_no = ?)
		""";
		
		List<Benefit> benefits = new ArrayList<>();
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, productNo);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Benefit benefit = new Benefit();
			benefit.setNo(rs.getInt("benefit_no"));
			benefit.setName(rs.getString("benefit_name"));
			
			benefits.add(benefit);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return benefits;
	}
	
	/**
	 * 변경된 정보가 반영된 상품정보를 전달받아서 테이블에 반영시킨다.
	 * @param product 변경된 정보가 반영된 Product 객체
	 * @throws SQLException
	 */
	public void updateProduct(Product product) throws SQLException {
		String sql = """
			update store_products
			set 
				product_name = ?
			  , product_price = ?
			  , product_discount_price = ?
			  , product_stock = ?
			  , product_description = ?
			  , product_category_no = ?
			  , product_company_no = ?
			  , product_status_no = ?
			  , product_updated_date = sysdate
			where product_no = ?
		""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, product.getName());
		pstmt.setInt(2, product.getPrice());
		pstmt.setInt(3, product.getDiscountPrice());
		pstmt.setInt(4, product.getStock());
		pstmt.setString(5, product.getDescription());
		pstmt.setInt(6, product.getCategory().getNo());
		pstmt.setInt(7, product.getCompany().getNo());
		pstmt.setInt(8, product.getStatus().getNo());
		pstmt.setInt(9, product.getNo());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
	
	/**
	 * 상품 추가 혜택테이블에서 지정된 상품번호로 등록된 추가혜택정보를 삭제한다.
	 * @param productNo 상품번호
	 * @throws SQLException
	 */
	public void deleteBenefitsByProductNo(int productNo) throws SQLException {
		String sql = """
			delete from store_product_benefits
			where product_no = ?	
		""";
		
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, productNo);
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
	}
	
	public void insertCart(int itemNo, int userNo, int productNo, int amount, int price) throws SQLException {
		String sql = """
				insert store_cart_items
				(item_no, user_no, product_no, item_amount, item_price)
				values
				(store_carts_seq_nocache, ?, ?, ?, ?)
			""";
		Connection con = ConnectionUtils.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, userNo);
		pstmt.setInt(2, productNo);
		pstmt.setInt(3, amount);
		pstmt.setInt(4, price);
		
	}
}

















