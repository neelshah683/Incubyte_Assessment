# Library Management System (Assessment)

A simple Java-based Library Management System that allows users to perform basic operations such as adding books, borrowing books, returning books, and viewing available books. The application is developed using Maven and tested with JUnit 5 also implemented with Test Driven Development (TDD).

## Table of Contents

- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [IDE Structure](#ide-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Running the tests](#running-the-tests)
- [Test Results](#test-results)
- [Built With](#built-with)
- [Authors](#authors)

## Getting Started

Follow the instructions below to set up the project on your local machine for development and testing purposes.

## Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - Version 8 or higher
- [Apache Maven](https://maven.apache.org/install.html)

## IDE Structure

```plaintext
LibraryManagementSystem/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               ├── Library.java
│   │               └── Book.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── LibraryTest.java
└── pom.xml
```

## Installation

1. Clone the repository:

   ```
   git clone [https://github.com/neelshah683/Incubyte_Assessment.git]
   ```

2. Navigate to the project directory:

   ```
   cd library-management-system

   ```

3. Compile the project and resolve dependencies:
   ```
   mvn clean install

   ```

## Usage

1. Build the project:

   ```
    mvn package
   ```

2. Build the project:

   ```
    java -cp target/library-management-system-1.0-SNAPSHOT.jar com.example.Main

   ```

## Running the tests

Unit tests are provided to ensure the reliability of the navigation system. To run these tests:

`  mvn test
 `
 
## Test Results

![image](https://github.com/user-attachments/assets/60c35fce-12f6-48c8-b9df-4bdc5fccb715)

![image](https://github.com/user-attachments/assets/668871ac-f664-4817-b59b-180a96ffbb16)


## Built With

- [Java](https://www.oracle.com/java/) - The programming language used
- [Maven](https://maven.apache.org/) - Dependency management and build tool
- [JUnit 5](https://junit.org/junit5/) - Testing framework

## Authors

- [Neel Shah](https://github.com/neelshah683/) - L.D. College Of Engineering
