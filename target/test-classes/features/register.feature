Feature: Register new user
Background: navigate to url and go to register page
  Given i am on the nop commerce home page
  Then  i should be navigated to home page
  When  i click on register link on the navbar
  Then  i should be navigated to register page

@regression
  Scenario: verify user registration by providing data in the mandatory fields

    When  i select gender as female
    And   i select day month year from date of birth dropdown
    And   i enter firstName lastName email password confPassword
      | firstName   | lastName     |  email     | password | confPassword|
      | jyoti        | g      |jyoti2@test.com|Testing2|   Testing12334|
    And  i click on register button
    Then registration is successful
@ui
    Scenario: Verify error messages when data is not provided in the mandatory fields
      When i click on register button
      Then i should see error messages on all mandatory fields