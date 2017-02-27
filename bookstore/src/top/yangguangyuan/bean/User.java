package top.yangguangyuan.bean;

/**
 * 用户的javabean
 * @author asus
 *
 */
public class User {
//	uid varchar(100) primary key,
//	username varchar(100),
//	password varchar(100),
//	email varchar(255),
//	telephone varchar(100),
//	sex varchar(20),
//	remark varchar(255) 
	private String uid;
	private String username;
	private String password;
	private String email;
	private String telephone; // 0791-110110
	private String sex;
	private String remark;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
