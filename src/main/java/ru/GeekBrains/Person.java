package ru.GeekBrains;

import java.util.ArrayList;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
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


    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0) {
            if (this.age > o.age) return 1;
            else if (this.age == o.age) return 0;
            else return -1;
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<Person> pioples = new ArrayList<>();
        pioples.add(new Person("Дима", 22, 13, 183));
        pioples.add(new Person("Аня", 3, 13, 83));
        pioples.add(new Person("Аня", 53, 13, 83));
        pioples.add(new Person("Аня", 43, 13, 83));
        pioples.add(new Person("Леша", 42, 13, 313));
        pioples.add(new Person("Боря", 2, 113, 183));
        pioples.add(new Person("Боря", 28, 113, 183));
        pioples.add(new Person("Боря", 33, 113, 183));

        for (Person piople : pioples) {
            System.out.println(piople);
        }
    }
}