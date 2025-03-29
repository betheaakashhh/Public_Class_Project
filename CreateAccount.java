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

public class CreateAccount implements ActionListener{
	JFrame frame = new JFrame();
	
	
	//label variable
	JLabel WelLabel = new JLabel("this");
	JLabel CreateName = new JLabel("Create Username");
	JLabel EnterPassword = new JLabel("Create Password");
	JLabel ConfirmPassword = new JLabel("Confirm Password");
	// JLabel  = new JLabel("Nama");
	
	//TextField
	JTextField NameField = new JTextField();
	JPasswordField PasswordField = new JPasswordField();
	JPasswordField ConfirmPasswordField = new JPasswordField();
	
	//Buttons
	JButton backHome = new JButton("Home");
	JButton Submitbtn = new JButton("Submit");
	JButton Resetbtn = new JButton("Reset");
	
	Font MyFont = new Font("Consolas",Font.BOLD,15);
	Font MyFont1 = new Font("Consolas",Font.BOLD,15);
	Font MyFont2 = new Font("Consolas",Font.BOLD,20);
	// HashMap<String,String> logininfo = new HashMap<String,String>();
	//constructor
	CreateAccount(){
		
		 WelLabel.setBounds(30,30,350,35);
		 WelLabel.setFont(MyFont);
		// WelLabel.setText("Namaste!);
		
		backHome.setBounds(310,600,100,30);
		backHome.addActionListener(this);
		backHome.setFont(MyFont);
		backHome.setFocusable(false);
		
		//Labels
		CreateName.setBounds(75,80,200,40);
		EnterPassword.setBounds(75,150,200,40);
		ConfirmPassword.setBounds(72,220,200,40);
		
		//setting Fonts
		CreateName.setFont(MyFont2);
		EnterPassword.setFont(MyFont2);
		ConfirmPassword.setFont(MyFont2);
		
		//TextFields
		NameField.setBounds(300,80,250,35);
		PasswordField.setBounds(300,150,250,35);
		ConfirmPasswordField.setBounds(300,220,250,35);
		
		//buttons
		Submitbtn.setBounds(300,400,100,30);
		Submitbtn.addActionListener(this);
		
		Resetbtn.setBounds(450,400,100,30);
		Resetbtn.addActionListener(this);
		
		
		
		//frame creation
		
		frame.add(CreateName);
		frame.add(EnterPassword);
		frame.add(ConfirmPassword);
		
		//textField frame
		frame.add(NameField);
		frame.add(PasswordField);
		frame.add(ConfirmPasswordField);
		
		//buttons in frame
		frame.add(Submitbtn);
		frame.add(Resetbtn);
		frame.add(WelLabel);
		frame.add(backHome);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720,720);
		frame.setLayout(null);
		frame.setVisible(true);
		
	
	}
	@Override
	public void actionPerformed(ActionEvent e){
		
		// Back to Home page action listener button
		if(e.getSource() ==  backHome){
			
			// IDPassword idp = new IDPassword();
			LoginPage login = new LoginPage();
			frame.dispose();
		}
		
		//reset Button action Listener
		if(e.getSource() == Resetbtn){
			NameField.setText("");
			PasswordField.setText("");
			ConfirmPasswordField.setText("");
			WelLabel.setText("");
			
		}
		
		//Submit button action listener button

			
			// Inside the Submitbtn action listener:
        if (e.getSource() == Submitbtn) {
        String name = NameField.getText().trim();
        String getPass = String.valueOf(PasswordField.getPassword()).trim();
         String getPassconfirm = String.valueOf(ConfirmPasswordField.getPassword()).trim();

    // Validate inputs
         if (name.isEmpty() || getPass.isEmpty() || getPassconfirm.isEmpty()) {
        WelLabel.setForeground(Color.RED);
        WelLabel.setText("All fields are required!");
        return;
      }

    // Check password match
    if (!getPass.equals(getPassconfirm)) {
        WelLabel.setForeground(Color.RED);
        WelLabel.setText("Passwords do not match!");
        PasswordField.setText("");
        ConfirmPasswordField.setText("");
        return;
    }

    // Call database logic
    boolean success = Accounts.createUser(name, getPass);
    if (success) {
        WelLabel.setForeground(Color.GREEN);
        WelLabel.setText("Account created successfully!");
        NameField.setText("");
        PasswordField.setText("");
        ConfirmPasswordField.setText("");
    } else {
        WelLabel.setForeground(Color.RED);
        WelLabel.setText("Username already exists or error!");
    }
   }
  }
  public static void main(String[] args){
	   SwingUtilities.invokeLater(() -> new CreateAccount());
  }
}
	
	
	
	
	
	
	
	
	
	
	
