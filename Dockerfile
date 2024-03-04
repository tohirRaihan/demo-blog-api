FROM eclipse-temurin:17

LABEL mentainer="tohir.raihan@gmail.com"

WORKDIR /app

COPY target/blog-0.0.1-SNAPSHOT.jar /app/blog.jar

ENTRYPOINT ["java", "-jar", "blog.jar"]