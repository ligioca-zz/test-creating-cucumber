Feature: LoginFeature
  Deals with the Login functionality of the application

  Scenario: Login with correct user name and password
    Given I navigate to the ExecuteAutomation website
    And I enter the user following data
      |UserName  |Password      |
      |admin1    |adminpassword1|

    And I click login button
    Then I should see the UserDetails page

  Scenario Outline: Login with correct user name and password
    Given I navigate to the ExecuteAutomation website
    And I enter the user <username> and pass <password>
    And I click login button
    Then I should see the UserDetails page

    Examples:
      |username  |password      |
      |admin1    |adminpassword1|
      |admin2    |adminpassword2|
      |admin3    |adminpassword3|