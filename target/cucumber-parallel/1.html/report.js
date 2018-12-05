$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/BDD Test Framework/src/main/java/features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login on eMAG",
  "description": "",
  "id": "login-on-emag",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-on-emag;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on eMAG page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user wants to access his account",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters his email",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "a new page with a welcome message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_is_on_eMAG_page()"
});
formatter.result({
  "duration": 10148704751,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_wants_to_access_his_account()"
});
formatter.result({
  "duration": 1071255436,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enters_his_credentials()"
});
formatter.result({
  "duration": 391936300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.userEntersThePassword()"
});
formatter.result({
  "duration": 161101220,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_click_on_Login_button()"
});
formatter.result({
  "duration": 5257256262,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.a_new_page_with_a_welcome_message_is_displayed()"
});
formatter.result({
  "duration": 298959925,
  "status": "passed"
});
});