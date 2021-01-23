Feature: Our web site signup fuctionality
  As a user I want to create new account in website webpage

@Ourwebsite
  Scenario: As a user I want to create new account in website webpage
    Given I am on ourwebsite webpage
    When I enter first name "Nehal", last name "Hasnain", email "abc@gmail.com", again email "abc@gmail.com", password "zxcv"
    When I select month "January", day "12", year "1990"
    When I click on "Male" radio button
    Then I should create new account successfully
