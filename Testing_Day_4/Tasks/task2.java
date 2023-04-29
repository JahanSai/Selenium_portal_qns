package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
    WebDriver driver=new ChromeDriver(co);
    driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    WebElement fname=driver.findElement(By.id("input-firstname"));
    fname.sendKeys("Jahan");
    WebElement lname=driver.findElement(By.id("input-lastname"));
    lname.sendKeys("Sai");
    WebElement email=driver.findElement(By.id("input-email"));
    email.sendKeys("jahansai2003@gmail.com");
    WebElement password=driver.findElement(By.id("input-password"));
    password.sendKeys("12345678");
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,550)", "");
    try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    WebElement subscribe =driver.findElement(By.id("input-newsletter-yes"));
    subscribe.click();
    WebElement agree=driver.findElement(By.name("agree"));
    agree.click();
    WebElement button=driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));
	button.click();	
	}

}
