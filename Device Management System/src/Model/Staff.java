package Model;
public class Staff {
	private int sid; //员工账户id
	private String sname;//员工账户名称
	private String spassword; //员工登陆密码
	private String screatdate;//员工账户创立时间
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getScreatdate() {
		return screatdate;
	}
	public void setScreatdate(String screatdate) {
		this.screatdate = screatdate;
	}
	
	
	
}
