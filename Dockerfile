FROM maven:3.9-eclipse-temurin-17
COPY . /app
WORKDIR /app
RUN mvn clean package
CMD ["mvn", "exec:java", "-Dexec.mainClass="com.company.app.Main"]