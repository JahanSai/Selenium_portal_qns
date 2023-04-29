package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {
   public static void main(String[]args) throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
	      ChromeOptions co=new ChromeOptions();
	      co.addArguments("--remotr-allow-origin=*");
	      WebDriver driver=new ChromeDriver(co);
	      driver.manage().window().maximize();
	      driver.get("https://demo.guru99.com/test/delete_customer.php");
	      WebElement id=driver.findElement(By.name("cusid"));
	      WebElement submit=driver.findElement(By.name("submit"));
	      id.clear();
	      id.sendKeys("401");
	      Thread.sleep(1000);
	      submit.click();
	      Thread.sleep(1000);
	      driver.switchTo().alert().dismiss();
	      Thread.sleep(1000);
	      id.clear();
	      id.sendKeys("402");
	      Thread.sleep(1000);
	      submit.click();
	      Thread.sleep(1000);
	      driver.switchTo().alert().accept();
	      Thread.sleep(1000);
	      Alert a=driver.switchTo().alert();
	      String message=a.getText();
	      Thread.sleep(1000);
	      a.accept();
	      System.out.println(message);
          
	      
	      
	      
	      
   }
}
