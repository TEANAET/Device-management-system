package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Admin;

public class AdminDao extends BaseDao {  //�̳���BaseDao
	//����Ա��¼
	public Admin login(Admin admin) { //����Admin���͵�login����������������û����������Ƿ����
		String sql = "select * from s_Admin where name=? and password =?";
		Admin adminRst = null; //����һ������
		try {
			PreparedStatement prst = con.prepareStatement(sql);//��sql��䴫�����ݿ��������
			prst.setString(1,admin.getName());//setString �������ڰ�ӳ������Ϊ String �Ĳ���������2����ָ����Ӧ�Ĳ���ֵ��
			prst.setString(2, admin.getPassword());
			ResultSet executeQuery = prst.executeQuery();//prst.executeQuery()��ִ������sql����
			//ResultSet executeQuery ��ŵ��Ǵ����ݿ��У������������ݽ����
			if(executeQuery.next()) {   //�ж�executeQuery()�����޽��
				adminRst = new Admin();//����һ��Admin������������ݿ��ڷ��صĽ��
				adminRst.setId(executeQuery.getInt("id"));
				adminRst.setName(executeQuery.getString("name"));
				adminRst.setPassword(executeQuery.getString("password"));
				adminRst.setCreatdate(executeQuery.getString("creatdate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();; //�ر����ݿ������
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminRst;
		}
	public String editPassword(Admin admin,String newPassword) {//�������ݿ��޸�����
		String sql = "select * from s_Admin where name=? and password =?";
		PreparedStatement prst = null;
		int id = 0;
		try {
			prst = con.prepareStatement(sql);
			prst.setString(1,admin.getName());
			prst.setString(2, admin.getPassword());
			ResultSet executeQuery = prst.executeQuery();
			if(!executeQuery.next()) {
				String retString = "���������";
				return retString;
				}
			id = executeQuery.getInt("id");
			
	}catch (SQLException e1) {
		e1.printStackTrace();
	}
		String retString = "�޸�ʧ�ܣ�";
		String sqlString = "update s_Admin set password = ? where id  = ?";
		try {
			prst = con.prepareStatement(sqlString);
			prst.setString(1,newPassword);
			prst.setInt(2,id);
			int rst = prst.executeUpdate();//�������ݣ�����int�����Ƿ��صĸ����˶����У�Ҳ������Ӱ������������Ϊ0�����ʾ�޸��� 
			if(rst > 0)
			{
				retString = "�����޸ĳɹ���";
			}
			} catch (SQLException e) {
				e.printStackTrace();
			    retString = "�޸�ʧ�ܣ�";
			}
		return retString;
		}		
	}
