$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookAppointment.feature");
formatter.feature({
  "line": 2,
  "name": "As a user, I want to select desired plan, complete payment and book and appointment for pickup.",
  "description": "",
  "id": "as-a-user,-i-want-to-select-desired-plan,-complete-payment-and-book-and-appointment-for-pickup.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Booking an appointment",
  "description": "",
  "id": "as-a-user,-i-want-to-select-desired-plan,-complete-payment-and-book-and-appointment-for-pickup.;booking-an-appointment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User has navigated to the application homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enters his zip code to get pricing",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user gets naviagted to next screen to select desired plan and makespace bins",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "provides required details for pickup",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be navigated to final screen to enter address, appointment and payment details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "should be able to confirm and book appointment successfully.",
  "keyword": "And "
});
formatter.match({
  "location": "BookanAppointment.user_has_navigated_to_the_application_homepage()"
});
formatter.result({
  "duration": 24707571299,
  "status": "passed"
});
formatter.match({
  "location": "BookanAppointment.enters_his_zip_code_to_get_pricing()"
});
formatter.result({
  "duration": 436453200,
  "status": "passed"
});
formatter.match({
  "location": "BookanAppointment.user_gets_naviagted_to_next_screen_to_select_desired_plan_and_makespace_bins()"
});
formatter.result({
  "duration": 9332978501,
  "status": "passed"
});
formatter.match({
  "location": "BookanAppointment.provides_required_details_for_pickup()"
});
formatter.result({
  "duration": 970311401,
  "status": "passed"
});
formatter.match({
  "location": "BookanAppointment.user_should_be_navigated_to_final_screen_to_enter_address_appointment_and_payment_details()"
});
formatter.result({
  "duration": 14013823499,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat pageObjects.PageObjects.appointmentDateTime(PageObjects.java:177)\r\n\tat supportPage.BookanAppointment.user_should_be_navigated_to_final_screen_to_enter_address_appointment_and_payment_details(BookanAppointment.java:44)\r\n\tat ✽.Then user should be navigated to final screen to enter address, appointment and payment details(BookAppointment.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BookanAppointment.should_be_able_to_confirm_and_book_appointment_successfully()"
});
formatter.result({
  "status": "skipped"
});
});