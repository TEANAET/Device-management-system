package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.AdminDao;
import Dao.StaffDao;
import Model.Admin;
import Model.Staff;
import Model.UserType;
import Util.StringUtil;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class Loginfrm extends JFrame {

	private JPanel contentPane;
	private JTextField User_textField;
	private JPasswordField passwordField;
	private JComboBox UserModel_comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginfrm frame = new Loginfrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loginfrm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Loginfrm.class.getResource("/picture/shebeiguanli1.png")));
		setTitle("\u767B\u5F55\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 450);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JLabel intro_Label = new JLabel("设备管理系统登录界面");
		intro_Label.setIcon(new ImageIcon(Loginfrm.class.getResource("/picture/shebei.png")));
		intro_Label.setFont(new Font("宋体", Font.BOLD, 25));
		intro_Label.setBackground(Color.CYAN);
		intro_Label.setForeground(SystemColor.activeCaption);
		intro_Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel User_Label_1 = new JLabel("用户名：");
		User_Label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		User_Label_1.setIcon(new ImageIcon(Loginfrm.class.getResource("/picture/\u7528\u6237\u540D.png")));
		
		JLabel Password_Label_2 = new JLabel("密码：");
		Password_Label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		Password_Label_2.setIcon(new ImageIcon(Loginfrm.class.getResource("/picture/\u5BC6\u7801.png")));
		
		User_textField = new JTextField();
		User_textField.setColumns(10);
		
		JButton Login_Button = new JButton("登录");
		Login_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAction(e);
			}
		});
		Login_Button.setIcon(new ImageIcon(Loginfrm.class.getResource("/picture/\u767B\u5F55.png")));
		Login_Button.setFont(new Font("宋体", Font.PLAIN, 18));
		
		JButton Reset_Button = new JButton("重置");
		Reset_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//重置按钮的事件
				resetValue(e);
			}
		});
		Reset_Button.setFont(new Font("宋体", Font.PLAIN, 18));
		Reset_Button.setIcon(new ImageIcon(Loginfrm.class.getResource("/picture/\u91CD\u7F6E.png")));
		
		passwordField = new JPasswordField();
		
		JLabel lblNewLabel = new JLabel("用户类型：");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setIcon(new ImageIcon(Loginfrm.class.getResource("/picture/\u7528\u6237\u7C7B\u578B.png")));
		
	    UserModel_comboBox = new JComboBox();
		UserModel_comboBox.setModel(new DefaultComboBoxModel(new UserType[] {UserType.ADMIN, UserType.Staff}));//将下拉列表的值用ADMIN，以及Staff枚举类型来表示
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(81)
					.addComponent(intro_Label, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(116)
					.addComponent(User_Label_1)
					.addGap(10)
					.addComponent(User_textField, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(116)
					.addComponent(Password_Label_2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(116)
					.addComponent(lblNewLabel)
					.addGap(3)
					.addComponent(UserModel_comboBox, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(95)
					.addComponent(Login_Button)
					.addGap(148)
					.addComponent(Reset_Button))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(intro_Label, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(User_Label_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(User_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(Password_Label_2)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(UserModel_comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(Login_Button, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(Reset_Button, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void LoginAction(ActionEvent e) { //登录按钮的一个方法
		// TODO Auto-generated method stub
		String username = User_textField.getText().toString();//将文本框的内容传给username
		String password = passwordField.getText().toString();
		UserType selectedItem = (UserType)UserModel_comboBox.getSelectedItem();//复选框的值强制转化成UserType类型的值。
		if(StringUtil.isEmpty(username)) {
			JOptionPane.showMessageDialog(this, "用户名不能为空！");
			return;
		}
		if(StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(this, "密码不能为空！");
			return;
		}
		Admin admin = null;
		if("系统管理员".equals(selectedItem.getName())) { //比较复选框的值是否一样
			//系统管理员登录
			AdminDao adminDao = new AdminDao();
			Admin adminTmp = new Admin();
			adminTmp.setName(username);
			adminTmp.setPassword(password);
			admin = adminDao.login(adminTmp); //通过login方法在数据库中查询用户名和密码是否(存在)正确
			adminDao.closeDao();
			if(admin == null) {//如果login方法返回的值为空，即没有找到相应的用户名和密码
				JOptionPane.showMessageDialog(this, "用户名或密码错误！");
				return;
			}
			JOptionPane.showMessageDialog(this,"欢迎【"+selectedItem.getName()+"]:"+admin.getName()+"登录本系统！");
			this.dispose();
			Mainfrm show =new Mainfrm(selectedItem,admin);
			show.setVisible(true);//打开主界面
		}
		else  {
			//员工登录
			Staff staff = null;
			StaffDao staffdao = new StaffDao();
			Staff staffTmp = new Staff();
			staffTmp.setSname(username);
			staffTmp.setSpassword(password);
			staff = staffdao.login(staffTmp);
			staffdao.closeDao();
			if(staff == null) {
				JOptionPane.showMessageDialog(this, "用户名或密码错误！");
				return;
			}
			JOptionPane.showMessageDialog(this,"欢迎【"+selectedItem.getName()+"]:"+staff.getSname()+"登录本系统！");
			this.dispose();
			Mainfrm shows =new Mainfrm(selectedItem,staff);//打开主界面
			shows.setVisible(true);
			
		}
		
		
	}

	protected void resetValue(ActionEvent e) {//重置按钮事件实现的方法
		// TODO Auto-generated method stub
		User_textField.setText("");
		passwordField.setText("");
		UserModel_comboBox.setSelectedIndex(0);
	}
}
