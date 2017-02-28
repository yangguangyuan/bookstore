package top.yangguangyuan.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.sun.org.apache.bcel.internal.generic.NEW;

import top.yangguangyuan.bean.User;
import top.yangguangyuan.dao.UserDao;
import top.yangguangyuan.utils.MyDBUtils;

public class UserDaoImpl implements UserDao {
	
	QueryRunner runner = new QueryRunner(MyDBUtils.getDataSource());
	@Override
	public User login(User user) {
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

	@Override
	public Boolean modifyUserInfo(User user) {
		String sql="update user set password=?,telephone=? where uid=?";
		try {
			int update = runner.update(sql,user.getPassword(),user.getTelephone(),user.getUid());
			if(update>0){
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
