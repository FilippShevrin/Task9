package Task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

        public static void main (String [] args) {


            partOfStringUser();
        }

    public static void partOfStringUser () {
            System.out.print("Введите число:");
            Scanner scanner = new Scanner(System.in);
            String userString = scanner.nextLine();
            String[] String_array = userString.split(" ");
            String_array[1].length();
            double result;
                    if(String_array.length>3){
                        System.err.println("число вводимых значений не может быть больше 3");
                        throw new IllegalArgumentException();
                    }
                try {
                double    test1 = Double.parseDouble(String_array[0]);
                    double    test2 = Double.parseDouble(String_array[2]);
                    System.out.println(test1+" "+ test2);
                } catch (NumberFormatException e) {
                    System.err.println("было введено не число");
                }
        double part1 = Double.parseDouble(String_array[0]);
        double part2 = Double.parseDouble(String_array[2]);
        switch (String_array [1]) {
            case "плюс": {
                result =  (part1+part2);
                break;
            }
            case "минус": {
                result =  (part1-part2);
                break;
            }
            case "умножить": {
                result =  (part1*part2);
                break;
            }
            case "делить": {
                if( part2 == 0){
                    System.err.println("деление на ноль");
                    throw new ArithmeticException();}
                else result =  (part1/part2);
                break;
            }
            default: {
                System.err.println("арифметическая операция не обнаружена");
                throw new ArithmeticException();}
        }
        System.out.println(result);

                }

                }


//    Ну, во первых тут есть куча преимуществ.
//1. Число и операции разделены пробелом. Отсюда сразу,
// если сделать сплит входящей строки и число кусков больше 3,
// то уже можно бросать искл на некорректный ввод.
//2.  После сплита, у тебя массив из 3 элементов(если не из 3, то бросаешь искл)
//0й кусок - 1й операнд
//2й кусок - 2й операнд
//
//А 1й это сама операция, важно, чтобы там был + или - или * или /.
// Если там не оно, то искл
//
//3. Проверяет 0й и 2й операнд, если они число, вот тут есть примеры
//https://stackabuse.com/java-check-if-string-is-a-number/
//
//Если все проверки ок, то превращаешь
// (вот тут есть https://www.google.com/amp/s/www.geeksforgeeks.org/convert-string-to-double-in-java/amp/)
// 0й и 2й кусок в double и умножаешь.
//
//4. Возвращаешь результат.
//Сделай только в отдельной фунции.
//
//Stack Abuse (https://stackabuse.com/java-check-if-string-is-a-number/)
//Java: Check if String is a Number
//In this tutorial, we'll go over examples on how to check if a String represents a Number in Java. We'll use Core Java and the Apache Commons Library, as well as Regex.

//Cоздаем калькулятор! Да не обычный, а консольный.
// На вход должна поступать строка в формате "аргумент1
// арифметическаяОперация аргумент2" (используем Scanner),
// примеры такого ввода: "5 плюс 23", "45 делить 6", "0.7 умножить 4.1",
// всего доступно 4 возможных операции. На выход в консоль
// должен выводиться результат, либо подробное сообщение о
// произошедшей ошибке (в человекочитаемом формате) + stacktrace ошибки.
//Пользователь, который будет этим пользоваться - человек, склонный
// ломать абсолютно все, поэтому интенсивно используйте механизм исключений
// где он применим и позаботьтесь о валидации ввода, плюс арифметических
// операций.//