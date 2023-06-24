#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
 # I want to use this template for my feature file

  ##@tag1
  ##Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    
    Feature: Rediff Test
    
    Scenario: Login with Valid Credentials
    Given User is on homepage
    Then click on signin
    Then user enters emailid
    And user enters password
    Then click on login
    