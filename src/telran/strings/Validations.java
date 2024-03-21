package telran.strings;

public class Validations {

	public static boolean isArithmeticExpression(String expression) {
			
if (!expression.matches(RegularExpressions.arithmeticExpression())) {
	return false;
}
		int counter = 0;
		for (int i = 0; i < expression.length(); i ++) {
			if (expression.charAt(i) == '(') {
				counter ++;
			} 
			else if (expression.charAt(i) == ')') {
				counter -= 1;
			}
			
			else if (counter <= -1) {
				return false;
			}

		}
		return counter == 0;

}
}