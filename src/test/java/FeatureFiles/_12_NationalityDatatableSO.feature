#Nationality fonksiyonlarını 5 farklı değer için çalıştırıp test ediniz
Feature: DataTable-Senaryo Outline Nationality Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Nationality Functionality

    And Click on the Element LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And User sending the Enter keys in Dialog

    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      |<name>|

    Examples:
      | name       |
      | AysenurNt1 |
      | AysenurNt2 |
      | AysenurNt3 |
      | AysenurNt4 |
      | AysenurNt5 |

