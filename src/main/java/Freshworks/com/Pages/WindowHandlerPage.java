package Freshworks.com.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		driver.findElement(By.xpath("//span[text()='Reimagine your cloud-based phone system for businesses of all sizes across 90+ countries.']"));
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String ParentWindow=it.next();
		System.out.println("Parent window id is :" + ParentWindow );
		
		String FreshCallerChild=it.next();
		System.out.println("FreshCaller Child window id is :" + FreshCallerChild );
		
		driver.switchTo().window(FreshCallerChild);
		System.out.println("Child window title is : " + driver.getTitle());
		
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		System.out.println("Parent window title is : " + driver.getTitle());
		
		driver.quit();

	}

}
