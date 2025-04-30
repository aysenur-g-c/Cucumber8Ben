Feature: Fees functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    @Regression
  Scenario: : Fees create and delete functionality

    And Click on the Element LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | ays     |
      | codeInput       | 123     |
      | integrationCode | ays1454 |
      | priorityCode    | 23      |

    And User sending the Enter keys in Dialog

    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | ays |
