Demo Web Shop - Wishlist Automation Test

Automated UI test for demowebshop.tricentis.com, built with Selenium WebDriver and TestNG, following the Page Object Model (POM) design pattern with Listeners and reporting.

Overview

This project automates the login and wishlist flow on the Tricentis Demo Web Shop, verifying that a user can log in, add a Jewelry product to the wishlist, and remove it successfully.

Tech Stack
Java – programming language
Selenium WebDriver – browser automation
TestNG – test framework and execution
Page Object Model (POM) – design pattern used to structure the framework
TestNG Listeners – for logging and reporting test execution events
ExtentReports – test reporting and HTML report generation
Maven – dependency management and build tool
Project Structure
src
 └── test
      └── java
           ├── tests/          # Test classes
           ├── pages/          # Page Object classes (Page Object Model)
           ├── listeners/      # TestNG Listener classes
           └── utils/          # Utility/helper classes
pom.xml                        # Maven dependencies and build configuration
Prerequisites

Before running the tests, make sure you have:

Java JDK installed (version 17+ recommended)
Maven installed
A supported browser (Chrome/Firefox) with matching WebDriver
How to Run the Tests
Clone the repository:
bash
   git clone https://github.com/aminaa20580/demoshop_tests.git
   cd demoshop_tests
Run the tests using Maven:
bash
   mvn clean test
Open the generated ExtentReports HTML report (path depends on your configuration, e.g.):
   test-output/ExtentReport.html
Test Scenario Covered
Open the Demo Web Shop website
Log in with valid credentials
Assert that the Logout button appears after successful login
Navigate to the Jewelry menu
Open the Black & White Diamond Heart product page
Add the product to the Wishlist
Assert that the item was added successfully
Remove the item from the wishlist and update it
Assert that the wishlist is empty
