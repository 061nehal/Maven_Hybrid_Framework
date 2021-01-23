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
formatter.uri("src/main/resources/Feature/OurWebSIteDataTable.feature");
formatter.feature({
  "name": "Our website signup fuctionality",
  "description": "  As a user I want to create new account in ourwebsite webpage",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DataTableFeature"
    }
  ]
});
formatter.scenario({
  "name": "As a user I want to create new account in ourwebsite webpage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DataTableFeature"
    },
    {
      "name": "@DataTable"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on our website webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "OurWebSiteDataTableStepDefinition.i_am_on_our_website_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "AgainEmail",
        "Password"
      ]
    },
    {
      "cells": [
        "Nehal",
        "Hasnain",
        "acb@gmail.com",
        "acb@gmail.com",
        "zxcv"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "OurWebSiteDataTableStepDefinition.i_enter(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d80.0.3987.122)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ANIK\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Nehal\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52721}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 2a636722066f973f4da50a7f749110b5\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat stepDefinitionPack.OurWebSiteDataTableStepDefinition.i_enter(OurWebSiteDataTableStepDefinition.java:24)\r\n\tat ✽.I enter(src/main/resources/Feature/OurWebSIteDataTable.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I select",
  "rows": [
    {
      "cells": [
        "Month",
        "Day",
        "Year"
      ]
    },
    {
      "cells": [
        "March",
        "12",
        "1990"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "OurWebSiteDataTableStepDefinition.i_select(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on",
  "rows": [
    {
      "cells": [
        "Gender"
      ]
    },
    {
      "cells": [
        "Male"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "OurWebSiteDataTableStepDefinition.i_click_on(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should create new account successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "OurWebSiteStepDefinition.i_should_create_new_account_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d80.0.3987.122)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ANIK\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Nehal\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52721}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 2a636722066f973f4da50a7f749110b5\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\r\n\tat stepDefinitionPack.Hook.teardown(Hook.java:31)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:31)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:25)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:17)\r\n\tat cucumber.runner.UnskipableStep.executeStep(UnskipableStep.java:22)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:84)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
});
});