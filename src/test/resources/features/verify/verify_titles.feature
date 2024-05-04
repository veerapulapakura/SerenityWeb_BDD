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

  Scenario Outline: Verify the titles under Financial Services inside Industry
    Given  The user is on Lexisnexis homepage
    When   The  user chooses "Choose Your Industry"
    And    The  user chooses Financial Services
    Then   The user should be able to see the below "<search_id>"

    Examples:
      | search_id |
      | Financial Crime Compliance |
      | Customer Data Management |
      | Collections & Recovery |
      | Risk Orchestration |
      | Fraud and Identity Management |
      | Credit Risk Assessment |
      | Investigations and Due Diligence |






