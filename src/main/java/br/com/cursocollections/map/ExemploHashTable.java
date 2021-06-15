package br.com.cursocollections.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println("\n" + estudantes);

        // Remove um estudante no índice 0
        estudantes.remove("Pedro");

        System.out.println("\n" + estudantes);

        // Recupera um estudante no índice 2
        int idadeEstutante = estudantes.get("Mariana");

        System.out.println("\n" + idadeEstutante);

        System.out.println("\n" + estudantes.size());

        System.out.println();

        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println();

        for (String key : estudantes.keySet()) {
            System.out.println(key + " -- " + estudantes.get(key));
        }
    }
}
