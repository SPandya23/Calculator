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

	/* public void addNum(String o1, String o2) {
		
		calculateAddition = (Double.parseDouble(o1) + Double.parseDouble(o2));
		
	}
	
	public void subNum(String o1, String o2) {
		
		calculateSubtraction = (Double.parseDouble(o1) - Double.parseDouble(o2));
		
	}
	
	public void multiplyNum(String o1, String o2) {
		
		calculateMultiplication = (Double.parseDouble(o1) * Double.parseDouble(o2));
		
	}
	
	public void divNum(String o1, String o2) {
		
		calculateDivision = (Double.parseDouble(o1) / Double.parseDouble(o2));
		
	}
	
	public double getAddnum() {
		
		System.out.println(calculateAddition);
		
		return calculateAddition;
		
	}
	
	public double getSubnum() {
		
		return calculateSubtraction;
		
	}
	
	public double getMulnum() {
		
		return calculateMultiplication;
		
	}
	
	public double getDivnum() {
		
		return calculateDivision;
		
	} */
	
}
