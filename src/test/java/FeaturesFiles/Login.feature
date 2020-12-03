Feature: Login Function
  @SmokeTest
  Scenario: Login and verify

    Given Navigate to basqar webpage

    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button

    Then User must login successfully