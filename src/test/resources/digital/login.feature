Feature: Login Page

  Scenario: Login Page
    Given I open the Home page
    When I introduce the credentials
      | username | password |
      | admin    | admin    |
    Then I have access to Management page
