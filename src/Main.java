import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.RenderingHints;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.BoxLayout;


import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JPasswordField;

import javax.mail.*;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



public class Main extends JFrame {

	private JPanel contentPane;
	
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private JTable table_student;
	private JTable shorttable;
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield4;
	private JTextField textfield5;
	private JTextField textfield6;
	private JTextField textfield7;
	private JTextField textfield8;
	private JTextField textfield10;
	private JTextField textfieldsearch;
	private JTextField textfieldupload;
	private byte[] personImg=null;
	private JTextField textfieldfrom;
	private JTextField textfieldto;
	private JTextField textfieldsubject;
	private JTextField textfieldtext;
	private JTextField textfieldlocation;
	private JTextField textfieldname;
	private JPasswordField textfieldpassword;
	private String filepath="";
	private JTable doctable;
	private JTextField attachtextfield;
	private JTextField docidtextfield;
	private JTextField studentidtextfield;
	private JTextField docnametextfield;
	private JTextField textField;
	private JLabel labelchartage;
	private JLabel labelchartheight;
	private JLabel labelchartweight;
	private JTextField o1;
	private JTextField o2;
	private JTextField o3;
	private JTextField o4;
	private JTextField o5;
	private JTextField o6;
	private JTextField o7;
	private JTextField o8;
	private JTextField o9;
	private JTextField m1;
	private JTextField m2;
	private JTextField m3;
	private JTextField m4;
	private JTextField m5;
	private JTextField m6;
	private JTextField m7;
	private JTextField m8;
	private JTextField m9;
	private JTextField fe1;
	private JTextField fe2;
	private JTextField fe3;
	private JTextField fe4;
	private JTextField fe5;
	private JTextField fe6;
	private JTextField fe7;
	private JTextField fe8;
	private JTextField fe9;
	private JTextField d1;
	private JTextField d2;
	private JTextField d3;
	private JTextField d4;
	private JTextField d5;
	private JTextField d6;
	private JTextField d7;
	private JTextField d8;
	private JTextField d9;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private String status="";
	private String decision="";
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 1100, 750);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem CloseMenuItem = new JMenuItem("Close");
		CloseMenuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
				
				
				try {
					
					close();
					LoginIn obj=new LoginIn();
					obj.setVisible(true);
					
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(rootPane,e);
				}
				
				finally {
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
				
			}
		});
		CloseMenuItem.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\iconfinder_Close_1891023.png"));
		CloseMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mnNewMenu.add(CloseMenuItem);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit from Software");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\iconfinder_close_981077.png"));
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		
		
		JMenu mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem offlinehelp = new JMenuItem("Offline Help");
		offlinehelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Files\\Help.pdf");
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(rootPane,"Error Opening file!");
				}
			}
		});
		offlinehelp.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_Help_Circle_Blue_34225.png"));
		offlinehelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnNewMenu_2.add(offlinehelp);
		
		JMenuItem webhelp = new JMenuItem("Web Help");
		webhelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					String url="https://www.youtube.com/watch?v=Zl68mmfRUM4&list=PL_4v6TqUdcY7BImeLxntj3ntA4vUrHFTT&index=1";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				}
				catch (IOException ex)
				{
				JOptionPane.showMessageDialog(rootPane,ex);	
				}
			}
		});
		webhelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		webhelp.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_1_4698588.png"));
		mnNewMenu_2.add(webhelp);
		
		JMenu mnNewMenu_3 = new JMenu("About");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("About Developer");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					String url="www.linkedin.com/in/hannanathar7";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				}
				catch (IOException ex)
				{
				JOptionPane.showMessageDialog(rootPane,ex);	
				}
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_Help_1493288 (1).png"));
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnNewMenu_3.add(mntmNewMenuItem_2);
		
		JMenu menudate = new JMenu("Date");
		menuBar.add(menudate);
		Calendar cal=new GregorianCalendar();
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int month=cal.get(Calendar.MONTH);
		int year=cal.get(Calendar.YEAR);
		menudate.setText("Current Date:"+day+"/"+(month+1)+"/"+year);
		menudate.setForeground(Color.blue);
		
		JMenu menutime = new JMenu("Time");
		menuBar.add(menutime);
		
		int second=cal.get(Calendar.SECOND);
		int minute=cal.get(Calendar.MINUTE);
		int hour=cal.get(Calendar.HOUR);
		menutime.setText("Current Time:"+hour+":"+minute+":"+second);
		menutime.setForeground(Color.red);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(5, 5, 1072, 25);
		toolBar.setBackground(Color.WHITE);
		contentPane.add(toolBar);
		
		
		
		JButton btnNewButton = new JButton("Sign Out");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\iconfinder_Close_1891023.png"));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					close();
					LoginIn obj=new LoginIn();
					obj.setVisible(true);
					
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(rootPane,e1);
				}
				
				finally {
					try {
						rs.close();
						ps.close();
						con.close();
					}
					catch (Exception e1)
					{
						JOptionPane.showMessageDialog(rootPane,e1);
					}
				}
				
			}
		});
		toolBar.add(btnNewButton);
		
		JButton helpbtn = new JButton("Help");
		helpbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Files\\Help.pdf");
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(rootPane,"Error Opening file!");
				}
			}
		});
		helpbtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		helpbtn.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_Help_Circle_Blue_34225.png"));
		toolBar.add(helpbtn);
		
		JButton btnNewButton_2 = new JButton("About");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					String url="www.linkedin.com/in/hannanathar7";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				}
				catch (IOException ex)
				{
				JOptionPane.showMessageDialog(rootPane,ex);	
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_admin_87402.png"));
		toolBar.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 255, 0)), "Action Panel", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)), "Action Panel", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255)));
		panel.setBackground(new Color(0, 0, 205));
		panel.setBounds(5, 294, 1077, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(0, 13, 1077, 370);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Data Table", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 750, 165);
		panel_1.add(scrollPane);
		
		table_student = new JTable();
		scrollPane.setViewportView(table_student);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(0, 164, 750, 175);
		panel_12.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 255, 0)), "Report", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_12.setBackground(new Color(100, 149, 237));
		panel_1.add(panel_12);
		panel_12.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(425, 30, 256, 95);
		panel_12.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Comment");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_16.setBounds(334, 47, 79, 16);
		panel_12.add(lblNewLabel_16);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Good");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				status = "Good. No need action. ";
			}
		});
		rdbtnNewRadioButton.setForeground(new Color(0, 255, 0));
		rdbtnNewRadioButton.setBounds(121, 30, 68, 25);
		panel_12.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Not Good");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				status = "Good. No need action. ";
			}
		});
		rdbtnNewRadioButton_1.setForeground(new Color(255, 0, 0));
		rdbtnNewRadioButton_1.setBounds(199, 30, 87, 25);
		panel_12.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_17 = new JLabel("Health Status");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_17.setBounds(12, 34, 101, 16);
		panel_12.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Attachment");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_18.setBounds(12, 69, 87, 16);
		panel_12.add(lblNewLabel_18);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Include Chart");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision = "checked";
			}
		});
		chckbxNewCheckBox.setForeground(new Color(0, 0, 255));
		chckbxNewCheckBox.setBounds(121, 65, 115, 25);
		panel_12.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("No chart");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision = "Not checked";
			}
		});
		chckbxNewCheckBox_1.setForeground(new Color(0, 0, 255));
		chckbxNewCheckBox_1.setBounds(244, 65, 79, 25);
		panel_12.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton_1 = new JButton("Generate Report");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_Generate-tables_85519.png"));
		btnNewButton_1.setForeground(new Color(0, 0, 139));
		btnNewButton_1.setBounds(131, 99, 177, 25);
		panel_12.add(btnNewButton_1);
		
		JPanel panel_13 = new JPanel();
		panel_13.setForeground(new Color(0, 0, 0));
		panel_13.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 255, 0)), "Indicator", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_13.setBounds(749, 0, 323, 339);
		panel_1.add(panel_13);
		panel_13.setLayout(null);
		
		JSlider slider1 = new JSlider();
		slider1.setValue(100);
		slider1.setMajorTickSpacing(10);
		slider1.setForeground(new Color(30, 144, 255));
		slider1.setPaintTicks(true);
		slider1.setBounds(111, 43, 200, 36);
		panel_13.add(slider1);
		
		JSlider slider2 = new JSlider();
		slider2.setMajorTickSpacing(10);
		slider2.setPaintTicks(true);
		slider2.setForeground(new Color(30, 144, 255));
		slider2.setBounds(111, 92, 200, 36);
		panel_13.add(slider2);
		
		JSlider slider3 = new JSlider();
		slider3.setMajorTickSpacing(10);
		slider3.setPaintTicks(true);
		slider3.setForeground(new Color(30, 144, 255));
		slider3.setBounds(111, 139, 200, 36);
		panel_13.add(slider3);
		
		JLabel lblNewLabel_19 = new JLabel("Age");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_19.setBounds(25, 51, 56, 16);
		panel_13.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Height");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_20.setBounds(25, 99, 56, 16);
		panel_13.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Weight");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_21.setBounds(25, 145, 56, 16);
		panel_13.add(lblNewLabel_21);
		
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(30, 144, 255));
		tabbedPane.addTab("Chart", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(28, 31, 216, 258);
		panel_14.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 200, 0)), "Each Student", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_2.add(panel_14);
		panel_14.setLayout(null);
		
		
		
		JButton barbutton = new JButton("Bar Chart");
		barbutton.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder__76ui_2303181.png"));
		barbutton.setBounds(46, 81, 128, 25);
		panel_14.add(barbutton);
		
		JButton linebutton = new JButton("Line Chart");
		linebutton.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_line_chart_172493.png"));
		linebutton.setBounds(46, 132, 128, 25);
		panel_14.add(linebutton);
		
		JButton overbutton = new JButton("Overlaid");
		overbutton.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_10_2172762.png"));
		overbutton.setBounds(46, 182, 128, 25);
		panel_14.add(overbutton);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(276, 31, 223, 258);
		panel_15.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 200, 0)), "Overall", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_2.add(panel_15);
		panel_15.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Age", "Height", "Weight"}));
		comboBox.setBounds(56, 32, 118, 22);
		panel_15.add(comboBox);
		
		JButton buttonbar = new JButton("Bar Chart");
		buttonbar.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder__76ui_2303181.png"));
		buttonbar.setBounds(56, 79, 118, 25);
		panel_15.add(buttonbar);
		
		JButton buttonline = new JButton("Line Chart");
		buttonline.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_line_chart_172493.png"));
		buttonline.setBounds(56, 132, 118, 25);
		panel_15.add(buttonline);
		
		JButton buttonover = new JButton("Overlaid");
		buttonover.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_10_2172762.png"));
		buttonover.setBounds(56, 180, 118, 25);
		panel_15.add(buttonover);
		
		JPanel panelchart = new JPanel();
		panelchart.setBounds(722, 13, 338, 313);
		panel_2.add(panelchart);
		panelchart.setLayout(null);
		
		JLabel labelchart = new JLabel("Chart");
		labelchart.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_10_1516234.png"));
		labelchart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelchart.setHorizontalAlignment(SwingConstants.CENTER);
		labelchart.setBounds(121, 114, 93, 37);
		panelchart.add(labelchart);
		
		JButton capturebutton = new JButton("Capture");
		capturebutton.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_Camera_2431363.png"));
		capturebutton.setBounds(569, 118, 114, 25);
		panel_2.add(capturebutton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(30, 144, 255));
		tabbedPane.addTab("Statistics", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(30, 144, 255));
		panel_16.setBounds(0, 13, 226, 313);
		panel_3.add(panel_16);
		panel_16.setLayout(null);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(0, 0, 139));
		panel_20.setBounds(0, 0, 230, 53);
		panel_16.add(panel_20);
		panel_20.setLayout(null);
		
		JLabel lblNewLabel_22 = new JLabel("OVERALL");
		lblNewLabel_22.setForeground(new Color(192, 192, 192));
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setBounds(30, 13, 158, 27);
		panel_20.add(lblNewLabel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(SystemColor.control);
		panel_23.setBounds(54, 88, 171, 225);
		panel_16.add(panel_23);
		panel_23.setLayout(null);
		
		JLabel lblNewLabel_23 = new JLabel("Mean");
		lblNewLabel_23.setForeground(Color.BLUE);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setBounds(0, 13, 56, 16);
		panel_23.add(lblNewLabel_23);
		
		JLabel lblMedian = new JLabel("Median");
		lblMedian.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedian.setForeground(Color.BLUE);
		lblMedian.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMedian.setBounds(52, 13, 56, 16);
		panel_23.add(lblMedian);
		
		JLabel lblMode = new JLabel("Mode");
		lblMode.setHorizontalAlignment(SwingConstants.CENTER);
		lblMode.setForeground(Color.BLUE);
		lblMode.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMode.setBounds(108, 13, 56, 16);
		panel_23.add(lblMode);
		
		o1 = new JTextField();
		o1.setBounds(10, 42, 46, 22);
		panel_23.add(o1);
		o1.setColumns(10);
		
		o2 = new JTextField();
		o2.setColumns(10);
		o2.setBounds(62, 41, 46, 22);
		panel_23.add(o2);
		
		o3 = new JTextField();
		o3.setColumns(10);
		o3.setBounds(118, 41, 46, 22);
		panel_23.add(o3);
		
		o4 = new JTextField();
		o4.setColumns(10);
		o4.setBounds(10, 89, 46, 22);
		panel_23.add(o4);
		
		o5 = new JTextField();
		o5.setColumns(10);
		o5.setBounds(62, 89, 46, 22);
		panel_23.add(o5);
		
		o6 = new JTextField();
		o6.setColumns(10);
		o6.setBounds(118, 89, 46, 22);
		panel_23.add(o6);
		
		o7 = new JTextField();
		o7.setColumns(10);
		o7.setBounds(10, 135, 46, 22);
		panel_23.add(o7);
		
		o8 = new JTextField();
		o8.setColumns(10);
		o8.setBounds(62, 135, 46, 22);
		panel_23.add(o8);
		
		o9 = new JTextField();
		o9.setColumns(10);
		o9.setBounds(118, 135, 46, 22);
		panel_23.add(o9);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setForeground(Color.BLUE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAge.setBounds(0, 134, 56, 16);
		panel_16.add(lblAge);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setForeground(Color.BLUE);
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHeight.setBounds(0, 178, 56, 16);
		panel_16.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeight.setForeground(Color.BLUE);
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWeight.setBounds(0, 225, 56, 16);
		panel_16.add(lblWeight);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(904, 13, 168, 313);
		panel_3.add(panel_19);
		panel_19.setLayout(null);
		
		JLabel lblNewLabel_24 = new JLabel("Male");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_24.setBounds(12, 87, 30, 16);
		panel_19.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Female");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_25.setBounds(12, 128, 56, 16);
		panel_19.add(lblNewLabel_25);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotal.setBounds(12, 169, 56, 16);
		panel_19.add(lblTotal);
		
		JLabel label = new JLabel("=");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(61, 87, 19, 16);
		panel_19.add(label);
		
		JLabel label_7 = new JLabel("=");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(61, 128, 19, 16);
		panel_19.add(label_7);
		
		JLabel label_14 = new JLabel("=");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_14.setBounds(61, 169, 19, 16);
		panel_19.add(label_14);
		
		t1 = new JTextField();
		t1.setBounds(81, 84, 75, 22);
		panel_19.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(80, 125, 75, 22);
		panel_19.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(81, 166, 75, 22);
		panel_19.add(t3);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(new Color(30, 144, 255));
		panel_17.setBounds(227, 13, 226, 313);
		panel_3.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(new Color(0, 0, 139));
		panel_18.setBounds(0, 0, 230, 53);
		panel_17.add(panel_18);
		
		JLabel lblMaleStudent = new JLabel("MALE STUDENT");
		lblMaleStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaleStudent.setForeground(Color.LIGHT_GRAY);
		lblMaleStudent.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMaleStudent.setBounds(30, 13, 158, 27);
		panel_18.add(lblMaleStudent);
		
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(SystemColor.menu);
		panel_21.setBounds(54, 88, 171, 225);
		panel_17.add(panel_21);
		
		JLabel label_1 = new JLabel("Mean");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(0, 13, 56, 16);
		panel_21.add(label_1);
		
		JLabel label_2 = new JLabel("Median");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(52, 13, 56, 16);
		panel_21.add(label_2);
		
		JLabel label_3 = new JLabel("Mode");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(108, 13, 56, 16);
		panel_21.add(label_3);
		
		m1 = new JTextField();
		m1.setColumns(10);
		m1.setBounds(10, 42, 46, 22);
		panel_21.add(m1);
		
		m2 = new JTextField();
		m2.setColumns(10);
		m2.setBounds(62, 41, 46, 22);
		panel_21.add(m2);
		
		m3 = new JTextField();
		m3.setColumns(10);
		m3.setBounds(118, 41, 46, 22);
		panel_21.add(m3);
		
		m4 = new JTextField();
		m4.setColumns(10);
		m4.setBounds(10, 89, 46, 22);
		panel_21.add(m4);
		
		m5 = new JTextField();
		m5.setColumns(10);
		m5.setBounds(62, 89, 46, 22);
		panel_21.add(m5);
		
		m6 = new JTextField();
		m6.setColumns(10);
		m6.setBounds(118, 89, 46, 22);
		panel_21.add(m6);
		
		m7 = new JTextField();
		m7.setColumns(10);
		m7.setBounds(10, 135, 46, 22);
		panel_21.add(m7);
		
		m8 = new JTextField();
		m8.setColumns(10);
		m8.setBounds(62, 135, 46, 22);
		panel_21.add(m8);
		
		m9 = new JTextField();
		m9.setColumns(10);
		m9.setBounds(118, 135, 46, 22);
		panel_21.add(m9);
		
		JLabel label_4 = new JLabel("Age");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(0, 134, 56, 16);
		panel_17.add(label_4);
		
		JLabel label_5 = new JLabel("Height");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_5.setBounds(0, 178, 56, 16);
		panel_17.add(label_5);
		
		JLabel label_6 = new JLabel("Weight");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.BLUE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_6.setBounds(0, 225, 56, 16);
		panel_17.add(label_6);
		
		
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(new Color(30, 144, 255));
		panel_22.setBounds(451, 13, 226, 313);
		panel_3.add(panel_22);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(new Color(0, 0, 139));
		panel_24.setBounds(0, 0, 230, 53);
		panel_22.add(panel_24);
		
		JLabel lblFemaleStudent = new JLabel("FEMALE STUDENT");
		lblFemaleStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblFemaleStudent.setForeground(Color.LIGHT_GRAY);
		lblFemaleStudent.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFemaleStudent.setBounds(12, 13, 191, 27);
		panel_24.add(lblFemaleStudent);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(SystemColor.menu);
		panel_25.setBounds(54, 88, 171, 225);
		panel_22.add(panel_25);
		
		JLabel label_8 = new JLabel("Mean");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.BLUE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_8.setBounds(0, 13, 56, 16);
		panel_25.add(label_8);
		
		JLabel label_9 = new JLabel("Median");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_9.setBounds(52, 13, 56, 16);
		panel_25.add(label_9);
		
		JLabel label_10 = new JLabel("Mode");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.BLUE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(108, 13, 56, 16);
		panel_25.add(label_10);
		
		fe1 = new JTextField();
		fe1.setColumns(10);
		fe1.setBounds(10, 42, 46, 22);
		panel_25.add(fe1);
		
		fe2 = new JTextField();
		fe2.setColumns(10);
		fe2.setBounds(62, 41, 46, 22);
		panel_25.add(fe2);
		
		fe3 = new JTextField();
		fe3.setColumns(10);
		fe3.setBounds(118, 41, 46, 22);
		panel_25.add(fe3);
		
		fe4 = new JTextField();
		fe4.setColumns(10);
		fe4.setBounds(10, 89, 46, 22);
		panel_25.add(fe4);
		
		fe5 = new JTextField();
		fe5.setColumns(10);
		fe5.setBounds(62, 89, 46, 22);
		panel_25.add(fe5);
		
		fe6 = new JTextField();
		fe6.setColumns(10);
		fe6.setBounds(118, 89, 46, 22);
		panel_25.add(fe6);
		
		fe7 = new JTextField();
		fe7.setColumns(10);
		fe7.setBounds(10, 135, 46, 22);
		panel_25.add(fe7);
		
		fe8 = new JTextField();
		fe8.setColumns(10);
		fe8.setBounds(62, 135, 46, 22);
		panel_25.add(fe8);
		
		fe9 = new JTextField();
		fe9.setColumns(10);
		fe9.setBounds(118, 135, 46, 22);
		panel_25.add(fe9);
		
		JLabel label_11 = new JLabel("Age");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.BLUE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBounds(0, 134, 56, 16);
		panel_22.add(label_11);
		
		JLabel label_12 = new JLabel("Height");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.BLUE);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_12.setBounds(0, 178, 56, 16);
		panel_22.add(label_12);
		
		JLabel label_13 = new JLabel("Weight");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.BLUE);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_13.setBounds(0, 225, 56, 16);
		panel_22.add(label_13);
		
		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBackground(new Color(30, 144, 255));
		panel_26.setBounds(676, 13, 226, 313);
		panel_3.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBackground(new Color(0, 0, 139));
		panel_27.setBounds(0, 0, 230, 53);
		panel_26.add(panel_27);
		
		JLabel lblDeviation = new JLabel("DEVIATION");
		lblDeviation.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeviation.setForeground(Color.LIGHT_GRAY);
		lblDeviation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeviation.setBounds(29, 13, 136, 27);
		panel_27.add(lblDeviation);
		
		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBackground(SystemColor.menu);
		panel_28.setBounds(54, 88, 171, 225);
		panel_26.add(panel_28);
		
		JLabel label_15 = new JLabel("Mean");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(Color.BLUE);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_15.setBounds(0, 13, 56, 16);
		panel_28.add(label_15);
		
		JLabel label_16 = new JLabel("Median");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(Color.BLUE);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_16.setBounds(52, 13, 56, 16);
		panel_28.add(label_16);
		
		JLabel label_17 = new JLabel("Mode");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.BLUE);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_17.setBounds(108, 13, 56, 16);
		panel_28.add(label_17);
		
		d1 = new JTextField();
		d1.setColumns(10);
		d1.setBounds(10, 42, 46, 22);
		panel_28.add(d1);
		
		d2 = new JTextField();
		d2.setColumns(10);
		d2.setBounds(62, 41, 46, 22);
		panel_28.add(d2);
		
		d3 = new JTextField();
		d3.setColumns(10);
		d3.setBounds(118, 41, 46, 22);
		panel_28.add(d3);
		
		d4 = new JTextField();
		d4.setColumns(10);
		d4.setBounds(10, 89, 46, 22);
		panel_28.add(d4);
		
		d5 = new JTextField();
		d5.setColumns(10);
		d5.setBounds(62, 89, 46, 22);
		panel_28.add(d5);
		
		d6 = new JTextField();
		d6.setColumns(10);
		d6.setBounds(118, 89, 46, 22);
		panel_28.add(d6);
		
		d7 = new JTextField();
		d7.setColumns(10);
		d7.setBounds(10, 135, 46, 22);
		panel_28.add(d7);
		
		d8 = new JTextField();
		d8.setColumns(10);
		d8.setBounds(62, 135, 46, 22);
		panel_28.add(d8);
		
		d9 = new JTextField();
		d9.setColumns(10);
		d9.setBounds(118, 135, 46, 22);
		panel_28.add(d9);
		
		JLabel label_18 = new JLabel("Age");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.BLUE);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_18.setBounds(0, 134, 56, 16);
		panel_26.add(label_18);
		
		JLabel label_19 = new JLabel("Height");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(Color.BLUE);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_19.setBounds(0, 178, 56, 16);
		panel_26.add(label_19);
		
		JLabel label_20 = new JLabel("Weight");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(Color.BLUE);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_20.setBounds(0, 225, 56, 16);
		panel_26.add(label_20);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Documents", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel locationtextfield = new JPanel();
		locationtextfield.setBackground(new Color(30, 144, 255));
		locationtextfield.setBounds(45, 35, 983, 268);
		panel_4.add(locationtextfield);
		locationtextfield.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try {
					
					int row=doctable.getSelectedRow();
					String tableClick=(doctable.getModel().getValueAt(row,0).toString());
					String sql= "Select * from document where Doc_id = '"+tableClick+"' ";
					ps=con.prepareStatement(sql);
					rs=ps.executeQuery();
					
					if(rs.next())
					{
						docidtextfield.setText(rs.getString("Doc_id"));
						studentidtextfield.setText(rs.getString("Student_id"));
						docnametextfield.setText(rs.getString("Doc_name"));
						attachtextfield.setText(rs.getString("Path"));
						
						
					}
				}
				
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(rootPane,ex);
				}
				
				try {
					
					int row=doctable.getSelectedRow();
					String tableClick=(doctable.getModel().getValueAt(row,3).toString());
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+tableClick);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(rootPane,ex);
				}
			}
		});
		scrollPane_2.setBounds(451, 32, 484, 193);
		locationtextfield.add(scrollPane_2);
		
		doctable = new JTable();
		scrollPane_2.setViewportView(doctable);
		
		JButton attachbutton = new JButton("Attach");
		attachbutton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
				JFileChooser chooser=new JFileChooser();
				chooser.showOpenDialog(rootPane);
				
				File f=chooser.getSelectedFile();
				String docfilepath=f.getAbsolutePath();
				attachtextfield.setText(docfilepath);
			}
		});
		attachbutton.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\iconfinder_General_Office_14_3592866.png"));
		attachbutton.setBounds(248, 43, 107, 25);
		locationtextfield.add(attachbutton);
		
		JButton addbutton = new JButton("Add");
		addbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql="insert into document(Doc_id,Student_id,Doc_name,Path)" + "values(?,?,?,?)";
				
				try
				{
					ps=con.prepareStatement(sql);
					
					ps.setString(1,docidtextfield.getText());
					ps.setString(2,studentidtextfield.getText());
					ps.setString(3,docnametextfield.getText());
					ps.setString(4,attachtextfield.getText());
					
					
					ps.execute();
					JOptionPane.showMessageDialog(rootPane, "Saved.");
				}
				
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(rootPane, ex);
				}
				
				updatedocumenttable();
				
				
			}
		});
		addbutton.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\iconfinder_ic_note_add_48px_3669317.png"));
		addbutton.setBounds(248, 92, 107, 25);
		locationtextfield.add(addbutton);
		
		JButton deletebutton = new JButton("Delete");
		deletebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int p=JOptionPane.showConfirmDialog(rootPane,"Do you really want to delete?","Delete",JOptionPane.YES_NO_OPTION);
				if(p==0)
				{
					String sql="delete from document where Doc_id=?";
					try
					{
						ps=con.prepareStatement(sql);
						ps.setString(1,docidtextfield.getText());
						ps.execute();
						
						JOptionPane.showMessageDialog(rootPane,"Deleted!");
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(rootPane,ex);
					}
					
					updatedocumenttable();
				}
			}
		});
		deletebutton.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\iconfinder_Delete_2290850.png"));
		deletebutton.setBounds(248, 143, 107, 25);
		locationtextfield.add(deletebutton);
		
		JButton clearbutton = new JButton("Clear");
		clearbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docidtextfield.setText(null);
				studentidtextfield.setText(null);
				docnametextfield.setText(null);
				attachtextfield.setText(null);
				
			}
		});
		clearbutton.setIcon(new ImageIcon("C:\\Users\\HANNAN ATHAR\\Downloads\\iconfinder_edit-clear_38988.png"));
		clearbutton.setBounds(248, 193, 107, 25);
		locationtextfield.add(clearbutton);
		
		attachtextfield = new JTextField();
		attachtextfield.setBounds(26, 44, 178, 22);
		locationtextfield.add(attachtextfield);
		attachtextfield.setColumns(10);
		
		docidtextfield = new JTextField();
		docidtextfield.setBounds(97, 93, 107, 22);
		locationtextfield.add(docidtextfield);
		docidtextfield.setColumns(10);
		
		studentidtextfield = new JTextField();
		studentidtextfield.setBounds(97, 144, 107, 22);
		locationtextfield.add(studentidtextfield);
		studentidtextfield.setColumns(10);
		
		docnametextfield = new JTextField();
		docnametextfield.setBounds(97, 194, 107, 22);
		locationtextfield.add(docnametextfield);
		docnametextfield.setColumns(10);
		
		JLabel docidlabel = new JLabel("Doc Id");
		docidlabel.setForeground(new Color(255, 215, 0));
		docidlabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		docidlabel.setBounds(29, 101, 56, 16);
		locationtextfield.add(docidlabel);
		
		JLabel studentidlabel = new JLabel("Student Id");
		studentidlabel.setForeground(new Color(255, 215, 0));
		studentidlabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		studentidlabel.setBounds(12, 146, 87, 16);
		locationtextfield.add(studentidlabel);
		
		JLabel docnamelabel = new JLabel("Doc Name");
		docnamelabel.setForeground(new Color(255, 215, 0));
		docnamelabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		docnamelabel.setBounds(12, 196, 82, 16);
		locationtextfield.add(docnamelabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(100, 149, 237));
		tabbedPane.addTab("Email", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(134, 13, 779, 313);
		panel_5.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("FROM");
		lblNewLabel_11.setBounds(27, 35, 56, 16);
		lblNewLabel_11.setForeground(new Color(0, 0, 255));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		panel_11.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("TO");
		lblNewLabel_12.setBounds(27, 75, 56, 16);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12.setForeground(new Color(0, 0, 255));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_11.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("SUBJECT");
		lblNewLabel_13.setBounds(27, 117, 67, 16);
		lblNewLabel_13.setForeground(new Color(50, 205, 50));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.LEFT);
		panel_11.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("PASSWORD");
		lblNewLabel_14.setBounds(27, 159, 99, 16);
		lblNewLabel_14.setForeground(Color.RED);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_11.add(lblNewLabel_14);
		
		textfieldfrom = new JTextField();
		textfieldfrom.setBounds(131, 33, 224, 22);
		panel_11.add(textfieldfrom);
		textfieldfrom.setColumns(10);
		
		textfieldto = new JTextField();
		textfieldto.setBounds(131, 73, 224, 22);
		panel_11.add(textfieldto);
		textfieldto.setColumns(10);
		
		textfieldsubject = new JTextField();
		textfieldsubject.setBounds(131, 115, 224, 22);
		panel_11.add(textfieldsubject);
		textfieldsubject.setColumns(10);
		
		textfieldtext = new JTextField();
		textfieldtext.setBounds(410, 33, 328, 100);
		panel_11.add(textfieldtext);
		textfieldtext.setColumns(10);
		
		textfieldlocation = new JTextField();
		textfieldlocation.setBounds(410, 157, 221, 22);
		panel_11.add(textfieldlocation);
		textfieldlocation.setColumns(10);
		
		textfieldname = new JTextField();
		textfieldname.setBounds(410, 209, 221, 22);
		panel_11.add(textfieldname);
		textfieldname.setColumns(10);
		
		JButton buttonattach = new JButton("Attach");
		buttonattach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				JFileChooser chooser=new JFileChooser();
				chooser.showOpenDialog(rootPane);
				
				File f=chooser.getSelectedFile();
				filepath=f.getAbsolutePath();
				textfieldlocation.setText(filepath);
				textfieldname.setText(filepath);
			}
		});
		buttonattach.setBounds(641, 156, 97, 25);
		buttonattach.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_General_Office_13_2530831.png"));
		panel_11.add(buttonattach);
		
		JLabel lblNewLabel_15 = new JLabel("Attachment Name");
		lblNewLabel_15.setBounds(643, 212, 120, 16);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setForeground(new Color(0, 0, 255));
		panel_11.add(lblNewLabel_15);
		
		JButton buttonsend = new JButton("Send Mail");
		buttonsend.setBounds(410, 255, 328, 34);
		buttonsend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				final String from=textfieldfrom.getText();
				final String pass=textfieldpassword.getText();
				
				String to=textfieldto.getText();
				String subject=textfieldsubject.getText();
				String msg=textfieldtext.getText();
				
				Properties prop=new Properties();
				prop.put("mail.smtp.host","smtp.gmail.com");
				prop.put("mail.smtp.socketFactory.port","465"); //SSL protocol port number is 465
				prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
				prop.put("mail.smtp.auth","true");
				prop.put("mail.smtp.port","465");
				
				Session session=Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(from,pass);
					}
					
					
				});
				
				try {
					
					//message header
					Message msg1=new MimeMessage(session);
					msg1.setFrom(new InternetAddress(from));
					msg1.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
					msg1.setSubject(subject);
					
					//code to set the message
					MimeBodyPart msgbodypart=new MimeBodyPart();
					msgbodypart.setText(msg);
					Multipart multipart=new MimeMultipart();
					multipart.addBodyPart(msgbodypart);
					
					//code to attach the file
					msgbodypart=new MimeBodyPart();
					DataSource source=new FileDataSource(filepath);
					msgbodypart.setDataHandler(new DataHandler(source));
					msgbodypart.setFileName(textfieldlocation.getText());
					multipart.addBodyPart(msgbodypart);
					
					
					msg1.setContent(multipart);
					Transport.send(msg1);
					
					JOptionPane.showMessageDialog(rootPane,"Message Sent");
					
				}
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(rootPane,e);
				}
				
				
				
			}
		});
		buttonsend.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonsend.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_gmail_1220367.png"));
		panel_11.add(buttonsend);
		
		textfieldpassword = new JPasswordField();
		textfieldpassword.setBounds(131, 157, 224, 22);
		panel_11.add(textfieldpassword);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.YELLOW));
		panel_6.setBounds(5, 34, 170, 257);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Welcome to KIET");
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(12, 13, 146, 23);
		panel_6.add(lblNewLabel_10);
		
		
		
		JButton btnsearch = new JButton("");
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					String url="https://www.youtube.com/watch?v=Zl68mmfRUM4&list=PL_4v6TqUdcY7BImeLxntj3ntA4vUrHFTT&index=1";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				}
				catch (IOException ex)
				{
				JOptionPane.showMessageDialog(rootPane,ex);	
				}
			}
		});
		btnsearch.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_magnifyingglass_1055031 (1).png"));
		btnsearch.setBounds(129, 45, 29, 22);
		panel_6.add(btnsearch);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(255, 0, 0)), "Commands", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_10.setBounds(12, 80, 146, 177);
		panel_6.add(panel_10);
		panel_10.setLayout(null);
		
		
		
		
		
		JButton btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int p=JOptionPane.showConfirmDialog(rootPane,"Do you really want to delete?","Delete",JOptionPane.YES_NO_OPTION);
				if(p==0)
				{
					String sql="delete from Student_info where Student_Id=?";
					try
					{
						ps=con.prepareStatement(sql);
						ps.setString(1,textfield1.getText());
						ps.execute();
						
						JOptionPane.showMessageDialog(rootPane,"Deleted!");
					}
					catch (Exception ex)
					{
						JOptionPane.showMessageDialog(rootPane,ex);
					}
					
					updateStudentInfo();
					updateShortStudentInfo();
					updatedocumenttable();
					updateStatTable();
				}
			}
		});
		btndelete.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_Delete_dustbin_empty_recycle_recycling_remove_trash_1886812.png"));
		btndelete.setBounds(25, 104, 97, 25);
		panel_10.add(btndelete);
		
		
		
		JPanel panelinfo = new JPanel();
		panelinfo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 255, 0)), "Student Info", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panelinfo.setBounds(179, 59, 449, 232);
		contentPane.add(panelinfo);
		panelinfo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(12, 35, 69, 16);
		panelinfo.add(lblNewLabel);
		
		textfield1 = new JTextField();
		textfield1.setBounds(93, 32, 116, 22);
		panelinfo.add(textfield1);
		textfield1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(12, 74, 69, 16);
		panelinfo.add(lblNewLabel_1);
		
		textfield2 = new JTextField();
		textfield2.setBounds(93, 71, 116, 22);
		panelinfo.add(textfield2);
		textfield2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Department");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(12, 115, 84, 16);
		panelinfo.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(12, 158, 69, 16);
		panelinfo.add(lblNewLabel_3);
		
		textfield4 = new JTextField();
		textfield4.setBounds(93, 155, 116, 22);
		panelinfo.add(textfield4);
		textfield4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Height");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(12, 203, 69, 16);
		panelinfo.add(lblNewLabel_4);
		
		textfield5 = new JTextField();
		textfield5.setBounds(93, 200, 116, 22);
		panelinfo.add(textfield5);
		textfield5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Weight");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(232, 35, 56, 16);
		panelinfo.add(lblNewLabel_5);
		
		textfield6 = new JTextField();
		textfield6.setBounds(321, 32, 116, 22);
		panelinfo.add(textfield6);
		textfield6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Temperature");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(232, 74, 84, 16);
		panelinfo.add(lblNewLabel_6);
		
		textfield7 = new JTextField();
		textfield7.setBounds(321, 71, 116, 22);
		panelinfo.add(textfield7);
		textfield7.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Symptoms");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(232, 115, 84, 16);
		panelinfo.add(lblNewLabel_7);
		
		textfield8 = new JTextField();
		textfield8.setBounds(321, 112, 116, 22);
		panelinfo.add(textfield8);
		textfield8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Gender");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(232, 158, 56, 16);
		panelinfo.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Blood Group");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(232, 203, 84, 16);
		panelinfo.add(lblNewLabel_9);
		
		textfield10 = new JTextField();
		textfield10.setBounds(321, 200, 116, 22);
		panelinfo.add(textfield10);
		textfield10.setColumns(10);
		
		JComboBox textfield9 = new JComboBox();
		textfield9.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		textfield9.setBounds(321, 155, 116, 22);
		panelinfo.add(textfield9);
		
		JComboBox textfield3 = new JComboBox();
		textfield3.setMaximumRowCount(11);
		textfield3.setModel(new DefaultComboBoxModel(new String[] {"IT", "CSIT", "CSE", "CO", "EC", "EN", "EI", "ME", "CE", "MCA", "MBA"}));
		textfield3.setBounds(93, 112, 116, 22);
		panelinfo.add(textfield3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.CYAN);
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.YELLOW));
		panel_8.setBounds(632, 33, 200, 257);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		
		
		
		
		
		
		JButton btnadd = new JButton("Add");
		btnadd.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_flat-style-circle-add_1312548.png"));
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String sql="insert into Student_info(Student_Id,Name,Department,Age,Height,Weight,Temperature,Symptoms,Gender,Blood_Group) values(?,?,?,?,?,?,?,?,?,?)";
				
				try
				{
					ps=con.prepareStatement(sql);
					ps.setString(1,textfield1.getText());
					ps.setString(2,textfield2.getText());
					ps.setString(3,(String)textfield3.getSelectedItem());
					ps.setString(4,textfield4.getText());
					ps.setString(5,textfield5.getText());
					ps.setString(6,textfield6.getText());
					ps.setString(7,textfield7.getText());
					ps.setString(8,textfield8.getText());
					ps.setString(9,(String)textfield9.getSelectedItem());
					ps.setString(10,textfield10.getText());
					
					ps.execute();
					JOptionPane.showMessageDialog(rootPane, "Saved.");
				}
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(rootPane, e);
				}
				
				updateStudentInfo();
				updateShortStudentInfo();
				updatedocumenttable();
				updateStatTable();
			}
		});
		btnadd.setBounds(25, 27, 97, 25);
		panel_10.add(btnadd);
		
		JButton btnedit = new JButton("Edit");
		btnedit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql="update Student_info set Name=?,Department=?,Age=?,Height=?,Weight=?,Temperature=?,Symptoms=?,Gender=?,Blood_Group=? where Student_Id=?";
				
				try
				{
					ps=con.prepareStatement(sql);
					
					
					ps.setString(1,textfield2.getText());
					ps.setString(2,(String)textfield3.getSelectedItem());
					ps.setString(3,textfield4.getText());
					ps.setString(4,textfield5.getText());
					ps.setString(5,textfield6.getText());
					ps.setString(6,textfield7.getText());
					ps.setString(7,textfield8.getText());
					ps.setString(8,(String)textfield9.getSelectedItem());
					ps.setString(9,textfield10.getText());
					ps.setString(10,textfield1.getText());
					
					ps.execute();
					JOptionPane.showMessageDialog(rootPane, "Updated.");
				}
				
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(rootPane, ex);
				}
				
				updateStudentInfo();
				updateShortStudentInfo();
				updatedocumenttable();
				updateStatTable();
				getEachStDeviation();
				
				slider1.setValue((int) Float.parseFloat(textfield4.getText()));
		        slider2.setValue((int) Float.parseFloat(textfield5.getText()));
		        slider3.setValue((int) Float.parseFloat(textfield6.getText()));
			}
		});
		btnedit.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_compose_1055085.png"));
		btnedit.setBounds(25, 66, 97, 25);
		panel_10.add(btnedit);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Snip");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					saveScreenshot(panelinfo,"Panel Img.png");
					JOptionPane.showMessageDialog(rootPane, "Image is captured");
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(rootPane, e);	
				}
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\cut.png"));
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		
		
		
		
		
		
		
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_9.setBounds(835, 34, 259, 257);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(UIManager.getColor("Button.background"));
		panel_7.setBounds(0, 0, 259, 179);
		panel_9.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel photolabel = new JLabel("");
		photolabel.setBackground(Color.BLACK);
		photolabel.setBounds(52, 13, 151, 160);
		panel_7.add(photolabel);
		
		textfieldsearch = new JTextField();
		textfieldsearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				String sql1="Select * from Student_info where Name=?";
				try
				{
					ps=con.prepareStatement(sql1);
					ps.setString(1,textfieldsearch.getText());
					rs=ps.executeQuery();
					if(rs.next())
					{
						textfield1.setText(rs.getString("Student_Id"));
						textfield2.setText(rs.getString("Name"));
						textfield3.setSelectedItem(rs.getString("Department"));
						textfield4.setText(rs.getString("Age"));
						textfield5.setText(rs.getString("Height"));
						textfield6.setText(rs.getString("Weight"));
						textfield7.setText(rs.getString("Temperature"));
						textfield8.setText(rs.getString("Symptoms"));
						textfield9.setSelectedItem(rs.getString("Gender"));
						textfield10.setText(rs.getString("Blood_Group"));
						
						byte[] imageData =rs.getBytes("Photo");
						ImageIcon format=new ImageIcon(scaledImage(imageData, photolabel.getWidth(), photolabel.getHeight()));
						photolabel.setIcon(format);
						
						
						getEachStDeviation();
						
						slider1.setValue((int) Float.parseFloat(textfield4.getText()));
				        slider2.setValue((int) Float.parseFloat(textfield5.getText()));
				        slider3.setValue((int) Float.parseFloat(textfield6.getText()));
						
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(rootPane,e);
				}
				
				String sql2="Select * from Student_info where Student_Id=?";
				try
				{
					ps=con.prepareStatement(sql2);
					ps.setString(1,textfieldsearch.getText());
					rs=ps.executeQuery();
					if(rs.next())
					{
						textfield1.setText(rs.getString("Student_Id"));
						textfield2.setText(rs.getString("Name"));
						textfield3.setSelectedItem(rs.getString("Department"));
						textfield4.setText(rs.getString("Age"));
						textfield5.setText(rs.getString("Height"));
						textfield6.setText(rs.getString("Weight"));
						textfield7.setText(rs.getString("Temperature"));
						textfield8.setText(rs.getString("Symptoms"));
						textfield9.setSelectedItem(rs.getString("Gender"));
						textfield10.setText(rs.getString("Blood_Group"));
						
						byte[] imageData =rs.getBytes("Photo");
						ImageIcon format=new ImageIcon(scaledImage(imageData, photolabel.getWidth(), photolabel.getHeight()));
						photolabel.setIcon(format);
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(rootPane,e);
				}
			}
		});
		textfieldsearch.setText("Search...");
		textfieldsearch.setBounds(12, 45, 110, 22);
		panel_6.add(textfieldsearch);
		textfieldsearch.setColumns(10);
		
		textfieldupload = new JTextField();
		textfieldupload.setBounds(10, 186, 123, 22);
		panel_9.add(textfieldupload);
		textfieldupload.setColumns(10);
		
		JButton buttonupload = new JButton("Upload");
		buttonupload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser chooser =new JFileChooser();
				chooser.showOpenDialog(null);
				
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				textfieldupload.setText(filename);
				
				try
				{
					FileInputStream fis=new FileInputStream(f);
					ByteArrayOutputStream baos=new ByteArrayOutputStream();
					byte [] buf=new byte[1024];
					
					for(int readNum;(readNum=fis.read(buf))!=-1;)
					{
					baos.write(buf,0,readNum);	
					}
					
					personImg=baos.toByteArray();
					
				}
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(rootPane,e);
				}
			}
		});
		buttonupload.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_icon-130-cloud-upload_314715.png"));
		buttonupload.setBounds(145, 186, 106, 23);
		panel_9.add(buttonupload);
		
		JButton buttonsave = new JButton("Save");
		buttonsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String sql="update Student_info set Photo=? where Student_Id=?";
				try
				{
					ps=con.prepareStatement(sql);
					ps.setBytes(1,personImg);
					ps.setString(2,textfield1.getText());
					
					ps.execute();
					JOptionPane.showMessageDialog(rootPane,"Image saved.");
				}
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(rootPane,e);
				}
			}
		});
		buttonsave.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_Save-as_85541.png"));
		buttonsave.setBounds(48, 219, 151, 25);
		panel_9.add(buttonsave);
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				if(arg0.getKeyCode()==KeyEvent.VK_UP || arg0.getKeyCode()==KeyEvent.VK_DOWN)
				{
					
					try {
						
						int row=shorttable.getSelectedRow();
						String tableClick=(shorttable.getModel().getValueAt(row,0).toString());
						String sql= "Select * from Student_info where Student_id = '"+tableClick+"' ";
						ps=con.prepareStatement(sql);
						rs=ps.executeQuery();
						
						if(rs.next())
						{
							textfield1.setText(rs.getString("Student_Id"));
							textfield2.setText(rs.getString("Name"));
							textfield3.setSelectedItem(rs.getString("Department"));
							textfield4.setText(rs.getString("Age"));
							textfield5.setText(rs.getString("Height"));
							textfield6.setText(rs.getString("Weight"));
							textfield7.setText(rs.getString("Temperature"));
							textfield8.setText(rs.getString("Symptoms"));
							textfield9.setSelectedItem(rs.getString("Gender"));
							textfield10.setText(rs.getString("Blood_Group"));
							
							byte[] imageData =rs.getBytes("Photo");
							ImageIcon format=new ImageIcon(scaledImage(imageData, photolabel.getWidth(), photolabel.getHeight()));
							photolabel.setIcon(format);
							
						
							getEachStDeviation();
							
							slider1.setValue((int) Float.parseFloat(textfield4.getText()));
					        slider2.setValue((int) Float.parseFloat(textfield5.getText()));
					        slider3.setValue((int) Float.parseFloat(textfield6.getText()));
							
						}
					}
					
					catch(SQLException ex)
					{
						JOptionPane.showMessageDialog(rootPane,ex);
					}
					
				}
			}
		});
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
				
					int row=shorttable.getSelectedRow();
					String tableClick=(shorttable.getModel().getValueAt(row,0).toString());
					String sql= "Select * from Student_info where Student_id = '"+tableClick+"' ";
					ps=con.prepareStatement(sql);
					rs=ps.executeQuery();
					
					if(rs.next())
					{
						textfield1.setText(rs.getString("Student_Id"));
						textfield2.setText(rs.getString("Name"));
						textfield3.setSelectedItem(rs.getString("Department"));
						textfield4.setText(rs.getString("Age"));
						textfield5.setText(rs.getString("Height"));
						textfield6.setText(rs.getString("Weight"));
						textfield7.setText(rs.getString("Temperature"));
						textfield8.setText(rs.getString("Symptoms"));
						textfield9.setSelectedItem(rs.getString("Gender"));
						textfield10.setText(rs.getString("Blood_Group"));
						
						byte[] imageData =rs.getBytes("Photo");
						ImageIcon format=new ImageIcon(scaledImage(imageData, photolabel.getWidth(), photolabel.getHeight()));
						photolabel.setIcon(format);
						
						
						getEachStDeviation();
						slider1.setValue((int) Float.parseFloat(textfield4.getText()));
				        slider2.setValue((int) Float.parseFloat(textfield5.getText()));
				        slider3.setValue((int) Float.parseFloat(textfield6.getText()));
					}
				}
				
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(rootPane,ex);
				}
			
				
			}
		});
		scrollPane_1.setBounds(12, 13, 176, 231);
		
		panel_8.add(scrollPane_1);
		
		JButton btnclear = new JButton("Clear");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textfield1.setText(null);
				textfield2.setText(null);
				textfield3.setSelectedItem("IT");
				textfield4.setText(null);
				textfield5.setText(null);
				textfield6.setText(null);
				textfield7.setText(null);
				textfield8.setText(null);
				textfield9.setSelectedItem("Male");
				textfield10.setText(null);
				
				photolabel.setIcon(null);
		        
		        
		        d1.setText(null);
		        d2.setText(null);
		        d3.setText(null);
		        d4.setText(null);
		        d5.setText(null);
		        d6.setText(null);
		        d7.setText(null);
		        d8.setText(null);
		        d9.setText(null);
				
			}
		});
		btnclear.setIcon(new ImageIcon("F:\\Eclipse\\HealthManagementProject\\image\\iconfinder_edit-clear_118917.png"));
		btnclear.setBounds(25, 139, 97, 25);
		panel_10.add(btnclear);
		
		shorttable = new JTable();
		scrollPane_1.setViewportView(shorttable);
		shorttable.setBackground(SystemColor.control);
		
		con=connection.dbConnect();
		
		updateStudentInfo();
		updateShortStudentInfo();
		updatedocumenttable();
		updateStatTable();
		
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		
		
		
		
	}
	
	
	
	public void close()
	{
		WindowEvent we=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
	}
	
	private void updateStudentInfo()
	{
		try
		{
			String sql="select Student_Id, Name, Department," + "Age, Height, Weight, Temperature, Symptoms, Gender, Blood_Group from Student_info";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			table_student.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(rootPane,ex);
		}
	}
	
	private Image scaledImage(byte[] img,int w,int h)
	{
		BufferedImage resizedImage=new BufferedImage(w,h, BufferedImage.TYPE_INT_RGB);
		try
		{
			Graphics2D g2=resizedImage.createGraphics();
			g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			
			//convert byte array back to BufferedImage 
			
			ByteArrayInputStream in=new ByteArrayInputStream(img);
			BufferedImage ImageFromConvert=ImageIO.read(in);
			
			g2.drawImage(ImageFromConvert,0,0,w,h,null);
			g2.dispose();
		}
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(rootPane,e);
		}
		
		return resizedImage;
	}
	
	private void updateShortStudentInfo()
	{
		try
		{
			String sql="select Student_Id, Name from Student_info";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			shorttable.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(rootPane,ex);
		}
	}
	
	private void updatedocumenttable()
	{
		try
		{
			String sql="select * from document";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			doctable.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(rootPane,ex);
		}
	}
	
	private static BufferedImage getscreenshot(Component comp)
	{
		BufferedImage img=new BufferedImage(comp.getWidth(),comp.getHeight(),BufferedImage.TYPE_INT_RGB);
		comp.paint(img.getGraphics());
		return img;
	}
	
	private static void saveScreenshot(Component comp,String fileName) throws Exception
	{
		BufferedImage img=getscreenshot(comp);
		ImageIO.write(img,"png",new File(fileName));
	}
	
	private void getChartData() {
        try {
            labelchartage.setText(rs.getString("Age"));
            labelchartheight.setText(rs.getString("height"));
            labelchartweight.setText(rs.getString("Weight"));

        } catch (SQLException ex) {
        	JOptionPane.showMessageDialog(rootPane,ex);
        }
    }
	
	private void updateStatTable() {
        //overall mean,median,mode
        try {
            //Age ----->
            String sql1 = "select avg(Age) as mean_age from Student_info";
            ps = con.prepareStatement(sql1);
            rs = ps.executeQuery();
            float f1 = Float.parseFloat(rs.getString("mean_age"));
            String a1 = String.format("%.2f", f1);
            //System.out.println(a);
            o1.setText(a1);

            String sql2 = "SELECT AVG(Age) FROM (SELECT Age FROM Student_info"
                    + " ORDER BY Age LIMIT 2 - (SELECT COUNT(*) FROM Student_info) % 2"
                    + " OFFSET (SELECT (COUNT(*) - 1) / 2"
                    + " FROM Student_info))";
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            float f2 = Float.parseFloat(rs.getString("AVG(Age)"));
            String a2 = String.format("%.2f", f2);
            o2.setText(a2);

            String sql3 = "select age,max(c) from(select age,count(*) as c"
                    + " from student_info group by age ORDER BY COUNT(*) DESC)";
            ps = con.prepareStatement(sql3);
            rs = ps.executeQuery();
            float f3 = Float.parseFloat(rs.getString("age"));
            String a3 = String.format("%.2f", f3);
            o3.setText(a3);
            
          //Height ------->
            String sql4 = "select avg(Height) as mean_height from Student_info";
            ps = con.prepareStatement(sql4);
            rs = ps.executeQuery();
            float f4 = Float.parseFloat(rs.getString("mean_height"));
            String a4 = String.format("%.2f", f4);
            o4.setText(a4);

            String sql5 = "SELECT AVG(Height) FROM (SELECT Height FROM Student_info"
                    + " ORDER BY Height LIMIT 2 - (SELECT COUNT(*) FROM Student_info) % 2"
                    + " OFFSET (SELECT (COUNT(*) - 1) / 2"
                    + " FROM Student_info))";
            ps = con.prepareStatement(sql5);
            rs = ps.executeQuery();
            float f5 = Float.parseFloat(rs.getString("AVG(Height)"));
            String a5 = String.format("%.2f", f5);
            o5.setText(a5);

            String sql6 = "select Height,max(c) from(select Height,count(*) as c"
                    + " from student_info group by Height ORDER BY COUNT(*) DESC)";
            ps = con.prepareStatement(sql6);
            rs = ps.executeQuery();
            float f6 = Float.parseFloat(rs.getString("Height"));
            String a6 = String.format("%.2f", f6);
           o6.setText(a6);
           
         //Weight ------->
           String sql7 = "select avg(Weight) as mean_weight from Student_info";
           ps = con.prepareStatement(sql7);
           rs = ps.executeQuery();
           float f7 = Float.parseFloat(rs.getString("mean_weight"));
           String a7 = String.format("%.2f", f7);
           o7.setText(a7);

           String sql8 = "SELECT AVG(Weight) FROM (SELECT Weight FROM Student_info"
                   + " ORDER BY Weight LIMIT 2 - (SELECT COUNT(*) FROM Student_info) % 2"
                   + " OFFSET (SELECT (COUNT(*) - 1) / 2"
                   + " FROM Student_info))";
           ps = con.prepareStatement(sql8);
           rs = ps.executeQuery();
           float f8 = Float.parseFloat(rs.getString("AVG(Weight)"));
           String a8 = String.format("%.2f", f8);
           o8.setText(a8);

           String sql9 = "select Weight,max(c) from(select Weight,count(*) as c"
                   + " from student_info group by Weight ORDER BY COUNT(*) DESC)";
           ps = con.prepareStatement(sql9);
           rs = ps.executeQuery();
           float f9 = Float.parseFloat(rs.getString("Weight"));
           String a9 = String.format("%.2f", f9);
           o9.setText(a9);

       } 
        catch (SQLException | NumberFormatException e) {
           JOptionPane.showMessageDialog(rootPane, e);
       }
        
      //Male student mean,median,mode
        try {
            //Age ----->
            String sql1 = "select avg(Age) as mean_age from Student_info where "
                    + "gender='Male'";
            ps = con.prepareStatement(sql1);
            rs = ps.executeQuery();
            float f1 = Float.parseFloat(rs.getString("mean_age"));
            String a1 = String.format("%.2f", f1);
            //System.out.println(a);
            m1.setText(a1);

            String sql2 = "SELECT AVG(Age) FROM (SELECT Age FROM Student_info "
                    + "where Gender='Male' "
                    + "ORDER BY Age LIMIT 2 - (SELECT COUNT(*) FROM "
                    + "Student_info where Gender='Male') % 2 "
                    + "OFFSET (SELECT (COUNT(*) - 1) / 2 "
                    + "FROM Student_info where Gender='Male'))";
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            float f2 = Float.parseFloat(rs.getString("AVG(Age)"));
            String a2 = String.format("%.2f", f2);
            m2.setText(a2);

            String sql3 = "select age,max(c) from(select age,count(*) as c"
                    + " from student_info where Gender='Male' "
                    + "group by age ORDER BY COUNT(*) DESC)";
            ps = con.prepareStatement(sql3);
            rs = ps.executeQuery();
            float f3 = Float.parseFloat(rs.getString("age"));
            String a3 = String.format("%.2f", f3);
            m3.setText(a3);

            //Height ------->
            String sql4 = "select avg(Height) as mean_Height from Student_info where "
                    + "gender='Male'";
            ps = con.prepareStatement(sql4);
            rs = ps.executeQuery();
            float f4 = Float.parseFloat(rs.getString("mean_Height"));
            String a4 = String.format("%.2f", f4);
            m4.setText(a4);

            String sql5 = "SELECT AVG(Height) FROM (SELECT Height FROM Student_info "
                    + "where Gender='Male' "
                    + "ORDER BY Height LIMIT 2 - (SELECT COUNT(*) FROM "
                    + "Student_info where Gender='Male') % 2 "
                    + "OFFSET (SELECT (COUNT(*) - 1) / 2 "
                    + "FROM Student_info where Gender='Male'))";
            ps = con.prepareStatement(sql5);
            rs = ps.executeQuery();
            float f5 = Float.parseFloat(rs.getString("AVG(Height)"));
            String a5 = String.format("%.2f", f5);
            m5.setText(a5);

            String sql6 = "select Height,max(c) from(select Height,count(*) as c"
                    + " from student_info where Gender='Male' "
                    + "group by Height ORDER BY COUNT(*) DESC)";
            ps = con.prepareStatement(sql6);
            rs = ps.executeQuery();
            float f6 = Float.parseFloat(rs.getString("Height"));
            String a6 = String.format("%.2f", f6);
            m6.setText(a6);

            //Weight ------->
            String sql7 = "select avg(Weight) as mean_Weight from Student_info where "
                    + "gender='Male'";
            ps = con.prepareStatement(sql7);
            rs = ps.executeQuery();
            float f7 = Float.parseFloat(rs.getString("mean_Weight"));
            String a7 = String.format("%.2f", f7);
            m7.setText(a7);

            String sql8 = "SELECT AVG(Weight) FROM (SELECT Weight FROM Student_info "
                    + "where Gender='Male' "
                    + "ORDER BY Weight LIMIT 2 - (SELECT COUNT(*) FROM "
                    + "Student_info where Gender='Male') % 2 "
                    + "OFFSET (SELECT (COUNT(*) - 1) / 2 "
                    + "FROM Student_info where Gender='Male'))";
            ps = con.prepareStatement(sql8);
            rs = ps.executeQuery();
            float f8 = Float.parseFloat(rs.getString("AVG(Weight)"));
            String a8 = String.format("%.2f", f8);
            m8.setText(a8);

            String sql9 = "select Weight,max(c) from(select Weight,count(*) as c"
                    + " from student_info where Gender='Male' "
                    + "group by Weight ORDER BY COUNT(*) DESC)";
            ps = con.prepareStatement(sql9);
            rs = ps.executeQuery();
            float f9 = Float.parseFloat(rs.getString("Weight"));
            String a9 = String.format("%.2f", f9);
            m9.setText(a9);

        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } 
        
      //Female student mean,median,mode
        try {
            //Age ----->
            String sql1 = "select avg(Age) as mean_age from Student_info where "
                    + "gender='Female'";
            ps = con.prepareStatement(sql1);
            rs = ps.executeQuery();
            float f1 = Float.parseFloat(rs.getString("mean_age"));
            String a1 = String.format("%.2f", f1);
            //System.out.println(a);
            fe1.setText(a1);

            String sql2 = "SELECT AVG(Age) FROM (SELECT Age FROM Student_info "
                    + "where Gender='Female' "
                    + "ORDER BY Age LIMIT 2 - (SELECT COUNT(*) FROM "
                    + "Student_info where Gender='Female') % 2 "
                    + "OFFSET (SELECT (COUNT(*) - 1) / 2 "
                    + "FROM Student_info where Gender='Female'))";
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            float f2 = Float.parseFloat(rs.getString("AVG(Age)"));
            String a2 = String.format("%.2f", f2);
            fe2.setText(a2);

            String sql3 = "select age,max(c) from(select age,count(*) as c"
                    + " from Student_info where Gender='Female' "
                    + "group by age ORDER BY COUNT(*) DESC)";
            ps = con.prepareStatement(sql3);
            rs = ps.executeQuery();
            float f3 = Float.parseFloat(rs.getString("age"));
            String a3 = String.format("%.2f", f3);
            fe3.setText(a3);

            //Height ------->
            String sql4 = "select avg(Height) as mean_Height from Student_info where "
                    + "gender='Female'";
            ps = con.prepareStatement(sql4);
            rs = ps.executeQuery();
            float f4 = Float.parseFloat(rs.getString("mean_Height"));
            String a4 = String.format("%.2f", f4);
            fe4.setText(a4);

            String sql5 = "SELECT AVG(Height) FROM (SELECT Height FROM Student_info "
                    + "where Gender='Female' "
                    + "ORDER BY Height LIMIT 2 - (SELECT COUNT(*) FROM "
                    + "Student_info where Gender='Female') % 2 "
                    + "OFFSET (SELECT (COUNT(*) - 1) / 2 "
                    + "FROM Student_info where Gender='Female'))";
            ps = con.prepareStatement(sql5);
            rs = ps.executeQuery();
            float f5 = Float.parseFloat(rs.getString("AVG(Height)"));
            String a5 = String.format("%.2f", f5);
            fe5.setText(a5);

            String sql6 = "select Height,max(c) from(select Height,count(*) as c"
                    + " from Student_info where Gender='Female' "
                    + "group by Height ORDER BY COUNT(*) DESC)";
            ps = con.prepareStatement(sql6);
            rs = ps.executeQuery();
            float f6 = Float.parseFloat(rs.getString("Height"));
            String a6 = String.format("%.2f", f6);
            fe6.setText(a6);

            //Weight ------->
            String sql7 = "select avg(Weight) as mean_Weight from Student_info where "
                    + "gender='Female'";
            ps = con.prepareStatement(sql7);
            rs = ps.executeQuery();
            float f7 = Float.parseFloat(rs.getString("mean_Weight"));
            String a7 = String.format("%.2f", f7);
            fe7.setText(a7);

            String sql8 = "SELECT AVG(Weight) FROM (SELECT Weight FROM Student_info "
                    + "where Gender='Female' "
                    + "ORDER BY Weight LIMIT 2 - (SELECT COUNT(*) FROM "
                    + "Student_info where Gender='Female') % 2 "
                    + "OFFSET (SELECT (COUNT(*) - 1) / 2 "
                    + "FROM Student_info where Gender='Female'))";
            ps = con.prepareStatement(sql8);
            rs = ps.executeQuery();
            float f8 = Float.parseFloat(rs.getString("AVG(Weight)"));
            String a8 = String.format("%.2f", f8);
            fe8.setText(a8);

            String sql9 = "select Weight,max(c) from(select Weight,count(*) as c"
                    + " from Student_info where Gender='Female' "
                    + "group by Weight ORDER BY COUNT(*) DESC)";
            ps = con.prepareStatement(sql9);
            rs = ps.executeQuery();
            float f9 = Float.parseFloat(rs.getString("Weight"));
            String a9 = String.format("%.2f", f9);
            fe9.setText(a9);

        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        try {
            String sql1 = "SELECT count(*)  FROM Student_info where Gender='Male'";
            ps = con.prepareStatement(sql1);
            rs = ps.executeQuery();
            t1.setText(rs.getString("count(*)"));

            String sql2 = "SELECT count(*)  FROM Student_info where Gender='Female'";
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            t2.setText(rs.getString("count(*)"));

            String sql3 = "SELECT count(*)  FROM Student_info";
            ps = con.prepareStatement(sql3);
            rs = ps.executeQuery();
            t3.setText(rs.getString("count(*)"));
        } 
        catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

	}
	
	private void getEachStDeviation() {
 
        float a;
        float b;
        String s;
       
      //Age--->
        a = Float.parseFloat(o1.getText());
        b = Float.parseFloat(textfield4.getText());
        a = a - b;
        //System.out.println(a);
        s = String.format("%.2f", a);
        d1.setText(s);
        
        a = Float.parseFloat(o2.getText());
        a = a - b;
        s = String.format("%.2f", a);
        d2.setText(s);
        
        a = Float.parseFloat(o3.getText());
        a = a - b;
        s = String.format("%.2f", a);
        d3.setText(s);
        
      ///Height--->
        a = Float.parseFloat(o4.getText());
        b = Float.parseFloat(textfield5.getText());
        a = a - b;
        s = String.format("%.2f", a);
        d4.setText(s);
        
        a = Float.parseFloat(o5.getText());
        a = a - b;
        s = String.format("%.2f", a);
        d5.setText(s);
        
        a = Float.parseFloat(o6.getText());
        a = a - b;
        s = String.format("%.2f", a);
        d6.setText(s);
        
      //Weight---->
        a = Float.parseFloat(o7.getText());
        b = Float.parseFloat(textfield6.getText());
        a = a - b;
        s = String.format("%.2f", a);
        d7.setText(s);
        
        a = Float.parseFloat(o8.getText());
        a = a - b;
        s = String.format("%.2f", a);
        d8.setText(s);
        
        a = Float.parseFloat(o9.getText());
        a = a - b;
        s = String.format("%.2f", a);
        d9.setText(s);
        
	}
	
	
	
	
	
	
}
