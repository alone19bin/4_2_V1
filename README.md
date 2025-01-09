# Individuals API Microservice

## Описание проекта
Микросервис управления пользователями и физическими лицами с использованием Spring Boot.

## Технологический стек
- Java 17
- Spring Boot 3.1.5
- PostgreSQL
- Flyway
- Swagger/OpenAPI
- Lombok

## Требования
- JDK 17
- Maven
- PostgreSQL

## Настройка базы данных
1. Создайте базу данных:
```sql
CREATE DATABASE individuals_db;
CREATE USER postgres WITH PASSWORD 'postgres';
GRANT ALL PRIVILEGES ON DATABASE individuals_db TO postgres;

