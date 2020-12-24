Feature: user should be able to use Dismissial Articles Page functionality

  Background:

    Given Navigate to basqar webpage
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button
    Then User must login successfully

  Scenario: Create a Dismissial Articles
    Given Navigate to Dismissial Articles page
    When Create a Dismissial Articles as "Ozge24"
    Then Success message should be diplayed.

  Scenario: Edit the Dismissial Articles
    Given Navigate to Dismissial Articles page
    When Edit the "Ozge24" to "Ozge3".
    Then Success message should be diplayed.


  Scenario: Delete the Dismissial Articles
    Given Navigate to Dismissial Articles page
    When Delete the "Ozge3".
    Then Success message should be diplayed.

