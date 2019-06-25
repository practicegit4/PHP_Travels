Feature: Phptravels Login Feature
  This login feature is for login functionality in Php website

      
 Scenario: Login with correct user id and password
    Given I navigated to Phptravels login page
    When I entered correct "islam.roman92@gmail.com" and "Gold123"
    And I click on login
    Then I should be able to login