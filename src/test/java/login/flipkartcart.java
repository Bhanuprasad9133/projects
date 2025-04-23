package login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/header/div[1]/div[2]/form/div/div/input")).sendKeys("s24 ultra mobile");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		Thread.sleep(1000);
	
		String mainPage=driver.getWindowHandle();
		System.out.print("Main page=" + mainPage);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
		
		Set<String> allPages=driver.getWindowHandles();
		for(String page : allPages) {
			if(!page.equals(mainPage)) {
				driver.switchTo().window(page);
			}
		}
		System.out.print(driver.getCurrentUrl());
		
				
	    driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
	    driver.quit();		
		
	}		
}
