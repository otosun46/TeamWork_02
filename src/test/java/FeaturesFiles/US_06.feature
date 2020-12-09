Feature: User should be able to use Documents Page functionality

  Background:
    Given Navigate to basqar webpage

    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button

    Then User must login successfully

  Scenario:Creating a new Document
    Given Navigate to Document Types Page
    When User should be able to view Document Types Page
    And User should be able to create new Document and view successfully validating the message
      | nameInput       | personForUS_06_Group2 |
      | stageCheckBoxes | 5                     |

  Scenario:Editing a  Document
    Given Navigate to Document Types Page
    When User should be able to view Document Types Page
    And When searching by  "personForUS_06_Group2", the results should be matched the search terms
    And User should be able to update an existing Document
      | nameInput       | personForUS_06_Group2_edited |
      | stageCheckBoxes | 3                            |

  Scenario: Delete a Document
    Given Navigate to Document Types Page
    When User should be able to view Document Types Page
    And When searching by  "personForUS_06_Group2_edited", the results should be matched the search terms
    And User should be able to delete an existing Document


