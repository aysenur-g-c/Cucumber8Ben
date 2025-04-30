Feature: Country Multi Scenario

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country

  Scenario: Create a Country
    When Create a country
    Then Success message should be displayed

  Scenario: Create a Country
    When Create a country name as "aysenurUlk1" code as "aysenurUlk1Kod1"
    Then Success message should be displayed