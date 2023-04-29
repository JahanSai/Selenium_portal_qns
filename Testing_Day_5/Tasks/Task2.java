package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
public class Task2 {
  public static void main(String[]args) {
	// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeOptions co=new ChromeOptions();
      co.addArguments("--remotr-allow-origin=*");
      WebDriver driver=new ChromeDriver(co);
      driver.manage().window().maximize();
      driver.get("https://jqueryui.com/droppable/");
      driver.switchTo().frame(0);
      try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		act.clickAndHold(drag).release(drop).build().perform();
  }
}
