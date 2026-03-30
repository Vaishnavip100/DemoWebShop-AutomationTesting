Demo Web Shop Automation
📌 Project Overview

This project contains end-to-end test automation framework for the Demo Web Shop application.
It is built using Selenium, TestNG, Java, and follows the Page Object Model (POM) design pattern.

The framework automates key user workflows such as registration, login, product selection, cart management, checkout, and invoice download.


🛠️ Tech Stack
Java
Selenium WebDriver
TestNG
Maven
Apache POI (Excel Data-Driven Testing)
AutoIT (File handling for PDF download)


🧱 Framework Design

The project follows Page Object Model (POM) for better maintainability and reusability.

📁 Project Structure
src/main/java
   ├── pages        → Page classes (UI actions)
   └── utils        → Reusable utilities (Excel, Screenshot)

src/test/java
   ├── base         → Base setup (WebDriver initialization)
   └── tests        → Test classes

src/test/resources
   └── testdata     → Excel files for data-driven testing


📸 Screenshots

Screenshots are captured during execution and stored in:

/screenshots
