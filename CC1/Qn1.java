package cc1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Qn1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	   Thread.sleep(5000);
	    WebElement username=driver.findElement(By.id("user-name"));
	    username.sendKeys("standard_user");
	    WebElement password=driver.findElement(By.id("password"));
	    password.sendKeys("secret_sauce");
	    WebElement login=driver.findElement(By.id("login-button"));
	    login.click();
	    WebElement add=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	    add.click();
	    WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	    cart.click();
	    WebElement checkout=driver.findElement(By.id("checkout"));
	    checkout.click();
	    WebElement fname=driver.findElement(By.id("first-name"));
	    fname.sendKeys("Jahan");
	    WebElement lname=driver.findElement(By.id("last-name"));
	    lname.sendKeys("Sai");
	    WebElement postalcode=driver.findElement(By.id("postal-code"));
	    postalcode.sendKeys("641046");
	    WebElement Continue=driver.findElement(By.id("continue"));
	    Continue.click();
	    WebElement pname=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
	    System.out.println(pname.getText());
	    WebElement price=driver.findElement(By.xpath("//*[@class=\"item_pricebar\"]/div"));
	    System.out.println(price.getText());
	    String actualurl=driver.getCurrentUrl();
	    Assert.assertEquals(actualurl,"https://www.saucedemo.com/checkout-step-two.html");
	    String actualtitle=driver.getTitle();
	    Assert.assertEquals(actualtitle,"Swag Labs");
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	    ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origin=*");
	    driver=new ChromeDriver(co);
	    driver=new ChromeDriver(co);
	    driver.navigate().to("https://www.saucedemo.com/");
	    driver.manage().window().fullscreen();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
