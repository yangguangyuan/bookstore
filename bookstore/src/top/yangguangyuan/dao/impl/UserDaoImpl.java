package top.yangguangyuan.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.sun.org.apache.bcel.internal.generic.NEW;

import top.yangguangyuan.bean.User;
import top.yangguangyuan.dao.UserDao;
import top.yangguangyuan.utils.MyDBUtils;

public class UserDaoImpl implements UserDao {
	
	
	@Override
	public User login(User user) {
		QueryRunner runner = new QueryRunner(MyDBUtils.getDataSource());
		String sql="select * from user where username= ? and password=?";
		try {
			User query = runner.query(sql, new BeanHandler<User>(User.class),
					user.getUsername(),user.getPassword());
			return query;
		} catch (Exception e) {
		}
		
		return null;
	}

	@Override
	public Boolean findUserByUsername(String username) {
		QueryRunner runner = new QueryRunner(MyDBUtils.getDataSource());
		String sqlString="select * from user where username=?";
		try {
			User query = runner.query(sqlString, new BeanHandler<User>(User.class),username);
			if(query!=null){
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean regist(User user) {
		QueryRunner runner = new QueryRunner(MyDBUtils.getDataSource());
		String sqlString="insert into user values(?,?,?,?,?,?,?)";
		Object[] params = {user.getUid(),user.getUsername(),user.getPassword(),
				user.getEmail(),user.getTelephone(),user.getSex(),user.getRemark()};
		//Object[] params = {"2","2","","","","",""};
		try {
			int update = runner.update(sqlString,params);
			if(update>0){
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
