package fast.steps.serenity;

import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.DataTable;
import net.thucydides.core.annotations.Step;
import operr.pages.*;
import org.junit.Assert;
import unhar.pages.LandingPage;

import java.util.Map;

public class ContractsEndUserSteps {

	LandingPage landingPage;
	SoftwareLicenseAgreementFormPage softwareLicenseAgreementFormPage;
	BasePage basePage;
	ContractPage contractPage;

	@Step
	public void user_opens_Sign_Contract_form() throws Throwable{
		landingPage.openSignContractForm();
	}

	@Step
	public void user_enters_below_information_in_Software_License_Agreement_form(Map<String, String> data, String randomNumber) throws Throwable {
		softwareLicenseAgreementFormPage.fillSoftwareLicenseAgreementForm(data, randomNumber);
	}

	@Step
	public void user_submits_the_Software_License_Agreement_form() throws Throwable {
		softwareLicenseAgreementFormPage.submitForm();
	}

	@Step
	public void user_accepts_the_confirmation() throws Throwable {
		softwareLicenseAgreementFormPage.acceptConfirmation();
		String text = softwareLicenseAgreementFormPage.getNotificationText();
		if(text.length() > 0 ) {
			Assert.assertEquals("Sign Contract successfully.", text);
		}
	}

	@Step
	public void then_user_click_on_tab(String arg1) throws Throwable {
		basePage.clickOnTab(arg1);
	}

	@Step
	public void user_clicks_on_button_on_contract_page(String arg1) throws Throwable {
		contractPage.clickOnSignANewContract();
	}

	@Step
	public void appropriate_error_messages_displays_when_user_searches_invalid_base_on_contracts_page(DataTable dt) throws Throwable {
//		List<List<String>> data = dt.raw();
//		String pattern = "yyyy-MM-dd";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		for (int i = 1; i < data.size(); i++) {
//			String baseName = data.get(i).get(0);
//			baseName.replace("TODAY_DATE", simpleDateFormat.format(new Date()));
//			contractPage.searchBase(baseName);
//			Assert.assertEquals(data.get(i).get(1), contractPage.getNoResultFoundMessage());
//			contractPage.closeSearchBox();
//		}
	}

	@Step
	public void user_searches_for_the_contract_using_Base(String baseName) throws Throwable {
		contractPage.searchBase(baseName);
		contractPage.clickSearchResult(baseName);
	}

	@Step
	public void verify_that_button_is_disable(String arg1) throws Throwable {
		Assert.assertEquals("true", softwareLicenseAgreementFormPage.isSubmitButtonDisabled());
	}

	@Step
	public void verify_that_button_is_not_displayed_on_contract_page(String arg1) throws Throwable {
		Assert.assertEquals(false, contractPage.isSignANewContractButtonPresent());
	}

	@Step
	public void user_clicks_on_edit_contract_icon() throws Throwable {
		contractPage.clickEditContractIcon();
	}

	@Step
	public void verify_edit_contract_icon_is_disable() throws Throwable {
		Assert.assertEquals("true", contractPage.isEditContractIconDisable());
	}

	@Step
	public void verify_edit_contract_icon_is_not_displayed() throws Throwable {
		Assert.assertEquals(false, contractPage.isEditContractIconPresent());
	}

	@Step
	public void user_clicks_on_Go_Back_button() throws Throwable {
		softwareLicenseAgreementFormPage.clickOnGoBackButton();
	}

	@Step
	public void verify_that_button_is_enable(String arg1) throws Throwable {
		Assert.assertEquals(null, softwareLicenseAgreementFormPage.isSubmitButtonDisabled());
	}

	@Step
	public void verify_values_on_edit_contract_page(Map<String, String> data, String randomNumber) throws Throwable {
		softwareLicenseAgreementFormPage.checkValuesOnEditContract(data, randomNumber);
	}

	@Step
	public void navigate_to_last_page_using_pagination() throws InterruptedException {
		contractPage.moveToLastPage();
		TestDataSetup.setTotalRow(contractPage.getTotalRows());
	}

	@Step
	public void verify_edit_contract_icon_is_enable() throws Throwable {
		if(TestDataSetup.getTotalRow() == 0 ) {
			Assert.assertEquals(TestDataSetup.getTotalRow(), contractPage.getTotalRows());
		}
		Assert.assertEquals(null, contractPage.isEditContractIconDisable());
	}

	@Step
	public void user_clicks_on_edit_contract_icon_using_Licensee_Name(String name) throws Throwable {
		contractPage.clickEditContractIconUsingName(name);
	}

}
