package cc2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup ();
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.in/Mandala-Colouring-Books-Adults-Sheets/dp/938653861X/ref=sr_1_1_sspa?crid=242QUV89NUJLI&keywords=book&qid=1683191364&sprefix=boo%2Caps%2C639&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		driver.manage().window().maximize() ;
		
	}
  @Test
  public void f() throws InterruptedException {
	    String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		Assert.assertEquals(currentTitle, "Mandala: Colouring books for Adults with tear out sheets : Wonder House Books: Amazon.in: Books");
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity_4\"]")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[2]/span/input")).click();
		driver.navigate().to("https://www.amazon.in/Mandala-Colouring-Books-Adults-Sheets/dp/938653861X/ref=sr_1_1_sspa?crid=242QUV89NUJLI&keywords=book&qid=1683191364&sprefix=boo%2Caps%2C639&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity_4\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]")).sendKeys("keerthivarmanism@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]")).click();        
		Thread.sleep(20000);
		
		
  }
  @AfterMethod
  public void teardown() {
	  
  }
  
}


