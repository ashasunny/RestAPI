package automation;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;*/
import java.util.concurrent.TimeUnit;


public class MySelenium {
    WebDriver driver;
	
    @BeforeTest
    public void BrowserSetup(){
        System.setProperty("webdriver.chrome.driver",
        		"C:\\Users\\asha sunny\\Desktop\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://storiyoh1mic.com/mic/login");
    }
    public void PageTitle(){
        System.out.println(driver.getTitle());
        String expectedTitle = "Storiyoh1mic- Giving Voice To Your Story";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    public void Login(){
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).clear();
        driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("saaj.strings@gmail.com");
        driver.findElement(By.cssSelector("#exampleInputPassword1")).clear();
        driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Pass@123");
        driver.findElement(By.xpath("//button[contains(text(),'sign in')]")).click();
        WebElement newlyAddedTopics = driver.findElement(By.xpath("//h3[contains(text(),'Newly Added Topics')]"));
        System.out.println(newlyAddedTopics.isDisplayed());
        Assert.assertEquals(true,newlyAddedTopics.isDisplayed());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void BrowserClose(){
        driver.close();
    }
}