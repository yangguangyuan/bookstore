package top.yangguangyuan.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.handlers.BeanHandler;

import top.yangguangyuan.bean.User;
import top.yangguangyuan.service.UserService;

/**
 * 
 * @ClassName: RegistServlet 
 * @Description: TODO(注册) 
 * @author yangguangyuan
 * @date 2017年2月27日 下午6:16:15 
 *
 */
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		UserService userService = new UserService();
		Boolean isexit = userService.findUserByUsername(username);
		if(isexit){
			request.setAttribute("msg", "当前用户名已存在");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		
		User user = new User();
		user.setUid(UUID.randomUUID().toString());
		try {
			BeanUtils.populate(user,request.getParameterMap());
			Boolean registBolean = userService.regist(user);
			if(registBolean){
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}else{
				request.setAttribute("msg", "注册失败");
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
