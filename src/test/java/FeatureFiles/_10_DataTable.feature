Feature:  DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Country Functionality

    And Click on the Element LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | aysenurUl32 |
      | shortName | aysenurkd32 |

      #yazıları gönder

    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | aysenurUl32 |

  Scenario: Create Nationality Functionality

    And Click on the Element LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element Dialog
      | addButton |

    And User sending the Enter keys in Dialog
      | nameInput | Aysenur123 |

    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | Aysenur123 |

  Scenario: CitizenShip Functionality

    And Click on the Element LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | AysenurCS |
      | shortName | AysenurKd |

    And Click on the Element Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | AysenurCS |
