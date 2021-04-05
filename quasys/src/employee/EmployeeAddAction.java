package employee;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.UserDAO;
import tool.Action;



public class EmployeeAddAction extends Action{
	public String execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {

		User newUser = new User();
		newUser.setId(request.getParameter("id"));
		newUser.setMailAddress(request.getParameter("mail-address"));
		newUser.setPassword(request.getParameter("password"));

		UserDAO userDao = new UserDAO();

		if(userDao.insert(newUser) > 1) {

		}

		return "employee-add-form.jsp";
	}
}
