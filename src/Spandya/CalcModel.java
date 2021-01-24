package Spandya;

public class CalcModel {
	
	private double result;
	
	
	public void calculation(String o1, String operand, String o2) {
		
		if (operand.equals("+"))
			result = (Double.parseDouble(o1) + Double.parseDouble(o2));
		else if (operand.equals("-"))
			result = (Double.parseDouble(o1) - Double.parseDouble(o2));
		else if (operand.equals("/"))
			result = (Double.parseDouble(o1) / Double.parseDouble(o2));
		else
			result = (Double.parseDouble(o1) * Double.parseDouble(o2));
		
	}
	
	public double getcalculations() {
		
		
		return result;
	}
}
