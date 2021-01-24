package Spandya;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalcView extends JFrame {
	
	private JTextField text;
	private JButton bu0,bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,budiv,bumul,buadd,busub;
	private JButton budecimal, buequal, buclear, bupercentage;
	
	
	public CalcView() {
		
		JPanel calcPanel = new JPanel();
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
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(275, 275);
		
		
		calcPanel.add(text);
		calcPanel.add(bu7);
		calcPanel.add(bu8);
		calcPanel.add(bu9);
		calcPanel.add(bu4);
		calcPanel.add(bu5);
		calcPanel.add(bu6);
		calcPanel.add(bu1);
		calcPanel.add(bu2);
		calcPanel.add(bu3);
		calcPanel.add(buclear);
		calcPanel.add(bu0);
		calcPanel.add(buequal);
		
		calcPanel.add(bumul);
		calcPanel.add(busub);
		
		calcPanel.add(budecimal);
		calcPanel.add(buadd);
		
		calcPanel.add(bupercentage);
		calcPanel.add(budiv);
		
		this.add(calcPanel);
		
	}
	
	public void setSolution(Double num) {
		
		
		text.setText(Double.toString(num));
	}
	
	public void setExpression(String expression) {
		
		text.setText(expression);
	}
	
	void b1Listener(ActionListener Listener){

		bu1.addActionListener(Listener);

	}
	
	void b2Listener(ActionListener Listener){

		bu2.addActionListener(Listener);

	}
	
	void b3Listener(ActionListener Listener){

		bu3.addActionListener(Listener);

	}
	
	void b4Listener(ActionListener Listener){

		bu4.addActionListener(Listener);

	}
	
	void b5Listener(ActionListener Listener){

		bu5.addActionListener(Listener);

	}
	
	void b6Listener(ActionListener Listener){

		bu6.addActionListener(Listener);

	}
	
	void b7Listener(ActionListener Listener){

		bu7.addActionListener(Listener);

	}
	
	void b8Listener(ActionListener Listener){

		bu8.addActionListener(Listener);

	}
	
	void b9Listener(ActionListener Listener){

		bu9.addActionListener(Listener);

	}
	
	void b0Listener(ActionListener Listener){

		bu0.addActionListener(Listener);

	}
	
	void addListener(ActionListener Listener){

		buadd.addActionListener(Listener);

	}
	
	void subListener(ActionListener Listener){

		busub.addActionListener(Listener);

	}
	
	void divListener(ActionListener Listener){

		budiv.addActionListener(Listener);

	}
	
	void mulListener(ActionListener Listener){

		bumul.addActionListener(Listener);

	}
	
	void periodListener(ActionListener Listener){

		budecimal.addActionListener(Listener);

	}
	
	void equalsListener(ActionListener Listener){

		buequal.addActionListener(Listener);

	}
	
	void clearListener(ActionListener Listener){

		buclear.addActionListener(Listener);

	}
	
	void percentListener(ActionListener Listener){

		bupercentage.addActionListener(Listener);

	}
	
}