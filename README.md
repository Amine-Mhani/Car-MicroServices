# Car Microservices

This repository contains a set of microservices for managing car-related data. Each microservice is designed to handle specific functionalities related to cars, providing a modular and scalable architecture.

## Table of Contents

- [Introduction](#introduction)
- [Microservices](#microservices)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contribution](#contribution)

## Introduction

The Car Microservices project is developed to showcase the implementation of a microservices architecture for handling various aspects of car-related operations. It leverages the principles of modularity, scalability, and maintainability.

## Microservices

### 1. Eureka Server
- Description: Eureka service registry for service discovery.
- Technologies: Spring Boot, Java.

### 2. Gateway
- Description: API Gateway for routing requests to the appropriate services.
- Technologies: Spring Cloud Gateway, Java.

### 3. Client
- Description: Client service responsible for handling user interactions.
- Technologies: Spring Boot, Java, MySQL.

### 4. Voiture
- Description: Voiture service managing car-related operations.
- Technologies: Spring Boot, Java, MySQL.


## Getting Started

To get started with the Car Microservices project, follow these steps:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Amine-Mhani/Car-MicroServices.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd Car-MicroServices
   ```

3. **Start the Eureka Server:**
   ```bash
   cd Eureka-Server
   mvn spring-boot:run
   ```

4. **Start the Gateway:**
   ```bash
   cd Gateway
   mvn spring-boot:run
   ```

5. **Start the Client:**
   ```bash
   cd Client
   mvn spring-boot:run
   ```

6. **Start the Voiture Service:**
   ```bash
   cd Voiture
   mvn spring-boot:run
   ```

Now you should have all the necessary services up and running. You can then explore the APIs and functionalities provided by the Client and Voiture services.

Feel free to customize the above steps based on the actual setup and requirements of your project. Provide any additional details or commands that users need to know to successfully set up and run your microservices.

## Usage

1. After starting the services, visit the Eureka Server dashboard at http://localhost:8761 to ensure all services are registered.

2. Access the Gateway at http://localhost:8888 and use it to interact with the Client and Voiture services.

3. Explore the APIs and functionalities provided by the Client and Voiture services.

## Contribution

Contributions are welcome! If you find any issues or have improvements, please open an issue or create a pull request.
