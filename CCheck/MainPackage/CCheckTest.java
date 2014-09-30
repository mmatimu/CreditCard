package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class CCheckTest {

	@Test
	public void testCheckDigit() {
		CheckDigit test = new CheckDigit();
		String result = (String) test.CheckDigit("4388576018410707");
		assertEquals("valid", result);
	}

}
