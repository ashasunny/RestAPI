package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mydemo {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",
	        		"C:\\Users\\asha sunny\\Desktop\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://storiyoh1mic.com/mic/login");
		  driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	      driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).clear();
	      driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("asha.sunny@storiyoh.com");
	      driver.findElement(By.cssSelector("#exampleInputPassword1")).clear();
	      driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Asha@123");
	      driver.findElement(By.xpath("//button[contains(text(),'sign in')]")).click();
	}
	

}

