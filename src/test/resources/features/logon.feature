Feature: validating login functionality
  Scenario: login with valid credentials
    Given launching the website
    When passing credentials
    And User should be redirected to secure page
    Then quit the browser