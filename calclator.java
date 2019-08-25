import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;


public class calclator {

	private JFrame frmCalculator; 
	
	// Calculations
	String strNum1 = "";
	String strNum2 = ""; 
	String[] statement;
	double num1 = 0;
	double num2 = 0; 
	String strTotal;
	double totalVal;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calclator window = new calclator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
	
	// Method for Factorial 
	public int factorial (int x) { 
		if (x == 0 || x == 1) 
			return 1;
		else return x * factorial(x-1);
	} 
	

	/**
	 * Create the application.
	 */
	public calclator() {
		initialize();
	} 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.setVisible(true);
		frmCalculator.setSize(400, 450);
		frmCalculator.setResizable(false);
		frmCalculator.getContentPane().setLayout(null);
		
		
		
		// Declaring TextField answer Parameters
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(7, 57, 380, 55);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		// Declaring TextArea attributes
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 25));
		textArea.setSize(380,50);
		textArea.setLocation(7, 5);
		textArea.setEditable(false);
		// Adding textArea to frame
		frmCalculator.getContentPane().add(textArea);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.BLACK);
		btn0.setBackground(Color.GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn0.setBounds(113, 340, 108, 43);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(Color.GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn1.setBounds(7, 300, 108, 43);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.BLACK);
		btn2.setBackground(Color.GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("2");
			}
			
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn2.setBounds(113, 300, 108, 43);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.BLACK);
		btn3.setBackground(Color.GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn3.setBounds(220, 300, 108, 43);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.BLACK);
		btn4.setBackground(Color.GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("4");
			}
		});
		btn4.setActionCommand("");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn4.setBounds(7, 260, 108, 43);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.BLACK);
		btn5.setBackground(Color.GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn5.setBounds(113, 260, 108, 43);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setBackground(Color.GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn6.setBounds(220, 260, 108, 43);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.GRAY);
		btn7.setForeground(Color.BLACK);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("7");
			}
			
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn7.setBounds(7, 219, 108, 43);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.BLACK);
		btn8.setBackground(Color.GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn8.setBounds(113, 219, 108, 43);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.BLACK);
		btn9.setBackground(Color.GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 27));
		btn9.setBounds(220, 219, 108, 43);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btndot = new JButton(".");
		btndot.setForeground(Color.BLACK);
		btndot.setBackground(Color.GRAY);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				textArea.append(".");
			}
		});
		btndot.setAlignmentY(Component.TOP_ALIGNMENT);
		btndot.setFont(new Font("Tahoma", Font.BOLD, 27));
		btndot.setBounds(7, 340, 108, 43);
		frmCalculator.getContentPane().add(btndot);
		
		JButton btneql = new JButton("=");
		btneql.setForeground(Color.BLACK);
		btneql.setBackground(Color.YELLOW);
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				if(textArea.getText().contains("+")) {
					statement = textArea.getText().split("\\+");
					System.out.println(statement);
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Double.parseDouble(strNum1);
					num2 = Double.parseDouble(strNum2);
					
					totalVal = num1 + num2;
					
					strTotal = Double.toString(totalVal);
					textField.setText(strTotal);
				}
				else if (textArea.getText().contains("!")) {
					statement = textArea.getText().split("!");
					int statement1 = Integer.parseInt(statement[0]);
					totalVal = factorial(statement1);
					strTotal = Integer.toString((int)totalVal);
					textField.setText(strTotal);
				}
				else if(textArea.getText().contains("*")) {
					statement = textArea.getText().split("\\*");
					System.out.println(statement);
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Double.parseDouble(strNum1);
					num2 = Double.parseDouble(strNum2);
					
					totalVal = num1 * num2;
					
					strTotal = Double.toString(totalVal);
					textField.setText(strTotal);
				} 
				else if(textArea.getText().contains("-")) {
					statement = textArea.getText().split("\\-");
					System.out.println(statement);
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Double.parseDouble(strNum1);
					num2 = Double.parseDouble(strNum2);
					
					totalVal = num1 - num2;
					
					strTotal = Double.toString(totalVal);
					textField.setText(strTotal);
				} 
				else if(textArea.getText().contains("/")) {
					statement = textArea.getText().split("\\/");
					System.out.println(statement);
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Double.parseDouble(strNum1);
					num2 = Double.parseDouble(strNum2);
					
					totalVal = num1 / num2;
					
					strTotal = Double.toString(totalVal);
					textField.setText(strTotal);
				} 
				else if (textArea.getText().contains("^")) {
				statement = textArea.getText().split("\\^");
				num1 = Double.parseDouble(statement[0]);
				num2 = Double.parseDouble(statement[1]);
				totalVal = Math.pow(num1, num2);
				textField.setText(Double.toString(totalVal));
			} 
				else {
					textField.setText(textArea.getText());
				
			}
			}
		});
		btneql.setFont(new Font("Tahoma", Font.BOLD, 27));
		btneql.setBounds(220, 340, 108, 43);
		frmCalculator.getContentPane().add(btneql);
		
		JButton btndiv = new JButton("/");
		btndiv.setForeground(Color.BLACK);
		btndiv.setBackground(Color.ORANGE);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				 if (textField.getText().isEmpty())
					textArea.append("/");
				 else 
					 textArea.setText(textField.getText() + "/");
				
			} 
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 23));
		btndiv.setBounds(330, 340, 52, 43);
		frmCalculator.getContentPane().add(btndiv);
		
		JButton btnmul = new JButton("*");
		btnmul.setForeground(Color.BLACK);
		btnmul.setBackground(Color.ORANGE);
		btnmul.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				if (textField.getText().isEmpty())
					textArea.append("*");
				 else 
					 textArea.setText(textField.getText() + "*");
			}
		});
		btnmul.setBounds(330, 300, 52, 37);
		frmCalculator.getContentPane().add(btnmul);
		
		JButton btnsub = new JButton("-");
		btnsub.setForeground(Color.BLACK);
		btnsub.setBackground(Color.ORANGE);
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnsub.setActionCommand("");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().isEmpty())
					textArea.append("-");
				 else 
					 textArea.setText(textField.getText() + "-");
			}
		});
		btnsub.setBounds(330, 260, 52, 37);
		frmCalculator.getContentPane().add(btnsub);
		
		JButton btnsum = new JButton("+");
		btnsum.setForeground(Color.BLACK);
		btnsum.setBackground(Color.ORANGE);
		btnsum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				if (textField.getText().isEmpty())
					textArea.append("+");
				 else 
					 textArea.setText(textField.getText() + "+");
			}
		});
		btnsum.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnsum.setBounds(330, 219, 52, 37);
		frmCalculator.getContentPane().add(btnsum);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(Color.BLACK);
		btnC.setBackground(Color.RED);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				textArea.setText("");
				textField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnC.setBounds(330, 178, 52, 37);
		frmCalculator.getContentPane().add(btnC);
		
		JButton btndel = new JButton("<-");
		btndel.setForeground(Color.ORANGE);
		btndel.setBackground(Color.BLACK);
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				textArea.setText(textArea.getText().substring(0, textArea.getText().length()-1));
			}
		});
		btndel.setFont(new Font("Tahoma", Font.BOLD, 27));
		btndel.setBounds(220, 178, 108, 43);
		frmCalculator.getContentPane().add(btndel);
		
		JButton btnSqr = new JButton("^");
		btnSqr.setBackground(Color.BLACK);
		btnSqr.setForeground(Color.ORANGE);
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				if (textField.getText().isEmpty())
					textArea.append("^");
				 else 
					 textArea.setText(textField.getText() + "^");
			
			}
		});
		btnSqr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSqr.setBounds(113, 178, 108, 43);
		frmCalculator.getContentPane().add(btnSqr);
		
		JButton button_6 = new JButton("!");
		button_6.setBackground(Color.BLACK);
		button_6.setForeground(Color.ORANGE);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().isEmpty())
					textArea.append("!");
				 else 
					 textArea.setText(textField.getText() + "!");	
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 27));
		button_6.setBounds(7, 178, 108, 43);
		frmCalculator.getContentPane().add(button_6);
		
		JRadioButton btnON = new JRadioButton("ON");
		btnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				//Method to enable all buttons 
					btn0.setEnabled(true);
					btn1.setEnabled(true);
					btn2.setEnabled(true);
					btn3.setEnabled(true);
					btn4.setEnabled(true);
					btn5.setEnabled(true);
					btn6.setEnabled(true);
					btn7.setEnabled(true);
					btn8.setEnabled(true);
					btn9.setEnabled(true);
					btnsum.setEnabled(true);
					btndiv.setEnabled(true);
					btnmul.setEnabled(true);
					btnsub.setEnabled(true);
					btndot.setEnabled(true);
					btneql.setEnabled(true);
					btnSqr.setEnabled(true);
					btnC.setEnabled(true);
					btndel.setEnabled(true);
					textArea.setEnabled(true);
					textField.setEnabled(true);
					button_6.setEnabled(true);
					
			}
		});
		buttonGroup.add(btnON);
		btnON.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		btnON.setBounds(17, 121, 57, 25);
		frmCalculator.getContentPane().add(btnON);
		
		JRadioButton btnOFF = new JRadioButton("OFF");
		btnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
				textField.setText("");
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnsum.setEnabled(false);
				btndiv.setEnabled(false);
				btnmul.setEnabled(false);
				btnsub.setEnabled(false);
				btndot.setEnabled(false);
				btneql.setEnabled(false);
				btnSqr.setEnabled(false);
				btnC.setEnabled(false);
				btndel.setEnabled(false);
				textArea.setEnabled(false);
				textField.setEnabled(false);
				button_6.setEnabled(false);
			}
		});
		buttonGroup.add(btnOFF);
		btnOFF.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		btnOFF.setBounds(85, 121, 57, 25);
		frmCalculator.getContentPane().add(btnOFF);	
	
		
	}
	
}
