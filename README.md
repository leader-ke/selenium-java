# Selenium Java Project

This project is a sample automation framework using **Selenium WebDriver**, **Java**, and **Maven**.

## 📦 Prerequisites

- Java 11+ (check with `java -version`)
- Maven 3+ (check with `mvn -version`)
- Git

## 🚀 Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/selenium-java.git
   cd selenium-java
2. Install dependencies:
   mvn clean install
4. Running Tests:
   mvn test
6. Project Structure:
   selenium-java/
 ├── src/
 │   ├── main/java/        # Application code (if any)
 │   └── test/java/        # Test classes
 ├── pom.xml               # Maven dependencies and build config
 └── .gitignore
7. Notes:
   Update pom.xml to add more dependencies if needed.
   Configure drivers (e.g., ChromeDriver) via pom.xml or system PATH.
