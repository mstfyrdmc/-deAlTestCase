package Tests;

import Model.HomePageModel;
import com.thoughtworks.gauge.Step;

public class HomePageTest {
    HomePageModel homePageModel;

    public HomePageTest(){
        this.homePageModel= new HomePageModel();
    }


    @Step("<key> sitesine giris yapilir")
    public void  initializeWebSite(String url){
        homePageModel.GoToUrl(url);
    }

    @Step("Anasayfanin acildigi gorulur")
    public void IsHomePageLoaded(){
        homePageModel.isHomePageOpened();
    }

    @Step("Arama alaninda <key> aratilir")
    public void SearchProduct(String productName){
        homePageModel.SearchProduct(productName);
    }
}
