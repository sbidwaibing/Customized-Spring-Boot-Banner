# DemoApplication

## Overview
This project, **DemoApplication**, is a simple Spring Boot application that includes a custom banner displayed during application startup. The custom banner welcomes users to the application and is powered by Spring Boot version 3.3.2.

## Custom Banner
Upon running the application, the following banner will be displayed in the console:

##############################################<br>
+-+-+-+-+-+-+-+ +-+-+ +-+-+-+<br>
|W|e|l|c|o|m|e| |t|o| |A|p|p|<br>
+-+-+-+-+-+-+-+ +-+-+ +-+-+-+<br>

Powered by Spring Boot 3.3.2<br>
##############################################<br>
Custom Banner Trial<br>
##############################################<br>


This banner serves as a welcoming message and indicates that the application is powered by Spring Boot 3.3.2.

## How to Run the Application

1. **Clone the repository:**
   ```bash
   [ git clone https://github.com/sbidwaibing/bannerDemo.git ]

2. **Navigate to the project directory:**
   ```bash
   [ cd DemoApplication ]

3. **Navigate to the project directory:**
   ```bash
   [ mvn clean install ]

4. **Run the application:**
   ```bash
   [ mvn spring-boot:run ]

4. **Test the application:**
   ```bash
   [ mvn test ]

## Tests
The project includes a test class com.developer.bannerDemo.BannerDemoApplicationTests. This class is used for testing the application's functionality.

## Requirements
Java 17 or higher
Maven 3.8.4 or higher
Spring Boot 3.3.2

## License
This project is licensed under the MIT License
