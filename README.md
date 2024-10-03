[![Continuos Integration With Github](https://github.com/herlandio/microservicos-springboot/actions/workflows/docker-publish.yml/badge.svg)](https://github.com/herlandio/microservicos-springboot/actions/workflows/docker-publish.yml)

# Microserviços com Spring Boot

## Os microserviços tem:

- Spring Boot 3
- Spring Cloud
- Java 17
- Netflix Eureka
- OpenApi/Swagger
- Zipkin + io.micrometer
- RabbitMQ
- JPA
- Mysql
- Resilience4j
- OpenFeign
- Flyway
- Docker

Para comecar

1. Execute `mvn spring-boot:build-image -DskipTests` nas pastas api-gateway e naming-server
2. Depois execute `mvn clean package -DskipTests` nas pastas book-service e cambio-service
3. Por fim execute `docker compose up -d`
