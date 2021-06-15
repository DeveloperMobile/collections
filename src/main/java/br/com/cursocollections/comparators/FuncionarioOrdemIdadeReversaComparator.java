package br.com.cursocollections.comparators;

import java.util.Comparator;

public class FuncionarioOrdemIdadeReversaComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return o2.getId() - o1.getId();
    }
}
