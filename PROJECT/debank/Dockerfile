FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy everything and build
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]