Feature: _US_11_Nation Keys functionality


  Background:
    Given Navigate to basqar webpage
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button
    Then User must login successfully


  Scenario:  View Notation Keys Page



    Then user should confirm "notation" text

  Scenario:  Create a Notation Key

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |
      | addButton      |

    And Userrr sending the keys
      | formnamebox  | hlkblgn |
      | shortnamebox | hlk    |
      | multiplerbox | 35      |

    When User clicks on the elements in Page

      | applyButton |


    Then Userrr should see "succes" message

  Scenario:  Edit a Notation Key

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |


    And Userrr sending the keys
      | nameSearch | hlkblgn |

    When User clicks on the elements in Page
      | searchButton |

    Then Userrr "edit" "hlkblgn"

    And Userrr sending the keys
      | formnamebox  |halkblgn2 |
      | shortnamebox | hlk2 |
      | multiplerbox | 34   |

    When User clicks on the elements in Page
      | applyButton |

    Then Userrr should see "succes" message


  Scenario:  Search a Notation Key

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |


    And Userrr sending the keys
      | nameSearch |halkblgn2 |

    When User clicks on the elements in Page
      | searchButton |

    Then  "halkblgn2" should be visible


  Scenario:  Delete a Notation Key

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |


    And Userrr sending the keys
      | nameSearch | halkblgn2 |

    When User clicks on the elements in Page
      | searchButton |

    Then Userrr "delete" "halkblgn2"

    And User clicks on the elements in Page
      | yesButton |

    Then Userrr should see "succes" message