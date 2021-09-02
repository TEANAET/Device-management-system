package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Admin;

public class AdminDao extends BaseDao {  //继承于BaseDao
	//管理员登录
	public Admin login(Admin admin) { //建立Admin类型的login方法，查找输入的用户名和密码是否存在
		String sql = "select * from s_Admin where name=? and password =?";
		Admin adminRst = null; //声明一个对象
		try {
			PreparedStatement prst = con.prepareStatement(sql);//把sql语句传给数据库操作对象
			prst.setString(1,admin.getName());//setString 方法用于绑定映射类型为 String 的参数。参数2用于指定对应的参数值。
			prst.setString(2, admin.getPassword());
			ResultSet executeQuery = prst.executeQuery();//prst.executeQuery()是执行这条sql语言
			//ResultSet executeQuery 存放的是从数据库中，返回来的数据结果。
			if(executeQuery.next()) {   //判断executeQuery()中有无结果
				adminRst = new Admin();//创建一个Admin对象来存放数据库在返回的结果
				adminRst.setId(executeQuery.getInt("id"));
				adminRst.setName(executeQuery.getString("name"));
				adminRst.setPassword(executeQuery.getString("password"));
				adminRst.setCreatdate(executeQuery.getString("creatdate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();; //关闭数据库的连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminRst;
		}
	public String editPassword(Admin admin,String newPassword) {//连接数据库修改密码
		String sql = "select * from s_Admin where name=? and password =?";
		PreparedStatement prst = null;
		int id = 0;
		try {
			prst = con.prepareStatement(sql);
			prst.setString(1,admin.getName());
			prst.setString(2, admin.getPassword());
			ResultSet executeQuery = prst.executeQuery();
			if(!executeQuery.next()) {
				String retString = "旧密码错误！";
				return retString;
				}
			id = executeQuery.getInt("id");
			
	}catch (SQLException e1) {
		e1.printStackTrace();
	}
		String retString = "修改失败！";
		String sqlString = "update s_Admin set password = ? where id  = ?";
		try {
			prst = con.prepareStatement(sqlString);
			prst.setString(1,newPassword);
			prst.setInt(2,id);
			int rst = prst.executeUpdate();//更新数据，返回int类型是返回的更新了多少行，也就是受影响的行数，如果为0，则表示无更新 
			if(rst > 0)
			{
				retString = "密码修改成功！";
			}
			} catch (SQLException e) {
				e.printStackTrace();
			    retString = "修改失败！";
			}
		return retString;
		}		
	}
