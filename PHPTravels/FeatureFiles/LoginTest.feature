  @PP
  Feature: Phptravels Login Feature
  This login feature is for login functionality in Php website
 @PHP1
  Scenario Outline: Login with  username and password
    Given I navigated to Phptravels login page
    When I entered "<username>" and "<password>"
    And I click on login
    Then I should be able to login

    Examples: 
      |username                    | password|
      | islam.roman92@gmail.com     | Gold123 | 
      
   @PHP2  
      Scenario Outline:  Homepage should be open successfully
    Given I navigated to Php homepage
    When I click hotels button
    And I put city name 
    And I put check in 
    And I put check out 
    And I click on search button 
    Then I should be able to find hotels chart.
    
 Examples:
 
 |cityname| checkin| checkout| 
 |new york| 12/09/2019|25/10/2019|