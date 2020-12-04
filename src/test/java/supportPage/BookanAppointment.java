package supportPage;

import testContext.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PageObjects;
    
	public class BookanAppointment {
		TestContext TestContext;
		PageObjects PageObjects;
		
		public BookanAppointment(TestContext context){
			TestContext = context;
			PageObjects = TestContext.getPageObjectManager().getPageObjects();
		}

		@Given("^User has navigated to the application homepage$")
		public void user_has_navigated_to_the_application_homepage() throws Throwable {
		   PageObjects.goToUrl();
		}

		@Given("^enters his zip code to get pricing$")
		public void enters_his_zip_code_to_get_pricing() throws Throwable {
		   PageObjects.ZipCodeTxtbox.sendKeys("10038");
		   PageObjects.SubmitZipcode.click();
		}

		@When("^user gets naviagted to next screen to select desired plan and makespace bins$")
		public void user_gets_naviagted_to_next_screen_to_select_desired_plan_and_makespace_bins() throws Throwable {
			PageObjects.assertionPlan();
		  PageObjects.SelectPlan();
		  
		}

		@When("^provides required details for pickup$")
		public void provides_required_details_for_pickup() throws Throwable {
		    PageObjects.enterDetails();
		}

		@Then("^user should be navigated to final screen to enter address, appointment and payment details$")
		public void user_should_be_navigated_to_final_screen_to_enter_address_appointment_and_payment_details() throws Throwable {
			PageObjects.accountAndAddressDetails();
			PageObjects.appointmentDateTime();
			PageObjects.cardDetails();
		}

		@Then("^should be able to confirm and book appointment successfully\\.$")
		public void should_be_able_to_confirm_and_book_appointment_successfully() throws Throwable {
			PageObjects.confirmAndBook();
	
		}



}
