Feature: Creating new account for new employee
  Check the information provided by the new employee and create new account for him/her

  Background:
    the current user has the appropriate permission to create new account

  Scenario: creating new account successfully
    Given the account with the phone number "0777888999" doesn't exist in the system
      And the account with the email "tony_stark@gmail.com" doesn't exist in the system
    When user uses "0777888999" as the phone number for the new account
      And user uses "tony_stark@gmail.com" as the email for the new account
      And user uses "111!StrongPassword!999"
      And user creates new account
    Then user is notified that the new account is created successfully

  Scenario Outline: creating new account using malformed or already existent phone number
    Given the account with the phone number "0123456789" already exists in the system
    When user uses "<phoneNumber>" as phone number
      And user creates new account
    Then user is notified that <result>

  Examples:
    | phoneNumber            | result                                   |
    |                        | phone number cannot be left blank        |
    | nguyen_van_a@gmail.com | phone number can only contains number    |
    | 0123456789             | the given phone number is already exists |

  Scenario Outline: creating new account using malformed or already existent email
    Given the account with the email "nguyen_van_a@gmail.com" already exists in the system
    When user uses "<email>" as email
      And user creates new account
    Then user is notified that <result>

  Examples:
    | email                  | result                                            |
    |                        | email cannot be left blank                        |
    | 0123456789             | email has to be in the form "my_name@example.com" |
    | nguyen_van_a@gmail.com | the given email is already exists                 |

  Scenario Outline: creating new account using weak password
    When user uses "0777888999" as phone number
      And user uses "tony_stark@gmail.com" as email
      And user uses "<password>"
      And user creates new account
    Then user is notified that <result>

  Examples:
    | password   | result                                           |
    | 0123       | password is too short (min. 8 characters)        |
    | 01234567a! | password doesn't contain any lowercase character |
    | 01234567A! | password doesn't contain any uppercase character |
    | 01234567Aa | password doesn't contain any special character   |
