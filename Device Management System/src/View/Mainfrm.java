package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.UserType;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Toolkit;

public class Mainfrm extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	public static UserType userType;
	public static Object userObject;
	private JMenuItem changepwmntmNewMenuItem;//����Ϊ˽�ж��󣬷������Ϊ��ͬ�û��������ز���Ҫ�Ĺ��ܡ�
	private JMenuItem Device_addmntmNewMenuItem;
	private JMenuItem Device_changemntmNewMenuItem;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Mainfrm frame = new Mainfrm(null,null);
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
	public Mainfrm(UserType userType,Object userObject) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Mainfrm.class.getResource("/picture/zhucaidan.png")));
		this.userType = userType;//�û�����
		this.userObject = userObject;//�û�����
		setFont(new Font("����", Font.PLAIN, 14));
		setTitle("\u8BBE\u5907\u7BA1\u7406\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 1339, 776);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("ϵͳ�޸�");
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mnNewMenu.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/shebeiguanli1.png")));
		menuBar.add(mnNewMenu);
		
	    changepwmntmNewMenuItem = new JMenuItem("�����޸�");
		changepwmntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePassword(e);
			}
		});
		changepwmntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		changepwmntmNewMenuItem.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/\u5BC6\u7801\u4FEE\u6539.png")));
		mnNewMenu.add(changepwmntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("�˳�ϵͳ");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//����һ���¼��˳�ϵͳ
				if(JOptionPane.showConfirmDialog(Mainfrm.this,"ȷ���˳���")==JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mntmNewMenuItem_1.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/tuichu.png")));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("�豸����");
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mnNewMenu_1.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/\u8BBE\u5907\u7BA1\u7406.png")));
		menuBar.add(mnNewMenu_1);
		
	    Device_addmntmNewMenuItem = new JMenuItem("�豸��Ϣ���");
		Device_addmntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {//����һ�������豸��Ϣ���¼�
				Adddevice(ae);
			}
		});
		Device_addmntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		Device_addmntmNewMenuItem.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/\u8BBE\u5907\u6DFB\u52A0.png")));
		mnNewMenu_1.add(Device_addmntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("�豸��Ϣ����Ҽ�ɾ��");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Devicemessagefrm devicemessagefrm = new Devicemessagefrm();
				devicemessagefrm.setVisible(true);//���豸��Ϣ����
				desktopPane.add(devicemessagefrm);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mntmNewMenuItem_3.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/\u8BBE\u5907\u5217\u8868.png")));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
	    Device_changemntmNewMenuItem = new JMenuItem("�豸��Ϣ�޸�");
	    Device_changemntmNewMenuItem.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/\u4FEE\u6539.png")));
		Device_changemntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change_staticticsfrm change_staticticsfrm = new Change_staticticsfrm();
				change_staticticsfrm.setVisible(true);//���޸���Ϣ����
				desktopPane.add(change_staticticsfrm);
			}
		});
		Device_changemntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mnNewMenu_1.add(Device_changemntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("����");
		mnNewMenu_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mnNewMenu_2.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/\u5E2E\u52A9.png")));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("��������");
		mntmNewMenuItem_4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//����һ���¼������ڡ�
				AboutUs(e);
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon(Mainfrm.class.getResource("/picture/\u5173\u4E8E.png")));
		mnNewMenu_2.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	    desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setAuth();//���ع���
	}

	protected void Adddevice(ActionEvent ae) {//ʵ�������豸��Ϣ�¼��ķ���
		// TODO Auto-generated method stub
		Add_Devicefrm adD = new Add_Devicefrm();
		adD.setVisible(true);//�������Ϣ����
		desktopPane.add(adD);//��������ӵ����ⴰ����ʾ
	}

	protected void ChangePassword(ActionEvent e) {//ʵ���޸�����˵��ķ���
		// TODO Auto-generated method stub
		ChangePasswordfrm chpas = new ChangePasswordfrm();
		chpas.setVisible(true);//���޸��������
		desktopPane.add(chpas);
		
	}

	protected void AboutUs(ActionEvent e) {  //����ϵͳ
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "�豸����ϵͳ�� ");
	}
	//*******���ع���*************
	private void setAuth() {
		if("Ա��".equals(userType.getName())) {//�����Ա����¼��������Ӧ�Ĺ���
			changepwmntmNewMenuItem.setEnabled(false);
			Device_addmntmNewMenuItem.setEnabled(false);
			Device_changemntmNewMenuItem.setEnabled(false);
			
		}
		
	}
}
