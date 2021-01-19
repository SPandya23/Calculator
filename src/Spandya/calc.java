package Spandya;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

class calc implements ActionListener {
	
	JFrame frame;
	JTextField text;
	JButton bu0,bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,budiv,bumul,buadd,busub;
	JButton budecimal, buequal, buclear, bupercentage;
	String o1 = "";
	String operand = "";
	String o2 = "";
			
	
	calc()
	{
		frame = new JFrame("Calculator");
		text = new JTextField(16);
		bu1 = new JButton("1");
		bu2 = new JButton("2");
		bu3 = new JButton("3");
		bu4 = new JButton("4");
		bu5 = new JButton("5");
		bu6 = new JButton("6");
		bu7 = new JButton("7");
		bu8 = new JButton("8");
		bu9 = new JButton("9");
		bu0 = new JButton("0");
		budiv = new JButton("/");
		buadd = new JButton("+");
		busub = new JButton("-");
		bumul = new JButton("*");
		budecimal = new JButton(".");
		buequal = new JButton("=");
		buclear = new JButton("C");
		bupercentage = new JButton("%");
	
		
		text.setBounds(30, 40, 280, 30);
		bu7.setBounds(30, 100, 50, 40);
		bu8.setBounds(100, 100, 50, 40);
		bu9.setBounds(170, 100, 50, 40);
		budiv.setBounds(240, 100, 50, 40);
		
		bu4.setBounds(30, 160, 50, 40);
		bu5.setBounds(100, 160, 50, 40);
		bu6.setBounds(170, 160, 50, 40);
		bumul.setBounds(240, 160, 50, 40);
		
		bu1.setBounds(30, 220, 50, 40);
		bu2.setBounds(100, 220, 50, 40);
		bu3.setBounds(170, 220, 50, 40);
		busub.setBounds(240, 220, 50, 40);
		
		budecimal.setBounds(30, 280, 50, 40);
		bu0.setBounds(100, 280, 50, 40);
		buequal.setBounds(170, 280, 50, 40);
		buadd.setBounds(240, 280, 50, 40);
		
		bupercentage.setBounds(240, 340, 50, 40);
		buclear.setBounds(30, 340, 140, 40);
		
		frame.add(text);
		frame.add(bu7);
		frame.add(bu8);
		frame.add(bu9);
		frame.add(budiv);
		
		frame.add(bu4);
		frame.add(bu5);
		frame.add(bu6);
		frame.add(bumul);
		
		frame.add(bu1);
		frame.add(bu2);
		frame.add(bu3);
		frame.add(busub);
		
		frame.add(budecimal);
		frame.add(bu0);
		frame.add(buequal);
		frame.add(buadd);
		
		frame.add(bupercentage);
		frame.add(buclear);
		
		frame.setLayout(null);
		frame.setSize(350, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);
		text.setEditable(false);
		
		bu9.addActionListener(this);
		bu8.addActionListener(this);
		bu7.addActionListener(this);
		bu6.addActionListener(this);
		bu5.addActionListener(this);
		bu4.addActionListener(this);
		bu3.addActionListener(this);
		bu2.addActionListener(this);
		bu1.addActionListener(this);
		bu0.addActionListener(this);
		budiv.addActionListener(this);
		bumul.addActionListener(this);
		busub.addActionListener(this);
		buadd.addActionListener(this);
		buequal.addActionListener(this);
		bupercentage.addActionListener(this);
		buclear.addActionListener(this);
		
				
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9' || cmd.charAt(0) == '.') {
			if (!operand.equals(""))
				o2 += cmd;
			else
				o1 += cmd;
			
			
			text.setText(o1 + operand + o2);
		}
		else if (cmd.charAt(0) == 'C') {
			text.setText("");
			o1 = operand = o2 = "";
		}
		else if (cmd.charAt(0) == '=') {
			double result;
			
			if (operand.equals("+"))
				result = (Double.parseDouble(o1) + Double.parseDouble(o2));
			else if (operand.equals("-"))
				result = (Double.parseDouble(o1) - Double.parseDouble(o2));
			else if (operand.equals("/"))
				result = (Double.parseDouble(o1) / Double.parseDouble(o2));
			else
				result = (Double.parseDouble(o1) * Double.parseDouble(o2));
			
			text.setText(o1 + operand + o2 + "=" + result);
			
			o1 = Double.toString(result);
			operand = o2 = "";
			
		}
		else {
			if (o1.equals("") || o2.equals("")) {
				operand = cmd;
			}
			else {
				double result;
				
				if (operand.equals("+"))
					result = (Double.parseDouble(o1) + Double.parseDouble(o2));
				else if (operand.equals("-"))
					result = (Double.parseDouble(o1) - Double.parseDouble(o2));
				else if (operand.equals("/"))
					result = (Double.parseDouble(o1) / Double.parseDouble(o2));
				else
					result = (Double.parseDouble(o1) * Double.parseDouble(o2));
				
				
				o1 = Double.toString(result);
				
				operand = cmd;
				
				o2 = "";
			}
			
			text.setText(o1 + operand + o2);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		new calc();
		
	}
	
}
