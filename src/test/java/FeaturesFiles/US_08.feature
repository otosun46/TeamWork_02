Feature: Inventory
Background:
  Given Navigate to basqar webpage
  When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button
  Then User must login successfully

  Scenario: Create a Item Categories
    Given Navigate to Item Categories page
    When Create a Item Categories as "E-2 position"
    Then Success message should be diplayed

  Scenario: Edit the Item Categories
    Given Navigate to Item Categories page
    When Edit the "E-2 position" to "E-3 position"
    Then Success message should be diplayed


  Scenario: Delete the Item Categories
    Given Navigate to Item Categories page
    When Delete the "E-3 position"
    Then Success message should be diplayed