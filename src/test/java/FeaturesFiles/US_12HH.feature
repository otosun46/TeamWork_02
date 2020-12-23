Feature: User should be able to use Attestations Page functionality

  Background:
    Given Navigate to basqar webpage
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button
    Then User must login successfully

  Scenario:

    When User should be able to view Attestations page_HH
    Then User  should be able to create an Attestation "Nihal" and view  successfully validating the message_HH
    Then User should  be able to edit from "Nihal" to "Zülal" Attestation and view  successfully validating the message_HH
    And  User should be able to delete "Zülal"  Attestation and view  successfully validating the message_HH
    And  searching by  name , the results should be matched the search terms.