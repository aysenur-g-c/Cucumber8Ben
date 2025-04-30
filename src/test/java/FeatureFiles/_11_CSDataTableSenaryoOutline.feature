# CitizenShip fonksiyonlarını 5 farklı değer için çalıştırınız

Feature: DataTable-Senaryo Outline Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: CitizenShip Functionality

    And Click on the Element LeftNav
      |setup|
      |parameters|
      |citizenship|

    And Click on the Element Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name>      |
      | shortName | <shortName> |

    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Examples:
      | name       | shortName  |
      | AysenurCs1 | AysenurKd1 |
      | AysenurCs2 | AysenurKd2 |
      | AysenurCs3 | AysenurKd3 |
      | AysenurCs4 | AysenurKd4 |
      | AysenurCs5 | AysenurKd5 |






