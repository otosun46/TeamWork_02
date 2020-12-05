Feature: User should be able to use Documents Page functionality




  Background:
    Given Navigate to basqar webpage

    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button

    Then User must login successfully
  Scenario:

    And User should be able to create a new Document
    And successMessageShouldBeDisplayedOnDocumentsPage
    And User should be able to update an existing Document
    And successMessageShouldBeDisplayedOnDocumentsPage
    And User should be able to delete an existing Document
