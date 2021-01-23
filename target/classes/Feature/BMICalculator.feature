@BmiFeature
Feature: Height and Weight BMI Metric
  User would like to calculate BMI 
@Normal
 Scenario: Normal
    Given I am on BMI calculator webpage
    When I enter height "170", weight "60"
    When I click on calculate button
    Then BMI should "20.8"
    And BMI category should  "Normal"

  Scenario: Underweight
    Given I am on BMI calculator webpage
    When I enter height "172", weight "40"
    When I click on calculate button
    Then BMI should "13.5"
    And BMI category should  "Underweight"

Scenario: Overweight
    Given I am on BMI calculator webpage
    When I enter height "172", weight "80"
    When I click on calculate button
    Then BMI should "27.0"
    And BMI category should  "Overweight"

 Scenario: Obesity
    Given I am on BMI calculator webpage
    When I enter height "172", weight "90"
    When I click on calculate button
    Then BMI should "30.4"
    And BMI category should  "Obesity"
