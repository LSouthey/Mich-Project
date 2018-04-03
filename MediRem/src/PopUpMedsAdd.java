import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUpMedsAdd {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUpMedsAdd window = new PopUpMedsAdd();
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
	public PopUpMedsAdd() {
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
		
		JLabel lblYourMedicationHas = new JLabel("Your medication has been added successfully");
		lblYourMedicationHas.setBounds(61, 11, 283, 56);
		frame.getContentPane().add(lblYourMedicationHas);
		
		JButton btnAddNewMedication = new JButton("Add New Medication");
		btnAddNewMedication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new AddMedication();
			}
		});
		btnAddNewMedication.setBounds(34, 172, 158, 23);
		frame.getContentPane().add(btnAddNewMedication);
	}
}
