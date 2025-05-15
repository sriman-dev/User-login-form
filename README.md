# User Login Form

This project provides a basic user registration form with database interaction using Java Servlets and JSP. It allows users to register by providing their name, email, and password, which are then stored in a MySQL database.

## Features and Functionality

*   **User Registration:** Allows users to create new accounts by providing their name, email, and password.
*   **Data Persistence:** Stores user registration information in a MySQL database.
*   **Simple UI:** Provides a basic HTML form for user input.
*   **Database Connection Pooling:** Utilizes a basic connection pooling mechanism for database interaction.

## Technology Stack

*   **Java:** The core programming language for the backend logic.
*   **JSP (JavaServer Pages):** Used for creating dynamic web pages.
*   **Servlets:** Used for handling HTTP requests and responses.
*   **MySQL:** The relational database used to store user data.
*   **JDBC (Java Database Connectivity):** Used to connect to and interact with the MySQL database.
*   **HTML:**  Used for creating the user interface.

## Prerequisites

Before you begin, ensure you have the following installed and configured:

*   **Java Development Kit (JDK):**  Version 8 or higher.
*   **MySQL:**  A running instance of MySQL server.
*   **MySQL Connector/J:** JDBC driver for connecting to MySQL.  Make sure to add this to your project's classpath.
*   **Servlet Container (e.g., Tomcat):** A servlet container to deploy and run the web application.

## Installation Instructions

1.  **Clone the Repository:**

    ```bash
    git clone https://github.com/sriman-dev/User-login-form.git
    cd User-login-form
    ```

2.  **Database Setup:**

    *   Create a database named `sridb` in your MySQL server:

        ```sql
        CREATE DATABASE sridb;
        USE sridb;
        CREATE TABLE user (
            uname VARCHAR(255),
            uemail VARCHAR(255),
            upass VARCHAR(255)
        );
        ```

    *   Update the database credentials in `src/main/java/Register2/provider.java`:

        ```java
        package Register2;

        public interface provider {
            String DRIVER="com.mysql.jdbc.Driver";
            String CONNECTION_URL="jdbc:mysql://localhost:3306/sridb";
            String USERNAME="root";
            String PASSWORD="Sriman@1042";
        }
        ```

        **Important:**  Replace `"root"` and `"Sriman@1042"` with your actual MySQL username and password.  Also note that `com.mysql.jdbc.Driver` is for older versions of MySQL Connector/J. For newer versions, you might need to use `com.mysql.cj.jdbc.Driver`.

3.  **Build the Project:**

    *   This project is likely configured for a specific IDE or build tool (like Maven or Gradle) though none is specified in this repo. Assuming it is configured for standard IDE build:

    * Open the project in your IDE (Eclipse, IntelliJ, etc.).
    * Add the MySQL Connector/J JAR file to the project's classpath.
    * Build the project.

4.  **Deployment:**

    *   Create a WAR (Web Application Archive) file from the project.  This is usually done through your IDE's build process, or using a build tool like Maven/Gradle if they are configured.
    *   Deploy the WAR file to your Tomcat server by copying it to the `webapps` directory of your Tomcat installation.

## Usage Guide

1.  **Access the Application:**

    *   Open your web browser and navigate to `http://localhost:8080/User-login-form/NewFile.html` (or the appropriate URL based on your Tomcat configuration and WAR file name).

2.  **Registration:**

    *   Fill out the registration form with your name, email, and password.
    *   Click the "register" button.

3.  **Data Storage:**

    *   The registration information will be stored in the `user` table in the `sridb` database.

## API Documentation

This project does not expose any external APIs.  It primarily functions as a web application with a user interface.

## Contributing Guidelines

Contributions are welcome! To contribute to this project, follow these steps:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes and commit them with clear, concise commit messages.
4.  Submit a pull request to the `main` branch.

## License Information

No license information is specified in this repository.  All rights are reserved unless otherwise specified.

## Contact/Support Information

For questions or support, please contact the repository owner through GitHub.
```
