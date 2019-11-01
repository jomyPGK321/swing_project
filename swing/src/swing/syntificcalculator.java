package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class syntificcalculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double USA=16;
	double India=10.2;
	double result;
	String op;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					syntificcalculator window = new syntificcalculator();
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
	public syntificcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Sintific Calculator");
		frame.setBounds(100, 100, 978, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 956, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Standerd");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 370, 397);	
				textField.setBounds(0,48,338,47);
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Scentific");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 654, 480);
				textField.setBounds(0,48,630,47);
			}
		});
		mnFile.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ultra Convertion");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 977, 398);
				textField.setBounds(0,48,630,47);
			}
		});
		mnFile.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("EXIT");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		textField = new JTextField();
		textField.setBounds(0, 48, 630, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.setBounds(0, 117, 63, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(73, 117, 63, 37);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnC.setBounds(146, 117, 63, 37);
		frame.getContentPane().add(btnC);
		
		JButton button_2 = new JButton("+/-");
		button_2.setBounds(217, 117, 63, 37);
		frame.getContentPane().add(button_2);
		
		JButton btnL = new JButton("Root");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sqrt(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnL.setBounds(290, 117, 63, 37);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("L");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=java.lang.Math.log(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(368, 117, 63, 37);
		frame.getContentPane().add(btnSin);
		
		
		
		JButton btnSinh_1 = new JButton("Sinh");
		btnSinh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSinh_1.setBounds(514, 117, 63, 37);
		frame.getContentPane().add(btnSinh_1);
		
		JButton btnMod = new JButton("mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnMod.setBounds(587, 117, 63, 37);
		frame.getContentPane().add(btnMod);
		
		JButton button_8 = new JButton("7");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBounds(0, 165, 63, 37);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(73, 165, 63, 37);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(146, 165, 63, 37);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_11.setBounds(217, 165, 63, 37);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("%");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_12.setBounds(290, 165, 63, 37);
		frame.getContentPane().add(button_12);
		
		JButton btnPi_1 = new JButton("pi");
		btnPi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=3.14*num1;
				textField.setText(String.valueOf(num1));
			}
		});
		btnPi_1.setBounds(368, 165, 63, 37);
		frame.getContentPane().add(btnPi_1);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.cos(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(441, 165, 63, 37);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cosh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCosh.setBounds(514, 165, 63, 37);
		frame.getContentPane().add(btnCosh);
		
		JButton btnInx = new JButton("Inx");
		btnInx.setBounds(587, 165, 63, 37);
		frame.getContentPane().add(btnInx);
		
		JButton button_17 = new JButton("4");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_17.getText();
				textField.setText(Number);
			}
		});
		button_17.setBounds(0, 213, 63, 37);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("5");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_18.getText();
				textField.setText(Number);
			}
		});
		button_18.setBounds(73, 213, 63, 37);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("6");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_19.getText();
				textField.setText(Number);
			}
		});
		button_19.setBounds(146, 213, 63, 37);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("*");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_20.setBounds(217, 213, 63, 37);
		frame.getContentPane().add(button_20);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
	
			}
		});
		btnXy.setBounds(368, 213, 63, 37);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.tan(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(441, 213, 63, 37);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tanh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTanh.setBounds(514, 213, 63, 37);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC_1.setBounds(587, 213, 63, 37);
		frame.getContentPane().add(btnC_1);
		
		JButton button_26 = new JButton("1");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_26.getText();
				textField.setText(Number);
			}
		});
		button_26.setBounds(0, 261, 63, 37);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("2");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_27.getText();
				textField.setText(Number);
			}
		});
		button_27.setBounds(73, 261, 63, 37);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("3");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_28.getText();
				textField.setText(Number);
			}
		});
		button_28.setBounds(146, 261, 63, 37);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("-");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_29.setBounds(217, 261, 63, 37);
		frame.getContentPane().add(button_29);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			num1=Double.parseDouble(textField.getText());
			textField.setText("");
			num1=Math.pow(num1,2);
			textField.setText(String.valueOf(num1));
			}
		});
		btnX.setBounds(368, 261, 63, 37);
		frame.getContentPane().add(btnX);
		
		JButton button_31 = new JButton("=");
		button_31.addActionListener(new ActionListener() {
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
					if(op=="%")
					{
						result=num1/num2;
						ans=String.format("%.2f", result);
						textField.setText(ans);
					}
					if(op=="x^y")
					{
						result=java.lang.Math.pow(num1,num2);
						ans=String.format("%.2f", result);
						textField.setText(String.valueOf(ans));
					}
				}
			}
		);
		button_31.setBounds(290, 259, 63, 87);
		frame.getContentPane().add(button_31);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.setBounds(441, 261, 63, 37);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.round(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnRund.setBounds(514, 261, 63, 37);
		frame.getContentPane().add(btnRund);
		
		JButton btnpi = new JButton("2*pi");
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=2*3.14*num1;
				textField.setText(String.valueOf(num1));
			}
		});
		btnpi.setBounds(587, 261, 63, 37);
		frame.getContentPane().add(btnpi);
		
		JButton button_35 = new JButton("0");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_35.getText();
				textField.setText(Number);
			}
		});
		button_35.setBounds(0, 309, 136, 37);
		frame.getContentPane().add(button_35);
		
		JButton button_37 = new JButton(".");
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_37.getText();
				textField.setText(Number);
			}
		});
		button_37.setBounds(146, 309, 63, 37);
		frame.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("+");
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_38.setBounds(217, 309, 63, 37);
		frame.getContentPane().add(button_38);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField.getText());
					textField.setText("");
					num1=Math.pow(num1,3);
					textField.setText(String.valueOf(num1));
			}
		});
		btnX_1.setBounds(368, 309, 63, 37);
		frame.getContentPane().add(btnX_1);
		
		JButton btnPi = new JButton("1/x");
		btnPi.setBounds(290, 213, 63, 37);
		frame.getContentPane().add(btnPi);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setBounds(441, 309, 63, 37);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnHex.setBounds(514, 309, 63, 37);
		frame.getContentPane().add(btnHex);
		
		JButton btnOcta = new JButton("Octa");
		btnOcta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnOcta.setBounds(587, 309, 63, 37);
		frame.getContentPane().add(btnOcta);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(656, 50, 292, 298);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 272, 276);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("CURRENCY CONVERTER");
		lblCurrencyConverter.setFont(new Font("Lucida Handwriting", Font.BOLD, 20));
		lblCurrencyConverter.setBounds(0, 11, 272, 35);
		panel_1.add(lblCurrencyConverter);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(70, 133, 147, 35);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(70, 179, 147, 35);
		panel_1.add(lblNewLabel);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select..", "India", "USA", "China"}));
		comboBox.setToolTipText("\r\n");
		comboBox.setBounds(70, 73, 147, 35);
		panel_1.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("CONVERTER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("India"));
				{
					String c=String.format("Rs%.2f",bp*India);
					lblNewLabel.setText(c);
				}
				if(comboBox.getSelectedItem().equals("USA"));
				{
					String c=String.format("$%.2f",bp*USA);
					lblNewLabel.setText(c);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 225, 133, 40);
		panel_1.add(btnNewButton_1);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				lblNewLabel.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(153, 225, 119, 40);
		panel_1.add(btnClear);
		
		JButton btnSin_1 = new JButton("sin");
		btnSin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sin(num1);
                textField.setText(String.valueOf(num1));

			}
		});
		btnSin_1.setBounds(441, 117, 63, 37);
		frame.getContentPane().add(btnSin_1);
		
		
	}
	protected static Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
