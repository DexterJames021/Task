# Stage 1: Build the application using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy pom and download dependencies first for better caching
COPY pom.xml .
RUN mvn dependency:go-offline

# Now copy the rest of the source
COPY src ./src

# Build the Spring Boot application
RUN mvn clean package -DskipTests

# Stage 2: Create minimal image with just the JAR
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /app/target/DBank-0.0.1-SNAPSHOT.jar app.jar

# Expose the port Spring Boot runs on
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
