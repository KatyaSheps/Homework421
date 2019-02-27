## Задача №1
### Универсальная форма ввода

В процессе разработки Android-программы в первую очередь мы работаем с пользовательским вводом. 
Один из типичных вариантов приминения пользовательского ввода это форма регистрации или подписка на рассылку.

**Задание:**

Нужно создать приложение, которое будет предлагать пользователю подписаться на рассылку, введя имя пользователя и электронную почту.
Таким образом, нужно:
* Установить заголовок окна в "Подписка"
* Создать в разметке экрана форму для ввода имени пользователя и пароля
* Создать Текстовое поле для вывода результата
* Создать кнопку "ОК", при нажатии на которую в текстовое поле будет попадать текст: "Подписка на рассылку успешно оформлена для пользователя <Имя пользователя из поля> на электронный адрес <Email из формы>"
* Создать кнопку "Очистить", которая будет очищать форму (оба поля ввода) и удалять текст из текстового поля с результатом



**Выполнение**

1. Добавить на форму элементы интерфейса для ввода текста - EditText
2. Под формой ввода добавить две кнопки, типа Button - "ОК", "Очистить"
3. Задать кнопкам имена (id) - как это сделать и для чего это нужно рассказывалось на лекции
4. Добавить элемент для вывода текста TextView
5. Задать для добавленных EditText и TextView элементов id
6. Используя ConstraintLayout расположить поле ввода в верхней части окна посередине
7. Все текстовые константы, необходимые по заданию вынести в файл ресурсов
8. Под кнопками расположить TextView
9. Добавить в коде обработчик нажатия кнопки "ОК"
10. Добавить в коде обработчик нажатия кнопки "Очистить"




**Результаты и сдача домашнего задания**

В результате должно получится приложение, содержащее  форму подписки на рассылку с работающими кнопками "ОК" и "Очистить".
Выполненное домашнее задание загрузить на GitHub.

Примерный вид экрана

![](https://i.imgur.com/QaBBnOk.png)