import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewUser {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField textField;
	private JButton btnDone;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser window = new NewUser();
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
	public NewUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		txtName = new JTextField();
		txtName.setBounds(174, 36, 86, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblUsername = new JLabel("Name");
		lblUsername.setBounds(174, 11, 86, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(174, 67, 68, 14);
		frame.getContentPane().add(lblSurname);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(174, 92, 86, 20);
		frame.getContentPane().add(txtSurname);
		txtSurname.setColumns(10);
		
		JLabel lblUsername_1 = new JLabel("Username");
		lblUsername_1.setBounds(174, 126, 68, 14);
		frame.getContentPane().add(lblUsername_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(174, 151, 86, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(174, 182, 68, 14);
		frame.getContentPane().add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(174, 207, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth");
		lblDateOfBirth.setBounds(174, 238, 86, 14);
		frame.getContentPane().add(lblDateOfBirth);
		
		textField = new JTextField();
		textField.setBounds(174, 263, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnDone = new JButton("Done");
		btnDone.setBounds(323, 262, 89, 23);
		frame.getContentPane().add(btnDone);
		
		btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new LoginScreen();
			}
		});
		btnBack.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnBack);
	}

}
