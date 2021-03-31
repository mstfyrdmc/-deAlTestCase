package Tests;

import Model.LoginModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;


public class LoginTest {

    LoginModel loginModel;

    public LoginTest(){
        this.loginModel= new LoginModel();
    }

    @Step("Anasayfada giris Yap a tiklanir")
    public void ClickSignIn(){
        loginModel.clickMyAccountButton();
        loginModel.clickLogin();
    }

    @Step("Kullanıcı adı <key> olarak girilir")
    public void  SetUserName(String userName){
        loginModel.SetUserName(userName);
    }

    @Step("Password alanına <key> girilir")
    public void SetPassword(String password){
        loginModel.SetPassword(password);
    }

    @Step("Giris Yap butonuna tiklanir")
    public void ClikcLoginButton(){
        loginModel.clickLoginButton();
    }

    @Step("Login girisinin basarili oldugu gorulur")
    public void IsLoginSuccess(){
        Assert.assertTrue("Login islemi basarisiz,lütfen tekrar deneyin.",loginModel.isLoginSuccess());
    }
    @Step("Hesabım alanina tiklanir")
    public void  CilckMyAccount(){
        loginModel.clickMyAccountButton();

    }
}
