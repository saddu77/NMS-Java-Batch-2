package junitdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test1 {
	@BeforeEach
	void verifyTest(){
		System.out.println("Verifying data...");
	}
	
	@Test
	void exampleTest() {
		
		int res = someMethod();
		Assertions.assertEquals(44, res,"The Result should be 44");
	}
	
	@AfterEach
	void validateTest(){
		System.out.println("Validating Results...");
	}
	
	private int someMethod() {
		return 44;
	}
}
