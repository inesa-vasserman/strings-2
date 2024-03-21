package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.RegularExpressions;

class RegularExpressionsTests {

	@Test
	void javaVariableTrueTest() {
		
		String regex = RegularExpressions.javaVariable();
		assertTrue("abc".matches(regex));
		assertTrue("Abc".matches(regex));
		assertTrue("abc_".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("$123".matches(regex));
		assertTrue("$1_23".matches(regex));
		assertTrue("__".matches(regex));
		
	}
	
	@Test
	void javaVariableFalseTest() {
		
		String regex = RegularExpressions.javaVariable();
		assertFalse("1abc".matches(regex));
		assertFalse("_".matches(regex));
		assertFalse("a-2".matches(regex));
		assertFalse("a 2".matches(regex));
		assertFalse("a?2".matches(regex));
		assertFalse("1abc".matches(regex));
		
	}
	
	@Test 
	void zero_300TestTrue() {
		
		String regex = RegularExpressions.zero_300();
		assertTrue("0".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("300".matches(regex));
		assertTrue("198".matches(regex));

	
	}
	
	@Test 
	void zero_300TestFalse() {
		
		String regex = RegularExpressions.zero_300();
		assertFalse("00".matches(regex));
		assertFalse("01".matches(regex));
		assertFalse("19s".matches(regex));
		assertFalse("300 ".matches(regex));
		assertFalse("-300".matches(regex));
		assertFalse("398".matches(regex));
		assertFalse("301".matches(regex));


	}
	
	@Test
	void ipOctetTest() {
		
		String regex = RegularExpressions.ipOptet();

		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("009".matches(regex));
		assertTrue("249".matches(regex));
		assertTrue("250".matches(regex));
		assertTrue("255".matches(regex));
		assertTrue("7".matches(regex));

		
	}
	
	@Test
	void ipOctetFalse() {
		
		String regex = RegularExpressions.ipOptet();

		assertFalse("-0".matches(regex));
		assertFalse("00 ".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("10?".matches(regex));
		assertFalse("1900".matches(regex));
		assertFalse("299".matches(regex));
		assertFalse("00a".matches(regex));
		assertFalse("-249".matches(regex));
		assertFalse("260".matches(regex));
		assertFalse("256".matches(regex));
		
	}
	
	@Test
	void mobileIsraelPhoneTest() {
		
		//+972-5>-<7
		String regex = RegularExpressions.mobileIsraelPhone();
		
		assertTrue("+972552898069".matches(regex));
		assertTrue("+972-552898069".matches(regex));
		assertTrue("+972-55-289-80-69".matches(regex));
		assertTrue("0552898069".matches(regex));
		assertTrue("055-289-80-69".matches(regex));
		assertTrue("+972562898069".matches(regex));
		assertTrue("+972572898069".matches(regex));
		assertTrue("+972502898069".matches(regex));
		assertTrue("+972532898069".matches(regex));

		assertFalse("+97255289806".matches(regex));
		assertFalse("+97255289806-9".matches(regex));
		assertFalse("+972-5-5-2-8-9-8-0-6-9".matches(regex));
		assertFalse("552898069".matches(regex));
		assertFalse("1552898069".matches(regex));
		assertFalse("055 2898069".matches(regex));
		assertFalse("+972_55_289_8069".matches(regex));
		assertFalse("+972802898069".matches(regex));
		assertFalse("+9835289806".matches(regex));

	}
	
	@Test
	void ipV4AddressTest() {
		String ip4VRegex = RegularExpressions.ipV4Address();
		assertTrue("1.2.3.4".matches(ip4VRegex));
		assertFalse("1.2.3".matches(ip4VRegex));
		assertFalse("1 2.3.4".matches(ip4VRegex));
		assertFalse("1. 2.3.4".matches(ip4VRegex));
		assertFalse("1. 2.3.4".matches(ip4VRegex));
		assertFalse("1. 2.3.4.5".matches(ip4VRegex));
		assertFalse("1. 2.3&4".matches(ip4VRegex));


	}
	
	@Test 
	void simpleArithmeticExpressionsTest() {
		String regex = RegularExpressions.simpleArithmeticExpresssion();
		assertTrue("20".matches(regex));
		assertTrue("20 + 3 / 2 * 100".matches(regex));
		assertTrue("1000-1".matches(regex));
		assertFalse("-20".matches(regex));
		assertFalse("20 ** 3".matches(regex));
		assertFalse("20 + 3 / 2 * 100 +".matches(regex));
		assertFalse("20 + 3 // 2 * 100".matches(regex));



	}
	
	
	
	@Test
	void arithmeticExpressionTest() {

		String regex = RegularExpressions.arithmeticExpression();
		assertTrue("(20.5 + (abc12 + 1)) + 22".matches(regex));
		assertTrue("(20.5 + abc))*2".matches(regex));
		assertTrue("(20.5 + abc / 3))*(2".matches(regex));
		assertTrue("(abc)".matches(regex));
		assertTrue("(___)".matches(regex));
		assertFalse("2 + _".matches(regex));
		assertFalse("2 + a12 *".matches(regex));
		assertFalse("2 + )a12 *".matches(regex));

	}

}
