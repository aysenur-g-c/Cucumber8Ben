#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.

  Feature: CitizenShip Functionality

    @SmokeTest
    Scenario: Create a CitizenShip

      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login succesfully
      And Navigate to CitizenShip
      When Create a CitizenShip
      Then Success message should be displayed