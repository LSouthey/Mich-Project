import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MedsList {

	private JFrame frame;
	private JTextField txtMedsList;
	private JTextField txtNewMeds;
	private JLabel lblNewMedication;
	String medList = " ";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedsList window = new MedsList();
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
	public MedsList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 463, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtMedsList = new JTextField();
		txtMedsList.setBounds(25, 126, 170, 124);
		frame.getContentPane().add(txtMedsList);
		txtMedsList.setColumns(10);
		
		JButton btnAddMeds = new JButton("+");
		btnAddMeds.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String newMed = txtNewMeds.getText();
				
				medList = medList + "\n" + newMed;
				System.out.println(medList);
				txtMedsList.setText(medList);
			}
		});
		btnAddMeds.setBounds(379, 204, 41, 34);
		frame.getContentPane().add(btnAddMeds);
		
		JLabel lblMedsList = new JLabel("Meds List");
		lblMedsList.setBounds(25, 101, 46, 14);
		frame.getContentPane().add(lblMedsList);
		
		txtNewMeds = new JTextField();
		txtNewMeds.setBounds(25, 54, 86, 20);
		frame.getContentPane().add(txtNewMeds);
		txtNewMeds.setColumns(10);
		
		lblNewMedication = new JLabel("New Medication");
		lblNewMedication.setBounds(25, 29, 86, 14);
		frame.getContentPane().add(lblNewMedication);
	}
}
