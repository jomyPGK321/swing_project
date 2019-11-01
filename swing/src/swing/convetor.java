package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class convetor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double result;
	String ans;
double result2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					convetor window = new convetor();
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
	public convetor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 442, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHelp.setBounds(10, 11, 31, 24);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAbout.setBounds(51, 11, 46, 24);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblUsMeasurment = new JLabel("US Measurment");
		lblUsMeasurment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsMeasurment.setBounds(139, 81, 114, 31);
		frame.getContentPane().add(lblUsMeasurment);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHeight.setBounds(53, 139, 114, 31);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWeight.setBounds(51, 177, 114, 31);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblMetri = new JLabel("Metric");
		lblMetri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMetri.setBounds(318, 81, 114, 31);
		frame.getContentPane().add(lblMetri);
		JLabel l1 = new JLabel("");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l1.setBounds(318, 146, 98, 20);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l2.setBounds(318, 182, 98, 20);
		frame.getContentPane().add(l2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a1;
				String a2;
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				result=num1/3.28;
				result2=num2/2.205;
				a1=String.format("%.2f",result);
				a2=String.format("%.2f",result2);
				l1.setText(a1+"m");
				l2.setText(a2+"kg");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(83, 234, 125, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("CLEAR");
		btnCancel.setBackground(Color.GRAY);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBounds(238, 234, 125, 31);
		frame.getContentPane().add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(144, 146, 141, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 184, 141, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(160, 286, 125, 31);
		frame.getContentPane().add(btnExit);
		
	
	}
}
