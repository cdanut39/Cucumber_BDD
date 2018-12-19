$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/BDD Test Framework/src/main/java/features/SortByAvailability.feature");
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
  "line": 4,
  "name": "Check radio button",
  "description": "",
  "id": "order-by-availability;check-radio-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search for \"sanie\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user choose category no 3 from list",
  "rows": [
    {
      "cells": [
        "In Stoc",
        "Promotii",
        "Noutati",
        "Lichidari Stoc"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "a page with corresponding results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.user_is_logged_in()"
});
formatter.result({
  "duration": 12800370178,
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
  "duration": 3694546929,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 24
    }
  ],
  "location": "SortByAvailabilityStepDef.user_choose_category_no_from_list(int,DataTable)"
});
formatter.result({
  "duration": 8937797409,
  "status": "passed"
});
formatter.match({
  "location": "SortByAvailabilityStepDef.a_page_with_corresponding_results_should_be_displayed()"
});
formatter.result({
  "duration": 19530,
  "status": "passed"
});
formatter.after({
  "duration": 430873,
  "status": "passed"
});
});