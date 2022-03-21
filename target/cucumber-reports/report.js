$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/signup.feature");
formatter.feature({
  "name": "Sign up form",
  "description": "  I want to verify the Sign up form",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify that the Verify Email page appears when I enter valid inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_001"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter in all fields from given \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.step({
  "name": "The Verify Email page appears with title \"Verify Email\"",
  "keyword": "And "
});
formatter.step({
  "name": "I open the email page and enter email from \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I enter code in the text box",
  "keyword": "And "
});
formatter.step({
  "name": "I click the Confirm button",
  "keyword": "And "
});
formatter.step({
  "name": "the Login page appears with title \"Log In\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter registered input from given \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The Profile page appears with title \"Profile Information\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "signup",
        "0"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that the Verify Email page appears when I enter valid inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_001"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStep.iAmOnTheLoginPageAndClickTheSignUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter in all fields from given \"signup\" and 0",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStep.iEnterInAllFieldsFromGivenAndRowNumber(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iClickTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Verify Email page appears with title \"Verify Email\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.theVerifyEmailPageAppearsWithTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open the email page and enter email from \"signup\" and 0",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iOpenTheEmailPageAndEnterEmailFromAndRowNumber(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter code in the text box",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iEnterCodeInTheTextBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iClickTheConfirmButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Login page appears with title \"Log In\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.theLoginPageAppearsWithTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter registered input from given \"signup\" and 0",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iEnterRegisteredInputFromGivenAndRowNumber(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Profile page appears with title \"Profile Information\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.theProfilePageAppearsWithTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the radio button Persona is selected",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SIG_002"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStep.iAmOnTheLoginPageAndClickTheSignUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Sign up page appears with title \"Sign Up\"",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStep.theSignUpPageAppearsWithTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The radio button Persona is selected by default",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.theRadioButtonPersonaIsSelectedByDefault()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the error message appears when entering number in the Firstname field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_003"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter in all fields from given \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.step({
  "name": "The error message \"Please enter valid name\" appears",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "signup",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the error message appears when entering number in the Firstname field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_003"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStep.iAmOnTheLoginPageAndClickTheSignUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter in all fields from given \"signup\" and 1",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStep.iEnterInAllFieldsFromGivenAndRowNumber(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iClickTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The error message \"Please enter valid name\" appears",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.theErrorMessageAppears(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the error message when leaving the Firstname blank",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_004"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.step({
  "name": "I leave Firstname blank and enter remaining fields from given \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.step({
  "name": "The required error message appears with text \"Required!\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "signup",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the error message when leaving the Firstname blank",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_004"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStep.iAmOnTheLoginPageAndClickTheSignUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I leave Firstname blank and enter remaining fields from given \"signup\" and 3",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStep.iLeaveFirstnameBlankAndEnterRemainingFieldsFromGivenAndRowNumber(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iClickTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The required error message appears with text \"Required!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.theRequiredErrorMessageAppearsWithText(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the error message appears when confirming invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_005"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter in all fields from given \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.step({
  "name": "The Confirm password error message \"Password doesn’t match\" appears",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "signup",
        "2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the error message appears when confirming invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_005"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStep.iAmOnTheLoginPageAndClickTheSignUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter in all fields from given \"signup\" and 2",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStep.iEnterInAllFieldsFromGivenAndRowNumber(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iClickTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Confirm password error message \"Password doesn’t match\" appears",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.theConfirmPasswordErrorMessageAppears(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the error message appears when entering number in the Lastname field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_006"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter in all fields from given \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.step({
  "name": "The error message \"Please enter valid name\" appears",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "signup",
        "4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the error message appears when entering number in the Lastname field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_006"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStep.iAmOnTheLoginPageAndClickTheSignUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter in all fields from given \"signup\" and 4",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStep.iEnterInAllFieldsFromGivenAndRowNumber(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iClickTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The error message \"Please enter valid name\" appears",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.theErrorMessageAppears(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the error message appears when entering number in the Password field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_007"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter in all fields from given \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.step({
  "name": "The error message \"At least one uppercase, one number and one special case character\" appears",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "signup",
        "5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the error message appears when entering number in the Password field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SIG_007"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStep.iAmOnTheLoginPageAndClickTheSignUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter in all fields from given \"signup\" and 5",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStep.iEnterInAllFieldsFromGivenAndRowNumber(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStep.iClickTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The error message \"At least one uppercase, one number and one special case character\" appears",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.theErrorMessageAppears(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that the Login page appears when I click the Login link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SIG_008"
    }
  ]
});
formatter.step({
  "name": "I am on the Login page and click the Sign up link",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStep.iAmOnTheLoginPageAndClickTheSignUpLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Login link",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStep.iClickTheLoginLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Login page appears with the \"Log In\" title",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.theLoginPageAppearsWithTheTitle(String)"
});
formatter.result({
  "status": "passed"
});
});