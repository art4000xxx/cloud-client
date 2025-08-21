# Cloud Client
Spring Boot клиент, подтягивающий конфигурацию от Config Server.

## Запуск
1. Убедитесь, что Config Server[](http://localhost:8888) запущен.
2. Склонируйте репозиторий.
3. Убедитесь, что Java 17 установлена.
4. Выполните:
   ```bash
   mvn clean install
   mvn spring-boot:run
Проверьте: curl http://localhost:8080/message

Конфигурация

Порт: 8080
Config Server: http://localhost:8888
Профиль: dev
