package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.xml.sax.Locator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    @BeforeMethod
    public void Main() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\chma6\\Links\\Mven\\Driver\\chromedriver.exe");
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.quit();
    }

    public void typeOnCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void ClearInputField(String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
    }

    public List<String> getListOfText(String Locator) {
        List<WebElement> webElements = driver.findElements(By.cssSelector(Locator));
        List<String> ListOfText = new ArrayList<>();
        for (WebElement element : webElements) ;

          return ListOfText;
    }
}
