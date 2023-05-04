package cc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Match found");
		}
		else {
			System.out.println("not Matched");
		}
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		txtBoxl.sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		String p1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(p1);
		String p2=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(p2);
		String p3=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(p3);
		String p4=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(p4);
		String p5=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(p5);
		
		driver.findElement(By.xpath("//*[@id=\"p_72/1318476031\"]/span/a/section/i")).click();
		
			System.out.println("the filter works");
		
		
		
		

	}

}
