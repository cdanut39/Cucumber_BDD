@SortByAvailability
Feature: Order by availability

  @Sort_specific
  Scenario: Check radio button
    Given user is logged in
    And user search for "sanie"
    When user choose category no 3 from list and a page with corresponding results should be displayed
      | In Stoc | Promotii | Noutati | Lichidari Stoc |


  @Sort_all
  Scenario: Check radio button
    Given user is logged in
    And user search for "sanie"
    When user choose a category from list then a page with corresponding results should be displayed
      | In Stoc | Promotii | aNoutati | Lichidari Stoc |