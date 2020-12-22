Feature: User should be able to Item Budgets functionality.(Budget)
  Background:
    Given Navigate to basqar webpage
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button
    Then User must login successfully

  Scenario: Create new Budgets
    Given Navigate to Budgets page
    When User should be able to view Budgets page
    Then User  should be able to create new Budgets (Budget Info)
      | name        | Announcement_01       |
      | description | Submitted for testing |
    And  Notification should be activated and able to select SMS
    Then Notification fields should be filled in and saved
      | daysBefore | 2                                                                                              |
      | textSMS    | This is a test message. If you have received this message, the message system is working fine. |
    And User should be able to view the verification message successfully