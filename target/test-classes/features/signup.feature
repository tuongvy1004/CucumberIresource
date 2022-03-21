Feature: Sign up form
  I want to verify the Sign up form
  @SIG_001
  Scenario Outline: Verify that the Verify Email page appears when I enter valid inputs
    Given I am on the Login page and click the Sign up link
    When I enter in all fields from given "<SheetName>" and <RowNumber>
    And I click the Sign up button
    And The Verify Email page appears with title "Verify Email"
    And I open the email page and enter email from "<SheetName>" and <RowNumber>
    And I enter code in the text box
    And I click the Confirm button
    And the Login page appears with title "Log In"
    And I enter registered input from given "<SheetName>" and <RowNumber>
    Then The Profile page appears with title "Profile Information"
    Examples:
    |SheetName|RowNumber|
    |signup   |0        |
  @SIG_002
  Scenario: Verify the radio button Persona is selected
    Given I am on the Login page and click the Sign up link
    When The Sign up page appears with title "Sign Up"
    Then The radio button Persona is selected by default

  @SIG_003
  Scenario Outline: Verify the error message appears when entering number in the Firstname field
    Given I am on the Login page and click the Sign up link
    When  I enter in all fields from given "<SheetName>" and <RowNumber>
    And I click the Sign up button
    Then The error message "Please enter valid name" appears
    Examples:
    |SheetName|RowNumber|
    |signup   |1        |

  @SIG_004
    Scenario Outline: Verify the error message when leaving the Firstname blank
      Given I am on the Login page and click the Sign up link
      When I leave Firstname blank and enter remaining fields from given "<SheetName>" and <RowNumber>
      And I click the Sign up button
      Then The required error message appears with text "Required!"
      Examples:
      |SheetName|RowNumber|
      |signup   |3        |
  @SIG_005
  Scenario Outline: Verify the error message appears when confirming invalid password
    Given I am on the Login page and click the Sign up link
    When I enter in all fields from given "<SheetName>" and <RowNumber>
    And I click the Sign up button
    Then The Confirm password error message "Password doesn’t match" appears
    Examples:
    |SheetName|RowNumber|
    |signup   |2        |

  @SIG_006
  Scenario Outline: Verify the error message appears when entering number in the Lastname field
    Given I am on the Login page and click the Sign up link
    When  I enter in all fields from given "<SheetName>" and <RowNumber>
    And I click the Sign up button
    Then The error message "Please enter valid name" appears
    Examples:
      |SheetName|RowNumber|
      |signup   |4        |

  @SIG_007
  Scenario Outline: Verify the error message appears when entering number in the Password field
    Given I am on the Login page and click the Sign up link
    When  I enter in all fields from given "<SheetName>" and <RowNumber>
    And I click the Sign up button
    Then The error message "At least one uppercase, one number and one special case character" appears
    Examples:
      |SheetName|RowNumber|
      |signup   |5        |

  @SIG_008
 Scenario: Verify that the Login page appears when I click the Login link
    Given I am on the Login page and click the Sign up link
    When I click the Login link
    Then The Login page appears with the "Log In" title


