# Конвертер
____
Небольшой сервис, для конвертирования температур.
Позволяет конвертировать температуру между градусами Цельсия, Фаренгейта и Кельвина.

Как пользоваться:
-----------

{in} - заменяем на число, которое будем конвертировать,
{convertFromTo} - заменяем на:
`convertCtoF` - конвертировать из градусов Цельсия в градусы Фаренгейта.   
`convertCtoK` — конвертировать из градусов Цельсия в кельвины.   
`convertFtoC` - конвертировать из градусов Фаренгейта в градусы Цельсия.   
`convertFtoK` - конвертировать из градусов Фаренгейта в кельвины.   
`convertKtoF` - конвертировать из градусов Кельвина в градусы Фаренгейта.     
`convertKtoC` - конвертировать из градусов Кельвина в градусы Цельсия.   

```
http://localhost:9001/converter/{convertFromTo}/{in}
```

При помощи докера:
-----------

```
docker build -t converter .
docker run -it --rm -p 9001:9001 converter   
```
```dev:```
[![Tests](https://github.com/Anromi/Converter/actions/workflows/gradle-test.yml/badge.svg?branch=develop)]

```main:```
[![Tests](https://github.com/Anromi/Converter/actions/workflows/gradle-test.yml/badge.svg?branch=main)]