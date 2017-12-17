package top.yangguangyuan.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import top.yangguangyuan.bean.Book;
import top.yangguangyuan.service.BookService;

/**
 * Servlet implementation class showProductByPage
 */
public class showProductByPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showProductByPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String category = request.getParameter("category");
		category = new String(category.getBytes("iso8859-1"),"utf-8");
		BookService bookService = new BookService();
		List<Book> listBook = bookService.listBook(category);
		
		request.setAttribute("list", listBook);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
