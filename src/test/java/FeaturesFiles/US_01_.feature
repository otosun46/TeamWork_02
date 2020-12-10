Feature: User should be able to use Citizenships Page functionality

  Background:
    Given Navigate to basqar webpage
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button
    Then User must login successfully

  Scenario:

    Given Navigate to Citizenhip Page
      |setupOne|
      |parameters|
      |citizenships|

    When User should be able to create new Citizenships
      | nameInput      | HalUk |
      | shortNameInput | Vicdan     |

    And Check  control whether succesfully message displayed

    And User should be able to update an existant Citizenships

      | searchNameInput    | HalUk    |
      | searchShortNameInput | Vicdan         |
      | nameInput          | HalUkBilgin |
      | shortNameInput     | VicdanLi     |




    And Check  control whether succesfully message displayed

    And User should be able to delete an existant Citizenships
      |searchNameInput|HalUkBilgin|
      |searchShortNameInput|VicdanLi|

    And Check  control whether succesfully message displayed
