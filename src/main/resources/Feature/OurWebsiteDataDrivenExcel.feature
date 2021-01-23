Feature: Our web site signup fuctionality by multiple data
  As a user I want to create multiple new account in website webpage

  Scenario Outline: As a user I want to create multiple new account in website webpage
    Given I am on Ourwebsite webpage
   	When I enter and select "<RowIndex>"
    Then I Should created new account successfully

    Examples: 
      |RowIndex|
      |1|
      |2|
      |3|
      |4|
      |5|
      |6|
      |7|
      
      
     
