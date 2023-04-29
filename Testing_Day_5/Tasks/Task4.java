package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	      ChromeOptions co=new ChromeOptions();
	      co.addArguments("--remotr-allow-origin=*");
	      WebDriver driver=new ChromeDriver(co);
	      driver.manage().window().maximize();
	      driver.navigate().to("https://www.abhibus.com/bus-ticket-booking");
	      WebElement source=driver.findElement(By.id("source"));
	      source.sendKeys("Coimbatore");
	      Thread.sleep(1500);
	      source.sendKeys(Keys.ENTER);
	      WebElement destination=driver.findElement(By.id("destination"));
	      destination.sendKeys("Chennai");
	      Thread.sleep(1500);
	      destination.sendKeys(Keys.ENTER);
	      WebElement date=driver.findElement(By.id("datepicker1"));
	      date.click();
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].setAttribute('value','04-05-2023')",date);
	      WebElement search=driver.findElement(By.id("seo_search_btn"));
	      search.click();
          
	}

}
