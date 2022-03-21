Feature: Login Form
  I want to verify the Login form
  @LOG_001
  Scenario Outline: Verify that the Explore project page appears by entering valid inputs
    Given I am on the Login page
    When I enter in all fields from given sheetname "<SheetName>" and rownumber <RowNumber>
    And I click the Login button
    Then The Explore project page appears with "Explore project"
    Examples:
    |SheetName|RowNumber|
    |login    |0        |
    |login    |1        |

  @LOG_002
  Scenario: Verify that the error message appears when entering invalid email
    Given I am on the Login page
    When I enter in all fields from given sheetname "<SheetName>" and rownumber <RowNumber>
    And I click the Login button
    Then The error "Email or password is invalid." appears
    |SheetName|RowNumber|
    |login    |2        |
    

  @LOG_003
  Scenario Outline: Verify that the error message appears when leaving email blank
    Given I am on the Login page
    When I only enter the password from given "<SheetName>" and <RowNumber>
    And I click the Login button
    Then The error "Required!" appears at the bottom of the Email field
    Examples:
    |SheetName|RowNumber|
    |login    |3        |

  @LOG_004
  Scenario Outline: Verify that the error message appears when entering password less than 5 characters
    Given I am on the Login page
    When I enter in all fields from given sheetname "<SheetName>" and rownumber <RowNumber>
    And I click the Login button
    Then The error "Minimum 5 characters" appears at the bottom of the Password field
    Examples:
    |SheetName|RowNumber|
    |login    |4        |

  @LOG_005
  Scenario Outline: Verify that the error message appears when entering invalid password
    Given I am on the Login page
    When I enter in all fields from given sheetname "<SheetName>" and rownumber <RowNumber>
    And I click the Login button
    Then The error "Email or password is invalid." appears
    Examples:
    |SheetName|RowNumber|
    |login    |5        |

  @LOG_006
  Scenario Outline: Verify that the error message appears when entering invalid email format
    Given I am on the Login page
    When I enter in all fields from given sheetname "<SheetName>" and rownumber <RowNumber>
    And I click the Login button
    Then The invalid format error message "Invalid email format" appears
    Examples:
      |SheetName|RowNumber|
      |login    |6        |

  @LOG_007
  Scenario Outline: Verify that the password is displayed with type text
    Given I am on the Login page
    When I enter password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And I click the Eye icon
    Then The password is displayed with type text
    Examples:
      |SheetName|RowNumber|
      |login    |7        |

  @LOG_008
  Scenario Outline: Verify that the error message appears when leaving password blank
    Given I am on the Login page
    When I only enter the email from given "<SheetName>" and <RowNumber>
    And I click the Login button
    Then The error message "Required!" appears at the bottom of the Password field
    Examples:
      |SheetName|RowNumber|
      |login    |8        |
