Feature: Login test for OrangeHRM Application

  Background: I am on the Login page
  Scenario:
    Given Launch the Application
    When  Given the username and password (username: "Admin", password: "admin123")
    And Click on login button
    Then User should be able to see admin module
    And User should be able to see the dashboard or home page
