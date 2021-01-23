@DataTableFeature
Feature: Our website signup fuctionality
  As a user I want to create new account in ourwebsite webpage
@DataTable
  Scenario: As a user I want to create new account in ourwebsite webpage
    Given I am on our website webpage
    When I enter
      | FirstName | LastName | Email         | AgainEmail    | Password |
      | Nehal     | Hasnain  | acb@gmail.com | acb@gmail.com | zxcv     |
    When I select
      | Month | Day | Year |
      | March |  12 | 1990 |
    When I click on
      | Gender |
      | Male   |
    Then I should create new account successfully
