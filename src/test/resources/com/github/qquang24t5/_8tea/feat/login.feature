Feature: Login function
  Scenario Outline: All the fields should return an error if it's not filled on the login form
    Given i am on the "Login" form
    When  i click on "Login" button on the "Login" form
      And i don't fill the "<field>" field on the "Login" form
    Then  the "<error>" on the "Login" page should be visible
    Examples:
      |field     |error             |
      |username  |missing username  |
      |password  |missing password  |
