package telran.strings;

public class RegularExpressions {
	
	public static String javaVariable() {
		
		String regex = "[A-Za-z$][\\w$]*|_[\\w$]+";
		//Return regex for checking a java variable string
		
		return regex;
		
	}
	public static String zero_300() {
		
		String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
		return regex;
		
	}
	
	public static String ipOptet() {
		
		return "\\d|[0-1]\\d\\d?|2[0-4]\\d|25[0-5]";
	}
	
	public static String mobileIsraelPhone() {
		//+972-5>-<7   +97255 28 980 69  289 80 69   28 980 69 28 98 069 
		return "(\\+972-?|0)5\\d[-]?(\\d{3}-?\\d{2}-?\\d{2}|\\d{2}-?\\d{3}-?\\d{2}|(\\d{2}-?){2}-?\\d{3})";
	}
	
	

}
