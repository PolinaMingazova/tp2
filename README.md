# ТЗ2

[![Build status](https://github.com/PolinaMingazova/tp2/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/PolinaMingazova/tp2/actions/workflows/maven.yml)

## Условие

Данная программа реализует 4 операции с числами из файлв: нахождение минимума, максимума, суммы и умножения. В программе есть 5 функций: преобразование файла в список чисел *getList()*, нахождение минимума *min*, нахождение максимума *max()*, нахождение суммы *sum()*, нахождение произведения *mult()*. Также в программе есть 9 тестов, 4 из которых проверяют работоспособность функций операций, другие 4 замеряют время операций и последний выдает ошибку при слишком долгом выполнении программы (более 200 мс)

## Запуск тестов

Тесты запускаются автоматически после каждого коммита. Также можно запустить тесты вручную, перейдя в Actions и нажав *Java CI with Maven*, после чего появится уведомление о существовании триггера и кнопка *Run workflow*, после нажатия на которую запустятся все тесты.

## График зависимости для функции *min*

На данном графике представлена зависимость времени выполнения функции минимума от количества чисел в файле. Она линейная (асимптотика O(n)), причем разбита на два куска: вначале угол прямой менее острый, то есть вначале время увеличивается с большей (причем постоянно) скоростью, чем потом. Это связано с тем, что вначале время на функции, мало зависящие от количества чисел, например, на компиляцию и запуск, достаточно большое по сравнению со временем работы функции, поэтому влияет сильнее, чем после, когда чисел становится больше и время работы функции минимума значительно увеличивается.

![Image](https://github.com/PolinaMingazova/tp2/blob/main/2024-05-26_16-08-31.png)

