# Demo Web Shop Automation

## 📌 Project Overview

This project contains an end-to-end test automation framework for the Demo Web Shop application.
It is built using **Selenium, TestNG, Java**, and follows the **Page Object Model (POM)** design pattern.

The framework automates:

* Registration
* Login
* Product selection
* Cart management
* Checkout
* Invoice download

---

## 🛠️ Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Apache POI (Excel Data-Driven Testing)
* AutoIT (PDF handling)

---

## 🧱 Framework Design

The project follows **Page Object Model (POM)** for better maintainability and reusability.

---

## 📁 Project Structure

```
src/main/java
   ├── pages        → Page classes (UI actions)
   └── utils        → Reusable utilities (Excel, Screenshot)

src/test/java
   ├── base         → WebDriver setup
   └── tests        → Test classes

src/test/resources
   └── testdata     → Excel files for data-driven testing
```

---

## 📸 Screenshots

Screenshots are captured during execution and stored in:

```
/screenshots
```

---

## 🚀 How to Run

1. Clone the repository:

```
git clone https://github.com/YOUR-USERNAME/DemoWebShop-AutomationTesting.git
```

2. Run using Maven:

```
mvn test
```

---

## 👩‍💻 Author

Vaishnavi
