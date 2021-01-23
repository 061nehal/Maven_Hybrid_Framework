$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/BMICalculator.feature");
formatter.feature({
  "name": "Height and Weight BMI Metric",
  "description": "  User would like to calculate BMI ",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BmiFeature"
    }
  ]
});
formatter.scenario({
  "name": "Normal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BmiFeature"
    },
    {
      "name": "@Normal"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on BMI calculator webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "BMIcalculator.i_am_on_BMI_calculator_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter height \"170\", weight \"60\"",
  "keyword": "When "
});
formatter.match({
  "location": "BMIcalculator.i_enter_height_weight(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on calculate button",
  "keyword": "When "
});
formatter.match({
  "location": "BMIcalculator.i_click_on_calculate_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "BMI should \"20.8\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BMIcalculator.bmi_should(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "BMI category should  \"Normal\"",
  "keyword": "And "
});
formatter.match({
  "location": "BMIcalculator.bmi_category_should(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/main/resources/Feature/FundTransfer.feature");
formatter.feature({
  "name": "Fund Transfer Functionality",
  "description": "  As a user we want to trasfer funds to the friends \u0026 family.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Fundtransfer"
    }
  ]
});
formatter.scenario({
  "name": "Valid Payee and valid amount",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Fundtransfer"
    },
    {
      "name": "@Vpva"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on fund transfer webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "FundTransferStepDefinition.i_am_on_fund_transfer_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select valid payee \"Jim\"",
  "keyword": "When "
});
formatter.match({
  "location": "FundTransferStepDefinition.i_select_valid_payee(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid amount \"500\"",
  "keyword": "When "
});
formatter.match({
  "location": "FundTransferStepDefinition.i_enter_valid_amount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on fund transfer button",
  "keyword": "When "
});
formatter.match({
  "location": "FundTransferStepDefinition.i_click_on_fund_transfer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get message \"$500 transferred successfully to Jim!!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FundTransferStepDefinition.i_should_get_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});