# api-framework

## Requirements

### Java

This project is configured to use Java 21. Ensure that you have Java 21 installed and set up in your development environment.
If you don't have the appropriate version of Java 21, please download and install it from [here](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).

### Build Tool

This project is configured to use Gradle build automation tool. Ensure that you have Gradle 8.5 installed and set up in your development environment.

## How to run tests

1. Set the environment variable SPRING_PROFILES_ACTIVE. Depending on an env against which a test should run,
   the value can be: prod or dev or stage
2. Run any test/class via `Run` option

## How to build the report

1. Navigate to the project root folder in the Terminal
2. Run the following command in the terminal:
  ```bash
   allure serve build/allure-results
   ```

