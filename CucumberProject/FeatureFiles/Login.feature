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
@scenariowithDatatable
 Scenario Outline: Login Functionality Validation
 When I Open OrangeHrms URL on "<Browser>"
 And I enter "<Username>" in Username Field
 And I enter "<Password>" in Password Field
 When I Click Login Button
 Then I should see Login Button
 When I close the Browser
 Examples: 
 |Browser|Username|Password|
 |chrome|Admin|Qedge123!@#|
 |firefox|Admin|admin123|
 |chrome|Admin|Qedge123!@#|
 |firefox|Admin|admin|
 |chrome|Admin|test123|
 |firefox|Admin|Qedge123!@#|
