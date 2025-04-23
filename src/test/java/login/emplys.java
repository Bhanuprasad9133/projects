package login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class emplys {
	//[Let's Start the Automation by JUnit ]
	//[public the WebDriver ]
	public WebDriver driver;

	@Test
	public void test() throws Exception {
		
		//[Adding the Methods to code ]
		LaunchBrowser();
		invokeApp();
		preformlogin();
		preformSearch();
		KillBrowser();
				

	}
	//[This Method is to Perform the login action by finding elements ]
	private void preformlogin() throws InterruptedException {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("9eRl@0lJAF");
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/button")).submit();
		Thread.sleep(3000);
		
	}
	//[This Method is to kill the Browser After completion/End of the Application By quitting]
	private void KillBrowser() {
		
		driver.quit();
		
	}
	//[This Method is to Perform Searching and locate the name ]
	private void preformSearch() throws Exception {
		
		driver.findElement(By.id("menu_item_128")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("employee_name_quick_filter_employee_list_value")).sendKeys("Paul  Collings");
		driver.findElement(By.id("quick_search_icon")).click();
	}
	//[In this Method we invoke URL or WebSite or application ]

	private void invokeApp() {
		driver.get("https://kbhanu-trials7161.orangehrmlive.com/");
	}
	//[This Method is to launch the selected Browser and its drivers ]

	private void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}