package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.AdminDao;
import Model.Admin;
import Model.UserType;
import Util.StringUtil;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangePasswordfrm extends JInternalFrame {

	private JPanel contentPane;
	private JTextField oldPassword_textField;
	private JTextField newPassword_textField;
	private JTextField confirmPassword_textField;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePasswordfrm frame = new ChangePasswordfrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ChangePasswordfrm() {
		setFont(new Font("Dialog", Font.PLAIN, 14));
		setTitle("\u4FEE\u6539\u5BC6\u7801");
		
		setBounds(100, 100, 622, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setClosable(true);
		setIconifiable(true);
		
		
		JLabel lblNewLabel = new JLabel("ԭ����:");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 14));
		lblNewLabel.setIcon(new ImageIcon(ChangePasswordfrm.class.getResource("/picture/\u5BC6\u78012.png")));
		
		oldPassword_textField = new JTextField();
		oldPassword_textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("������:");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 14));
		lblNewLabel_1.setIcon(new ImageIcon(ChangePasswordfrm.class.getResource("/picture/\u5BC6\u7801\u4FEE\u6539.png")));
		
		newPassword_textField = new JTextField();
		newPassword_textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ȷ������:");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 14));
		lblNewLabel_2.setIcon(new ImageIcon(ChangePasswordfrm.class.getResource("/picture/\u5BC6\u7801\u4FEE\u6539.png")));
		
		confirmPassword_textField = new JTextField();
		confirmPassword_textField.setColumns(10);
		
		JButton confirm_Button = new JButton("ȷ��");
		confirm_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmEdit(e);//ȷ���޸�
			}
		});
		confirm_Button.setFont(new Font("����", Font.PLAIN, 14));
		confirm_Button.setIcon(new ImageIcon(ChangePasswordfrm.class.getResource("/picture/\u786E\u8BA4.png")));
		
		JButton reset_Bottom = new JButton("����");
		reset_Bottom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset_Password(e);//��������
			}
		});
		reset_Bottom.setFont(new Font("����", Font.PLAIN, 14));
		reset_Bottom.setIcon(new ImageIcon(ChangePasswordfrm.class.getResource("/picture/\u91CD\u7F6E1.png")));
		
		JLabel lblNewLabel_3 = new JLabel("��ǰ�û�");
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 14));
		lblNewLabel_3.setIcon(new ImageIcon(ChangePasswordfrm.class.getResource("/picture/\u7528\u62372.png")));
		
		JLabel oldUser_label = new JLabel("");
		//oldUser_label.setText("sss");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(121)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(oldUser_label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(confirm_Button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(reset_Bottom, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(confirmPassword_textField)
								.addComponent(newPassword_textField)
								.addComponent(oldPassword_textField, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
					.addContainerGap(172, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(oldUser_label))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(oldPassword_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addComponent(newPassword_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(confirmPassword_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(reset_Bottom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(confirm_Button, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
					.addGap(20))
		);
		
		contentPane.setLayout(gl_contentPane);
		if("ϵͳ����Ա".equals(Mainfrm.userType.getName())) {//�����ϵͳ����Ա
			Admin admin = (Admin)Mainfrm.userObject; //�ѵ�¼���˻���Ϣ����Admin 
			oldUser_label.setText("��ϵͳ����Ա��"+admin.getName());
			
		}
	}
	
	protected void confirmEdit(ActionEvent e) { //�޸�����
		// TODO Auto-generated method stub
		String oldPassword = oldPassword_textField.getText().toString();
		String newPassword = newPassword_textField.getText().toString();//������
		String confirmPassword = confirmPassword_textField.getText().toString();//ȷ������
		if(StringUtil.isEmpty(oldPassword)) {
			JOptionPane.showMessageDialog(this, "����д�����룡");
			return;
		}
		if(StringUtil.isEmpty(newPassword)) {
			JOptionPane.showMessageDialog(this, "����д�����룡");
			return;
		}
		if(!newPassword.equals(confirmPassword)) {
			JOptionPane.showMessageDialog(this, "������������벻һ�£����������룡");
			return;
		}
		if("ϵͳ����Ա".equals(Mainfrm.userType.getName())) {
			AdminDao admindao = new AdminDao();
			Admin adminTmp = new Admin();
			Admin admin = (Admin)Mainfrm.userObject;
			adminTmp.setName(admin.getName());//��ȡ���˻���
			adminTmp.setPassword(oldPassword);//��ȡ�������
			String jg = admindao.editPassword(admin, newPassword);//�޸�����
			JOptionPane.showMessageDialog(this,jg);
			admindao.closeDao();
			return;
		}
	}

	protected void reset_Password(ActionEvent e) {//�����޸�����
		// TODO Auto-generated method stub
		oldPassword_textField.setText("");
		newPassword_textField.setText("");
		confirmPassword_textField.setText("");
		
	}
}
