# Real-time Chat Application

## Overview

This is a real-time chat application built using Java, Spring Boot, and WebSockets. The application includes user authentication and authorization using Spring Security and integrates with Apache Kafka for message queuing. The front-end is implemented with a simple HTML, CSS, and JavaScript UI.

## Features

- Real-time messaging using WebSockets
- User authentication and authorization
- Integration with Apache Kafka for message queuing
- Simple and responsive chat interface

## Technologies Used

- **Java**: Programming language
- **Spring Boot**: Framework for building the application
- **Spring Security**: For authentication and authorization
- **Spring WebSocket**: For real-time communication
- **Apache Kafka**: Message broker
- **HTML/CSS/JavaScript**: Front-end technologies

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 17 or later
- Apache Kafka (or RabbitMQ if you prefer)
- Maven (for building the project)

## Setup

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/chat-application.git
cd chat-application
```

### 2. Configure Kafka

Ensure that Apache Kafka is running locally. If you haven’t installed Kafka, you can follow the [Apache Kafka Quickstart guide](https://kafka.apache.org/quickstart) for installation and setup.

### 3. Build the Project

Use Maven to build the project:

```bash
mvn clean install
```

### 4. Run the Application

You can run the Spring Boot application using Maven:

```bash
mvn spring-boot:run
```

Alternatively, you can build the JAR file and run it:

```bash
mvn package
java -jar target/chat-application-0.0.1-SNAPSHOT.jar
```

### 5. Access the Application

Open a web browser and navigate to `http://localhost:8080` to access the chat application.

## Application Structure

- **`src/main/java/com/example/chat/`**: Contains Java code for the application.
  - **`config/`**: Configuration classes for WebSocket, Security, and Kafka.
  - **`controller/`**: REST controllers for handling WebSocket messages.
  - **`model/`**: Data models used in the application.
  - **`service/`**: Service classes for business logic and Kafka integration.
  - **`ChatApplication.java`**: Main application class.
- **`src/main/resources/`**: Contains application configuration and static resources.
  - **`application.properties`**: Application configuration properties.
  - **`static/`**: Static files for the front-end.
    - **`css/`**: CSS files for styling.
    - **`js/`**: JavaScript files for front-end logic.
    - **`index.html`**: The main HTML file for the chat interface.
  - **`templates/`**: (Optional) Thymeleaf templates if needed.
- **`src/test/java/`**: Contains unit and integration tests.
- **`pom.xml`**: Maven configuration file with dependencies.

## Usage

1. **Connect**: Enter your username and click "Connect" to join the chat.
2. **Send Messages**: Type your message and click "Send" to broadcast it to all connected users.

## Troubleshooting

- **Kafka Issues**: Ensure Kafka is running and properly configured in `application.properties`.
- **Connection Issues**: Verify that WebSocket connection endpoints are correct and that your Spring Boot application is running.

## Contributing

Feel free to submit issues, enhancements, or pull requests. Contributions are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or feedback, please contact:
- **LinkedIn**: https://www.linkedin.com/in/abdulbasit24/
---

Feel free to customize the README further based on any additional details or specific instructions for your application.
