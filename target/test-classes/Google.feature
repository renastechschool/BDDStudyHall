Feature: Google search box verification

  @smoke1 @regressionTest @TC12657
  Scenario: User search a text in google search box
    Given User wants to go google
    And Verify that user is on google home page
    When User enter a text on search box
    And click to search button
    Then title matches with search text
















