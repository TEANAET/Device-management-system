package Util;
import java.sql.*;
public class DbUtil {
	public Connection getConnection() {//����һ���������͵ĺ���
        String username = "sa";//SQL server �ĵ�¼��
        String password = "123456";//��¼���µ�����
        String url="jdbc:sqlserver://localhost:1433;DatabaseName=Device_Management";//LJW17���Լ�������һ�����ݿ�
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; //��������
        
        try {
            Class.forName(driver);//������������
            Connection con= DriverManager.getConnection(url, username, password); //�������ݿ�
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
	//�ر����ݿ�����
	public void closeCon( Connection con) throws Exception{
		if(con!=null) {
			con.close();
		}
	}
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//    	DbUtil dbUtil = new DbUtil();
//    	try {
//    		dbUtil.getConnection();
//    		System.out.println("���ݿ����ӳɹ���");
//    		System.out.println(dbUtil.getConnection().toString());
//    	} catch (Exception e) {
//    		e.printStackTrace();
//    		System.out.println("���ݿ�����ʧ�ܣ�");
//    	}
//       // Connection con = DbUtil.getConnection();
//        
//    }
}


