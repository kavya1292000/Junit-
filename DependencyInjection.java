package junitTestScripts;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
public class DependencyInjection {


	@org.junit.jupiter.api.RepeatedTest(7)
	public void repeatedtestdemo(TestInfo testinfo, RepetitionInfo repInfo)
	{
		
		System.out.println(testinfo.getDisplayName() + ""+ repInfo.getCurrentRepetition() );
		
	}


}
