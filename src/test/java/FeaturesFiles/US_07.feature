Feature: User should be able to use Notifications Page functionality

  Background:
    Given Navigate to basqar webpage

    When Enter username "daulet2030@gmail.com" and password "TechnoStudy123@" and click Login button

    Then User must login successfully

  Scenario: Create new Notification (SMS)
    Given Navigate to Notifications page
    When User should be able to view Notifications Page
    Then User  should be able to create new Notification in "0" type
      | name        | Announcement_01       |
      | description | Submitted for testing |
    And  Notification should be activated and able to select SMS
    Then Notification fields should be filled in and saved
      | daysBefore | 2                                                                                              |
      | textSMS    | This is a test message. If you have received this message, the message system is working fine. |
    And User should be able to view the verification message successfully

#  Scenario: Create new Notification (email)
#    Given Navigate to Notifications page
#    When User should be able to view Notifications Page
#    Then User  should be able to create new Notification in "1" type
#      | name        | Announcement_01       |
#      | description | Submitted for testing |
#    And  Notification should be activated and able to select mail
#    Then Notification fields should be filled in and saved
#      | textSMS    | This is a test message. If you have received this message, the message system is working fine. |
#    And User should be able to view the verification message successfully

  Scenario: Edit the Notification
    Given Navigate to Notifications page
    When User should be able to view Notifications Page
    And When searching by  "Announcement_01", the results should be matched the search terms.
    Then User  should be able to edit the Notification
      | textSMS | This is a test message changed. |
    And User should be able to view the verification message successfully

  Scenario: Delete the Notification
    Given Navigate to Notifications page
    When User should be able to view Notifications Page
    And When searching by  "Announcement_01", the results should be matched the search terms.
    Then User  should be able to delete the Notification
    And User should be able to view the verification message successfully
#    Birlestirme islemini takip icin eklendi