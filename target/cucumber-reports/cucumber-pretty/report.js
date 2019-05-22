$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google_search.feature");
formatter.feature({
  "line": 2,
  "name": "Google Search",
  "description": "As a web user\r\nI want to find information on google\r\nSo that I get a better understanding of the topic",
  "id": "google-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GoogleSearch"
    },
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Search for Cucumber",
  "description": "",
  "id": "google-search;search-for-cucumber",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for \"Cucumber\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the page title should contain \"cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.i_am_on_google_search_page()"
});
formatter.result({
  "duration": 6653116177,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 14
    }
  ],
  "location": "GoogleSearch.i_search_for(String)"
});
formatter.result({
  "duration": 2525780660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber",
      "offset": 31
    }
  ],
  "location": "GoogleSearch.the_first_line_on_the_result_page_should_contain(String)"
});
formatter.result({
  "duration": 1176264308,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Confirm search result for Cucumber",
  "description": "",
  "id": "google-search;confirm-search-result-for-cucumber",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am on google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I search for \"Java\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the first line on the result page should contain \"Java\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.i_am_on_google_search_page()"
});
formatter.result({
  "duration": 5125220107,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Java",
      "offset": 14
    }
  ],
  "location": "GoogleSearch.i_search_for(String)"
});
formatter.result({
  "duration": 2018267283,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Java",
      "offset": 50
    }
  ],
  "location": "GoogleSearch.theFirstLineOnTheResultPageShouldContain(String)"
});
formatter.result({
  "duration": 1215111832,
  "status": "passed"
});
});