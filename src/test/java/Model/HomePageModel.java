package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePageModel extends BaseModel{

    public static By lblSignIn= By.id("myAccount");
    public static By tbxSearchArea = By.xpath("//*[@class='desktopOldAutosuggestTheme-input']");
    public static By searchedProductName = By.xpath("//*[@id='categorySuggestionList']/div[1]");

    public void GoToUrl(String url) {
        webDriver.get(url);
    }

    public boolean isHomePageOpened(){
        return isElementVisible(lblSignIn);
    }

    public void SearchProduct(String productName) {
        SendKeys(tbxSearchArea, productName);
        webDriver.findElement(tbxSearchArea).sendKeys(Keys.ENTER);
    }

}
