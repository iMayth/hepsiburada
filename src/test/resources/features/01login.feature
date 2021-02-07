Feature: login function
@wip
  Scenario: go to the main page of the website
    Given The user is on the main page
    When the user clicks on giris yap
    And the user enters valid credentials and click giris yap button
    Then the user should be able to logged in
