Feature: Login
  @positive
  Scenario: I want to login with correct username and password
    Given I Open browser
    And Open website www saucedemo
    And Located www.saucedemo.com
    When I input username "standard_user"
    And I input password "secret_sauce"
    And I click login btn
    Then Showing products page