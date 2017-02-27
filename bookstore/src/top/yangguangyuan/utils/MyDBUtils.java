package top.yangguangyuan.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MyDBUtils {
	public static ComboPooledDataSource comboPooledDataSource= new ComboPooledDataSource();
	
	public static DataSource getDataSource(){
		return comboPooledDataSource;
	}
	
	public static Connection getConnection() throws SQLException{
		Connection connection = comboPooledDataSource.getConnection();
		return connection;
	}
}
