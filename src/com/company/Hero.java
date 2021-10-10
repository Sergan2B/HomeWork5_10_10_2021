package com.company;

public class Hero {
    // Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность. Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
    //Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты. Добавить в класс геттеры и сеттеры для всех полей.
    //В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию о боссе.
    //ДЗ на сообразительность:
    //Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев с помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй). Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return, как возвращаемый результат метода createHeroes. Hero[]
    //Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
    //Дэдлайн 10.10.2021 23 59

    private int heroHP, heroDamage;
    private int superpower;

    public void setHeroHP(int HeroHP) {
        heroHP = HeroHP;
    }
    public int getHeroHP() {
        return heroHP;
    }
    public void setHeroDamage(int HeroDamage) {
        heroDamage = HeroDamage;
    }
    public int getHeroDamage() {
        return heroDamage;
    }
    public void setSuperpower(int SuperPower) {superpower = SuperPower;}
    public int getSuperpower() {return superpower; }


    public Hero () {}

    public Hero (int heroHP, int heroDamage, int superpower) {
        this.heroHP = heroHP;
        this.heroDamage = heroDamage;
        this.superpower = superpower;
        System.out.println("Здоровоье героя равно: " + heroHP);
        System.out.println("Урон героя равен: " + heroDamage);
        System.out.println("Количество супер силы равно: " + superpower);
    }

    public Hero (int heroDamage, int heroHP) {
        this.heroHP = heroHP;
        this.heroDamage = heroDamage;
        System.out.println("Здоровоье героя равно: " + heroHP);
        System.out.println("Урон героя равен: " + heroDamage);
    }


    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("У героя здоровье равен " + heroHP + ", а урон героя равен " + heroDamage + ".");
        }
    }
}
