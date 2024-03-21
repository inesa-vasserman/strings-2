package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.Validations;

class ValidationsTest {

	@Test
	void testIsArithmeticExpression() {

		
		assertTrue(Validations.isArithmeticExpression("(20.5 + abc12 + 22)"));
		assertTrue(Validations.isArithmeticExpression("(20.5 + (abc12 + 1) + 22)"));
		assertTrue(Validations.isArithmeticExpression("((20.5 + abc12) + 22)"));
		assertTrue(Validations.isArithmeticExpression("((((a + b))))"));
		assertFalse(Validations.isArithmeticExpression("(a+b))*((b+a)"));
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc12))*2"));
		assertFalse(Validations.isArithmeticExpression("(1"));
		assertFalse(Validations.isArithmeticExpression("1)"));


	}

	
	
}
