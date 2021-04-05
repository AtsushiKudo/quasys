package security;


import tool.Action;
import javax.servlet.http.*;

import bean.User;
import dao.UserDAO;

public class LoginAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session=request.getSession();

		String login=request.getParameter("login");
		String password=request.getParameter("password");

		UserDAO userDao=new UserDAO();
		User shop =userDao.search(login, password);

		if (shop!=null) {
			session.setAttribute("login-user", shop);
			return "../common/top.jsp";
		}

		return "login-in.jsp";
	}
}
