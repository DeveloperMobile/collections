package br.com.cursocollections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Iterator<Integer> iterator = numeros.iterator();

        System.out.println("While:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Foreach:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        numeros.add(23);

        System.out.println(numeros);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());
    }
}
