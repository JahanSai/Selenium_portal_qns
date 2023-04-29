package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		
		WebElement to_name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		to_name.sendKeys("Veer");
		WebElement to_email=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		to_email.sendKeys("abcd@gmail.com");
		WebElement from_name=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		from_name.sendKeys("Jahan Sai");
		WebElement from_email=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		from_email.sendKeys("jahansai2003@gmail.com");
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,550)","");
	    try {
	    	Thread.sleep(500);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
		WebElement theme=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		theme.click();
        WebElement message=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
        message.sendKeys("Be Safe while flying a jet");
        WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
        amount.clear();
        amount.sendKeys("100");
        WebElement agree=driver.findElement(By.xpath("//*[@name=\"agree\"]"));
        agree.click();
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button"));
        submit.click();
        
	}

}
