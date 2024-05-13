package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogin {
WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpass;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	public void Fbloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
  public void setValues(String email,String pswd)
  {
	 fbemail.sendKeys(email);
	 fbpass.sendKeys(pswd);
  }
  
  public void loginclick()
  {
	  fblogin.click();
  }


public void clickLoginBtn() {
	// TODO Auto-generated method stub
	
}

}
