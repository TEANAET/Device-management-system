package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Staff;

public class StaffDao extends BaseDao{
	public Staff login(Staff staff) { //建立login的一个方法，查找输入的用户名和密码是否存在
		String sql = "select * from s_Staff where Sname=? and Spassword =?";
		Staff staffRst = null; //声明一个对象
		try {
			PreparedStatement prst = con.prepareStatement(sql);
			prst.setString(1,staff.getSname());
			prst.setString(2, staff.getSpassword());
			ResultSet executeQuery = prst.executeQuery();
			if(executeQuery.next()) {
				staffRst = new Staff();//创建一个对象
				staffRst.setSid(executeQuery.getInt("Sid"));
				staffRst.setSname(executeQuery.getString("Sname"));
				staffRst.setSpassword(executeQuery.getString("Spassword"));
				staffRst.setScreatdate(executeQuery.getString("Screatdate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close(); //关闭数据库的连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return staffRst;
		}
}
