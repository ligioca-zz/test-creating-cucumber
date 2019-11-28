Feature: FaqSupport
  Deals with the FAQ and Support functionality of the website

  Scenario: User should be able to access FAQ and Support page and see all the categories blocks of help
    Given I navigate to the wire website
    And I click SUPPORT in the footer of the page
    Then I should see FAQ and Support page
