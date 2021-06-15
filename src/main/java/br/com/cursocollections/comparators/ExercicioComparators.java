package br.com.cursocollections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioComparators {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Tiago", 1234));
        funcionarios.add(new Funcionario("Rosana", 5678));
        funcionarios.add(new Funcionario("Jessica", 1357));
        funcionarios.add(new Funcionario("Vitor", 2468));
        funcionarios.add(new Funcionario("Ieleny", 1206));

        System.out.println("--- Ordem de inserção ---");
        System.out.println(funcionarios);
        System.out.println();

        Collections.sort(funcionarios);

        System.out.println("--- Ordem natural dos números - id(interface Comparable) ---");
        System.out.println(funcionarios);
        System.out.println();

        funcionarios.sort((first, second) -> first.getId() - second.getId());

        System.out.println("--- Ordem natural dos números - id ---");
        System.out.println(funcionarios);
        System.out.println();

        funcionarios.sort((first, second) -> second.getId() - first.getId());

        System.out.println("--- Ordem inversa dos números - id ---");
        System.out.println(funcionarios);
        System.out.println();

        Collections.sort(funcionarios, new FuncionarioOrdemIdadeReversaComparator());

        System.out.println("--- Ordem reversa dos números - id(interface Comparator) ---");
        System.out.println(funcionarios);
    }
}
