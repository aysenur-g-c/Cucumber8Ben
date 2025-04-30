Feature:  Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip

  Scenario Outline: Create a Citizenship with parameter
    When Create a CitizenShip name as "<name>" shortkod as "<shortName>"
    Then Success message should be displayed

    When Create a CitizenShip name as "<name>" shortkod as "<shortName>"
    Then Already exist message should be displayed

    When user delete name as "<name>"
    Then Success message should be displayed
    Examples:
      | name | shortName |
      | Aysenur1 | Acskod1|
      | Aysenur2 | Acskod2|
      | Aysenur3 | Acskod3|
      | Aysenur4 | Acskod4|
      | Aysenur5 | Acskod5|


    #  dataProvider (TestNG için), Senaryo Outline (cucumber)
         #  görevi verilen her değer için, tüm senayo çalışır