package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivers 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=VffosKXVZoY");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
