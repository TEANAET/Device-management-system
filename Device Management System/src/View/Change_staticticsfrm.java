package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import Dao.DeviceDao;
import Model.Device;
import Util.StringUtil;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Change_staticticsfrm extends JInternalFrame {
	private JTextField editDevice_numtextField;
	private JTextField editDevice_nametextField;
	private JTextField editDevice_kindtextField;
	private JTextField editDevice_sectiontextField;
	private JTextField editnumtextField;
	private JTextField editDevice_datetextField;
	private JTextField editDevice_pricetextField;
	private JTable change_staticticestable;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Change_staticticsfrm frame = new Change_staticticsfrm();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Change_staticticsfrm() {
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 15));
		setEnabled(false);
		setTitle("\u8BBE\u5907\u4FEE\u6539\u53CA\u7EDF\u8BA1");
		setBounds(100, 100, 974, 653);
		setClosable(true);
		setIconifiable(true);
		
		JLabel lblNewLabel = new JLabel("设备号:");
		lblNewLabel.setIcon(new ImageIcon(Change_staticticsfrm.class.getResource("/picture/\u8BBE\u5907\u53F7.png")));
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		
		editDevice_numtextField = new JTextField();
		editDevice_numtextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("设备名称:");
		lblNewLabel_1.setIcon(new ImageIcon(Change_staticticsfrm.class.getResource("/picture/\u8BBE\u5907\u540D\u79F0.png")));
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));
		
		editDevice_nametextField = new JTextField();
		editDevice_nametextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("设备种类:");
		lblNewLabel_2.setIcon(new ImageIcon(Change_staticticsfrm.class.getResource("/picture/\u8BBE\u5907\u79CD\u7C7B.png")));
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 14));
		
		editDevice_kindtextField = new JTextField();
		editDevice_kindtextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("所属部门:");
		lblNewLabel_3.setIcon(new ImageIcon(Change_staticticsfrm.class.getResource("/picture/\u6240\u5C5E\u90E8\u95E8.png")));
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 14));
		
		editDevice_sectiontextField = new JTextField();
		editDevice_sectiontextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("购买数量:");
		lblNewLabel_4.setIcon(new ImageIcon(Change_staticticsfrm.class.getResource("/picture/\u8D2D\u4E70\u6570\u91CF.png")));
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 14));
		
		editnumtextField = new JTextField();
		editnumtextField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("购买时间:");
		lblNewLabel_5.setIcon(new ImageIcon(Change_staticticsfrm.class.getResource("/picture/\u8D2D\u4E70\u65F6\u95F4.png")));
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 14));
		
		editDevice_datetextField = new JTextField();
		editDevice_datetextField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("购买价格:");
		lblNewLabel_6.setIcon(new ImageIcon(Change_staticticsfrm.class.getResource("/picture/\u8D2D\u4E70\u4EF7\u683C.png")));
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 14));
		
		editDevice_pricetextField = new JTextField();
		editDevice_pricetextField.setColumns(10);
		
		JButton btnNewButton = new JButton("确认修改");
		btnNewButton.setIcon(new ImageIcon(Change_staticticsfrm.class.getResource("/picture/\u786E\u8BA4.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitAct(e);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(editDevice_pricetextField)
						.addComponent(editDevice_sectiontextField)
						.addComponent(editDevice_numtextField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 86, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(editnumtextField)
								.addComponent(editDevice_nametextField, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 82, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(editDevice_datetextField)
								.addComponent(editDevice_kindtextField, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
							.addContainerGap(20, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)
							.addGap(121))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 888, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(editDevice_numtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(editDevice_nametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(editDevice_kindtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(editDevice_sectiontextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(editnumtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5)
						.addComponent(editDevice_datetextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(editDevice_pricetextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(118, Short.MAX_VALUE))
		);
		
		change_staticticestable = new JTable();
		change_staticticestable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectTable(e);
			}
		});
		change_staticticestable.setModel(new DefaultTableModel(
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
		scrollPane.setViewportView(change_staticticestable);
		getContentPane().setLayout(groupLayout);
		setTable(new Device());//初始化列表，即进去就可以看到数据

	}
	protected void submitAct(ActionEvent e) {
		// TODO Auto-generated method stub
		DeviceDao devicedao = new DeviceDao();
		int index = change_staticticestable.getSelectedRow();
		if(index == -1) {
			JOptionPane.showMessageDialog(this, "请选择要修改的内容！");
			return;
		}
		DefaultTableModel dft = (DefaultTableModel) change_staticticestable.getModel();
		String Device_num = dft.getValueAt(change_staticticestable.getSelectedRow(),1).toString();
		String Device_name = dft.getValueAt(change_staticticestable.getSelectedRow(),2).toString();
		String Device_kind = dft.getValueAt(change_staticticestable.getSelectedRow(),3).toString();
		String Device_section = dft.getValueAt(change_staticticestable.getSelectedRow(),4).toString();
		String num = dft.getValueAt(change_staticticestable.getSelectedRow(),5).toString();
		String Device_date = dft.getValueAt(change_staticticestable.getSelectedRow(),6).toString();
		String Device_price = dft.getValueAt(change_staticticestable.getSelectedRow(),7).toString();
		String editDevice_num = editDevice_numtextField.getText().toString();
		String editDevice_name = editDevice_nametextField.getText().toString();
		String editDevice_kind = editDevice_kindtextField.getText().toString();
		String editDevice_section = editDevice_sectiontextField.getText().toString();
		String editnum = editnumtextField.getText().toString();
		String editDevice_date = editDevice_datetextField.getText().toString();
		String editDevice_price = editDevice_pricetextField.getText().toString();
		if(StringUtil.isEmpty(editDevice_num)) {
			JOptionPane.showMessageDialog(this, "请填写要修改的设备号！");return;
		}
		if(StringUtil.isEmpty(editDevice_name)) {
			JOptionPane.showMessageDialog(this, "请填写要修改的设备名称！");return;
		}
		if(StringUtil.isEmpty(editDevice_kind)) {
			JOptionPane.showMessageDialog(this, "请填写要修改的设备种类！");return;
		}
		if(StringUtil.isEmpty(editDevice_section)) {
			JOptionPane.showMessageDialog(this, "请填写要修改的所属部门！");return;
		}
		if(StringUtil.isEmpty(editnum)) {
			JOptionPane.showMessageDialog(this, "请填写要修改的设备号！");
		}
		if(StringUtil.isEmpty(editDevice_date)) {
			JOptionPane.showMessageDialog(this, "请填写要修改的购买日期！");return;
		}
		if(StringUtil.isEmpty(editDevice_price)) {
			JOptionPane.showMessageDialog(this, "请填写要修改的购买价格！");return;
		}
		if(Device_num.equals(editDevice_num) &&Device_name.equals(editDevice_name)&&
				Device_kind.equals(editDevice_kind) &&Device_section.equals(editDevice_section) &&
				num.equals(editnum)&&Device_date.equals(editDevice_date) && Device_price.equals(editDevice_price))  {
			JOptionPane.showMessageDialog(this, "您还没有做任何修改！");return;
			
		} 
		int nuid = Integer.parseInt(dft.getValueAt(change_staticticestable.getSelectedRow(),0).toString());
		Device dc = new Device();
		dc.setID(nuid);
		dc.setDevice_num(editDevice_num);
		dc.setDevice_name(editDevice_name);
		dc.setDevice_kind(editDevice_kind);
		dc.setDevice_section(editDevice_section);
		dc.setNum(Integer.valueOf(editnum ).intValue());
		dc.setDevice_date(editDevice_date);
		dc.setDevise_price(Integer.valueOf(editDevice_price ).intValue());
		DeviceDao deviceda = new DeviceDao();
		if(deviceda.update(dc)) {
			JOptionPane.showMessageDialog(this, "修改成功！");
		}
		else {
			JOptionPane.showMessageDialog(this, "修改失败！");
			
		}
		deviceda.closeDao();
		setTable(new Device());
		return;
		
		
	}

	protected void selectTable(MouseEvent e) {
		// TODO Auto-generated method stub
		//将选中的数据返回到相应的文本框，便于修改
		DefaultTableModel df = (DefaultTableModel) change_staticticestable.getModel(); //鼠标事件
		editDevice_numtextField.setText(df.getValueAt(change_staticticestable.getSelectedRow(), 
				change_staticticestable.getSelectedColumnCount()).toString());
		editDevice_nametextField.setText(df.getValueAt(change_staticticestable.getSelectedRow(), 
				change_staticticestable.getSelectedColumnCount()+1).toString());
		editDevice_kindtextField.setText(df.getValueAt(change_staticticestable.getSelectedRow(), 
				change_staticticestable.getSelectedColumnCount()+2).toString());
		editDevice_sectiontextField.setText(df.getValueAt(change_staticticestable.getSelectedRow(),
				change_staticticestable.getSelectedColumnCount()+3).toString());
		editnumtextField.setText(df.getValueAt(change_staticticestable.getSelectedRow(), 
				change_staticticestable.getSelectedColumnCount()+4).toString());
		editDevice_datetextField.setText(df.getValueAt(change_staticticestable.getSelectedRow(),
				change_staticticestable.getSelectedColumnCount()+5).toString());
		editDevice_pricetextField.setText(df.getValueAt(change_staticticestable.getSelectedRow(), 
				change_staticticestable.getSelectedColumnCount()+6).toString());
	
	}

	public void setTable(Device dev) {
		DefaultTableModel df = (DefaultTableModel) change_staticticestable.getModel();
		df.setRowCount(0);
		DeviceDao  devicedao= new DeviceDao();
		List<Device> devicelist = devicedao.getDeviceList(dev);
		for(Device dcc : devicelist) {
			Vector ve = new Vector();
			ve.add(dcc.getID());
		    ve.add(dcc.getDevice_num());
			ve.add(dcc.getDevice_name());
			ve.add(dcc.getDevice_kind());
			ve.add(dcc.getDevice_section());
			ve.add(dcc.getNum());
			ve.add(dcc.getDevice_date());
			ve.add(dcc.getDevise_price());
			df.addRow(ve);
		}
		
	}
}
