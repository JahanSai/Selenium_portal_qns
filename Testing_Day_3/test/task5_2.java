package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;
public class task5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeOptions eo=new EdgeOptions();
		eo.addArguments("--remote-allow-origin=*");
		WebDriver driver=new EdgeDriver(eo);
		driver.manage().window().maximize();
		driver.navigate().to("https://j2store.net/free/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)", "");
        try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img"));
		clothing.click();
		List<WebElement> list=driver.findElements(By.xpath("//h2[@class='product-title']"));
		for(WebElement x:list) {
			System.out.println(x.getText());
		}

	}

}


