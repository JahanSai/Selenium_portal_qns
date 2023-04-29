package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class task5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.edgedriver().setup();
        EdgeOptions co=new EdgeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriver driver=new EdgeDriver(co);
        driver.manage().window().maximize();
        driver.navigate().to("https://j2store.net/free/");
        String actualurl1=driver.getCurrentUrl();
        if(actualurl1.equals("https://j2store.net/free/")) {
        	System.out.println("passed");
        }else {
        	System.out.println("Url failed");
        }
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)", "");
        try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img"));
		clothing.click();
		String actualurl2=driver.getCurrentUrl();
		if(actualurl2.equals("https://j2store.net/free/index.php/shop?filter_catid=11")) {
			System.out.println("passed");
		}else {
			System.out.println("Url failed");
		}
	}

}
