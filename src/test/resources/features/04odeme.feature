Feature: odeme
  @wip
  Scenario: go to the odeme page of the website
    Given the user is on odeme page
    When the user clicks on aninda havale and select an option
    Then the user should click on devam et
    When the user clicks on siparisi onayla
    Then the user should be able to see bank option page and cancel by clicking on cancel button