# Demo Web Shop - Wishlist Automation Test

Automated UI test for [demowebshop.tricentis.com](https://demowebshop.tricentis.com/), built with Selenium WebDriver and TestNG, following the Page Object Model (POM) design pattern with Listeners and reporting.

## Overview

This project automates the login and wishlist flow on the Tricentis Demo Web Shop, verifying that a user can log in, add a Jewelry product to the wishlist, and remove it successfully.

## Tech Stack

- **Java** – programming language
- **Selenium WebDriver** – browser automation
- **TestNG** – test framework and execution
- **Page Object Model (POM)** – design pattern used to structure the framework
- **TestNG Listeners** – for logging and reporting test execution events
- **ExtentReports** – test reporting and HTML report generation
- **Maven** – dependency management and build tool

## Project Structure

```
src
 └── test
      └── java
           ├── tests/          # Test classes
           ├── pages/          # Page Object classes (Page Object Model)
           ├── listeners/      # TestNG Listener classes
           └── utils/          # Utility/helper classes
pom.xml                        # Maven dependencies and build configuration
```

## Prerequisites

Before running the tests, make sure you have:

- Java JDK installed (version 17+ recommended)
- Maven installed
- A supported browser (Chrome/Firefox) with matching WebDriver

## How to Run the Tests

1. Clone the repository:
   ```bash
   git clone https://github.com/aminaa20580/demoshop_tests.git
   cd demoshop_tests
   ```

2. Run the tests using Maven:
   ```bash
   mvn clean test
   ```

3. Open the generated ExtentReports HTML report (path depends on your configuration, e.g.):
   ```
   test-output/ExtentReport.html
   ```

## Test Scenario Covered

1. Open the Demo Web Shop website
2. Log in with valid credentials
3. Assert that the **Logout** button appears after successful login
4. Navigate to the **Jewelry** menu
5. Open the **Black & White Diamond Heart** product page
6. Add the product to the **Wishlist**
7. Assert that the item was added successfully
8. Remove the item from the wishlist and update it
9. Assert that the wishlist is empty

## Reporting

Test execution results are captured using **ExtentReports**, generating a clear, visual HTML report showing pass/fail status, execution time, and logs for each test step. TestNG **Listeners** are used to hook into test lifecycle events (start, success, failure) for logging and reporting purposes.

## Notes

This project is part of a personal learning exercise to practice:
- Selenium WebDriver fundamentals
- Page Object Model (POM) design pattern
- TestNG Listeners
- ExtentReports integration
- Clean project setup with Maven

---

Feel free to explore, fork, or suggest improvements!
