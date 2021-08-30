package Task8;

import java.util.*;

public class Main {
  public static void main(String[] args) {


    List<Baggage> dictionary = new ArrayList<>();
    dictionary.add(new Baggage("1111", "2222", 187));
    dictionary.add(new Baggage("111111", "222222", 130));
    dictionary.add(new Baggage("111", "333", 17));
    dictionary.add(new Baggage("22", "12", 130));
    dictionary.add(new Baggage("11111", "22222", 111));
    dictionary.add(new Baggage("1", "1", 110));


    dictionaryComporatorInt sort1 = new dictionaryComporatorInt();
    dictionary.sort(sort1);
    System.out.println(dictionary);

    System.out.println("------");

    dictionary.sort((Baggage h1, Baggage h2) ->
            h1.myGetterName().length() + h1.myGetterClassName().length()
                    - h2.myGetterName().length() + h2.myGetterClassName().length());

    System.out.println(dictionary);
    System.out.println("------------------");
  dictionaryComporator sort2 = new dictionaryComporator();
    dictionary.sort(sort2);
    System.out.println(dictionary);
}
  }



//Задание 8.1 Аэропорт
//У вас есть список описаний багажа, в виде набора данных
// - наименование перевозчика, наименование класса перелета,
// предельно допустимый вес багажа.
//1. Ваша задача - описать класс багажа, создать на его основе
// список из > 5 объектов. Упорядочить список от самого легкого
// к самому тяжелому багажу, вывести список на экран.
//2. Далее - переупорядочить список, теперь сортировка должна
// произойти в зависимости от длины строки, получаемой путем
// сложения названия перевозчика и названия класса. Сортировка
// должна быть выполнена от самого длинного названия к самому короткому.
//В одном из случаев использовать анонимный класс, в одном - лямбду, на ваше усмотрение.