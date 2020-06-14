package fast.stepDefinitions;


import fast.steps.serenity.EndUserSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import io.cucumber.datatable.DataTable;

public class DefinitionSteps {

	@Steps
	EndUserSteps steps;

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws InterruptedException {
		steps.user_is_on_login_page();
	}

	@Given("^user enter username \"([^\"]*)\" and password as \"([^\"]*)\" and click Login button$")
	public void user_enter_username_and_password_as_and_click_Login_button(String arg1, String arg2)
			throws InterruptedException {
		steps.user_enter_username_and_password_as_and_click_Login_button(arg1, arg2);

	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws InterruptedException {
		steps.home_page_is_displayed();

	}



}