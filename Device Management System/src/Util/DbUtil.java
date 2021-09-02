package Util;
import java.sql.*;
public class DbUtil {
	public Connection getConnection() {//定义一个连接类型的函数
        String username = "sa";//SQL server 的登录名
        String password = "123456";//登录名下的密码
        String url="jdbc:sqlserver://localhost:1433;DatabaseName=Device_Management";//LJW17是自己建立的一个数据库
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; //驱动程序
        
        try {
            Class.forName(driver);//加载驱动程序
            Connection con= DriverManager.getConnection(url, username, password); //连接数据库
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
	//关闭数据库连接
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
//    		System.out.println("数据库连接成功！");
//    		System.out.println(dbUtil.getConnection().toString());
//    	} catch (Exception e) {
//    		e.printStackTrace();
//    		System.out.println("数据库连接失败！");
//    	}
//       // Connection con = DbUtil.getConnection();
//        
//    }
}


