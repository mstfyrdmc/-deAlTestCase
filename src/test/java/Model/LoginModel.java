package Model;

import org.openqa.selenium.By;

public class LoginModel extends BaseModel{
    public static By btnMyAccount = By.id("myAccount");
    public static By btnLogin = By.id("login");
    public static By txtUserName = By.id("txtUserName");
    public static By txtPassword = By.xpath("//input[@name='password']");
    public static By btnLoginButton = By.id("btnLogin");
    public static By lblMyAccountText = By.xpath("//*[@id='myAccount']/span/a/span[1]");


    public void clickMyAccountButton(){
        clickElement(btnMyAccount);
    }
    public void clickLogin(){
        clickElement(btnLogin);
    }

    public void SetUserName(String userName){
        SendKeys(txtUserName,userName);
    }

    public void SetPassword(String password){
        SendKeys(txtPassword,password);
    }

    public void clickLoginButton(){
        clickElement(btnLoginButton);
    }

    public String getMyAccountText(){
        return getText(lblMyAccountText);
    }

    public boolean isLoginSuccess(){
        if (getMyAccountText().contains("Hesabım")){
            return true;
        }
        else{
            return false;
        }
    }
}
