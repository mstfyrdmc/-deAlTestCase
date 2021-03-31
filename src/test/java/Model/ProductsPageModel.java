package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsPageModel extends BaseModel{
    public static By tbxSearchArea = By.xpath("//*[@class='desktopOldAutosuggestTheme-input']");
    public static By selectedProductName = By.xpath("//*[@id='categorySuggestionList']/div[1]");
    public static By btnSecondPage = By.xpath("//*[contains(@class,'page-2')]");
    public static By allProduct = By.xpath("//*[@class='search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex']");

    public String getSearchedProductName() {
        return getElementValue(tbxSearchArea,"value");
    }

    public String getSelectedProductName() {
        return getText(selectedProductName);
    }

    public boolean isSearchedProductExist() {
        if (getSelectedProductName().contains(getSearchedProductName())) {
            return true;
        }
        return false;
    }

    public  void scrollToElement(WebElement element){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickSecondPage(){
        scrollToElement(findElement(btnSecondPage));
        clickElement(btnSecondPage);
    }

    public String getSecondPagesText(){
        return getElementValue(btnSecondPage,"class");
    }

    public boolean isSecondPageOpened(){
        if (getSecondPagesText().contains("active")){
            return true;
        }
        else {
            return false;
        }
    }

    public void selectProduct(){
        List<WebElement> products = findElements(allProduct);
        Random rnd = new Random();
        int productNumber= rnd.nextInt(products.size());
        clickElement(products.get(productNumber));
    }

}
