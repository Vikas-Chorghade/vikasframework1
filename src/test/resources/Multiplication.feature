Feature: This is second feature file to perform multiplication
#Background: Firebox  browser is opened
Given Chrome browser is opened

@smoke
Scenario: Pass two integer and verify the multiplication result

Given I have two num 5 and 6
When We multiply the result
Then Verify multiplication is 30  

