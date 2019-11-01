package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class tickets {

private JFrame frame;
private JTextField t5;
private JTextField t6;
private JTextField t7;
private JTextField t8;
private JTextField t9;
private JTextField t10;
private JTextField t11;
private JTextField t12;
private JTextField t1;
private JTable table;
private JTextField t2;
private JTextField t3;
private JTextField t4;
protected Calendar timer;
double n1=200;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
tickets window = new tickets();
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
public tickets() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 803, 491);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBounds(180, 11, 386, 53);
panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblT = new JLabel("Ticket Booking");
lblT.setFont(new Font("Tahoma", Font.BOLD, 25));
lblT.setBounds(93, 11, 260, 31);
panel.add(lblT);

JPanel panel_1 = new JPanel();
panel_1.setBounds(377, 78, 400, 263);
panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblTicketDetail = new JLabel("Ticket Detail");
lblTicketDetail.setBounds(171, 0, 89, 14);
panel_1.add(lblTicketDetail);

JLabel lblName = new JLabel("Name");
lblName.setBounds(32, 50, 46, 14);
panel_1.add(lblName);

t5 = new JTextField();
t5.setBounds(94, 47, 86, 20);
panel_1.add(t5);
t5.setColumns(10);

JLabel lblFrom = new JLabel("From");
lblFrom.setBounds(32, 91, 46, 14);
panel_1.add(lblFrom);

t6 = new JTextField();
t6.setBounds(94, 85, 86, 20);
panel_1.add(t6);
t6.setColumns(10);

JLabel lblTo = new JLabel("To");
lblTo.setBounds(32, 127, 46, 14);
panel_1.add(lblTo);

t7 = new JTextField();
t7.setBounds(94, 124, 86, 20);
panel_1.add(t7);
t7.setColumns(10);

JLabel lblDate = new JLabel("Date");
lblDate.setBounds(32, 162, 46, 14);
panel_1.add(lblDate);

t8 = new JTextField();
t8.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
	}
});
t8.setBounds(94, 159, 86, 20);
panel_1.add(t8);
t8.setColumns(10);

JLabel lblTime = new JLabel("Time");
lblTime.setBounds(32, 204, 46, 14);
panel_1.add(lblTime);

t9 = new JTextField();
t9.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
	}
});
t9.setBounds(94, 201, 86, 20);
panel_1.add(t9);
t9.setColumns(10);

JLabel lblNewLabel = new JLabel("Ticket No");
lblNewLabel.setBounds(271, 91, 54, 14);
panel_1.add(lblNewLabel);

t10 = new JTextField();
t10.setBounds(271, 105, 86, 20);
panel_1.add(t10);
t10.setColumns(10);

JLabel lblPrice = new JLabel("Price");
lblPrice.setBounds(271, 127, 46, 14);
panel_1.add(lblPrice);

t11 = new JTextField();
t11.setBounds(271, 142, 86, 20);
panel_1.add(t11);
t11.setColumns(10);

JLabel lblRoute = new JLabel("Route");
lblRoute.setBounds(271, 165, 46, 14);
panel_1.add(lblRoute);

t12 = new JTextField();
t12.setBounds(271, 180, 86, 20);
panel_1.add(t12);
t12.setColumns(10);

JButton btnNewButton = new JButton("Confirm");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String Number=t1.getText();
		t5.setText(Number);
		//String comboBox'/.getSelectedItem(),'
	}
});
btnNewButton.setBounds(171, 232, 89, 23);
panel_1.add(btnNewButton);

JLabel lblName_1 = new JLabel("Name");
lblName_1.setBounds(20, 78, 46, 14);
frame.getContentPane().add(lblName_1);

t1 = new JTextField();
t1.setBounds(84, 79, 101, 20);
frame.getContentPane().add(t1);
t1.setColumns(10);

JSeparator separator = new JSeparator();
separator.setBackground(SystemColor.desktop);
separator.setBounds(20, 110, 347, 2);
frame.getContentPane().add(separator);

JRadioButton rdbtnStandard = new JRadioButton("Standard");
rdbtnStandard.setBounds(0, 119, 82, 23);
frame.getContentPane().add(rdbtnStandard);

JRadioButton Sin = new JRadioButton("Single Ticket");
Sin.setBounds(76, 119, 109, 23);
frame.getContentPane().add(Sin);

JRadioButton rdbtnAdult = new JRadioButton("Adult");
rdbtnAdult.setBounds(187, 119, 109, 23);
frame.getContentPane().add(rdbtnAdult);

JRadioButton rdbtnNewRadioButton = new JRadioButton("First Class");
rdbtnNewRadioButton.setBounds(0, 147, 82, 23);
frame.getContentPane().add(rdbtnNewRadioButton);

JRadioButton Ac = new JRadioButton("AC");
Ac.setBounds(84, 147, 51, 23);
frame.getContentPane().add(Ac);

JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
rdbtnSleeper.setBounds(137, 147, 82, 23);
frame.getContentPane().add(rdbtnSleeper);

JRadioButton rdbtnChild = new JRadioButton("Child");
rdbtnChild.setBounds(238, 147, 109, 23);
frame.getContentPane().add(rdbtnChild);

JComboBox comboBox = new JComboBox();
comboBox.setBounds(10, 177, 72, 20);
comboBox.setModel(new DefaultComboBoxModel(new String[] {"-From-", "Arunachal Pradhesh", "Goa", "Jammu Kashmir", "Kerala"}));
frame.getContentPane().add(comboBox);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setBounds(97, 177, 96, 20);
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-To-", "Andra Pradhesh", "Kerala", "Uttar Pradhesh"}));
frame.getContentPane().add(comboBox_1);

JComboBox comboBox_2 = new JComboBox();
comboBox_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
comboBox_2.setBounds(221, 177, 83, 20);
comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-No.Tick-", "1", "2", "3", "4", "5", "6", "7"}));
frame.getContentPane().add(comboBox_2);

JSeparator separator_1 = new JSeparator();
separator_1.setBackground(SystemColor.desktop);
separator_1.setBounds(10, 300, 357, 2);
frame.getContentPane().add(separator_1);

JButton btnTotal = new JButton("Total");
btnTotal.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String a=(String)comboBox.getSelectedItem();
		t6.setText(a);
		String b=(String)comboBox_1.getSelectedItem();
		t7.setText(b);
		String Number=t1.getText();
		t5.setText(Number);
		//time
		Calendar timer=Calendar.getInstance();
		        timer.getTime();
		        SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
		        t9.setText(tTime.format(timer.getTime()));
		        //day
		        SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
		        t8.setText(tdate.format(timer.getTime()));
		        t6.setText("Goa");
		        t6.setText((String)comboBox.getSelectedItem());
		       
		        int num;
		        String s="";
		        num=1325;
		        s=s+num+1325;
		        t10.setText(s);
		        t12.setText("Any");

	     
		double t=0;
        String m="";
        if(Sin.isSelected()) {
        t=t+500;
        }
        else
        {
        t=t+300;
        }
        if(Ac.isSelected())
        {
        t=t+500;
        }
        else {
        t=t+300;
        }
        if(rdbtnSleeper.isSelected())
        {
        t=t+500;
        }
        else
        {
        t=t+300;
        }
        m=m+t;
       t3.setText(m);
       String text=(String)comboBox_2.getSelectedItem();
       int b1=Integer.parseInt(text);
       t=t+b1;
       String ans=String.format("%.2", t);
       t7.setText(ans);
       if(Ac.isSelected());
       {
    	   
       }
 		
	}
});
btnTotal.setBounds(5, 315, 89, 23);
frame.getContentPane().add(btnTotal);

JButton btnReset = new JButton("Reset");
btnReset.setBounds(102, 315, 89, 23);
frame.getContentPane().add(btnReset);

JButton btnExit = new JButton("Exit");
btnExit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		frame=new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frame, "Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
		System.exit(0);
	}}
});
btnExit.setBounds(203, 315, 89, 23);
frame.getContentPane().add(btnExit);

table = new JTable();
table.setModel(new DefaultTableModel(
new Object[][] {
{"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "AC/Non-AC", "Price"},

},
new String[] {
"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "AC/Non-AC", "Price"
}
));
table.setBounds(10, 351, 767, 64);
frame.getContentPane().add(table);
JSeparator separator_2 = new JSeparator();
separator_2.setBackground(SystemColor.desktop);
separator_2.setBounds(10, 208, 357, 2);
frame.getContentPane().add(separator_2);
JLabel lblTax = new JLabel("Tax");
lblTax.setBounds(20, 221, 46, 14);
frame.getContentPane().add(lblTax);
JLabel lblSubTotal = new JLabel("Sub Total");
lblSubTotal.setBounds(10, 250, 46, 14);
frame.getContentPane().add(lblSubTotal);
JLabel lblTotal = new JLabel("Total");
lblTotal.setBounds(20, 275, 46, 14);
frame.getContentPane().add(lblTotal);
t2 = new JTextField();
t2.setBounds(84, 218, 101, 20);
frame.getContentPane().add(t2);
t2.setColumns(10);
t3 = new JTextField();
t3.setBounds(84, 247, 101, 20);
frame.getContentPane().add(t3);
t3.setColumns(10);
t4 = new JTextField();
t4.setBounds(84, 272, 101, 20);
frame.getContentPane().add(t4);
t4.setColumns(10);
JSeparator separator_3 = new JSeparator();
separator_3.setOrientation(SwingConstants.VERTICAL);
separator_3.setBackground(SystemColor.desktop);
separator_3.setBounds(365, 110, 2, 228);
frame.getContentPane().add(separator_3);
JPanel panel_2 = new JPanel();
panel_2.setBounds(72, 11, 10, 10);
frame.getContentPane().add(panel_2);
}
}