@GoogleSearch @test
Feature: Google Search
  As a web user
  I want to find information on google
  So that I get a better understanding of the topic

  Scenario: Search result page contains search query
    Given I am on google search page
    When I search for "Cucumber"
    Then the page title should contain "cucumber"

  Scenario: Google first result description contains searched query
    Given I am on google search page
    When I search for "Java"
    Then the first line on the result page should contain "Java"
