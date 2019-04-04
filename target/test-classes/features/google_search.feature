@LoginProfile
Feature: Google Search
  As a web user
  I want to find information on google
  So that I get a better understanding of the topic

  Scenario: Search for Cucumber
    Given I am on google search page
    When I search for "Cucumber"
    Then the first line on the result page should contain "cucumber"
