package com.upchiapas.queue;

import com.upchiapas.queue.models.Pizza;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] catalogo =  {"Hawaiana","Peperoni","4 quesos","Mexicana"};
        Random random = new Random(System.nanoTime());

        Queue<Pizza> listaPizza =  new LinkedList<Pizza>();

        for (int i=0;i<10;i++)
            listaPizza.add(new Pizza((short)(i+1),
                    catalogo[random.nextInt(catalogo.length)],
                    random.nextFloat()
                    ));

        while (!listaPizza.isEmpty())
            System.out.println(listaPizza.poll());
    }
}
