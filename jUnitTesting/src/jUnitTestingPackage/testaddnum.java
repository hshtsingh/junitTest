package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testaddnum {

	@Test
	public void test() {
		jUnitfunction junit = new jUnitfunction();
		int result= junit.addNum(200,300);
		assertEquals (500,result); 
	}

}
