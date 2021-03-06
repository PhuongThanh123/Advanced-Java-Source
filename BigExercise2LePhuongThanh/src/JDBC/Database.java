package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016
 * @Deception: Class Database connect database 
 */
public class Database {
	private static final String JDBC_URL="jdbc:mysql://127.0.0.1/cdstore?useUnicode=true&characterEncoding=utf8";
	private static final String JDBC_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String JDBC_USERNAME="root";
	private static final String JDBC_PASSWORD="";
	
	/**
	 * @return connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection connect() throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn=DriverManager.getConnection(JDBC_URL,JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}

}
