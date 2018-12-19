$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SortByAvailability.feature");
formatter.feature({
  "line": 2,
  "name": "Order by availability",
  "description": "",
  "id": "order-by-availability",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SortByAvailability"
    }
  ]
});
formatter.scenario({
  "line": 13,
  "name": "Check radio button",
  "description": "",
  "id": "order-by-availability;check-radio-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Sort_all"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user search for \"sanie\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user choose a category from list then a page with corresponding results should be displayed",
  "rows": [
    {
      "cells": [
        "In Stoc",
        "Promotii",
        "aNoutati",
        "Lichidari Stoc"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDef.user_is_logged_in()"
});
formatter.result({
  "duration": 13836592676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sanie",
      "offset": 17
    }
  ],
  "location": "SearchStepDef.user_search_for_product(String)"
});
formatter.result({
  "duration": 2692688226,
  "status": "passed"
});
formatter.match({
  "location": "SortByAvailabilityStepDef.user_choose_each_category_from_list(DataTable)"
});
formatter.result({
  "duration": 20844436732,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tnull\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:47)\r\n\tat stepDefinitions.SortByAvailabilityStepDef.user_choose_each_category_from_list(SortByAvailabilityStepDef.java:45)\r\n\tat ✽.When user choose a category from list then a page with corresponding results should be displayed(SortByAvailability.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 481161014,
  "status": "passed"
});
});