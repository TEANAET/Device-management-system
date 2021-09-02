package Dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Model.Device;
import Util.StringUtil;

/*
 * 
 * 设备信息与数据库的操作
 * */
public class DeviceDao extends BaseDao {
	public boolean Add_Device(Device divice) {
		String sql = "insert into s_Device values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);//把sql语句传给数据库操作对象
			preparedStatement.setString(1,divice.getDevice_num()); //获取第几个？号，进行字符替换
			preparedStatement.setString(2,divice.getDevice_name());
			preparedStatement.setString(3, divice.getDevice_kind());
			preparedStatement.setString(4, divice.getDevice_section());
			preparedStatement.setInt(5, divice.getNum());
			preparedStatement.setString(6, divice.getDevice_date());
			preparedStatement.setInt(7, divice.getDevise_price());
			if(preparedStatement.executeUpdate()>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//获取列表信息
	public List<Device> getDeviceList(Device device) {
		List<Device> retList = new ArrayList<Device>();//定义一个Device类型的列表
		String sqlString = "select * from [s_Device]";
		if(!StringUtil.isEmpty(device.getDevice_kind())) {
			sqlString =sqlString+"where Device_kind like '%"+device.getDevice_kind()+"%'";
		}
		if(!StringUtil.isEmpty(device.getDevice_section())) {
			sqlString =sqlString+"where Device_section like '%"+device.getDevice_section()+"%'";
		}
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sqlString);
			ResultSet executeQuery = preparedStatement.executeQuery();
			while(executeQuery.next()) {
				Device dece = new Device();
				dece.setID(executeQuery.getInt("ID"));
				dece.setDevice_num(executeQuery.getString("Device_num"));
				dece.setDevice_name(executeQuery.getString("Device_name"));
				dece.setDevice_kind(executeQuery.getString("Device_kind"));
				dece.setDevice_section(executeQuery.getString("Device_section"));
				dece.setNum(executeQuery.getInt("num"));
				dece.setDevice_date(executeQuery.getString("Device_date"));
				dece.setDevise_price(executeQuery.getInt("Devise_price"));
				retList.add(dece); //向列表中添加Device类型数据(dece)
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retList;
	}
	//删除设备信息
	public boolean delete(int ID) {
		String sql = "delete from [s_Device] where ID = ?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1,ID);
			if(preparedStatement.executeUpdate()>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//修改设备信息
	public boolean update(Device dc) {
		String sql = "update s_Device set Device_num=?,Device_name=?,Device_kind=?,"
				+ "Device_section=?,num = ?,Device_date=?,Devise_price=? where ID = ?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, dc.getDevice_num());
			preparedStatement.setString(2, dc.getDevice_name());
			preparedStatement.setString(3, dc.getDevice_kind());
			preparedStatement.setString(4, dc.getDevice_section());
			preparedStatement.setInt(5, dc.getNum());
			preparedStatement.setString(6, dc.getDevice_date());
			preparedStatement.setInt(7, dc.getDevise_price());
			preparedStatement.setInt(8,dc.getID());
			if(preparedStatement.executeUpdate()>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
