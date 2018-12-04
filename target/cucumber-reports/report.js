$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Feature: Search functionality"
    },
    {
      "line": 2,
      "value": "#"
    },
    {
      "line": 3,
      "value": "#  @SearchOneProduct"
    },
    {
      "line": 4,
      "value": "#  Scenario: Search a valid product"
    },
    {
      "line": 5,
      "value": "#    Given user is logged in"
    },
    {
      "line": 6,
      "value": "#    When user search for \"samsung s7\""
    },
    {
      "line": 7,
      "value": "#    Then a page with \"Samsung Galaxy S7\" is displayed"
    }
  ],
  "line": 9,
  "name": "Search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Search a valid product",
  "description": "",
  "id": "search-functionality;search-a-valid-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@SearchMultipleProducts"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user search for \u003cproduct\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "a page with \u003ccategory\u003e is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "search-functionality;search-a-valid-product;",
  "rows": [
    {
      "cells": [
        "product",
        "category"
      ],
      "line": 18,
      "id": "search-functionality;search-a-valid-product;;1"
    },
    {
      "cells": [
        "pirelli",
        "Anvelopa"
      ],
      "line": 19,
      "id": "search-functionality;search-a-valid-product;;2"
    },
    {
      "cells": [
        "nokia",
        "Telefon"
      ],
      "line": 20,
      "id": "search-functionality;search-a-valid-product;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 408939,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search a valid product",
  "description": "",
  "id": "search-functionality;search-a-valid-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@SearchMultipleProducts"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user search for pirelli",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "a page with Anvelopa is displayed",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.user_is_logged_in()"
});
formatter.result({
  "duration": 11075018907,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pirelli",
      "offset": 16
    }
  ],
  "location": "SearchStepDef.user_search_for_product(String)"
});
formatter.result({
  "duration": 5706320173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anvelopa",
      "offset": 12
    }
  ],
  "location": "SearchStepDef.a_page_with_expected_product_is_displayed(String)"
});
formatter.result({
  "duration": 1019044079,
  "status": "passed"
});
formatter.after({
  "duration": 743043898,
  "status": "passed"
});
formatter.after({
  "duration": 474742,
  "status": "passed"
});
formatter.before({
  "duration": 104564,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search a valid product",
  "description": "",
  "id": "search-functionality;search-a-valid-product;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@SearchMultipleProducts"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user search for nokia",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "a page with Telefon is displayed",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.user_is_logged_in()"
});
formatter.result({
  "duration": 10175438934,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nokia",
      "offset": 16
    }
  ],
  "location": "SearchStepDef.user_search_for_product(String)"
});
formatter.result({
  "duration": 5950316110,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Telefon",
      "offset": 12
    }
  ],
  "location": "SearchStepDef.a_page_with_expected_product_is_displayed(String)"
});
formatter.result({
  "duration": 1502085711,
  "error_message": "java.lang.AssertionError: did not expect to find [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat org.testng.Assert.assertTrue(Assert.java:53)\r\n\tat stepDefinitions.SearchStepDef.a_page_with_expected_product_is_displayed(SearchStepDef.java:52)\r\n\tat ✽.Then a page with Telefon is displayed(Search.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 733625370,
  "status": "passed"
});
formatter.after({
  "duration": 7823033,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027SVRODK00184\u0027, ip: \u0027172.17.9.120\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: EventFiringWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:131)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:703)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:388)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:105)\r\n\tat com.sun.proxy.$Proxy19.getScreenshotAs(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.getScreenshotAs(EventFiringWebDriver.java:288)\r\n\tat util.TestUtil.takeScreenShot(TestUtil.java:99)\r\n\tat stepDefinitions.LoginStepDef.tearDown(LoginStepDef.java:67)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:131)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:658)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:792)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1103)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:140)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:122)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:739)\r\n\tat org.testng.TestRunner.run(TestRunner.java:589)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:398)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:392)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:354)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:302)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1145)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1067)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:997)\r\n\tat org.testng.TestNG.run(TestNG.java:965)\r\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:73)\r\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\r\n",
  "status": "failed"
});
});