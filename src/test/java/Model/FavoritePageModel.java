package Model;

import org.openqa.selenium.By;

public class FavoritePageModel extends BaseModel{
    public static By btnMyFavorites = By.xpath("//*[contains(@title,'Beğendiklerim')]");
    public static By imgFavoriteProduct =By.className("product-item");
    public static By btnSelectAllProduct = By.id("StickActionHeader-SelectAll");
    public static By btnDeleteSelectedProduct = By.id("StickActionHeader-RemoveSelected");
    public static By btnDeleteConfirmButton= By.id("DeleteConfirmationModal-ActionButton");
    public static By lblEmptyFavorites = By.xpath("//*[@class='info']");

    public void clickMyFavoritesButton(){
        clickElement(btnMyFavorites);
    }

    public boolean isFavoriteProductPresent(){
        return isElementVisible(imgFavoriteProduct);
    }

    public void clickSelectAllProduct(){
        clickElement(btnSelectAllProduct);
    }

    public void clickDeleteSelectedProducts(){
        clickElement(btnDeleteSelectedProduct);
    }

    public void clickDeleteConfirmButton(){
        clickElement(btnDeleteConfirmButton);
    }

    public String getEmptyFavoritesText(){
        return  getText(lblEmptyFavorites);
    }

    public boolean isFavoritesEmpty(){
        if (getEmptyFavoritesText().contains("listen şu an boş.")){
            return true;
        }
        else{
            return false;
        }
    }
}
