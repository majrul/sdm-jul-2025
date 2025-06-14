FROM maven
WORKDIR /app
COPY . .
RUN mvn compile
CMD mvn exec:java -Dexec.mainClass=com.cdac.training.App