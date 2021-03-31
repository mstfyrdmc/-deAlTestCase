package Tests;

import Model.FavoritePageModel;
import Model.HomePageModel;
import Model.LoginModel;
import Model.ProductDetailModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductDetailTest {
    ProductDetailModel productDetailModel;
    public ProductDetailTest() { this.productDetailModel=new ProductDetailModel();}

    @Step("Secilen urun favorilere eklenir")
    public void AddFavoriteProduct(){
        productDetailModel.clickLikeButton();
    }


}
