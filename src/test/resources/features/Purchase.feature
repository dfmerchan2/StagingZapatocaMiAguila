#Autor: Diego Fernando Merchan Jimenez

Feature: Carry out purchase of products
  As a user of the Zapatoca Homes page
  I want to buy different products
  To take them to my residence

  Background:
    Given that 'Diego' enters the Zapatoca Address page
    And he enters the username 'mariap9630@gmail.com' and password 'Test123456'
    Then he should see the welcome message 'Hola'

  Scenario Outline: Make purchase of different products
    When he adds 5 products from category '<category>' to the shopping cart
    Then he should see these products in the shopping cart
    Examples:
      | category   |
      | Jugueteria |
      | Fruver     |


