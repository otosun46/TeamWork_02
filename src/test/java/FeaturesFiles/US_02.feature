Feature: User should be able to use Nationalities Page functionality

  Background:
    Given Navigate to basqar webpage

    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button

    Then User must login successfully

    Scenario:

    When User should be able to create new Nationalites
    When User should be able to update an existant Nationality
    When User should be able to delete an existant Nationality
    And  User should not be able to create a Nationality that is exists with similar name
