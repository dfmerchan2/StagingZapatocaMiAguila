#Autor: Diego Fernando Merchan Jimenez

Feature: User registration on the Zapatoca Address page
  As a new user of the Zapatoca Address page
  I want to register on the page
  To make purchases and homes

  Background:
    Given that 'Diego' enters the Zapatoca Address page

  Scenario Outline: Register a new user on the Zapatoca Address page
    When the user '<userType>' enters the mandatory information for registration
    And add your location information
    Then he should see the registration successfully
    Examples:
      | userType |
      | Person   |
      | Company  |
      | Abroad   |