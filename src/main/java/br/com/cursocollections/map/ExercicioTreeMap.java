package br.com.cursocollections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioTreeMap {
    public static void main(String[] args) {
        Map<String, String> estados = new TreeMap<>();

        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        System.out.println(estados);

        estados.remove("MG");

        System.out.println("\n" + estados);

        estados.put("DF", "Distrito Federal");

        System.out.println("\n" + estados);

        estados.remove("MS", "Mato Grosso do Sul");

        System.out.println("\n" + estados);

        System.out.println();

        for (Map.Entry<String, String> entry : estados.entrySet()) {
            System.out.println(entry.getValue() + "(" + entry.getKey() + ")");
        }

        System.out.println("\n" + estados.containsKey("SC"));

        System.out.println("\n" + estados.containsValue("Maranhão"));
    }
}
