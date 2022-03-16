Feature: : Login to nopCommerce
  As a user
  i want to login to the application
  so that i can place some orders
Background: navigate to url and go to login page
  Given i am on the nop commerce home page
  When  i click log in link from the nav bar
  Then  i should be navigated to login page
@regression
  Scenario: Verify login with valid credentials


    When  i enter email as "jyot@gmail.com"
    And   i enter password as "testing5"
    And   i click on log in button
    Then  i should be logged in successfully

  Scenario: Verify login with invalid credentials


    When  i enter invalid email as "gjhghjgj"
    And   i enter invalid password as "gjhgjhg"
    And   i click on log in button
    Then  i should not be logged in successfully

  Scenario: Verify login with blank credentials


    When  i keep  email as blank ""
    And   i keep  password as blank ""
    And   i click on log in button
    Then  i should not be logged in