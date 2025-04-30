#Country menusu create,delete olarak,
# Senaryo outline şeklinde 5 kez çalıştırınız
# Bu senaryoda country delete de yazılım hatası mevcut

Feature:  Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country

  Scenario Outline: Country with Parameter
    When Create a country name as "<name>" code as "<kod>"
    Then Success message should be displayed
    When Create a country name as "<name>" code as "<kod>"
    Then Already exist message should be displayed
    When user delete name as "<name>"
    Then Success message should be displayed

    Examples:
      | name | kod|
      | aysenurUlk12 | aysenurUlk1Kod12|
      | aysenurUlk12 | aysenurUlk1Kod12|
      | aysenurUlk12 | aysenurUlk1Kod12|
      | aysenurUlk12 | aysenurUlk1Kod12|
      | aysenurUlk12 | aysenurUlk1Kod12|