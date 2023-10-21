Feature: continue shopping after click the cart
  @positive
  Scenario: I want to continue shopping after click the cart
    Given opening browser
    And opening www.saucedemo.com
    And get web www.saucedemo.com
    When inputing my username "standard_user"
    And inputing my password "secret_sauce"
    And click login-btn
    And logging in and see products
    And add to cart
    And click cart
    And click continue shopping
    Then show the products page