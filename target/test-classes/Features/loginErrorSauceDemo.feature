Feature: Login Error
  @negative
  Scenario: I want to login with non-registered user
    Given I Open the browser
    And Open website wwwsaucedemo
    And Located on www.saucedemo.com
    When I input username with "user_non-registered"
    And I input password with "salahbro"
    And I click login button
    Then Showing error messages