<h1 align="center">УЧЕТ СТУДЕНТОВ</h1>
<h2 align="center">Консольное приложение (со стартером Spring Shell) с возможностью добавлять студента в базу, удалять студента из базы, получать список всех студентов, очищать базу студентов.</h2>

## **СОДЕРЖАНИЕ:** ##
* [ПОДГОТОВКА К ЗАПУСКУ](#инструкция_по_запуску)
* [ЗАПУСК И РАБОТА ПРИЛОЖЕНИЯ](#запуск_и_работа)

<a name="инструкция_по_запуску"></a>
## **ИНСТРУКЦИЯ ПО ЗАПУСКУ** ##

**1. Проверьте установлены-ли следующие компоненты и установите при их отсутствии:**
* Java Development Kit (JDK) версии 17 или выше.
* Gradle - система автоматической сборки проектов.
* Lombok - библиотека для исключения лишнего кода.

**2. Клонируйте репозиторий.**
* Клонируйте репозиторий с кодом проекта на свой локальный компьютер:  
  git clone https://github.com/vadimsa3/skillbox-second-task/tree/master/second-task

* Проверьте наличие зависимостей в файле _build.gradle.kts_:

  _dependencies {  
  implementation("org.springframework.shell:spring-shell-starter")  
  compileOnly("org.projectlombok:lombok")  
  annotationProcessor("org.projectlombok:lombok")  
  }_

<a name="запуск_и_работа"></a>
## **ЗАПУСК И РАБОТА ПРИЛОЖЕНИЯ** ##

* При старте приложения будут созданы два студента и помещены в список.
  Отключатить эту функцию возможно в application.properties, изменив статус _true_ на _false_.  
  ![Изображение](https://github.com/vadimsa3/skillbox-second-task/blob/master/second-task/src/main/resources/raw/start-create.jpg "Создание студентов по умолчанию")

1. Запустите приложение посредством IntelliJ IDEA.
2. Из командной строки, командой help можно получит перечень доступных приложению команд.
   ![Изображение](https://github.com/vadimsa3/skillbox-second-task/blob/master/second-task/src/main/resources/raw/list-commands.jpg "Доступные команды")

3. Следуйте доступным командам.

    * команда _delete-student_ - удаление студента из перечня по его id  
      _(пример: shell:>shell:>delete-student 1,_
      результат: _Student deleted: 1)_

    * команда _get-student_ - получение студента из списка по его id  
      _(пример: shell:>get-student 2,
      результат: _Student 2 - Petrov Andrey, age: 17)__

    * команда _add-student_ - добавление в список нового студента  
      _(пример: shell:>add-student Ivanov Ivan 25,
      результат: _Student added: Student 3 - Ivan Ivanov, age: 25)__

    * команда _view-students_ - получение списка студентов  
      _(пример: shell:>view-students,_
      _результат:_ _Student 1 - Ivanov Ivan, age: 18 Student 2 - Petrov Andrey, age: 17)_

    * команда _clear-students_ - очистка списка студентов  
      _(пример: shell:>clear-students,_
      _результат:_ _The list of students has been cleared)_

    * команда _exit_ - завершение работы программы

![Изображение](https://github.com/vadimsa3/skillbox-second-task/blob/master/second-task/src/main/resources/raw/docker.png)
**ЗАПУСК ПРИЛОЖЕНИЯ ЧЕРЕЗ DOCKER**
* Проверьте, установлен-ли у вас Docker (введите в терминале: docker version).
* Запустите образ приложения (введите в терминале: docker run -it skillbox-second-task).