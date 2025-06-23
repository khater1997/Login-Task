# Login-Task
Task-Project is a UI automation testing project designed using Java, Selenium WebDriver, Cucumber (BDD), and TestNG. It follows the Page Object Model (POM) design pattern for clean and maintainable code, supporting scalable test automation.

The project automates testing of login functionality with multiple credential combinations to validate both success and error scenarios.
## ⚙️ Technologies Used
- Java 21
- Maven
- Selenium WebDriver 4.23.0
- Cucumber 7.18.1 (Java & TestNG)
- WebDriverManager 5.9.1
- TestNG

## 📁 Project Structure
```
Task-Project/
├── src/
│   ├── main/
│   │   └── resources/
│   │       └── features/
│   │           └── login.feature
│   └── test/
│       └── java/
│           └── Org/Example/
│               ├── pages/       # Page Objects (P01_loginPage.java)
│               ├── stepDefs/    # Step Definitions & Hooks
│               └── testRunner/  # TestNG Runner
├── pom.xml      # Maven build configuration
```
## 📜 Feature File Example
gherkin
@smoke
Feature: Login Functionality
  Scenario Outline: Login with different credentials
    Given User open the login page
    When User enter username "<username>" and password "<password>"
    And User click the login button
    Then User should see "<result>"
    Examples:
      | username    | password    | result  |
      | validUser   | validPass   | success |
      | invalidUser | validPass   | error   |
      | validUser   | invalidPass | error   |
      |             |             | error   |
## 🚀 Installation & Setup
### 1️⃣ Clone the Repository
git clone https://github.com/Khater1997/Login-Task.git
cd Login-Task
### 2️⃣ Install Dependencies
mvn clean install
### 3️⃣ WebDriver Setup
No manual download required. Browser drivers are managed automatically by WebDriverManager.
### ▶️ Running Tests
Run all scenarios:
mvn test
Run specific tag (e.g., @smoke):
mvn test -Dcucumber.filter.tags="@smoke"
## 📂 Reports
After execution, test reports are generated in the target/ directory:
- target/cucumber.html – HTML Report
- target/cucumber.json – JSON Report
- target/cukes.xml – JUnit XML Report
- target/rerun.txt – Rerun failed scenarios list

## ✅ Example Components Breakdown
### Hooks (Hooks.java)
- Sets up ChromeDriver before each test
- Navigates to base URL (https://www.example.com/)
- Closes the browser after tests
### Page Object (P01_loginPage.java)
- Handles all interactions with the Login page elements
### Step Definitions (D01_loginStepDefs.java)
- Maps Gherkin steps to Java code actions
- Validates correct behavior for success and error login scenarios

