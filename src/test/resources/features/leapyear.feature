Feature: Leap Year Calculator

  As a user
  I want to know if a year is a leap year
  So that I can plan for an extra day on February 29th during those years.

  Scenario: All years divisible by 400 ARE leap years
    Given the year is 400
    When I check if the year is a leap year
    Then I should get a "Leap Year"

  Scenario: The year 401 is not a leap year
    Given the year is 401
    When I check if the year is a leap year
    Then I should get a "Not A Leap Year"

  Scenario: The year 399 is not a leap year
    Given the year is 399
    When I check if the year is a leap year
    Then I should get a "Not A Leap Year"