package ru.GeekBrains.personComp;

import java.util.ArrayList;
import java.util.Collections;

public class Person3 implements Comparable<Person3>{
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person3(String name, int age, int weight, int height) {
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

    // Сортировка по росту, весу, возрасту и имени по убыванию.

    @Override
    public int compareTo(Person3 o) {
        if (this.height == o.height) {
            if (this.weight == o.weight){
                if (this.age == o.age) {
                    return o.name.compareTo(this.name);
                }
                return Integer.compare(o.age, this.age);
            }
            return Integer.compare(o.weight, this.weight);
        }
        return Integer.compare(o.height, this.height);
    }

    public static void main(String[] args) {
        ArrayList<Person3> peoples = new ArrayList<>();
        peoples.add(new Person3("Дима", 22, 55, 183));
        peoples.add(new Person3("Аня", 3, 13, 133));
        peoples.add(new Person3("Аня", 53, 94, 155));
        peoples.add(new Person3("Аня", 42, 113, 83));
        peoples.add(new Person3("Леша", 42, 113, 313));
        peoples.add(new Person3("Боря", 53, 94, 155));
        peoples.add(new Person3("Боря", 28, 213, 133));
        peoples.add(new Person3("Боря", 22, 55, 183));

        Collections.sort(peoples);

        for (Person3 people : peoples) {
            System.out.println(people);
        }
    }
}
