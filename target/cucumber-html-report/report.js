$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login Form",
  "description": "  I want to verify the Login form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that user is able to login when entering valid input",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC_001"
    }
  ]
});
formatter.step({
  "name": "I\u0027m on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter valid input",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "System displays Explore project page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});