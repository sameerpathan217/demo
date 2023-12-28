package sss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		Thread.sleep(3000);
		List<WebElement> suggetion = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		Thread.sleep(3000);
        int count = suggetion.size();
        System.out.println(count);
        
     /*   for(int i=0;i<count;i++) {
        WebElement all = suggetion.get(i);
        String data = all.getText();
        System.out.println(data);
        }*/
        for(WebElement w:suggetion) {
        	System.out.println(w.getText());
        }
        
        suggetion.get(4).click();
        
	}

}
