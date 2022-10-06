package ru.GeekBrains.personComp;

import java.util.ArrayList;
import java.util.Collections;

public class Person1 implements Comparable<Person1>{
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person1(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    // Сортировка по имени и возрасту по убыванию

    @Override
    public int compareTo(Person1 o) {
        if (this.name.compareTo(o.name) == 0) {
            return Integer.compare(o.age, this.age);
        }
        return o.name.compareTo(this.name);
    }

    public static void main(String[] args) {
        ArrayList<Person1> peoples = new ArrayList<>();
        peoples.add(new Person1("Дима", 22, 55, 183));
        peoples.add(new Person1("Аня", 3, 13, 133));
        peoples.add(new Person1("Аня", 53, 94, 155));
        peoples.add(new Person1("Аня", 42, 113, 83));
        peoples.add(new Person1("Леша", 42, 13, 313));
        peoples.add(new Person1("Боря", 2, 113, 155));
        peoples.add(new Person1("Боря", 28, 213, 133));
        peoples.add(new Person1("Боря", 3, 189, 203));

        Collections.sort(peoples);

        for (Person1 people : peoples) {
            System.out.println(people);
        }
    }
}