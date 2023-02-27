Feature: Application login

  Scenario: Home page login
    Given User is on landing page
    When User login into application with username and password
    Then Home page is open
    And Card are displayed