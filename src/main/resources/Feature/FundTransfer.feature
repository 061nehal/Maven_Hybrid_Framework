@Fundtransfer
Feature: Fund Transfer Functionality
  As a user we want to trasfer funds to the friends & family.

@Vpva
  Scenario: Valid Payee and valid amount
    Given I am on fund transfer webpage
    When I select valid payee "Jim"
    When I enter valid amount "500"
    When I click on fund transfer button
    Then I should get message "$500 transferred successfully to Jim!!"
 @Vpinva
  Scenario: Valid Payee and invalid amount
    Given I am on fund transfer webpage
    When I select valid payee "Jim"
    When I enter invalid amount "6000"
    When I click on fund transfer button
    Then I should get message "Transfer failed!! account cannot be overdrawn"

  Scenario: Invalid Payee and valid amount
    Given I am on fund transfer webpage
    When I select invalid payee "John"
    When I enter valid amount "500"
    When I click on fund transfer button
    Then I should get message "Transfer failed!! 'John' is not approved. Please contact your branch"
