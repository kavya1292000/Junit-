package junitTestScripts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BeforeEachAfterEach {
	
	
	@BeforeEach
	public void setup()
	{
		System.out.println("Start DB connection");
		
	}
	@Test
	public void method1()
	{
		System.out.println("Hello Junit");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Test code of Java operations class");
	}
	
	@AfterEach
	public void teardown()
	{
		System.out.println("Close DB connections");
	}
	
}


	