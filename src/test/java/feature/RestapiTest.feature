Feature: Restapi Test
  # test api test

  Scenario Outline: Rest API Get Employee Request
    Given I get request for employee id "<empId>"
    Then I should get response code as "<responseCode>"

    Examples:
      | empId | responseCode |
      | 15983 | 200          |
      | 1     | 200          |


  Scenario: Data table example
    Given I get request for employee id "15983"
    Then I should be able to see all the details in response
      | Fields          | Values     |
      | employee_name   | PTest54321 |
      | employee_salary | 12000      |
      | employee_age    | 23         |


