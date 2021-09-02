package Dao;

import java.sql.Connection;
import java.sql.SQLException;

import Util.DbUtil;

public class BaseDao {
	public Connection con = new DbUtil().getConnection();
	public void closeDao() {
		try {
			con.close(); //关闭连接，释放资源
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

