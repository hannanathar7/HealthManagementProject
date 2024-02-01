import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class LoginIn extends JFrame {

	private JPanel contentPane;
	private JTextField UsertextField;
	private JPasswordField PasswordtextField;
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginIn frame = new LoginIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public LoginIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 1100, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.ITALIC, 16));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(605, 232, 94, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.ITALIC, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(593, 333, 110, 25);
		contentPane.add(lblNewLabel_1);
		
		UsertextField = new JTextField();
		UsertextField.setFont(new Font("Arial", Font.PLAIN, 16));
		UsertextField.setBounds(615, 268, 261, 38);
		contentPane.add(UsertextField);
		UsertextField.setColumns(10);
		
		PasswordtextField = new JPasswordField();
		PasswordtextField.setBounds(615, 366, 261, 38);
		contentPane.add(PasswordtextField);
		
		JButton btnLogIn = new JButton("Login");
		
		btnLogIn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String s1="select * from login where username=? and password=?";
				try
				{
					ps=con.prepareStatement(s1);
					ps.setString(1,UsertextField.getText());
					ps.setString(2,PasswordtextField.getText());
					rs=ps.executeQuery();
					if(rs.next())
					{
						close();
						Main obj=new Main();
						obj.setVisible(true);
						
						try {
							rs.close();
							ps.close();
							con.close();
						}
						catch (Exception e)
						{
							JOptionPane.showMessageDialog(rootPane,e);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(rootPane,"Username and password is incorrect!");
					}
					
				}
				catch (SQLException | HeadlessException e) {
		            JOptionPane.showMessageDialog(rootPane, e);
		        }
			}
		});
		btnLogIn.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\enter (2).png"));
		btnLogIn.setForeground(Color.BLACK);
		btnLogIn.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		btnLogIn.setBackground(Color.GRAY);
		btnLogIn.setBounds(680, 450, 128, 50);
		contentPane.add(btnLogIn);
		
		JLabel lblNewLabel_2 = new JLabel("KIET");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Ink Free", Font.ITALIC, 45));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(639, 68, 153, 56);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome to Kiet E-Health");
		lblNewLabel_3.setFont(new Font("Gabriola", Font.PLAIN, 22));
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(615, 171, 222, 33);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(547, 0, 535, 703);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Designed & Developed by:");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(383, 658, 140, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Hannan Athar");
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setBounds(444, 674, 79, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\Webp.net-resizeimage (2).jpg"));
		lblNewLabel_5.setBounds(12, 13, 552, 690);
		contentPane.add(lblNewLabel_5);
		
		con=connection.dbConnect();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		
	}
	
	public void close()
	{
		WindowEvent we=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Login");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
