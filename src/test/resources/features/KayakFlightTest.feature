Feature: I want to test Kayak flight search functionality


  Scenario Outline: Kayak domestic flight search
    Given I am on Kayak home page
    When I perform flight search for <city>
    And from date should be <fromDate>
    And to date should be <todate>
    And I click on search button
    Then Flight search result page should be displayed and the prices should be displayed in increasing order
    
    Examples: 
    
    | city 		| 		fromDate 					| todate 			 		 |
    | Mumbai 	| 20 May, 2024			  | 27 May, 2024  |
    #| Pune 		| 10 October, 2024 			| 15 October, 2024 |
    
    
    #@Functional
    #Scenario Outline: Kayak domestic flight search
    #Given I am on Kayak home page
    #When I perform flight search for <city>
    #And from date should be <fromDate>
    #And to date should be <todate>
    #And I click on search button
    #Then Flight search result page should be displayed and the prices should be displayed in increasing order
    
    #Examples: 
    #
    #| city 		| 		fromDate 					| todate 			 		 |
    #| Mumbai 	| 1 October, 2022			  | 7 October, 2022  |
    #| Pune 		| 10 October, 2022 			| 15 October, 2022 |
    