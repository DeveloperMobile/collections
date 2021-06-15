package br.com.cursocollections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        System.out.println("1 Elemento: " + nomes.element());

        System.out.println("1 Elemento Removendo: " + nomes.poll());

        System.out.println();

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Daniel");

        System.out.println();

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        System.out.println("A lista tem " + nomes.size() + " elementos.");

        System.out.println("Está vazia?: " + (nomes.isEmpty() ? "Sim" : "Não"));

        System.out.println("Carlos está na lista?: " + (nomes.contains("Carlos") ? "Sim" : "Não"));
    }
}
