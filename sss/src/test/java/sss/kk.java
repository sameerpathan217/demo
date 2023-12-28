package sss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class kk {
	public static void main(String args[]) {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//My code 1
		//My code 2
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		 WebElement d = driver.findElement(By.id("searchDropdownBox"));
		 
		 Select sat=new Select(d);
		 sat.selectByVisibleText("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wings Of Fire");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		String g = driver.getPageSource();
		if(g.contains("WINGS OF FIRE: AUTOBIOGRAPHY OF ABDUL KALAM")) {
			System.out.println("Page load suceess");
		}else {
			System.out.println("Page Not load ");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
	



}
