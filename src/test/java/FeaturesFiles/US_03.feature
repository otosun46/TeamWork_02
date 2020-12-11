
Feature: User should be able to use Fees Page functionality

  Background:
    Given Navigate to basqar webpage
    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button
    Then User must login successfully

  Scenario: User should be able to use Fees Page functionality
    Given Click on the element to navigate to fee page
      | setupOne   |
      | parameters |
      | fees       |

    When User should be able to create a new Fee Type and name as
      | feeName            | Toll_Fee1 |
      | feeCodeInput       | TF006666   |
      | feeIntegrationCode | 00006666   |
      | feePriority        | 00006666   |

    And User should be able to saved and displayed the successfully message


  Scenario: User should be able to search Fee Type
    Given Click on the element to navigate to fee page
      | setupOne   |
      | parameters |
      | fees       |

    When  When User should be able to search Fee Type and name as
      | feeSearchName  | Toll_Fee |
      | feeSearchCode  | TF000001   |



  Scenario: User should be able to update an existent Fee Type
    Given Click on the element to navigate to fee page
      | setupOne   |
      | parameters |
      | fees       |

    When  When User should be able to search Fee Type and name as
      | feeSearchName  | Toll_Fee |


    When User should be able to update an existent Fee Type named

      | feeName            | Toll_Fee_Type2 |
      | feeCodeInput       | FT-00001     |
      | feeIntegrationCode | 00006667           |
      | feePriority        | 0006655           |


  Scenario: User should be able to delete an existent Fee Type

    Given Click on the element to navigate to fee page
      | setupOne   |
      | parameters |
      | fees       |

    When User should be able to delete an existent Fee Type named
      | feeSearchName  | Toll_Fee_Type |




