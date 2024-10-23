package java_jdbc;

import java.sql.Connection;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException{
		
		// JDBC 드라이버 등록
		Class.forName("oracle.jdbc.OracleDriver");
		
	}
}
