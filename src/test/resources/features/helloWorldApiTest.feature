Feature: To test the hello world api

  Scenario: Testing the api
    When the hello world api is invoked
    Then it should return 200 response code
    And  it should say "Hello World"