Feature: Google search box verification

  @smoke1 @regressionTest @TC12657
  Scenario: User search a text in google search box
    Given User wants to go google
    And Verify that user is on google home page
    When User enter a text on search box
    And click to search button
    Then title matches with search text

    @ScenarioOutlineExample
 Scenario Outline: User search an apple product in google search box
   Given User wants to go to Google
   When User enter a "<AppleProduct>" in search box
   And click to search button for product
   Examples:
   |AppleProduct |
   |Iphone 13 max|
   |mac pro 2022 |
   |Airpods      |

      Scenario: User search BMW models in google search box
        Given user wants to Google
        And User enter BMW product in search box
        |BMW Model |m5      |
        |Year      | 2022   |
        |Mileage   | 0      |
        And User click on search
        | m5 | 2022 | 0|
        |m10 |2010  |150000|
        |m20 |2030  |0     |












