package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dao.DeviceDao;
import Model.Device;
import Model.UserType;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.JobAttributes;
import java.util.List;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Devicemessagefrm extends JInternalFrame {
	private JTable Devicelist_table;
	private JTextField searchDevicekind_textField;
	private JTextField searchDevice_sectiontextField;
	private JButton DeleteDevice_Button;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Devicemessagefrm frame = new Devicemessagefrm();
//					frame.setVisible(true);
//					//Device device = new Device();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Devicemessagefrm() {
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 15));
		setTitle("\u8BBE\u5907\u4FE1\u606F\u67E5\u627E\u548C\u5220\u9664");
		setBounds(100, 100, 831, 600);
		setClosable(true);
		setIconifiable(true);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("设备种类:");
		lblNewLabel.setIcon(new ImageIcon(Devicemessagefrm.class.getResource("/picture/\u8BBE\u5907\u79CD\u7C7B.png")));
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		
		searchDevicekind_textField = new JTextField();
		searchDevicekind_textField.setColumns(10);
		
		JButton searchDivicekind_Button = new JButton("查询1");
		searchDivicekind_Button.setIcon(new ImageIcon(Devicemessagefrm.class.getResource("/picture/\u67E5\u8BE2.png")));
		searchDivicekind_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Device device = new Device();
				device.setDevice_kind(searchDevicekind_textField.getText().toString());
				setTable(device);
				
			}
		});
		searchDivicekind_Button.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("所属部门:");
		lblNewLabel_1.setIcon(new ImageIcon(Devicemessagefrm.class.getResource("/picture/\u6240\u5C5E\u90E8\u95E8.png")));
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));
		
		searchDevice_sectiontextField = new JTextField();
		searchDevice_sectiontextField.setColumns(10);
		
		JButton searchDevice_sectionButton = new JButton("查询2");
		searchDevice_sectionButton.setIcon(new ImageIcon(Devicemessagefrm.class.getResource("/picture/\u67E5\u8BE2.png")));
		searchDevice_sectionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Device devi = new Device();
				devi.setDevice_section(searchDevice_sectiontextField.getText().toString());
				setTable(devi);
			}
		});
		searchDevice_sectionButton.setFont(new Font("宋体", Font.PLAIN, 14));
		
	     DeleteDevice_Button = new JButton("删除");
		DeleteDevice_Button.setIcon(new ImageIcon(Devicemessagefrm.class.getResource("/picture/\u5220\u9664.png")));
		DeleteDevice_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitDelete(e);
			}
		});
		DeleteDevice_Button.setFont(new Font("宋体", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(100)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(searchDevice_sectiontextField)
								.addComponent(searchDevicekind_textField, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
							.addGap(88)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(searchDivicekind_Button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(searchDevice_sectionButton, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 735, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(45, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(589, Short.MAX_VALUE)
					.addComponent(DeleteDevice_Button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(133))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(searchDevicekind_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(searchDivicekind_Button, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(searchDevice_sectiontextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(searchDevice_sectionButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(DeleteDevice_Button, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(59))
		);
		
		Devicelist_table = new JTable();
		Devicelist_table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectTableRow(e);
			}
		});
		Devicelist_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "\u8BBE\u5907\u53F7", "\u8BBE\u5907\u540D\u79F0", "\u8BBE\u5907\u79CD\u7C7B", "\u6240\u5C5E\u90E8\u95E8", "\u8D2D\u4E70\u6570\u91CF", "\u8D2D\u4E70\u65F6\u95F4", "\u8D2D\u4E70\u4EF7\u683C"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(Devicelist_table);
		getContentPane().setLayout(groupLayout);
		setTable(new Device());
		

	}
	protected void submitDelete(ActionEvent e) {
		// TODO Auto-generated method stub
		int index = Devicelist_table.getSelectedRow();
		DefaultTableModel df = (DefaultTableModel) Devicelist_table.getModel();
		if(index == -1) {
			JOptionPane.showMessageDialog(this, "请选择要删除的内容！");
			return;
		}
		int num1 = Integer.parseInt(df.getValueAt(Devicelist_table.getSelectedRow(),0).toString());
		DeviceDao  devicedo= new DeviceDao();
		if(JOptionPane.showConfirmDialog(Devicemessagefrm.this,"确定删除吗？")==JOptionPane.OK_OPTION) {
		
		if(devicedo.delete(num1)){
			JOptionPane.showMessageDialog(this, "删除成功！");
		}
		else {
			JOptionPane.showMessageDialog(this, "删除失败！");
		}
		devicedo.closeDao();  //关闭数据库的连接
		setTable(new Device());//刷新表界面
		return;
		}
	}

	protected void selectTableRow(MouseEvent e) {//鼠标事件，用来选择表中的行
		// TODO Auto-generated method stub
		DefaultTableModel df = (DefaultTableModel) Devicelist_table.getModel();
		
	}

	public void setTable(Device device) {              //设置列表，将数据库的数据在列表上显示出来
		DefaultTableModel dft = (DefaultTableModel) Devicelist_table.getModel();//获取表格的模式
		dft.setRowCount(0);//从第0个开始
		DeviceDao  devicedao= new DeviceDao();
		List<Device> devicelist = devicedao.getDeviceList(device);
		for(Device dc : devicelist) {
			Vector v = new Vector();//Vector 类实现了一个动态数组
			v.add(dc.getID());//添加数据到数组
		    v.add(dc.getDevice_num());
			v.add(dc.getDevice_name());
			v.add(dc.getDevice_kind());
			v.add(dc.getDevice_section());
			v.add(dc.getNum());
			v.add(dc.getDevice_date());
			v.add(dc.getDevise_price());
			dft.addRow(v);//向JTable中添加一条数据(v)
		}
		
	
	}
}
