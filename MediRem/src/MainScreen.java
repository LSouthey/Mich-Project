import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
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
		
		JButton btnAddMedication = new JButton("Add Medication");
		btnAddMedication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				new AddMedication();
			}
		});
		btnAddMedication.setBounds(28, 29, 125, 23);
		frame.getContentPane().add(btnAddMedication);
		
		JButton btnViewMedication = new JButton("View Medication");
		btnViewMedication.setBounds(28, 63, 138, 23);
		frame.getContentPane().add(btnViewMedication);
		
		JButton btnReminders = new JButton("Reminders");
		btnReminders.setBounds(27, 97, 126, 23);
		frame.getContentPane().add(btnReminders);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnHelp);
	}

}
