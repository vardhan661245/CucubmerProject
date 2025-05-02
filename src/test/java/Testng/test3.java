package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test3 
{
    @DataProvider(name = "myData")
    public Object[][] getData() 
    {
        return new Object[][] {
            {"user1", "pass1"},
            {"user2", "pass2"},
            {"user3", "pass3"}  };
    }

    @Test(dataProvider = "myData")
    public void testLogin(String username, String password) 
    {
        System.out.println("Logging in with: " + username + " and " + password);
    }
}



