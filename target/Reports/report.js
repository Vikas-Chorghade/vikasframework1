$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Addition.feature");
formatter.feature({
  "name": "This is first feature file tp perfrom Addition.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Pass two integer and verify the addition result",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have two numbers 20 and 20",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinations.cucumber.AdditionSteps.i_have_two_numbers_and(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We add the result",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinations.cucumber.AdditionSteps.we_add_the_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify addition  is 40",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinations.cucumber.AdditionSteps.verify_addition_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Multiplication.feature");
formatter.feature({
  "name": "This is second feature file to perform multiplication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Pass two integer and verify the multiplication result",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have two num 5 and 6",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinations.cucumber.MultiplicationSteps.i_have_two_num_and(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We multiply the result",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinations.cucumber.MultiplicationSteps.we_multiply_the_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify multiplication is 30",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinations.cucumber.MultiplicationSteps.verify_multiplication_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});