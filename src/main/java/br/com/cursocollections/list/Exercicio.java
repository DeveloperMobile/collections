package br.com.cursocollections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println(">>" + nome );
        }

        nomes.set(2, "Roberto");

        System.out.println("");

        for (String nome : nomes) {
            System.out.println(">>" + nome );
        }

        String name = nomes.get(1);
        System.out.println(name + "\n");

        nomes.remove(4);

        for (String nome : nomes) {
            System.out.println(">>" + nome);
        }

        nomes.remove("João");

        System.out.println("");

        for (String nome : nomes) {
            System.out.println(">>" + nome);
        }

        int tamanho = nomes.size();
        System.out.println(tamanho + "\n");

        boolean novoItem = nomes.contains("Juliano");
        System.out.println(novoItem + "\n");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        nomes2.addAll(nomes);

        System.out.println("");

        for (String nome : nomes2) {
            System.out.println(">>" + nome);
        }

        Collections.sort(nomes2);

        System.out.println("");

        for (String nome : nomes2) {
            System.out.println(">>" + nome);
        }

        System.out.println("");

        boolean estaVazio = nomes2.isEmpty();
        System.out.println(estaVazio);
    }
}
