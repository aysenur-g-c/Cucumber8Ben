#Senaryolar
#CitizenShip sayfasına gidiniz.
#S1: Create işlemini parameter yöntemi ile doğrulayınız.
#S2: Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)
#S3: Ayrı senaryoda girilen bilgiyi silme işlemini doğrulayınız

Feature:  Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip

  @SmokeTest
  Scenario: Create a Citizenship with parameter
    When Create a CitizenShip name as "aysenurCS1" shortkod as "acskod1"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter Negative
    When Create a CitizenShip name as "aysenurCS1" shortkod as "acskod1"
    Then Already exist message should be displayed

  Scenario: Delete Citizenship
    When user delete name as "AysenurCS1"
    Then Success message should be displayed