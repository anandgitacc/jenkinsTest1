$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/FacebookLoginOutline.feature");
formatter.feature({
  "name": "Facebook details checking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Facebook Login/credential verification",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on facebook login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should verify the success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "anand",
        "anand@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Facebook Login/credential verification",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginStepDef.user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"anand\" and \"anand@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginStepDef.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginStepDef.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDef.user_should_verify_the_success_message()"
});
formatter.result({
  "status": "passed"
});
});