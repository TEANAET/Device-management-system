package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.DeviceDao;
import Model.Device;
import Util.StringUtil;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Add_Devicefrm extends JInternalFrame{

	private JPanel contentPane;
	private JTextField Divice_numtextField;
	private JTextField Divice_nametextField;
	private JTextField Divice_kindtextField;
	private JTextField Device_sectiontextField;
	private JTextField numtextField;
	private JTextField Divice_datetextField;
	private JTextField Divice_pricetextField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Add_Devicefrm() {
		setIconifiable(true);
		setFont(new Font("宋体", Font.PLAIN, 14));
		setTitle("\u6DFB\u52A0\u8BBE\u5907\u4FE1\u606F");
		setBounds(100, 100, 564, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setClosable(true);
		JLabel lblNewLabel = new JLabel("设备号:");
		lblNewLabel.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u8BBE\u5907\u53F7.png")));
		lblNewLabel.setBounds(42, 49, 92, 16);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("设备名称:");
		lblNewLabel_1.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u8BBE\u5907\u540D\u79F0.png")));
		lblNewLabel_1.setBounds(42, 99, 103, 16);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("设备种类:");
		lblNewLabel_2.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u8BBE\u5907\u79CD\u7C7B.png")));
		lblNewLabel_2.setBounds(42, 151, 103, 16);
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("所属部门:");
		lblNewLabel_3.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u6240\u5C5E\u90E8\u95E8.png")));
		lblNewLabel_3.setBounds(42, 201, 103, 16);
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_4 = new JLabel("购买数量:");
		lblNewLabel_4.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u8D2D\u4E70\u6570\u91CF.png")));
		lblNewLabel_4.setBounds(42, 254, 103, 16);
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5 = new JLabel("购买时间:");
		lblNewLabel_5.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u8D2D\u4E70\u65F6\u95F4.png")));
		lblNewLabel_5.setBounds(42, 301, 103, 16);
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_6 = new JLabel("购买价格:");
		lblNewLabel_6.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u8D2D\u4E70\u4EF7\u683C.png")));
		lblNewLabel_6.setBounds(42, 350, 103, 16);
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 14));
		
		Divice_numtextField = new JTextField();
		Divice_numtextField.setBounds(134, 47, 294, 21);
		Divice_numtextField.setColumns(10);
		
		Divice_nametextField = new JTextField();
		Divice_nametextField.setBounds(134, 97, 294, 21);
		Divice_nametextField.setColumns(10);
		
		Divice_kindtextField = new JTextField();
		Divice_kindtextField.setBounds(134, 149, 296, 21);
		Divice_kindtextField.setColumns(10);
		
		Device_sectiontextField = new JTextField();
		Device_sectiontextField.setBounds(134, 199, 296, 21);
		Device_sectiontextField.setColumns(10);
		
		numtextField = new JTextField();
		numtextField.setBounds(134, 252, 296, 21);
		numtextField.setColumns(10);
		
		Divice_datetextField = new JTextField();
		Divice_datetextField.setBounds(134, 299, 296, 21);
		Divice_datetextField.setColumns(10);
		
		Divice_pricetextField = new JTextField();
		Divice_pricetextField.setBounds(134, 348, 296, 21);
		Divice_pricetextField.setColumns(10);
		
		JButton confirm_addButton = new JButton("\u63D0\u4EA4");
		confirm_addButton.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u63D0\u4EA4.png")));
		confirm_addButton.setBounds(48, 406, 97, 41);
		confirm_addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				submitDivice(ae);//确认增加按钮事件
			}
		});
		confirm_addButton.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JButton reset_addButton = new JButton("\u91CD\u7F6E");
		reset_addButton.setIcon(new ImageIcon(Add_Devicefrm.class.getResource("/picture/\u91CD\u7F6E1.png")));
		reset_addButton.setBounds(348, 406, 97, 41);
		reset_addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAdd(e);//重置增加按钮事件
			}
		});
		reset_addButton.setFont(new Font("宋体", Font.PLAIN, 15));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(lblNewLabel_5);
		contentPane.add(lblNewLabel_6);
		contentPane.add(confirm_addButton);
		contentPane.add(Device_sectiontextField);
		contentPane.add(Divice_kindtextField);
		contentPane.add(numtextField);
		contentPane.add(Divice_datetextField);
		contentPane.add(Divice_pricetextField);
		contentPane.add(reset_addButton);
		contentPane.add(Divice_numtextField);
		contentPane.add(Divice_nametextField);
	}
//***********确认添加设备信息的方法*******************
	protected void submitDivice(ActionEvent ae) {
		// TODO Auto-generated method stub
		String divicenum = Divice_numtextField.getText().toString();
		String divicename = Divice_nametextField.getText().toString();
	    String divicekind = Divice_kindtextField.getText().toString();
	    String divicesection = Device_sectiontextField.getText().toString();
	    String numdivice = numtextField.getText().toString();
		String divicedate = Divice_datetextField.getText().toString();
		String diviceprice = Divice_pricetextField.getText().toString();
		if(StringUtil.isEmpty(divicenum)) {
			JOptionPane.showMessageDialog(this, "设备号不能为空！");
			return;
		}
		if(StringUtil.isEmpty(divicename)) {
			JOptionPane.showMessageDialog(this, "设备名不能为空！");
			return;
		}
		if(StringUtil.isEmpty(divicekind)) {
			JOptionPane.showMessageDialog(this, "设备类型不能为空！");
			return;
		}
		if(StringUtil.isEmpty(divicesection)) {
			JOptionPane.showMessageDialog(this, "设备所属部门不能为空！");
			return;
		}
		if(StringUtil.isEmpty(numdivice)) {
			JOptionPane.showMessageDialog(this, "设备数量不能为空！");
			return;
		}
		if(StringUtil.isEmpty(divicedate)) {
			JOptionPane.showMessageDialog(this, "设备购买日期不能为空！");
			return;
		}
		if(StringUtil.isEmpty(diviceprice)) {
			JOptionPane.showMessageDialog(this, "设备购买价格不能为空！");
			return;
		}
		Device dic = new  Device();
		dic.setDevice_num(divicenum);//把文本框所数的字符保存到Device表中
		dic.setDevice_name(divicename);
		dic.setDevice_kind(divicekind);
		dic.setDevice_section(divicesection);
		dic.setNum(Integer.valueOf(numdivice ).intValue());
		dic.setDevice_date(divicedate);
		dic.setDevise_price(Integer.valueOf(diviceprice).intValue());
		DeviceDao deviceadd = new DeviceDao();
		if(deviceadd.Add_Device(dic)) {//和数据库建立连接来添加设备信息
			JOptionPane.showMessageDialog(this, "设备信息添加成功！");
		}
		else {
			JOptionPane.showMessageDialog(this, "设备信息添加失败！");
		}
		deviceadd.closeDao();//关闭数据库的连接释放空间
		return;
	}
//*****************重置*******************
	protected void resetAdd(ActionEvent e) {
		// TODO Auto-generated method stub
		 Divice_numtextField.setText("");
		 Divice_nametextField.setText("");
		 Divice_kindtextField.setText("");
		 Device_sectiontextField.setText("");
		 numtextField.setText("");
		 Divice_datetextField.setText("");
	     Divice_pricetextField.setText("");

		
	}
}
