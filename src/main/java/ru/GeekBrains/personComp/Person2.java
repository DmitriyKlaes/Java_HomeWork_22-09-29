package ru.GeekBrains.personComp;

import java.util.ArrayList;
import java.util.Collections;

public class Person2 implements Comparable<Person2>{
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person2(String name, int age, int weight, int height) {
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

    // Сортировка по возрасту, весу и росту по возрастанию

    @Override
    public int compareTo(Person2 o) {
        if (o.age == this.age) {
            if (this.weight == o.weight){
                return Integer.compare(this.height, o.height);
            }
            return Integer.compare(this.weight, o.weight);
        }
        return Integer.compare(this.age, o.age);
    }

    public static void main(String[] args) {
        ArrayList<Person2> peoples = new ArrayList<>();
        peoples.add(new Person2("Дима", 22, 55, 183));
        peoples.add(new Person2("Аня", 3, 13, 133));
        peoples.add(new Person2("Аня", 53, 94, 155));
        peoples.add(new Person2("Аня", 42, 113, 83));
        peoples.add(new Person2("Леша", 42, 113, 313));
        peoples.add(new Person2("Боря", 2, 113, 155));
        peoples.add(new Person2("Боря", 28, 213, 133));
        peoples.add(new Person2("Боря", 3, 13, 203));

        Collections.sort(peoples);

        for (Person2 people : peoples) {
            System.out.println(people);
        }
    }
}
