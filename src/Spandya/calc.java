package Spandya;

import javax.swing.*;

public class calc {
	
	public static void main(String[] args)
	{
		CalcView calculatorView = new CalcView();
		
		CalcModel calculatorModel = new CalcModel();
		
		CalcController calculatorController = new CalcController(calculatorView, calculatorModel);
		
		calculatorView.setVisible(true);
		
	}
	
}
