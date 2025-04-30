# Fees menusunu 5 farklı değerler için
# Create ve Delete fonksiyonlarını test ediniz

Feature: Fees functionality Senaryo Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Fees create and delete functionality

    And Click on the Element LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | <name>   |
      | codeInput       | <code>   |
      | integrationCode | <intgCd> |
      | priorityCode    | <priCd>  |

    And User sending the Enter keys in Dialog

    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Examples:
      | name | code | intgCd | priCd |
      | ays1 | 123  | ays125 | 25    |
      | ays2 | 123  | ays125 | 25    |
      | ays3 | 123  | ays125 | 25    |
      | ays4 | 123  | ays125 | 25    |
      | ays5 | 123  | ays125 | 25    |
