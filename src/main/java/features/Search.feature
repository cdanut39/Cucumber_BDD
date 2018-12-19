#Feature: Search functionality
#
#  @SearchOneProduct
#  Scenario: Search a valid product
#    Given user is logged in
#    When user search for "samsung s7"
#    Then a page with "Samsung Galaxy S7" is displayed

Feature: Search functionality

  @SearchMultipleProducts
  Scenario Outline: Search a valid product
    Given user is logged in
    When user search for "<product>"
    Then a page with "<category>" is displayed

    Examples:
      | product | category |
      | pirelli | Anvelopa |
      | nokia   | Telefon  |