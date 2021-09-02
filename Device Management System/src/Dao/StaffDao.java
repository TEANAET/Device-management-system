package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Staff;

public class StaffDao extends BaseDao{
	public Staff login(Staff staff) { //����login��һ������������������û����������Ƿ����
		String sql = "select * from s_Staff where Sname=? and Spassword =?";
		Staff staffRst = null; //����һ������
		try {
			PreparedStatement prst = con.prepareStatement(sql);
			prst.setString(1,staff.getSname());
			prst.setString(2, staff.getSpassword());
			ResultSet executeQuery = prst.executeQuery();
			if(executeQuery.next()) {
				staffRst = new Staff();//����һ������
				staffRst.setSid(executeQuery.getInt("Sid"));
				staffRst.setSname(executeQuery.getString("Sname"));
				staffRst.setSpassword(executeQuery.getString("Spassword"));
				staffRst.setScreatdate(executeQuery.getString("Screatdate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close(); //�ر����ݿ������
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return staffRst;
		}
}
