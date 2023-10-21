Feature: remove product after adding in
  @positive
  Scenario: I want to remove product after adding in
    Given open my browser
    And goto www.saucedemo.com
    And get on www.saucedemo.com
    When input my username "standard_user"
    And input my password "secret_sauce"
    And clik the login button
    And page showing products
    And click add to cart to product
    And shipping cart +1 new product
    And click remove cart to the that product
    Then shipping cart remove that product