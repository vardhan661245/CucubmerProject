package applicationHooks;

import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks2 
{  @Test
	@Before(order=-1)
	  public void setUp()
	  {
		  System.out.println("Set Up 1");     //driver =new ChromeDriver
		 
	  }
@Test
	@Before(order=-2)
	  public void setUp2()
	  {
		  System.out.println("Set Up 2");     //driver =new ChromeDriver
		
	  }
@Test
	  @After(order=1)
	  public void tearDown()
	  {
		  System.out.println("CLOSE THE BROWSER 1");   //driver.close();
	  }
@Test
	  @After(order=2)
	  public void tearDown2()
	  {
		  System.out.println("CLOSE THE BROWSER 2");   //driver.close();
		 
	  }


}