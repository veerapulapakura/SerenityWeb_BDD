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







