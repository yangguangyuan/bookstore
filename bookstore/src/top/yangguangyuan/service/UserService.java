package top.yangguangyuan.service;


import top.yangguangyuan.bean.User;
import top.yangguangyuan.dao.UserDao;
import top.yangguangyuan.dao.impl.UserDaoImpl;

public class UserService {
	UserDao userDao = new UserDaoImpl();
	public User login(User user) {
		return userDao.login(user);
	}

	/**
	 * @Title: findUserByUsername 
	 * @Description: TODO(根据用户名判断用户是否存在) 
	 * @param @param username
	 * @param @return    设定文件 
	 * @return Boolean    返回类型 
	 * @throws
	 */
	public Boolean findUserByUsername(String username) {
		return userDao.findUserByUsername(username);
	}

	public Boolean regist(User user) {
		return userDao.regist(user);
	}

	public Boolean modifyUserInfo(User user) {
		return userDao.modifyUserInfo(user);
	}

}
