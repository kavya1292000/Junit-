package junitTestScripts;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class ArgumentConvertionImplicitSource {


	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	public void testImplicitargumentConversion(ChronoUnit chronounit)
	{
		
		System.out.println(chronounit.name());
		Assertions.assertNotNull(chronounit.name());
		
	}


}
