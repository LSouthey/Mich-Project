import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JButton btnBack;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtUserName.setBounds(174, 67, 86, 20);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblUserName.setBounds(174, 42, 86, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel.setBounds(176, 123, 70, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(174, 148, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
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
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
