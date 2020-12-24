Feature: User should be able to Item Budgets functionality.(Budget)

  Background:
    Given Navigate to basqar webpage
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button
    Then User must login successfully

  Scenario: Create new Budgets
    Given Navigate to Budgets page
    When User should be able to view Budgets page
    Then User  should be able to create new Budgets (Budget Info)
      | description | Deneme123 |
      | year        | 2021      |
    And Click and Select options
      | budgetGroup | 2 |
      | school      | 1 |
      | type        | 0 |
    Then Save created budgets
    And User should be able to view the verification message successfully

  Scenario: User should not be able to add without Year,Budget Group and School
    Given Navigate to Budgets page
    When User should be able to view Budgets page
    Then User  should be able to create new Budgets (Budget Info)
      | description | Deneme123 |
    And Click and Select options
      | type        | 0 |
    And User should verify that the budget is not saved

  Scenario: User should be able to delete  Budgets and view  successfully validating the message
    Given Navigate to Budgets page
    When User  should be able to delete  "Deneme123" Budgets
    Then User should be able to view the verification message successfully