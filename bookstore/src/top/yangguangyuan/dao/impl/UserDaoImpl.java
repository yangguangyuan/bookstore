package top.yangguangyuan.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;



import top.yangguangyuan.bean.User;
import top.yangguangyuan.dao.UserDao;
import top.yangguangyuan.utils.MyDBUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public User login(User user) {
		QueryRunner runner = new QueryRunner(MyDBUtils.getDataSource());
		String sql="select * from username= ? and password=?";
		try {
			User query = runner.query(sql, new BeanHandler<User>(User.class),
					user.getUsername(),user.getPassword());
			return query;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
		
	}

}
