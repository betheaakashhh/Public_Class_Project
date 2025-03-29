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
public class LoginPage implements ActionListener{
	
	// HashMap<String,String> logininfo = new HashMap<String,String>();
	
	
	JFrame frame = new JFrame();
	JButton Loginbtn = new JButton("Login");
	JButton Resetbtn = new JButton("Reset");
	JButton Createbtn = new JButton("New A/C");
	JTextField UserTextField = new JTextField("");
	JPasswordField PassTextField = new JPasswordField("");
	JLabel UserLabel = new JLabel("Username");
	JLabel PassLabel =  new JLabel("Password");
	JLabel Messege =  new JLabel("Create new Account");
	Font myFont = new Font("Consolas",Font.ITALIC,15);
	
	
	//Constructor
	LoginPage(){
		
		// logininfo = loginInfoOriginal;
		
		//elements
		UserLabel.setBounds(50,100,95,45);
		PassLabel.setBounds(50,200,95,45);
		
		//textField
		UserTextField.setBounds(125,100,280,50);
		PassTextField.setBounds(125,200,280,50);
		
		//Buttons
		Loginbtn.setBounds(125,350,100,20);
		Loginbtn.addActionListener(this);
		Loginbtn.setFocusable(false);
		
		Resetbtn.setBounds(300,350,100,20);
		Resetbtn.addActionListener(this);
		Resetbtn.setFocusable(false);
		
		Createbtn.setBounds(380,400,100,20);
		Createbtn.addActionListener(this);
		Createbtn.setFocusable(false);
		//messege
		Messege.setBounds(150,280,300,45);
		Messege.setFont(myFont);
		Messege.setForeground(new Color(255,0,0));
		
		
		frame.add(UserLabel);
		frame.add(PassLabel);
		frame.add(UserTextField);
		frame.add(PassTextField);
		frame.add(Messege);
		frame.add(Loginbtn);
		frame.add(Resetbtn);
		frame.add(Createbtn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(520,520);
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		
		
		
		
		
		frame.setVisible(true);
	}
	
	//ActionListener
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == Resetbtn){
			UserTextField.setText("");
			PassTextField.setText("");
			Messege.setForeground(Color.blue);
			Messege.setText("Login Again");
		}
		if(e.getSource() == Createbtn){
			
			
			CreateAccount account = new CreateAccount();
			frame.dispose();
		}
		
		if(e.getSource() == Loginbtn){
			// Calculator calc = new Calculator();
			
			 String userId = UserTextField.getText().trim();
            String userPass = String.valueOf(PassTextField.getPassword()).trim();

            if (userId.isEmpty() || userPass.isEmpty()) {
                Messege.setForeground(Color.red);
                Messege.setText("Username/password cannot be empty!");
                return;
            }

            // Validate against the database
            boolean isValid = Accounts.validateUser(userId, userPass);
            
            if (isValid) {
                Messege.setForeground(Color.green);
                Messege.setText("Login Successful!");
                UserTextField.setText("");
                PassTextField.setText("");
                frame.dispose();
                Welcome wel = new Welcome(userId); // Open welcome window
            } else {
                Messege.setForeground(Color.red);
                Messege.setText("Invalid username or password!");
            }
        }
	}
}