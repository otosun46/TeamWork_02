Feature:User should be able to use Discounts Page functionality


  Background:
    Given Navigate to basqar webpage

    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button

    Then User must login successfully
  @Regression
  Scenario: Discount

    When User should be able to create a new Discount
    And successMessageShouldBeDisplayed
    When User should be able to update an existant Discount
    When  User should be able to delete an existant Discount
