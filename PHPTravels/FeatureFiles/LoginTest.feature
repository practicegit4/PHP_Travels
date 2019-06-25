 Feature: Phptravels Login Feature
  This login feature is for login functionality in Php website.
  
  Scenario Outline: Login with  username and password
    Given I navigated to Phptravels login page
    When I entered wrong "<username>" and "<password>"
    
    And I click on login
    Then I should be able to login

    Examples: 
      | islam.roman92@gmail.com     | Gold123     |
    