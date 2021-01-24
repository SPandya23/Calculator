package Spandya;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class calc {
	
	public static void main(String[] args)
	{
		CalcView calculatorView = new CalcView();
		
		CalcModel calculatorModel = new CalcModel();
		
		CalcController calculatorController = new CalcController(calculatorView, calculatorModel);
		
		calculatorView.setVisible(true);
		
	}
	
}
