package telran.strings;

public class Validations {

	public static boolean isArithmeticExpression(String expression) {
			

		int counter = 0;
		for (int i = 0; i < expression.length(); i ++) {
			if (expression.charAt(i) == '(') {
				counter ++;
			} 
			if (expression.charAt(i) == ')') {
				counter -= 1;
			}
			
			if (counter <= -1) {
				return false;
			}

		}
		
//		if ( expression.charAt(expression.length() - 1) == ')') {
//			counter -= 1;
//		}
		
		System.out.println(counter);
		return counter == 0;

}
}