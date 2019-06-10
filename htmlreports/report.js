$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/sample1.feature");
formatter.feature({
  "name": "Login to Testmeapp successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testmeapp login procedure",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Users opens Testmeapp",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdeff.users_opens_Testmeapp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter usernamre \"lalitha\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdeff.enter_usernamre(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdeff.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdeff.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close application",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdeff.close_application()"
});
formatter.result({
  "status": "passed"
});
});