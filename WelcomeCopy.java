import java.util.HashMap;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.FlowLayout;

public class WelcomeCopy implements ActionListener{
	JFrame frame = new JFrame();
	JLabel WelLabel = new JLabel("Nama");
	Font MyFont = new Font("Consolas",Font.BOLD,25);
	JMenuBar menubar = new JMenuBar();
	
	//inside of menubar
	JMenu FileMenu = new JMenu("File");
	JMenu EditMenu = new JMenu("Edit");
	JMenu SearchMenu = new JMenu("Search");
	JMenu ViewMenu = new JMenu("View");
	JMenu ProfileMenu = new JMenu("Profile");
	
	//FileMenuItems
	JMenuItem Savaitem = new JMenuItem("Save");
	JMenuItem Openitem = new JMenuItem("Open");
	JMenuItem Refreshitem = new JMenuItem("Refresh");
	JMenuItem Exititem = new JMenuItem("Exit");
	
	//action using Mnemonics
	
	
	//EditMenuItem Class
	JMenuItem undoitem = new JMenuItem("Undo");
	JMenuItem cutitem = new JMenuItem("Cut");
	JMenuItem insertitem = new JMenuItem("Insert");
	JMenuItem Readitem = new JMenuItem("Read Item Mode");
	
	//profile
	JMenuItem account = new JMenuItem("Account");
	JMenuItem progress = new JMenuItem("Progress");
	JMenuItem bill = new JMenuItem("Bill");
	JMenuItem admin = new JMenuItem("Admin?");
	
	
	//Profile Panal
	JPanel profilePanel = new JPanel();
	
	//icons
	
	ImageIcon saveicon;
	ImageIcon openicon;
	ImageIcon usericon;
	ImageIcon adminicon;
	ImageIcon loadicon;
	ImageIcon billicon;
	
	
	//constructor
	WelcomeCopy(){
		
		
		//image 
		saveicon = new ImageIcon("F:/technothings/java/JavaProjects/JavaSwing/MiniProjectCompleted/save.png");
		openicon = new ImageIcon("F:/technothings/java/JavaProjects/JavaSwing/MiniProjectCompleted/open.png");
		billicon = new ImageIcon("F:/technothings/java/JavaProjects/JavaSwing/MiniProjectCompleted/bill.png");
		adminicon = new ImageIcon("F:/technothings/java/JavaProjects/JavaSwing/MiniProjectCompleted/admin.png");
		usericon = new ImageIcon("F:/technothings/java/JavaProjects/JavaSwing/MiniProjectCompleted/user.png");
		
		Savaitem.setIcon(saveicon);
		Openitem.setIcon(openicon);
		bill.setIcon(billicon);
		Refreshitem.setIcon(loadicon);
		account.setIcon(usericon);
		admin.setIcon(adminicon);
		
		
		//profile Panel
		profilePanel.setPreferredSize(new Dimension(100,600));
		profilePanel.setBackground(new Color(255,255,0));
		
		//menubarpanel
		frame.setJMenuBar(menubar);
		
		//inside of menubarpanael
		menubar.add(FileMenu);
		menubar.add(EditMenu);
		menubar.add(SearchMenu);
		menubar.add(ViewMenu);
		menubar.add(ProfileMenu);
		
		//mnemonic
		FileMenu.setMnemonic(KeyEvent.VK_F);
		
		
		//Filemeuitem addition
		FileMenu.add(Savaitem);
		FileMenu.add(Openitem);
		FileMenu.add(Refreshitem);
		FileMenu.add(Exititem);
		
		//action listener
		Savaitem.addActionListener(this);
		Openitem.addActionListener(this);
		Refreshitem.addActionListener(this);
		Exititem.addActionListener(this);
		
		//fileMenu mnemnics
		Savaitem.setMnemonic(KeyEvent.VK_S);
		Openitem.setMnemonic(KeyEvent.VK_O);
		Refreshitem.setMnemonic(KeyEvent.VK_L);
		Exititem.setMnemonic(KeyEvent.VK_E);
		
		
		//edit menu item addition
		EditMenu.add(undoitem);
		EditMenu.add(cutitem);
		EditMenu.add(insertitem);
		EditMenu.add(Readitem);
		
		//profile
		ProfileMenu.add(account);
		ProfileMenu.add(progress);
		ProfileMenu.add(bill);
		ProfileMenu.add(admin);
		
		
		//profile actionlistener
		account.addActionListener(this);
		
		//default frame method
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720,720);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == account){
			frame.add(profilePanel);
		}
		if(e.getSource() == Exititem){
			System.exit(0);
		}
	}
	public static void main(String[] args){
		 WelcomeCopy wels = new WelcomeCopy();
	}
	
	
}