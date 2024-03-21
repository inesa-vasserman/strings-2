package telran.strings;

public class RegularExpressions {
	
	public static String javaVariable() {
		
		String regex = "[A-Za-z$][\\w$]*|_[\\w$]+";
		
		return regex;
		
	}
	public static String zero_300() {
		
		String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
		return regex;
		
	}
	
	public static String ipOptet() {
		
		return "([0-1]?\\d{1,2}|2([0-4]\\d|5[0-5]))";
	}
	
	public static String mobileIsraelPhone() {
		
		return "(\\+972-?|0)5\\d[-]?(\\d{3}-?\\d{2}-?\\d{2}|\\d{2}-?\\d{3}-?\\d{2}|(\\d{2}-?){2}-?\\d{3})";
	}
	
	public static String ipV4Address() {
		String ipOctetExpr = ipOptet();
		return String.format("%1$s(\\.%1$s){3}", ipOctetExpr);
	}
	
	public static String simpleArithmeticExpresssion() {
		String operand = integerNumberExp();
		String operation = operationExp();
		return String.format("%1$s(%2$s%1$s)*", operand, operation);
	}

	private static String integerNumberExp() {

		return "(\\s*\\d+\\s*)";
	}
	
	private static String operationExp() {
		return "\\s*[-+*/]\\s*";
	}
	
	private static String integerDoubleNumberExp() {
	    return "(\\s*\\d+(\\.\\d+)*\\s*)";
	}

	
	public static String javaVariableExp() {
		
		String regex = "(\\s*([A-Za-z$][\\w$]*|_[\\w$]+)\\s*)";
		
		return regex;
		
	}
	
	public static String arithmeticExpression() {
	    String operand = integerDoubleNumberExp();
	    String operation = operationExp();
	    String javaVariable = javaVariableExp();
	    return String.format("\\(*(%1$s|%3$s)(\\(*%2$s\\(*(%1$s|%3$s)\\)*)*\\)*", operand, operation, javaVariable);    
	}

	                         
	
	
	
	

	


	

	
	
	

}
