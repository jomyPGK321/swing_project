package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 324, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(0, 33, 308, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton b1 = new JButton("1");
		b1.setBackground(Color.LIGHT_GRAY);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b1.getText();
				textField.setText(Number);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(10, 127, 64, 47);
		frame.getContentPane().add(b1);
		
		JButton b4 = new JButton("4");
		b4.setBackground(Color.LIGHT_GRAY);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String Number=textField.getText()+b4.getText();
			textField.setText(Number);
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 18));
		b4.setBounds(10, 191, 64, 51);
		frame.getContentPane().add(b4);
		
		JButton b7 = new JButton("7");
		b7.setBackground(Color.LIGHT_GRAY);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b7.getText();
				textField.setText(Number);
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 18));
		b7.setBounds(10, 253, 64, 52);
		frame.getContentPane().add(b7);
		
		JButton b0 = new JButton("0");
		b0.setBackground(Color.LIGHT_GRAY);
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b0.getText();
				textField.setText(Number);
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 18));
		b0.setBounds(10, 316, 64, 47);
		frame.getContentPane().add(b0);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b2.getText();
				textField.setText(Number);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 18));
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setForeground(Color.BLACK);
		b2.setBounds(84, 127, 64, 47);
		frame.getContentPane().add(b2);
		
		JButton b5 = new JButton("5");
		b5.setFont(new Font("Tahoma", Font.BOLD, 18));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b5.getText();
				textField.setText(Number);
			}
		});
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setForeground(Color.BLACK);
		b5.setBounds(84, 191, 64, 51);
		frame.getContentPane().add(b5);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b8.getText();
				textField.setText(Number);
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 18));
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setForeground(Color.BLACK);
		b8.setBounds(84, 253, 64, 52);
		frame.getContentPane().add(b8);
		
		JButton button_6 = new JButton(".");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setForeground(Color.BLACK);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(84, 316, 64, 47);
		frame.getContentPane().add(button_6);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b3.getText();
				textField.setText(Number);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 18));
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(Color.BLACK);
		b3.setBounds(158, 127, 64, 47);
		frame.getContentPane().add(b3);
		
		JButton b6 = new JButton("6");
		b6.setFont(new Font("Tahoma", Font.BOLD, 18));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b6.getText();
				textField.setText(Number);
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 18));
		b6.setBackground(Color.LIGHT_GRAY);
		b6.setForeground(Color.BLACK);
		b6.setBounds(158, 191, 64, 51);
		frame.getContentPane().add(b6);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b9.getText();
				textField.setText(Number);
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 18));
		b9.setBackground(Color.LIGHT_GRAY);
		b9.setForeground(Color.BLACK);
		b9.setBounds(158, 253, 64, 52);
		frame.getContentPane().add(b9);
		
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="%");
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_10.setBackground(Color.LIGHT_GRAY);
		button_10.setForeground(Color.BLACK);
		button_10.setBounds(158, 316, 64, 47);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_11.setBackground(Color.LIGHT_GRAY);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_11.setBounds(232, 127, 64, 47);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
				
			}
		});
		button_12.setBackground(Color.LIGHT_GRAY);
		button_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_12.setBounds(232, 191, 64, 51);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_13.setBackground(Color.LIGHT_GRAY);
		button_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_13.setBounds(232, 313, 64, 52);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("%");
		button_14.setBackground(Color.LIGHT_GRAY);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_14.setBounds(232, 376, 64, 54);
		frame.getContentPane().add(button_14);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBackground(Color.RED);
		btnC.setBounds(10, 377, 64, 51);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
				}
			}
		});
		btnB.setBackground(Color.LIGHT_GRAY);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnB.setBounds(84, 374, 64, 54);
		frame.getContentPane().add(btnB);
		
		JButton button_15 = new JButton("*");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_15.setBackground(Color.LIGHT_GRAY);
		button_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_15.setBounds(232, 253, 64, 52);
		frame.getContentPane().add(button_15);
		
		JButton btnOo = new JButton("OO");
		btnOo.setBackground(Color.LIGHT_GRAY);
		btnOo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnOo.getText();
				textField.setText(Number);
			}
		});
		btnOo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOo.setBounds(158, 374, 64, 56);
		frame.getContentPane().add(btnOo);
		
		JLabel lblForTheLifes = new JLabel("FOR THE LIFE'S CALCULATION");
		lblForTheLifes.setForeground(Color.WHITE);
		lblForTheLifes.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 15));
		lblForTheLifes.setBounds(10, 445, 243, 14);
		frame.getContentPane().add(lblForTheLifes);
	}
}
