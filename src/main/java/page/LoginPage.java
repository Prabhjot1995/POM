package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
}
//Element Library
@FindBy(xpath="//input[@name='g2599-name']")
WebElement FIRST_NAME;
@FindBy(xpath="//input[@name='g2599-email']")
WebElement EMAIL_ADDRESS;
@FindBy(xpath="//input[@name='g2599-website']")
WebElement WEBSITE_NAME;
@FindBy(xpath="//select[@name='g2599-experienceinyears']")
WebElement EXPERINCE_FEILD;
@FindBy(xpath="//input[@value='Automation Testing']")
WebElement EXPERTISE;
@FindBy(xpath="//input[@value='Post Graduate']")
WebElement STUDIES_FEILD;
@FindBy(xpath="//textarea[@name='g2599-comment']")
WebElement COMMENT_FEILD;
@FindBy(xpath="//button[@class='pushbutton-wide']")
WebElement SUMBIT_BUTTON;
public void username(String name) {
	int a =RandomNums(999);
	FIRST_NAME.sendKeys(name+a);
}
public void email(String email) {
	int b=RandomNums(999);
	EMAIL_ADDRESS.sendKeys(b+email);
}
public void web(String site) {
	WEBSITE_NAME.sendKeys(site);
}
public void experince(String value) {
	SelectDropDown(EXPERINCE_FEILD,value);
}
public void expertise() {
	EXPERTISE.click();
}
public void study() {
	STUDIES_FEILD.click();
}
public void comment(String type) {
	COMMENT_FEILD.sendKeys(type);
}
public void sumbit() {
	SUMBIT_BUTTON.click();
}
}