package br.com.cursocollections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio {
    public static void main(String[] args) {
        // Cria a coleção de estudantes
        List<Estudante> estudantes = new ArrayList<>();

        // Adiciona 7 estudantes para a coleção
        estudantes.add(new Estudante("Pedro", 20));
        estudantes.add(new Estudante("Tayse", 22));
        estudantes.add(new Estudante("Marcelo", 24));
        estudantes.add(new Estudante("Carla", 26));
        estudantes.add(new Estudante("Juliana", 28));
        estudantes.add(new Estudante("Thiago", 30));
        estudantes.add(new Estudante("Rafael", 32));

        // Retorna a quantidade de elementos
        System.out.println("Contagem: " + estudantes.stream().count());

        // Estudantes com idade maior ou igual a 18
        System.out.println("Estudantes com idade igual ou maior que 18: " + estudantes.stream().filter((estudante) ->
                estudante.getIdade() >= 18).collect(Collectors.toList()));

        // Mostrando os elementos no console
        System.out.println("Todos os elementos: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna elementos que tem a letra R no nome
        System.out.println("Com a letra B no nome: " + estudantes.stream().filter((estudante) ->
                estudante.getNome().toUpperCase().contains("B")).collect(Collectors.toList()));

        // Retorna true se algum dos elementos possue a letra D no nome
        System.out.println("Tem algum elemento com 'D' no nome? "
                + estudantes.stream().anyMatch((elemento) -> elemento.getNome().contains("D")));

        // Retorna o elemento com maior idade
        System.out.println("Estudante mais velho: " + estudantes.stream().max(Comparator.comparingInt(estudante ->
                Math.max(estudante.getIdade(), estudante.getIdade()))));

        // Retorna o elemento com menor idade
        System.out.println("Estudante mais novo: " + estudantes.stream().min(Comparator.comparingInt(estudante ->
                Math.min(estudante.getIdade(), estudante.getIdade()))));
    }
}
