package CUNY;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class Search extends CommonAPI {
    @Test
    public void TestSearch() throws InterruptedException {
        List<String> getItemList = Search.getListOfText();
        for (String value : getItemList);
        typeOnCss("#twotabsearchtextbox","Laptop");
        Thread.sleep(2000);
        ClearInputField("#twotabsearchtextbox");
    }

}
