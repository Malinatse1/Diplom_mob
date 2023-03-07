# <img width="5%" title="Wikipedia" src="readme_resources/wiki_logo.jpg"> Дипломный проект по тестирования мобильного приложения [Wikipedia](https://github.com/wikimedia/apps-android-wikipedia/)

##  Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Atlassian Jira
- Уведомление в Telegram о результатах прогона тестов

## Технологии и инструменты

<p  align="left"

<code><img width="5%" title="IntelliJ IDEA" src="readme_resources/Idea.svg"></code>
<code><img width="5%" title="Java" src="readme_resources/Java.svg"></code>
<code><img width="5%" title="Selenoid" src="readme_resources/Selenoid.svg"></code>
<code><img width="5%" title="Gradle" src="readme_resources/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="readme_resources/JUnit5.svg"></code>
<code><img width="5%" title="GitHub" src="readme_resources/GitHub.svg"></code>
<code><img width="5%" title="Allure Report" src="readme_resources/Allure_Report.svg"></code>
<code><img width="5%" title="Jenkins" src="readme_resources/Jenkins.svg"></code>
<code><img width="5%" title="Telegram" src="readme_resources/Telegram.svg"></code>
<code><img width="5%" title="Allure_TO" src="readme_resources/Allure_TO.svg"></code>
<code><img width="5%" title="Android-studio" src="readme_resources/Android-studio.svg"></code>
<code><img width="5%" title="Browserstack" src="readme_resources/Browserstack.svg"></code>
</p>

## :heavy_check_mark: Тест кейсы

- Проверка поиска в приложении
- Проверка прохождения начальных экранов
- Проверка перехода на статью


##  Запуск тестов из терминала :computer:

1. Запуск с командной строки:

```gradle clean test =-Denv=browserstack```

```gradle clean test = -Denv=emulator```

```gradle clean test = -Denv=real```

2. Получение отчёта: 

```gradle allureServe```

3. Результат запуска сборки можно посмотреть в отчёте Allure.

 
##  Запуск тестов в Jenkins
1. Для запуска сборки необходимо открыть  <a target="_blank" href="https://jenkins.autotests.cloud/job/HW_21_mobile/">проект</a> . 
2. Указать значения параметров и нажать кнопку ```Собрать```.
3. Результат запуска сборки можно посмотреть в отчёте Allure.

![](/readme_resources/.png)

После завершения сборки результаты тестирования доступны в:
>- <code><strong>*Allure Report*</strong></code>
>- <code><strong>*Allure TestOps*</strong></code> - результаты загружаются туда и тест-кейсы могут автоматически обновляться в соответствии с последними изменениями в коде.

##  Отчет о результатах тестирования в Allure Report :bar_chart:
###  Основной Дашборд ###
Для перехода к просмотру отчета в разделе "История сборок" нажать значок "Allure Report", откроется страница с отчетом по прохождению.

![This is an image](/readme_resources/Allure_dashboa.png)

###  Группировка тестов по проверяемому функционалу ###

![This is an image](/readme_resources/Allure_sep%20.png)
##  Уведомления в Telegram с использованием бота

После завершения сборки, Вам будет отправлено уведомление в ```Telegram``` с отчетом о прохождении.

![This is an image](/readme_resources/Telegram_rport.png)

## <img width="4%" title="Allure TestOPS" src="readme_resources/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/18485)
### Основной дашборд

<p align="center">
  <img src="readme_resources/Allure_TO_dashboard.p" alt="dashboard" width="900">
</p>

### Список тестов с результатами прогона

<p align="center">
  <img src="readme_resources/Allure_TO_resus.png" alt="dashboard" width="900">
</p>

К каждому тесту в отчете прилагается видео.

На данном видео выполняется:

- Проверка перехода на статью


<p align="center">
  <img title="Browserstack Video" src="readme_resources/video-browserstack.gif">
</p>



