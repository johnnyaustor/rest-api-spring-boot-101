# Rest API Spring Boot 101

## Required

name | link
--- | ---
JDK 11 | [link download JDK11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
MAVEN | [link download maven](https://maven.apache.org/download.cgi)


## Initial Project

kunjungi web [start.spring.io](https://start.spring.io) untuk membuat project baru,
atau bisa menggunakan IDE IntelliJIdea Ultimate

## Pom Dependency

- Spring Web
- Spring Data JPA
- H2 Database / MySQL / PostgreSQL
- Lombok

## Running Script

```bash
$ mvn clean install

$ mvn spring-boot:run
```

## Branch

- Master Initial Project
- 100Config Init Configuration
- 101Post Init Create Data
- 102GetList Init Get List
- 103GetDetail Init Get Detail
- 104Patch Init Update Data
- 105Delete Init Delete Data

## Properties
```properties
spring.datasource.url=jdbc:h2:mem:data
# or
# spring.datasource.url=jdbc:h2:file:./data/data
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
```