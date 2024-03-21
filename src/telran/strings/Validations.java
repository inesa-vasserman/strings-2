package telran.strings;

public class Validations {

	public static boolean isArithmeticExpression(String expression) {
			
		if (!expression.matches(RegularExpressions.arithmeticExpression())) {
			return false;
		}
		int counter = 0;
		for (int i = 0; i < expression.length() - 1; i ++) {
			if (expression.charAt(i) == '(' && expression.charAt(i + 1) != ')') {
				counter ++;
			} 
			if (expression.charAt(i) == ')' && expression.charAt(i + 1) != '(') {
				counter -= 1;
			}

		}
		
		if ( expression.charAt(expression.length() - 1) == ')' && expression.charAt(expression.length()- 2)  != '(') {
			counter -= 1;
		}
		
		System.out.println(counter);
		return counter == 0;

}
}