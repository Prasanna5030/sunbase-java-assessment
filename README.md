# Sunbase-java-assessment Application

This is a simple CRUD application built with Spring Boot and JSP for user management. The application allows users to register, login, and perform CRUD operations on user data.

## Features
- Implemented JWT User Based Authorization
- User Registration
- User Login
- Create, Read, Update, Delete (CRUD) Operations for Users

## Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- Java 21 or later
- Maven 3.6.3 or later

## Getting Started

Follow these instructions to set up and run the application on your local machine.

### 1. Clone the Repository

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/Prasanna5030/sunbase-java assessment.git

cd spring-boot-crud

mvn clean install

mvn spring-boot:run  (or)  java -jar target/sunbase-java-assessment-0.0.1-SNAPSHOT.jar


### IMPORTANT #####
Credentials to login to application :
email : sunbase@gmail.com
password : sunbase123

api end-points:
# list all users
http://localhost:8080/users

# edit user
http://localhost:8080/users/edit/{id}

# delete users
http://localhost:8080/users/delete/{id}
