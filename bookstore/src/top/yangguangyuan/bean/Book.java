package top.yangguangyuan.bean;
/*
 * 图书的javabean
 */
public class Book {
//	  bid VARCHAR(100) PRIMARY KEY,/*主键*/
//	  bname VARCHAR(100),/*图书名*/
//	  price DECIMAL(5,1),/*单价*/
//	  author VARCHAR(20),/*作者*/
//	  imgurl VARCHAR(200),/*图片地址*/
//	  category VARCHAR(100)/*所属分类*/
	
	private String bid;
	private String bname;
	private int price;
	private String author;
	private String imgurl;
	private String category;
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
