package dao;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO extends DAO {

	public User search(String login, String password)
		throws Exception {
		User user=null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
			"select * from users where id=? and password=?");
		st.setString(1, login);
		st.setString(2, password);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			user=new User();
			user.setId(rs.getString("id"));
			user.setMailAddress(rs.getString("mail_address"));
			user.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();
		return user;
	}

	public int insert(User user) throws Exception {
	Connection con=getConnection();

	PreparedStatement st=con.prepareStatement(
		"insert into users (id, mail_address, password, admin_flag, delete_flag) values( ?, ?, ?, FALSE, FALSE)");
	st.setString(1, user.getId());
	st.setString(2, user.getMailAddress());
	st.setString(3, user.getPassword());
	int line=st.executeUpdate();

	st.close();
	con.close();
	return line;
	}
}
