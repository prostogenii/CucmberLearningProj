Feature: Application login

  @MobileTest
  Scenario: Home page login
    Given User is on landing page
    When User login into application with name and password
    Then Home page is open
    And Card are displayed

  @SmokeTest
  Scenario Outline: Home page login
    Given User is on landing page
    When User login into application with <Username> and password <password>
    Then Home page is open
    And Card are displayed

    Examples:
    | Username | password |
    | User1| password1 |
    | User2 | password2 |
    | User3 | password3 |