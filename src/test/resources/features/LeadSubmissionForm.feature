@LSF
Feature: Lead Submission Form
  As a user, I want to be able submit my contacts and receive informational brochure

  Background: Open home page
    Given user is on the home page

  @LSF001
  Scenario: User verifies progress bar works properly on step 1 and title is displayed
    Then user verifies progress bar value is "10"
    And user verifies title is displayed on the submission form

  @LSF002
  Scenario: User selects MBA option and verifies progress bar value is changed and title is displayed
    When user selects MBA option
    And user clicks next button
    Then user verifies progress bar value is "90"
    And user verifies title is displayed on the submission form

  @LSF003
  Scenario: User selects MBA option and tries to submit form without entering contact data
    When user selects MBA option
    And user clicks next button
    And user clicks Get Brochure button
    Then user verifies Full Name icon warning is displayed
    And user verifies Email icon warning is displayed
    And user verifies Phone Number icon warning is displayed

  @LSF004
  Scenario: User selects MBA option and tries to submit form entering wrong email format
    When user selects MBA option
    And user clicks next button
    And user inputs wrong email format
    Then user clicks Get Brochure button
    And user verifies Email icon warning is displayed


    #defect
  @LSF005
  Scenario: User selects MBA option and tries to submit form entering wrong name format
    When user selects MBA option
    And user clicks next button
    And user inputs wrong name format
    Then user clicks Get Brochure button
    And user verifies Full Name icon warning is displayed

    #defect
  @LSF006
  Scenario: User selects MBA option and tries to submit form entering wrong phone number
    When user selects MBA option
    And user clicks next button
    And user inputs wrong phone number
    Then user clicks Get Brochure button
    And user verifies Phone Number icon warning is displayed


  @LSF007
  Scenario Outline: User selects MBA option and inputs valid data <data set number> and submit the form
    When user selects MBA option
    And user clicks next button
    Then user inputs valid data set "<data set number>"
    When user clicks Get Brochure button
    Then user verifies thank you page title is displayed

    Examples:
      | data set number |
      | 1               |
      | 2               |
      | 3               |
      | 4               |
      | 5               |
      | 6               |
      | 7               |
      | 8               |
      | 9               |
      | 10              |
      | 11              |
      | 12              |
      | 13              |
      | 14              |
      | 15              |
      | 16              |
      | 17              |
      | 18              |
      | 19              |
      | 20              |
      | 21              |
      | 22              |
      | 23              |
      | 24              |
      | 25              |
      | 26              |
      | 27              |
      | 28              |
      | 29              |
      | 30              |
      | 31              |
      | 32              |
      | 33              |
      | 34              |
      | 35              |
      | 36              |
      | 37              |
      | 38              |
      | 39              |
      | 40              |
      | 41              |
      | 42              |
      | 43              |
      | 44              |
      | 45              |
      | 46              |
      | 47              |
      | 48              |
      | 49              |
      | 50              |


  @LSF007
  Scenario Outline: User selects MSBA option and inputs valid data <data set number> and submit the form
    When user selects MSBA option
    And user clicks next button
    Then user inputs valid data set "<data set number>"
    When user clicks Get Brochure button
    Then user verifies thank you page title is displayed

    Examples:
      | data set number |
      | 1               |
      | 2               |
      | 3               |
      | 4               |
      | 5               |
      | 6               |
      | 7               |
      | 8               |
      | 9               |
      | 10              |
      | 11              |
      | 12              |
      | 13              |
      | 14              |
      | 15              |
      | 16              |
      | 17              |
      | 18              |
      | 19              |
      | 20              |
      | 21              |
      | 22              |
      | 23              |
      | 24              |
      | 25              |
      | 26              |
      | 27              |
      | 28              |
      | 29              |
      | 30              |
      | 31              |
      | 32              |
      | 33              |
      | 34              |
      | 35              |
      | 36              |
      | 37              |
      | 38              |
      | 39              |
      | 40              |
      | 41              |
      | 42              |
      | 43              |
      | 44              |
      | 45              |
      | 46              |
      | 47              |
      | 48              |
      | 49              |
      | 50              |




