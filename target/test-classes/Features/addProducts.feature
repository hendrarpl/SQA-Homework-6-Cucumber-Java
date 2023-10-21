Feature: add products after login
  @positive
  Scenario: I want to add some products after login
    Given open the browser
    And open www.saucedemo.com
    And landing on www.saucedemo.com
    When inputing username "standard_user"
    And inputing password "secret_sauce"
    And click login button
    And showing products page with some products
    And click add to cart to first product
    Then shipping cart added new product