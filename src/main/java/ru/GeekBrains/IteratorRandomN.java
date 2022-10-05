package ru.GeekBrains;

import java.util.Iterator;
import java.util.Random;

public class IteratorRandomN implements Iterable<Integer>{

    private final int count;
    private final int from;
    private final int to;

    private static final Random rnd;

    static {
        rnd = new Random();
    }

    public IteratorRandomN(Integer count, int from, int to) {
        this.count = count;
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < count;
            }

            @Override
            public Integer next() {
                int number = rnd.nextInt(from, to + 1);
                counter++;
                return number;
            }
        };
    }

    public static void main(String[] args) {
        IteratorRandomN irr = new IteratorRandomN(5,0,3);
        for (Integer integer : irr) {
            System.out.println(integer);
        }
    }
}
