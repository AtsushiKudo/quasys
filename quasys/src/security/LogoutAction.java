package security;

import tool.Action;
import javax.servlet.http.*;

public class LogoutAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session=request.getSession();

		if (session.getAttribute("login-user")!=null) {
			session.removeAttribute("login-user");
			return "logout-out.jsp";
		}

		return "../common/top.jsp";
	}
}
