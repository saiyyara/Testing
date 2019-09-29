$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "This is Login Functionality",
  "description": "",
  "id": "this-is-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verifing Login Module",
  "description": "",
  "id": "this-is-login-functionality;verifing-login-module",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@scenariowithoutDatatable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open OrangeHRMS URL on chromebrowser",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I enter  in username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter  in password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Should see Welcome Link on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I close the browser",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "i click logout",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_open_OrangeHRMS_URL_on_chromebrowser()"
});
formatter.result({
  "duration": 9678942870,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_in_username()"
});
formatter.result({
  "duration": 276079993,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_in_password()"
});
formatter.result({
  "duration": 308161868,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_Login_Button()"
});
formatter.result({
  "duration": 6025627246,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_Should_see_Welcome_Link_on_Home_Page()"
});
formatter.result({
  "duration": 115816173,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_close_the_browser()"
});
formatter.result({
  "duration": 212332838,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});