package Model;

public enum UserType { //�û�ö����
	ADMIN("ϵͳ����Ա",0),Staff("Ա��",1);
	String name;
	int index;
	private UserType(String name,int index) //���캯��
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
