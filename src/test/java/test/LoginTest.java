package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory1;

public class LoginTest {
	WebDriver driver;

	@Test
	public void usershouldbaletologin() throws Exception {
		driver = BrowserFactory1.init();
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.username("john");
		page.email("test@gmail.com");
		page.web("hello.com");
		page.experince("5-7");
		page.expertise();
		page.study();
		page.comment("we are studying togeter,doing well so far");
		page.sumbit();
		Thread.sleep(3000);
		BrowserFactory1.TearDown();
	}
}
