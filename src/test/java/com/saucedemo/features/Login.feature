Feature: Login
  As a user
  I want to be able to login successfully
  So I can access my account

  Background: Access the Sauce Demo homepage
    Given I navigate to the Sauce Labs Homepage

  Scenario Outline: Login Successfully
    When I enter the credentials "<Username>" and "<Password>"
    Then I should be logged in successfully

    Examples:
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario: Login failed
    When I enter the Username "problem_user"
    And I enter the Password "secret_ketchup"
    Then When I login I should get an error message