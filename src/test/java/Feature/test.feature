Feature: Getir istenilen Test Case Yazma işlemi

  Scenario: Getir Test Case1
    Given Navigate to the MobileApp
    Then Username "hello@getir.com" password "hello" Login
    Then Basket Null Product
    Then "Atıştırmalık" category selected
    Then "1" 'inci üründen "2" tane sepete ekleyelim
    Then "1". product "2" Addition Verifed
    Then "2" 'inci üründen "1" tane sepete ekleyelim
    Then "2". product "1" Addition Verifed
    Then Back To Button
    Then "İçecek" category selected
    Then "1" 'inci üründen "2" tane sepete ekleyelim
    Then "1". product "2" Addition Verifed
    Then Go To Basket
    Then Remove Products
    Then Basket Confirmed Empty


    Scenario: Getir Test Case2
      Given Navigate to the MobileApp
      Then Username "hello@getir.com" password "hello" Login
      Then Basket Null Product
      Then "Atıştırmalık" category selected
      Then "1" 'inci üründen "2" tane sepete ekleyelim
      Then "1". product "2" Addition Verifed
      Then "2" 'inci üründen "2" tane sepete ekleyelim
      Then "2". product "2" Addition Verifed
      Then Back To Button
      Then "Yiyecek" category selected
      Then "1" 'inci üründen "2" tane sepete ekleyelim
      Then Go To Basket
      Then increase all products by
      Then Remove Products
      Then Basket Confirmed Empty
