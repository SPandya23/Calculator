package Spandya;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
	
	private CalcView calculatorView;
	private CalcModel calculatorModel;
	String o1 = "";
	String operand = "";
	String o2 = "";
	
	
	public CalcController(CalcView calculatorView, CalcModel calculatorModel) {
		
		this.calculatorView = calculatorView;
		this.calculatorModel = calculatorModel;
		
		this.calculatorView.b0Listener(new CalculatorListener());
		this.calculatorView.b1Listener(new CalculatorListener());
		this.calculatorView.b2Listener(new CalculatorListener());
		this.calculatorView.b3Listener(new CalculatorListener());
		this.calculatorView.b4Listener(new CalculatorListener());
		this.calculatorView.b5Listener(new CalculatorListener());
		this.calculatorView.b6Listener(new CalculatorListener());
		this.calculatorView.b7Listener(new CalculatorListener());
		this.calculatorView.b8Listener(new CalculatorListener());
		this.calculatorView.b9Listener(new CalculatorListener());
		this.calculatorView.addListener(new CalculatorListener());
		this.calculatorView.subListener(new CalculatorListener());
		this.calculatorView.divListener(new CalculatorListener());
		this.calculatorView.mulListener(new CalculatorListener());
		this.calculatorView.equalsListener(new CalculatorListener());
		this.calculatorView.periodListener(new CalculatorListener());
		this.calculatorView.clearListener(new CalculatorListener());
		this.calculatorView.percentListener(new CalculatorListener());
		
		
	}
	
	class CalculatorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String cmd = e.getActionCommand();
			
			if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9' || cmd.charAt(0) == '.') {
				if (!operand.equals(""))
					o2 += cmd;
				else
					o1 += cmd;
				
				
				calculatorView.setExpression(o1 + operand + o2);
			}
			else if (cmd.charAt(0) == 'C') {
				calculatorView.setExpression("");
				o1 = operand = o2 = "";
			}
			else if (cmd.charAt(0) == '=') {
				calculatorView.setExpression("");
				
				
				double result;
				
				if (o2.equals("") && operand.equals("")) {
					
					calculatorView.setExpression(o1);
					
				} else if (o1.equals("")) {
					calculatorView.setExpression(o2);
					o1 = o2;
					operand = o2 = "";
					
				}
				
				calculatorModel.calculation(o1, operand, o2);
				result = calculatorModel.getcalculations();
				calculatorView.setSolution(result);
				
				o1 = Double.toString(result);
				
				operand = o2 = "";
			
				
			}
			else if (cmd.charAt(0) == '%') {
				calculatorView.setExpression("");
				
				double result;
				
				if (o2.equals("") && operand.equals("")) {
					
					result = (Double.parseDouble(o1)) / 100;
					calculatorView.setSolution(result);
	
					o1 = Double.toString(result);
					operand = o2 = "";

					
				}
				
				calculatorModel.calculation(o1, operand, o2);
				result = calculatorModel.getcalculations();
				calculatorView.setSolution(result);
				
				o1 = Double.toString(result);
				
				operand = o2 = "";
				
				
				
			}
			else {
				if (o1.equals("") || o2.equals("")) {
					operand = cmd;
				}
				else {
					double result;
					
					if (o2.equals("") && operand.equals("")) {
						
						calculatorView.setExpression(o1);
						
					}
					
					
					calculatorModel.calculation(o1, operand, o2);
					result = calculatorModel.getcalculations();
					calculatorView.setSolution(result);
					
					o1 = Double.toString(result);
					
					operand = cmd;
					
					o2 = "";
					
					}
				
				calculatorView.setExpression(o1 + operand + o2);
				} 
			
		}
		
	}
	

}
