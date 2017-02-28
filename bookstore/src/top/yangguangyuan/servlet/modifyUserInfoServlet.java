package top.yangguangyuan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import top.yangguangyuan.bean.User;
import top.yangguangyuan.service.UserService;

/**
 * @ClassName: modifyUserInfoServlet 
 * @Description: TODO(用户信息修改) 
 * @author yangguangyuan
 * @date 2017年2月28日 上午8:04:41 
 *
 */
public class modifyUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public modifyUserInfoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getAttribute("user");
		UserService userService = new UserService();
		Boolean modifyUserInfo = userService.modifyUserInfo(user);
		if(modifyUserInfo){
			request.getSession().invalidate();
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}else{
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
