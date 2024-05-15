<h1 align="center">СПИСОК КОНТАКТОВ</h1>
<h2 align="center">Консольное приложение с интерфейсом, реализованным с помощью Thymeleaf, 
обработка запросов выполняется через контроллеры Spring MVC. Возможности приложения: вывод всех контактов в таблице
(со всеми полями сущности - контакта); добавление нового контакта через форму (ID не добавляется через UI);
редактирование имеющегося контакта через форму (ID не меняется); удаление конкретного контакта через кнопку
в списке контактов.
</h2>

## **СОДЕРЖАНИЕ:** ##
* [ПОДГОТОВКА К ЗАПУСКУ](#инструкция_по_запуску)
* [ЗАПУСК И РАБОТА ПРИЛОЖЕНИЯ](#запуск_и_работа)

<a name="инструкция_по_запуску"></a>
## **ИНСТРУКЦИЯ ПО ЗАПУСКУ** ##

**1. Проверьте установлены-ли следующие компоненты и установите при их отсутствии:**
* Java Development Kit (JDK) версии 17 или выше.
* Gradle - система автоматической сборки проектов.
* Docker — ПО для автоматизации развёртывания и управления приложениями.

**2. Клонируйте репозиторий.**
* Клонируйте репозиторий с кодом проекта на свой локальный компьютер:  
  git clone https://github.com/vadimsa3/skillbox-third-task.git

* Проверьте наличие зависимостей в файле _build.gradle.kts_:

**Проверьте подключение зависимостей в build.gradle.kts:**
* Thymeleaf - механизм шаблонов.
* Starter-web - стартер подтянет в проект все библиотеки, необходимые для разработки Spring MVC-приложений.
* Starter-data-jdbc - стартер для подключения к реляционным базам данных (доступ к данным через JdbcTemplate).
* Postgresql - драйвер для подключения к базе данных.
* Lombok - библиотека для исключения лишнего кода.

_Пример:_
_dependencies {
implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
implementation("org.springframework.boot:spring-boot-starter-web")
implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
runtimeOnly("org.postgresql:postgresql")
compileOnly("org.projectlombok:lombok")
annotationProcessor("org.projectlombok:lombok")
testImplementation("org.springframework.boot:spring-boot-starter-test")
}_

<a name="запуск_и_работа"></a>
## **ЗАПУСК И РАБОТА ПРИЛОЖЕНИЯ** ##

* Запустите приложение посредством IntelliJ IDEA.
* 
* 
* 
* 

1. Запустите приложение посредством IntelliJ IDEA.
2. Из командной строки, командой help можно получит перечень доступных приложению команд.
   ![Изображение](https://github.com/vadimsa3/skillbox-second-task/blob/master/second-task/src/main/resources/raw/list-commands.jpg "Доступные команды")

3. Доступные команды, обрабатываемые приложением:
   * вывод всех контактов из базы;
   * добавление нового контакта в базу через форму;
   * редактирование имеющегося контакта через форму;
   * удаление выбраного контакта кнопкой.

![Изображение](https://github.com/vadimsa3/skillbox-second-task/blob/master/second-task/src/main/resources/raw/docker.png)
**ЗАПУСК ПРИЛОЖЕНИЯ ЧЕРЕЗ DOCKER**
* Проверьте, установлен-ли у вас Docker (введите в терминале: docker version).
* Запускаем образ приложения (введите в терминале: docker run -it skillbox-third-task).
* Запускаем docker-compose.yml (введите в терминале: docker-compose up), который создаст контейнер из образа postgres версии 12.3.
* По умолчанию указаны следующие настройки в docker-compose:
  _открываем локальный порт 5432 для возможности подключения к БД по порту 5432;
  при старте контейнера создается БД с именем contacts и USER = postgres, PASSWORD = postgres;
  при старте контейнера выполняется файл init.sql (для сохранения данных после закрытия контейнера),
  создается схема contacts_schema, создается таблица contacts в схеме contacts_schema (с полями id, first_name, last_name, email, phone)._

