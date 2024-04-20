
Feature: I want to test Kayak flight search

  Scenario Outline: Testing kayak flight search
    Given I am on home page
    When I want search from <city> city in the date <date>
    When I select child option <option>
    When I select the month <month>
    Then I should get search result

    Examples: 
      | city  	| date 									| option  | month  |
      | Mumbai  | 12 December, 2022			|	Yes			|  05    |
      | Pune	  | 5	Nov, 2022						|	No			|  8     |
