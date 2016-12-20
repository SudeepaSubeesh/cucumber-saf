$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027Login.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "Login action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters Credentials and Login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "successful login message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.User_is_on_Login_page()"
});
formatter.result({
  "duration": 21298132137,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.User_enters_Credentials_and_Login()"
});
formatter.result({
  "duration": 3061554650,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.successful_login_message_is_displayed()"
});
formatter.result({
  "duration": 175719,
  "status": "passed"
});
});