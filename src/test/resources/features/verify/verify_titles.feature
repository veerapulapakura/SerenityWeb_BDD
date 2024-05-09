Feature: Verification of titles under Homepage

  Scenario Outline: Verify the titles under Industry
    Given The user is on Lexisnexis homepage
    When  The  user chooses "Choose Your Industry"
    Then  The user should be able to see the below "<search_id>"

    Examples:
      | search_id |
      | Financial Services |
      | Insurance |
      | Life and Pensions |
      | Corporations and Non-Profits |

  Scenario: Verify the titles under Industry as a single test
    Given The user is on Lexisnexis homepage
    When  The  user chooses "Choose Your Industry"
    Then  The user should be able to verify all the titles

  Scenario: Verify the titles under Financial Services inside Industry
    Given  The user is on Lexisnexis homepage
    When   The  user chooses "Choose Your Industry"
    And    The  user chooses Financial Services
    Then   The user should be able to see all the tabs under Financial Services








