package Sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.get("https://practice.expandtesting.com/js-dialogs");
      Thread.sleep(5000);
      driver.findElement(By.id("js-alert")).click();
      Thread.sleep(5000);
      Alert alert=driver.switchTo().alert();
      alert.accept();
      
      
	}

}
