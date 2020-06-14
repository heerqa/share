package fast.steps.serenity;

import net.thucydides.core.annotations.Step;
import unhar.pages.*;
import org.junit.After;
import org.junit.Assert;
import unhar.pages.ExtendedPageObject;
import unhar.pages.LandingPage;

public class EndUserSteps extends ExtendedPageObject {

	LandingPage landingPage;

	@Step
	public void user_is_on_login_page() throws InterruptedException {
		landingPage.openURL();
	}

	@After
	public void closeBrowser() {
//		 landingPage.quitBrowser();
	}

	@Step
	public void user_enter_username_and_password_as_and_click_Login_button(String arg1, String arg2)
			throws InterruptedException {
		landingPage.setEmail(arg1);
		landingPage.setPassword(arg2);
		landingPage.clickLoginBtn();
	}

	@Step
	public void home_page_is_displayed() throws InterruptedException {
		Assert.assertTrue(landingPage.getURL1().contains("MyDeliveries"));
	}






}