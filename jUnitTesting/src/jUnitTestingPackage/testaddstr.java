package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testaddstr {

	@Test
	public void test() {
		jUnitfunction junitstring = new jUnitfunction();
		String result = junitstring.addstr("E19CSE", "309");
		assertEquals("E19CSE309",result);
	}

}
