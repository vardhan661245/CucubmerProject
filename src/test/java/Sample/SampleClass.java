package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=Apj9ISyXr_s");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//button[@title='Play (k)']"));
         ele.click();
         Thread.sleep(5000);
         WebElement el1=driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
		 el1.click();
		 Thread.sleep(9000);
		 driver.close();
	
	}

}

