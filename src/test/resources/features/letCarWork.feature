Feature: Let car work

  @validData
  Scenario: Add new car
    Given User launches Chrome browser
    When User opens iLCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks OK on the message
    And User clicks on Let car work link
    And User enters valid car data
    And User clicks on Submit button
    Then User verifies fields is empty
    And User quites browser
