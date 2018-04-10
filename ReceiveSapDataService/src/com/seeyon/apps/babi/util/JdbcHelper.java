package com.seeyon.apps.babi.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcHelper {
	 private static Connection conn = null;  
	    private static PreparedStatement preparedStatement = null;  
	    private static CallableStatement callableStatement = null;  
	   
	    /** 
	     * 用于查询，返回结果集 
	     *  
	     * @param sql 
	     *            sql语句 
	     * @return 结果集 
	     * @throws SQLException 
	     */  
	    @SuppressWarnings("rawtypes")  
	    public static List query(String sql) throws SQLException {  
	   
	        ResultSet rs = null;  
	        try {  
	            getPreparedStatement(sql);  
	            rs = preparedStatement.executeQuery();  
	   
	            return ResultToListMap(rs);  
	        } catch (SQLException e) {  
	            throw new SQLException(e);  
	        } finally {  
	            free(rs);  
	        }  
	   
	    }  
	   
	    /** 
	     * 用于带参数的查询，返回结果集 
	     *  
	     * @param sql 
	     *            sql语句 
	     * @param paramters 
	     *            参数集合 
	     * @return 结果集 
	     * @throws SQLException 
	     */  
	    @SuppressWarnings("rawtypes")  
	    public static List query(String sql, Object... paramters)  
	            throws SQLException {  
	   
	        ResultSet rs = null;  
	        try {  
	            getPreparedStatement(sql);  
	   
	            for (int i = 0; i < paramters.length; i++) {  
	                preparedStatement.setObject(i + 1, paramters[i]);  
	            }  
	            rs = preparedStatement.executeQuery();  
	            return ResultToListMap(rs);  
	        } catch (SQLException e) {  
	            throw new SQLException(e);  
	        } finally {  
	            free(rs);  
	        }  
	    }  
	   
	    /** 
	     * 返回单个结果的值，如count\min\max等等 
	     *  
	     * @param sql 
	     *            sql语句 
	     * @return 结果集 
	     * @throws SQLException 
	     */  
	    public static Object getSingle(String sql) throws SQLException {  
	        Object result = null;  
	        ResultSet rs = null;  
	        try {  
	            getPreparedStatement(sql);  
	            rs = preparedStatement.executeQuery();  
	            if (rs.next()) {  
	                result = rs.getObject(1);  
	            }  
	            return result;  
	        } catch (SQLException e) {  
	            throw new SQLException(e);  
	        } finally {  
	            free(rs);  
	        }  
	   
	    }  
	   
	    /** 
	     * 返回单个结果值，如count\min\max等 
	     *  
	     * @param sql 
	     *            sql语句 
	     * @param paramters 
	     *            参数列表 
	     * @return 结果 
	     * @throws SQLException 
	     */  
	    public static Object getSingle(String sql, Object... paramters)  
	            throws SQLException {  
	        Object result = null;  
	        ResultSet rs = null;  
	        try {  
	            getPreparedStatement(sql);  
	   
	            for (int i = 0; i < paramters.length; i++) {  
	                preparedStatement.setObject(i + 1, paramters[i]);  
	            }  
	            rs = preparedStatement.executeQuery();  
	            if (rs.next()) {  
	                result = rs.getObject(1);  
	            }  
	            return result;  
	        } catch (SQLException e) {  
	            throw new SQLException(e);  
	        } finally {  
	            free(rs);  
	        }  
	    }  
	   
	    /** 
	     * 用于增删改 
	     *  
	     * @param sql 
	     *            sql语句 
	     * @return 影响行数 
	     * @throws SQLException 
	     */  
	    public static int update(String sql) throws SQLException {  
	   
	        try {  
	            getPreparedStatement(sql);  
	   
	            return preparedStatement.executeUpdate();  
	        } catch (SQLException e) {  
	            throw new SQLException(e);  
	        } finally {  
	            free();  
	        }  
	    }  
	   
	    /** 
	     * 用于增删改（带参数） 
	     *  
	     * @param sql 
	     *            sql语句 
	     * @param paramters 
	     *            sql语句 
	     * @return 影响行数 
	     * @throws SQLException 
	     */  
	    public static int update(String sql, Object... paramters)  
	            throws SQLException {  
	        try {  
	            getPreparedStatement(sql);  
	   
	            for (int i = 0; i < paramters.length; i++) {  
	                preparedStatement.setObject(i + 1, paramters[i]);  
	            }  
	            return preparedStatement.executeUpdate();  
	        } catch (SQLException e) {  
	            throw new SQLException(e);  
	        } finally {  
	            free();  
	        }  
	    }  
	   
	    /** 
	     * 插入值后返回主键值 
	     *  
	     * @param sql 
	     *            插入sql语句 
	     * @return 返回结果 
	     * @throws Exception 
	     */  
	    public static Object insertWithReturnPrimeKey(String sql)  
	            throws SQLException {  
	        ResultSet rs = null;  
	        Object result = null;  
	        try {  
	            conn = JdbcUnits.getConnection();  
	            preparedStatement = conn.prepareStatement(sql,  
	                    PreparedStatement.RETURN_GENERATED_KEYS);  
	            preparedStatement.execute();  
	            rs = preparedStatement.getGeneratedKeys();  
	            if (rs.next()) {  
	                result = rs.getObject(1);  
	            }  
	            return result;  
	        } catch (SQLException e) {  
	            throw new SQLException(e);  
	        }  
	    }  
	   
	    /** 
	     * 插入值后返回主键值 
	     *  
	     * @param sql 
	     *            插入sql语句 
	     * @param paramters 
	     *            参数列表 
	     * @return 返回结果 
	     * @throws SQLException 
	     */  
	    public static Object insertWithReturnPrimeKey(String sql,  
	            Object... paramters) throws SQLException {  
	        ResultSet rs = null;  
	        Object result = null;  
	        try {  
	            conn = JdbcUnits.getConnection();  
	            preparedStatement = conn.prepareStatement(sql,  
	                    PreparedStatement.RETURN_GENERATED_KEYS);  
	            for (int i = 0; i < paramters.length; i++) {  
	                preparedStatement.setObject(i + 1, paramters[i]);  
	            }  
	            preparedStatement.execute();  
	            rs = preparedStatement.getGeneratedKeys();  
	            if (rs.next()) {  
	                result = rs.getObject(1);  
	            }  
	            return result;  
	        } catch (SQLException e) {  
	            throw new SQLException(e);  
	        }  
	   
	    }  
	    @SuppressWarnings({ "unchecked", "rawtypes" })  
	    private static List ResultToListMap(ResultSet rs) throws SQLException {  
	        List list = new ArrayList();  
	        while (rs.next()) {  
	            ResultSetMetaData md = rs.getMetaData();  
	            Map map = new HashMap();  
	            for (int i = 1; i < md.getColumnCount(); i++) {  
	                map.put(md.getColumnLabel(i), rs.getObject(i));  
	            }  
	            list.add(map);  
	        }  
	        return list;  
	    }  
	    /** 
	     * 获取PreparedStatement 
	     *  
	     * @param sql 
	     * @throws SQLException 
	     */  
	    private static void getPreparedStatement(String sql) throws SQLException {  
	        conn = JdbcUnits.getConnection();  
	        preparedStatement = conn.prepareStatement(sql);  
	    }  
	   
	    /** 
	     * 获取CallableStatement 
	     *  
	     * @param procedureSql 
	     * @throws SQLException 
	     */  
	    private static void getCallableStatement(String procedureSql)  
	            throws SQLException {  
	        conn = JdbcUnits.getConnection();  
	        callableStatement = conn.prepareCall(procedureSql);  
	    }  
	   
	    /** 
	     * 释放资源 
	     *  
	     * @param rs 
	     *            结果集 
	     */  
	    public static void free(ResultSet rs) {  
	   
	        JdbcUnits.free(conn, preparedStatement, rs);  
	    }  
	   
	    /** 
	     * 释放资源 
	     *  
	     * @param statement 
	     * @param rs 
	     */  
	    public static void free(Statement statement, ResultSet rs) {  
	        JdbcUnits.free(conn, statement, rs);  
	    }  
	   
	    /** 
	     * 释放资源 
	     */  
	    public static void free() {  
	   
	        free(null);  
	    }  
}
