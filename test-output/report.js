$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GooglePage.feature");
formatter.feature({
  "line": 1,
  "name": "Search information on Google",
  "description": "",
  "id": "search-information-on-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User enters valid name",
  "description": "Given: user is on Google page\r\nWhen: user search an item\r\nThen: a page with results is displayed",
  "id": "search-information-on-google;user-enters-valid-name",
  "type": "scenario",
  "keyword": "Scenario"
});
});