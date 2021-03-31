package Model;

import org.openqa.selenium.By;

public class ProductDetailModel extends BaseModel{
    public static By btnLike = By.className("Like-3B4x5");


    public void clickLikeButton(){
        clickElement(btnLike);
    }


}
