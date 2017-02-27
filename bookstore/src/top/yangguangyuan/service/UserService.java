package top.yangguangyuan.service;


import top.yangguangyuan.bean.User;
import top.yangguangyuan.dao.UserDao;
import top.yangguangyuan.dao.impl.UserDaoImpl;

public class UserService {

	public User login(User user) {
		UserDao userDao = new UserDaoImpl();
		return userDao.login(user);
	}

}
