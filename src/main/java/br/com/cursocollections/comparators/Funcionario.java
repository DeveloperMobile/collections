package br.com.cursocollections.comparators;

public class Funcionario implements Comparable<Funcionario> {
    private final String nome;
    private final Integer id;

    public Funcionario(String nome, Integer dalario) {
        this.nome = nome;
        this.id = dalario;
    }

    public String getNome() { return nome; }

    public Integer getId() { return id; }

    @Override
    public String toString() {
        return nome + " - " + id;
    }

    @Override
    public int compareTo(Funcionario funcionario) {
        return this.id - funcionario.getId();
    }
}
