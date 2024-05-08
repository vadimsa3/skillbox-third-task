# базовый образ, содержащий Java 18
FROM openjdk:18-oracle

# рабочая директория приложения внутри контейнера
WORKDIR /app

# копирование JAR-файла (созданого gradle/build/bootJar) приложения в контейнер и переименование его
COPY build/libs/skillbox-third-task-0.0.1-SNAPSHOT.jar app.jar

## определение переменной среды, по умолчанию будет запуск со свойством из properties - true
#ENV CREATE_ON_STARTUP=true

# команда для запуска приложения
CMD ["java", "-jar", "app.jar"]

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# необходимо создать докер файл
# сначала jar из gradle
# потом из терминала docker build -t название
#https://www.youtube.com/watch?v=x9SalIycd1Y