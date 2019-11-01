package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BodyMassIndex {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	double a1;
	double a2;
	double n1;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BodyMassIndex window = new BodyMassIndex();
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
	public BodyMassIndex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 0));
		panel.setBounds(0, 0, 434, 85);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("BODY MASS INDEX");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblBodyMassIndex.setBounds(132, 21, 230, 38);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(102, 153, 0));
		panel_1.setBounds(10, 98, 414, 300);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Height(m):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 83, 88, 31);
		panel_1.add(lblNewLabel);
		
		JLabel lblWeightkg = new JLabel("Weight(kg):");
		lblWeightkg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWeightkg.setBounds(10, 125, 88, 31);
		panel_1.add(lblWeightkg);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBmi.setBounds(10, 189, 56, 31);
		panel_1.add(lblBmi);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(255, 204, 0));
		l1.setBackground(new Color(0, 0, 0));
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setBounds(268, 189, 136, 31);
		panel_1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(142, 90, 199, 24);
		panel_1.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(142, 132, 199, 24);
		panel_1.add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(255, 204, 0));
		t3.setColumns(10);
		t3.setBounds(116, 189, 101, 24);
		panel_1.add(t3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String r1;
				a1=Double.parseDouble(t1.getText());
				a2=Double.parseDouble(t2.getText());
				n1=a2/(a1*a1);
				r1=String.format("%.2f",n1);
				t3.setText(r1);
				if(n1<18.5)
				{
					l1.setText("UNDER WEIGHT");
				}
				if(n1>18.5 && n1<24.9)
				{
					l1.setText("NORMAL WEIGHT");	
				}
				if(n1>25 && n1<29.9)
				{
					l1.setText("OVER WEIGHT");
				}
				if(n1>30)
				{
					l1.setText("OBECE");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(33, 249, 103, 38);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(142, 249, 103, 38);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(255, 249, 101, 38);
		panel_1.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(102, 153, 0));
		panel_2.setBounds(0, 409, 434, 185);
		frame.getContentPane().add(panel_2);
	}
}
