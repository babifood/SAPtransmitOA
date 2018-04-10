package com.seeyon.apps.babi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public final class JdbcUnits {
//OA正式环境
//	public static final String DRIVER="oracle.jdbc.driver.OracleDriver";
//	public static final String URL="jdbc:oracle:thin:@10.1.1.6:1521:oaprd";
//	public static final String USERNAME="V3XUSER";
//	public static final String PASSWORD="BabiPrd2016";
//OA测试环境
	public static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	public static final String URL="jdbc:oracle:thin:@10.1.1.4:1521:oaprd";
	public static final String USERNAME="V3XUSER";
	public static final String PASSWORD="BabiPrd2016";
   
    /** 
     * 装载驱动 
     */  
    static {  
        try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
    }  
   
    /** 
     * 建立数据库连接 
     *  
     * @return 
     * @throws SQLException 
     */  
    public static Connection getConnection() throws SQLException {  
        Connection conn = null;  
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);  
        return conn;  
    }  
   
    /** 
     * 释放连接 
     * @param conn 
     */  
    private static void freeConnection(Connection conn) {  
        try {  
            conn.close();  
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
   
    /** 
     * 释放statement 
     * @param statement 
     */  
    private static void freeStatement(Statement statement) {  
        try {  
            statement.close();  
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
   
    /** 
     * 释放resultset 
     * @param rs 
     */  
    private static void freeResultSet(ResultSet rs) {  
        try {  
            rs.close();  
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
   
    /** 
     * 释放资源 
     *  
     * @param conn 
     * @param statement 
     * @param rs 
     */  
    public static void free(Connection conn, Statement statement, ResultSet rs) {  
        if (rs != null) {  
            freeResultSet(rs);  
        }  
        if (statement != null) {  
            freeStatement(statement);  
        }  
        if (conn != null) {  
            freeConnection(conn);  
        }  
    }  
}
