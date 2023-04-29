package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	      ChromeOptions co=new ChromeOptions();
	      co.addArguments("--remotr-allow-origin=*");
	      co.addArguments("start-maximized");
	      WebDriver driver=new ChromeDriver(co);
	      String[]arr= {"Apple","Selenium","Cucumber"};
	      for(int i=0;i<3;i++) {
	    	  driver.get("https://www.google.com");
	    	  WebElement search=driver.findElement(By.name("q"));
	    	  search.sendKeys(arr[i]);
	    	  Thread.sleep(1000);
	    	  search.sendKeys(Keys.ENTER);
	    	  System.out.println(driver.getWindowHandle()+" "+driver.getTitle());
	    	  Thread.sleep(1000);
	    	  if(i!=2) {
	    	  driver.switchTo().newWindow(WindowType.WINDOW);  
	    	  }
	      }
	      
	      

	}

}
