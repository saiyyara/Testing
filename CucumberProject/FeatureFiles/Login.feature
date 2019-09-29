Feature: This is Login Functionality
@scenariowithoutDatatable
Scenario: Verifing Login Module
When I open OrangeHRMS URL on chromebrowser 
And I enter  in username
And I enter  in password 
When I click Login Button
Then I Should see Welcome Link on Home Page
When I close the browser
When i click logout