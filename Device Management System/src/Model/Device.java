package Model;

public class Device {
	private int ID;             //设备ID
	private String Device_num;   //设备号
	private String Device_name; //设备名称
	private String Device_kind; //设备种类
	private String Device_section; //所属部门
	private int num;              //数量
	private String Device_date;   //购买时间
	private int Devise_price;     //价格
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		ID = id;
	}
	public String getDevice_num() {
		return Device_num;
	}
	public void setDevice_num(String device_num) {
		Device_num = device_num;
	}
	public String getDevice_name() {
		return Device_name;
	}
	public void setDevice_name(String device_name) {
		Device_name = device_name;
	}
	public String getDevice_kind() {
		return Device_kind;
	}
	public void setDevice_kind(String device_kind) {
		Device_kind = device_kind;
	}
	public String getDevice_section() {
		return Device_section;
	}
	public void setDevice_section(String device_section) {
		Device_section = device_section;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDevice_date() {
		return Device_date;
	}
	public void setDevice_date(String device_date) {
		Device_date = device_date;
	}
	public int getDevise_price() {
		return Devise_price;
	}
	public void setDevise_price(int devise_price) {
		Devise_price = devise_price;
	}
	
}
