package CUNY;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage {

    public WebDriver driver = null;
@BeforeMethod
    public void Main() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver","C:\\Users\\chma6\\Links\\Mven\\Driver\\chromedriver.exe");
         driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       driver.quit();
    }
    @AfterMethod
    public void CleanUp(){
    driver.close();
    }
    }

