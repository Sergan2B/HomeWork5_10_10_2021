package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/* Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
         Написать 2 разных конструктора для создания объекта.
         В одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.*/
        //  СДЕЛАЛ

        /*Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
        Добавить в класс геттеры и сеттеры для всех полей.*/
        //СДЕЛАЛ

        /*В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
        Затем распечатать всю информацию о боссе.*/
        //СДЕЛАЛ

        //ДЗ на сообразительность:
        /*Добавить метод в классе Main который называется createHeroes, в теле метода необходимо
        создать 3х героев с помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй).
        Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return,
        как возвращаемый результат метода createHeroes. Hero[]*/
        //СДЕЛАНО


        //Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
        //Сделано
        //Дэдлайн 10.10.2021 23 59

        Hero c01 = new Hero();
        c01.setHeroHP(750);
        c01.setHeroDamage(35);

        Boss C01 = new Boss();
        System.out.println("Выводим босса " + C01);
        C01.setBossHP(2000);
        C01.setBossDamage(50);
        C01.setDefendType("Magic");

        System.out.println("Выводим значение в main методе: " + c01.getHeroHP());
        System.out.println("Выводим значение в main методе: " + c01.getHeroDamage());
        System.out.println("____________________________");

        int lengthHero = createHeroes().length;
        for (int i = 0; i < lengthHero; i++) {
            System.out.println(" ");
            System.out.println(Arrays.toString(createHeroes()));
            System.out.println("Отчет о героях закончен. ");
        }
        //createHeroes();
    }

    public static Hero[] createHeroes() {
        Hero s01 = new Hero(13, 890);
        Hero s02 = new Hero(500, 50, 1);
        Hero s03 = new Hero(690, 29);
        return new Hero[]{s01, s02, s03};
    }
}
