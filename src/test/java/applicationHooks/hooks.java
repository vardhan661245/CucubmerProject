package applicationHooks;

import io.cucumber.java.Before;

import org.testng.annotations.Test;

import io.cucumber.java.After;

public class hooks 
{   	
    @Before
    @Test
    public void setup() {
        System.out.println("Launching browser");
    }
    @Test 
    @After
    public void teardown() {
        System.out.println("Closing browser");
    }
}
