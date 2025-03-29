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

public class Welcome{
	JFrame frame = new JFrame();
	JLabel WelLabel = new JLabel("Nama");
	Font MyFont = new Font("Consolas",Font.BOLD,25);
	
	//constructor
	Welcome(String userId){
		
		WelLabel.setBounds(30,30,350,35);
		WelLabel.setFont(MyFont);
		WelLabel.setText("Namaste! "+ userId);
		
		
		
		
		
		frame.add(WelLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720,720);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args){
		 // // Welcome wels = new Welcome();
	}
	
	
}