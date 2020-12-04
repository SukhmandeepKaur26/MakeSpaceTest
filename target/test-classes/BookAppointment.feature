@tag
Feature: As a user, I want to select desired plan, complete payment and book and appointment for pickup.

Scenario: Booking an appointment
Given User has navigated to the application homepage
And  enters his zip code to get pricing
When  user gets naviagted to next screen to select desired plan and makespace bins
And  provides required details for pickup
Then user should be navigated to final screen to enter address, appointment and payment details
And should be able to confirm and book appointment successfully.



