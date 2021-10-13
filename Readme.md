#Introduction
This is an example of a mobile automation that uses Serenity as a framework, Appium and Java programming.

# Getting Started
The application you need to install is at: https://github.com/saucelabs/sample-app-mobile/releases

Remember to change the capabilities of your mobile device in serenity.properties

# Build and Test
To run the complete project use the command:
`` ''
  gradle test
`` ''
To run a specific runner:
 
`` `` gradle clean test -Dtest.single = MyRunner `` ''
`` `` gradle clean test -Prunner = MyRunner `` ''
To run different runners separating them by commas:

`` `` gradle clean test -Prunner = PrimerRunner, SegundoRunner `` ''

To Generate the test evidence:
 
gradle aggregate

Although the project by itself generates the evidence automatically once the execution is finished.

# Execution commands example:
`` `` gradle clean test -Dtest.single = LoginRunner aggregate `` ''
