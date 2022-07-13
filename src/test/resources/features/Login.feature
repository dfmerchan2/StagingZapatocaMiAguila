#Autor: Diego Fernando Merchan Jimenez

Feature: Login to the Domicilios Zapatoca page
  As a user of the Zapatoca address platform
  I want to authenticate
  To purchase products

  Scenario: Successful authentication at Domicilios Zapatoca
    Given that 'Diego' enters the Zapatoca Address page
    When he enters the username 'mariap9630@gmail.com' and password 'Test123456'
    Then he should see the welcome message 'Hola'