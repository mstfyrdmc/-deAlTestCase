package Tests;

import Model.FavoritePageModel;
import Model.ProductDetailModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class FavoriteProductTest {
    FavoritePageModel favoritePageModel;
    public FavoriteProductTest() { this.favoritePageModel=new FavoritePageModel();}

    @Step("Begendiklerime tiklanir")
    public void ClickMyFavorites(){
        favoritePageModel.clickMyFavoritesButton();
    }

    @Step("Favorilerde urun oldugu gorulur")
    public void IsFavoriteProductPresent(){

        Assert.assertTrue("Favorilerde urun yok", favoritePageModel.isFavoriteProductPresent());
    }

    @Step("Favorilerimden tum urunler secilir")
    public void SelectAllFavoritesProduct(){
        favoritePageModel.clickSelectAllProduct();
    }

    @Step("Tum secimleri kaldir butonuna tiklanir")
    public void ClickDeleteAllSelectedProduct(){
        favoritePageModel.clickDeleteSelectedProducts();
    }

    @Step("Cikan pop-up da sil butonuna tiklanir")
    public void ClickDeleteConfirmButton(){
        favoritePageModel.clickDeleteConfirmButton();
    }

    @Step("Favori listesinin bos oldugu gorulur")
    public void isFavoriteListEmpty(){
        favoritePageModel.isFavoritesEmpty();
    }
}
