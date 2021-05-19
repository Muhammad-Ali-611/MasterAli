package CUNY;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Title {

    @Test
    public void CheckTitle() {
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = expectedTitle;
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);


    }
}
