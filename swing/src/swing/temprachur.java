package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class temprachur {

	private JFrame frame;
	private JTextField textField;
	double n1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temprachur window = new temprachur();
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
	public temprachur() {
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
		
		JLabel lblNewLabel = new JLabel("Degree");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(52, 57, 118, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResult.setBounds(52, 115, 118, 28);
		frame.getContentPane().add(lblResult);
		
		JButton btnNewButton = new JButton("To Celsius");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 186, 204, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnTofarehnheit = new JButton("To Farehnheit");
		btnTofarehnheit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTofarehnheit.setBounds(220, 186, 204, 46);
		frame.getContentPane().add(btnTofarehnheit);
		
		textField = new JTextField();
		textField.setBounds(180, 59, 182, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(180, 115, 182, 28);
		frame.getContentPane().add(label_1);
	}

}
