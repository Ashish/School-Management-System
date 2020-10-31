package application;


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;


public class Dashboard {

	private JFrame frame;
	
	private Image img_home = new ImageIcon(Dashboard.class.getClassLoader().getResource("home.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image img_leave = new ImageIcon(Dashboard.class.getClassLoader().getResource("leave.png")).getImage().getScaledInstance(37,37,Image.SCALE_SMOOTH);
	private Image img_marks = new ImageIcon(Dashboard.class.getClassLoader().getResource("marks.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image img_attendance = new ImageIcon(Dashboard.class.getClassLoader().getResource("attendance.png")).getImage().getScaledInstance(35,35,Image.SCALE_SMOOTH);
	private Image img_background = new ImageIcon(Dashboard.class.getClassLoader().getResource("background.jpg")).getImage().getScaledInstance(832,255,Image.SCALE_SMOOTH);
	private Image img_logo = new ImageIcon(Dashboard.class.getClassLoader().getResource("l1.png")).getImage().getScaledInstance(250,68,Image.SCALE_SMOOTH);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Dashboard");
		frame.getContentPane().setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(new Color(47, 79, 79));
		frame.setBounds(100, 100, 1126, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Border blackline = BorderFactory.createLineBorder(Color.red);
		
		JLabel lbl_name = new JLabel("Name");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setForeground(new Color(255, 255, 255));
		lbl_name.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_name.setBounds(625, 196, 127, 24);
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_photo = new JLabel("");
		lbl_photo.setBackground(new Color(255, 255, 255));
		lbl_photo.setBounds(625, 28, 127, 148);
		lbl_photo.setBorder(blackline);
		frame.getContentPane().add(lbl_photo);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBounds(0, 0, 278, 517);
		menuPanel.setBackground(new Color(47, 79, 79));
		frame.getContentPane().add(menuPanel);
		menuPanel.setLayout(null);
		
		JLabel menuLabel = new JLabel("My Dashboard");
		menuLabel.setBounds(0, 0, 278, 54);
		menuLabel.setHorizontalAlignment(SwingConstants.CENTER);
		menuLabel.setForeground(new Color(255, 255, 255));
		menuLabel.setFont(new Font("Bell MT", Font.BOLD, 28));
		menuLabel.setBackground(new Color(46, 139, 87));
		menuLabel.setOpaque(true);
		menuPanel.add(menuLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 80, 258, 45);
		menuPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Home = new JLabel("Home");
		lbl_Home.setForeground(new Color(255, 255, 255));
		lbl_Home.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lbl_Home.setBounds(72, 15, 103, 23);
		panel.add(lbl_Home);
		
		JLabel lbl_1 = new JLabel("");
		lbl_1.setBounds(20, 5, 40, 35);
		lbl_1.setIcon(new ImageIcon(img_home));
		panel.add(lbl_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 145, 258, 45);
		menuPanel.add(panel_1);
		
		JLabel blob_Leave = new JLabel("Apply Leave");
		blob_Leave.setForeground(new Color(255, 255, 255));
		blob_Leave.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		blob_Leave.setBounds(72, 15, 103, 23);
		panel_1.add(blob_Leave);
		
		JLabel lbl_2 = new JLabel("");
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setBounds(20, 5, 40, 35);
		lbl_2.setIcon(new ImageIcon(img_leave));
		panel_1.add(lbl_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(47, 79, 79));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 210, 258, 45);
		menuPanel.add(panel_1_1);
		
		JLabel lbl_Marks = new JLabel("Marks");
		lbl_Marks.setForeground(new Color(255, 255, 255));
		lbl_Marks.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lbl_Marks.setBounds(72, 15, 103, 23);
		panel_1_1.add(lbl_Marks);
		
		JLabel lbl_3 = new JLabel("");
		lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3.setBounds(20, 5, 40, 35);
		lbl_3.setIcon(new ImageIcon(img_marks));
		panel_1_1.add(lbl_3);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(47, 79, 79));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(10, 275, 258, 45);
		menuPanel.add(panel_1_1_1);
		
		JLabel lbl_Attendance = new JLabel("Attendance");
		lbl_Attendance.setForeground(new Color(255, 255, 255));
		lbl_Attendance.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lbl_Attendance.setBounds(72, 15, 103, 23);
		panel_1_1_1.add(lbl_Attendance);
		
		JLabel lbl_4 = new JLabel("");
		lbl_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4.setBounds(20, 5, 40, 35);
		lbl_4.setIcon(new ImageIcon(img_attendance));
		panel_1_1_1.add(lbl_4);
		
		JLabel lbl_back = new JLabel("");
		lbl_back.setBounds(278, 0, 832, 255);
		lbl_back.setIcon(new ImageIcon(img_background));
		frame.getContentPane().add(lbl_back);
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setBounds(308, 255, 278, 100);
		lbl_logo.setIcon(new ImageIcon(img_logo));
		frame.getContentPane().add(lbl_logo);
		
		JLabel lbl_welcome = new JLabel("WELCOME");
		lbl_welcome.setForeground(new Color(47, 79, 79));
		lbl_welcome.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lbl_welcome.setBounds(308, 366, 239, 38);
		frame.getContentPane().add(lbl_welcome);
		
		JLabel lbl_name1 = new JLabel("Name");
		lbl_name1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_name1.setBounds(308, 415, 134, 24);
		frame.getContentPane().add(lbl_name1);
		
		JLabel lbl_id = new JLabel("ID : ");
		lbl_id.setForeground(new Color(47, 79, 79));
		lbl_id.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_id.setBounds(308, 452, 90, 24);
		frame.getContentPane().add(lbl_id);
		
		JLabel lbl_id1 = new JLabel("Identification number");
		lbl_id1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_id1.setBounds(308, 482, 144, 24);
		frame.getContentPane().add(lbl_id1);
		
		
	}
}


