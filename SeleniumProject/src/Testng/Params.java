package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {
	
	@Test
	@Parameters({"val1","val2"})
	void paramsMethod(int a, int b, int c, int d)
	{
		System.out.println(a+b);
	}

}
