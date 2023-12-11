FROM openjdk:19-jdk

WORKDIR /app

# Copy the JAR file from the target directory into the container at /app
COPY target/Voiture-0.0.1-SNAPSHOT.jar /app/

# Expose the port
EXPOSE 8089

# Run the application when the container launches
CMD ["java", "-jar", "Voiture-0.0.1-SNAPSHOT.jar"]