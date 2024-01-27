package junitTestScripts;
import java.lang.annotation.Annotation;
public class CustomAnnotation implements MetaAnnotation{
	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
	@MetaAnnotation
	public void testdemo()
	{
		System.out.println("My annotation testing");
	}
	


}
