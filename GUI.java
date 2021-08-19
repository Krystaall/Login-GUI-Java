package loginGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	private static JLabel userLabel;  //private static used as a good practice
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JTextField passwordText;
	private static JButton button;
	private static JLabel success;
	

	public static void main(String[] args) {
		JPanel panel= new JPanel();
		JFrame frame=new JFrame();
		frame.setSize(350, 200); //(width, height)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel=new JLabel("USER");
		userLabel.setBounds(10,20,80,25);//(x, y, width, height)
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel =new JLabel("PASSWORD");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
	    passwordText =  new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("LOGIN");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success= new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);

		
		frame.setVisible(true);

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user= userText.getText();
		String password = passwordText.getText();
		System.out.println(user+ ","+password);
		//we did all this to get password entered from user so that we can verify whether 
		//it is correct password or not by comparing with the correct password
		
		if(user.equals("Sharvari") && password.equals("iamSharvari123")) {
			success.setText("LOGIN SUCCESSFUL!");
		}
	
		
	}

}
