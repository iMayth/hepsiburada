Feature: sepet
  @wip
  Scenario: go to the kitap page
    Given the user is on the kitap page
    When the user clicks on sepete ekle
    Then the user should be able to see urun sepetinizde message
    When the user clicks on sepete git
    Then the user should be able to click alisverisi tamamla
    And the user should be able to click devam et