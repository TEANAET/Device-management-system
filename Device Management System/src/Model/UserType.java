package Model;

public enum UserType { //用户枚举类
	ADMIN("系统管理员",0),Staff("员工",1);
	String name;
	int index;
	private UserType(String name,int index) //构造函数
	{
		this.name = name;
		this.index = index;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String toString() {
		return this.name;
	}

}
