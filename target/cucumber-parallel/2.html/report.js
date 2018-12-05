$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/BDD Test Framework/src/main/java/features/Search.feature");
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
  "duration": 16256072113,
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
  "duration": 6551371718,
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
  "duration": 1076210479,
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
  "duration": 11144819381,
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
  "duration": 5851525709,
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
  "duration": 1435465916,
  "error_message": "java.lang.AssertionError: did not expect to find [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat org.testng.Assert.assertTrue(Assert.java:53)\r\n\tat stepDefinitions.SearchStepDef.a_page_with_expected_product_is_displayed(SearchStepDef.java:52)\r\n\tat ✽.Then a page with Telefon is displayed(D:/workspace/BDD Test Framework/src/main/java/features/Search.feature:15)\r\n",
  "status": "failed"
});
});