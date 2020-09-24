Feature: Login functionality

Scenario:  to verify user is login successfully and  after login able to see "Gtpl Bank" message for confirmation
  Given user is on the homepage
  When user enter email id"sitaram123@gmail.com"
  And user click on submit button
  And user click on Bank Project
  And user enter user id"mngr283833"
  And user enter password"gubudYh"
  And user click on login button
  Then user should able to login successfully
  And user should able to see "Gtpl Bank" message for confirmation


  Scenario Outline: to verify user is login successfully and  after login able to see "Gtpl Bank" message for confirmation
    Given user is on the homepage
    When user enter <email id >
    And user click on submit button
    And user click on Bank Project
    And user enter user<User Id><Password>
    And user click on login button
    Then user should able to login successfully
    And user should able to see "Gtpl Bank" message for confirmation
    Examples:
    |email id            |User Id   |Password|
    |sitaram123@gmail.com|mngr283833|gubudYh |



