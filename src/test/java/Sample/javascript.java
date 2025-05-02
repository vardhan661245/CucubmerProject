package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		WebElement ele=driver.findElement(By.id("username"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
         js.executeScript("arguments[0].value='vishnu'",ele );
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
		
		 js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", login);
		  Thread.sleep(3000);
		  
		  js.executeScript("arguments[0].click();",login);
		  
			Thread.sleep(2000);
			js.executeScript("window.scrollTo(0,700);");
	}

}
