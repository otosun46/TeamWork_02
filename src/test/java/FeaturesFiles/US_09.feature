Feature: User should be able to use Documents Page functionality

  Background:
    Given Navigate to basqar webpage

    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button

    Then User must login successfully

  Scenario:Creating a new Budget Project

    When User should be able to view Budget Projects Page

    And User should not be able to add without Code
      | nameInput        | personForUS_09_Group2_test1 |
      | accountCodeInput |                             |


    And User should not be able to add without a True Code
      | nameInput        | personForUS_09_Group2_test2 |
      | accountCodeInput | 1.1                         |
    And User should be able to create new Budget Project and view successfully validating the message
      | nameInput        | personForUS_09_Group2_test3 |
      | accountCodeInput | 3.3                         |

  Scenario:Editing a Budget Project

    When User should be able to view Budget Projects Page
    And When searching by  "personForUS_09_Group2_test3", the results should be matched the search terms in Budget Projects Page
    And User should be able to update an existing Budget Project
      | nameInput        | personForUS_09_Group2_edited |
      | accountCodeInput | 3.3                          |

  Scenario: Delete a Budget Project
    When User should be able to view Budget Projects Page
    And When searching by  "personForUS_09_Group2_edited", the results should be matched the search terms in Budget Projects Page
    And User should be able to delete an existing Budget Project


