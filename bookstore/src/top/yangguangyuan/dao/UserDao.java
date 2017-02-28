package top.yangguangyuan.dao;

import top.yangguangyuan.bean.User;




public interface UserDao {

	User login(User user);

	Boolean findUserByUsername(String username);

	Boolean regist(User user);

	Boolean modifyUserInfo(User user);

}
