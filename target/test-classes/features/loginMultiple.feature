Feature: : Login to nopCommerce
  As a user
  i want to login to the application
  so that i can place some orders
@login
  Scenario Outline: Verify login with valid credentials

    Given i am on the nop commerce home page
    When  i click log in link from the nav bar
    Then  i should be navigated to login page
    When  i enter email as "<email>"
    And   i enter password as "<password>"
    And   i click on log in button
    Then  i should be logged in successfully

    Examples:
    |email              |     password |
    |jyoti@gmail.com    |   testing    |
    |jyoti1@gmail.com    |    testing1  |
    |jyoti2@gmail.com    |     testing2 |