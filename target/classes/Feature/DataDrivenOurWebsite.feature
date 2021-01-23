Feature: Our web site signup fuctionality by multiple data
  As a user I want to create multiple new account in website webpage

  Scenario Outline: As a user I want to create multiple new account in website webpage
    Given I am on Ourwebsite Webpage
    When I Enter first name "<FirstName>", last name "<LastName>", email "<Email>", again email "<AgainEmail>", password "<Password>"
    When I Select month "<Month>", day "<Day>", year "<Year>"
    When I Click on "<Gender>" radio button
    Then I Should create new account successfully

    Examples: 
      | FirstName | LastName | Email         | AgainEmail    | Password | Month | Day | Year | Gender |
      | Nehal     | Hasnain  | acb@gmail.com | acb@gmail.com | zxcv     | March |  12 | 1990 | Male   |
      | Anik      | Hasnain  | qwe@gmail.com | qwe@gmail.com | qwer     | April |   7 | 1994 | Male   |
      | Amit      | Hasnain  | asd@gmail.com | asd@gmail.com | asdf     | March |   8 | 1990 | Male   |
      | Nehal     | Hasnain  | acb@gmail.com | acb@gmail.com | zxcv     | March |  12 | 1990 | Male   |
      | Anik      | Hasnain  | qwe@gmail.com | qwe@gmail.com | qwer     | April |   7 | 1994 | Male   |
      | Amit      | Hasnain  | asd@gmail.com | asd@gmail.com | asdf     | March |   8 | 1990 | Male   |
      
