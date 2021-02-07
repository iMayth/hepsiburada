Feature: kitap
  @wip
  Scenario: go to the main page of the website
    Given the user is on the main page of the website
    When the user hovers over kitap menu
    Then the user should be able to click on roman
    When the user clicks on any book
    Then the user should see add to cart