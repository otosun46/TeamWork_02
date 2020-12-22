Feature: User should be able to use Attestations Page functionality

  Background:
    Given Navigate to basqar webpage

    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button

    Then User must login successfully
Scenario:
  When User should be able to view Attestations page
  Then User  should be able to create an Attestation name as "Sena1" and view  successfully validating the message
  And User should  be able to edit Attestation update "Sena1" to "Neda1" and view  successfully validating the message
  And User should be

