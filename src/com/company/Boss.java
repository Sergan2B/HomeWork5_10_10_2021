package com.company;

import java.util.Scanner;

public class Boss {
    // Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность. Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
    //Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты. Добавить в класс геттеры и сеттеры для всех полей.
    //В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию о боссе.
    //ДЗ на сообразительность:
    //Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев с помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй). Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return, как возвращаемый результат метода createHeroes. Hero[]
    //Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
    //Дэдлайн 10.10.2021 23 59

    private int bossHP, bossDamage;
    private String defendType;

    public int getBossHP() {
        return bossHP;
    }

    public void setBossHP(int bossHP) {
        this.bossHP = bossHP;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getDefendType() {
        return defendType;
    }

    public void setDefendType(String defendType) {
        this.defendType = defendType;
    }

    public Boss() {}
    public Boss(int bossHP, int bossDamage, String defendType) {
        this.bossHP = bossHP;
        this.bossDamage = bossDamage;
        this.defendType = defendType;
       /* Scanner enterHPScanner = new Scanner(System.in);
        bossHP = enterHPScanner.nextInt();
        Scanner enterDamageScanner = new Scanner(System.in);
        bossDamage = enterDamageScanner.nextInt();
        Scanner enterDefendTypeScanner = new Scanner(System.in);
        defendType = enterDefendTypeScanner.next();*/
    }
}
