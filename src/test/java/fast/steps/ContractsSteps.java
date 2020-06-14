package fast.steps;

import fast.steps.serenity.ContractsEndUserSteps;
import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class ContractsSteps {

	@Steps
	ContractsEndUserSteps steps;

	@Given("^user opens Sign Contract form$")
	public void user_opens_Sign_Contract_form() throws Throwable {
		steps.user_opens_Sign_Contract_form();
	}

	@Given("^user enters below information in Software License Agreement form$")
	public void user_enters_below_information_in_Software_License_Agreement_form(Map<String, String> data) throws Throwable {
		String randomNumber = TestDataSetup.getUUID();
		TestDataSetup.setRandomNumber(randomNumber);
		TestDataSetup.setContractInfo(data);
		String licensee = data.get("Licensee");
		if(licensee != null){
			TestDataSetup.setBaseName(licensee.replace("RANDOM_NUMBER", randomNumber));
		} else {
			licensee = data.get("Select Licensee");
			if(licensee != null){
				TestDataSetup.setBaseName(licensee);
			}
		}
		steps.user_enters_below_information_in_Software_License_Agreement_form(data, TestDataSetup.getRandomNumber());
	}

	@Given("^user submits the Software License Agreement form$")
	public void user_submits_the_Software_License_Agreement_form() throws Throwable {
		steps.user_submits_the_Software_License_Agreement_form();
	}

	@Given("^user accepts the confirmation$")
	public void user_accepts_the_confirmation() throws Throwable {
		steps.user_accepts_the_confirmation();
	}

	@Given("^then user click on \"([^\"]*)\" tab$")
	public void then_user_click_on_tab(String arg1) throws Throwable {
		steps.then_user_click_on_tab(arg1);
	}

	@Given("^user clicks on \"([^\"]*)\" button on contract page$")
	public void user_clicks_on_button_on_contract_page(String arg1) throws Throwable {
		steps.user_clicks_on_button_on_contract_page(arg1);
	}

	@Then("^appropriate error messages displays when user searches invalid base on contracts page$")
	public void appropriate_error_messages_displays_when_user_searches_invalid_base_on_contracts_page(DataTable arg1) throws Throwable {
		steps.appropriate_error_messages_displays_when_user_searches_invalid_base_on_contracts_page(arg1);
	}

	@Then("^user searches for the contract using Base$")
	public void user_searches_for_the_contract_using_Base() throws Throwable {
		steps.user_searches_for_the_contract_using_Base(TestDataSetup.getBaseName());
	}

	@Then("^verify that \"([^\"]*)\" button is disable$")
	public void verify_that_button_is_disable(String arg1) throws Throwable {
		steps.verify_that_button_is_disable(arg1);
	}

	@Then("^verify that \"([^\"]*)\" button is not displayed on contract page$")
	public void verify_that_button_is_not_displayed_on_contract_page(String arg1) throws Throwable {
		steps.verify_that_button_is_not_displayed_on_contract_page(arg1);
	}

	@Then("^user clicks on edit contract icon$")
	public void user_clicks_on_edit_contract_icon() throws Throwable {
		steps.user_clicks_on_edit_contract_icon();
	}

	@Then("^verify edit contract icon is disable$")
	public void verify_edit_contract_icon_is_disable() throws Throwable {
		steps.verify_edit_contract_icon_is_disable();
	}

	@Then("^verify edit contract icon is not displayed$")
	public void verify_edit_contract_icon_is_not_displayed() throws Throwable {
		steps.verify_edit_contract_icon_is_not_displayed();
	}

	@Given("^user clicks on Go Back button$")
	public void user_clicks_on_Go_Back_button() throws Throwable {
		steps.user_clicks_on_Go_Back_button();
	}

	@Then("^verify that \"([^\"]*)\" button is enable$")
	public void verify_that_button_is_enable(String arg1) throws Throwable {
		steps.verify_that_button_is_enable(arg1);
	}

	@Then("^verify values on edit contract page$")
	public void verify_values_on_edit_contract_page() throws Throwable {
		steps.verify_values_on_edit_contract_page(TestDataSetup.getContractInfo(), TestDataSetup.getRandomNumber());
	}

	@Then("^navigate to last page using pagination$")
	public void navigate_to_last_page_using_pagination() throws InterruptedException {
		steps.navigate_to_last_page_using_pagination();
	}

	@Then("^verify edit contract icon is enable$")
	public void verify_edit_contract_icon_is_enable() throws Throwable {
		steps.verify_edit_contract_icon_is_enable();
	}

	@Then("^user clicks on edit contract icon using Licensee Name$")
	public void user_clicks_on_edit_contract_icon_using_Licensee_Name() throws Throwable {
		steps.user_clicks_on_edit_contract_icon_using_Licensee_Name(TestDataSetup.getBaseName());
	}

}
