package top.yangguangyuan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import top.yangguangyuan.bean.Book;
import top.yangguangyuan.service.BookService;

/**
 * 
 * @ClassName: ProductInfo 
 * @Description: TODO(商品详情) 
 * @author yangguangyuan
 * @date 2017年3月2日 上午8:00:04 
 */
public class ProductInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bid = request.getParameter("bid");
		if(null==bid){
			request.getSession().setAttribute("msg", "商品id不能为空");
			return;
		}
		
		BookService bookService = new BookService();
		Book book = bookService.findBookByBid(bid);
		if(null==book){
			request.getSession().setAttribute("msg", "未查询到该商品");
			return;
		}else{
			request.getSession().setAttribute("book", book);
			request.getRequestDispatcher("/product_info.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
