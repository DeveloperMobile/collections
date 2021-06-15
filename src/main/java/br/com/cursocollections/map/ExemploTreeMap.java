package br.com.cursocollections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // Monta a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println("\n"+treeCapitais.firstKey());

        // Retorna a última capital no final da árvore
        System.out.println("\n"+treeCapitais.lastKey());

        // Retorna a primeira capital abaixo na árvore da capital parametricada
        System.out.println("\n" + treeCapitais.lowerKey("SC"));

        // Retorna a primeira capital acima na árvore da capital parametricada
        System.out.println("\n" + treeCapitais.higherKey("SC"));

        // Retorna a primeira capital no topo da árvore
        System.out.println("\n" + treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        // Retorna a última capital no final da árvore
        System.out.println("\n" + treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        // Retorna a primeira capital abaixo na árvore da capital parametricada
        System.out.println("\n" + treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());

        // Retorna a primeira capital acima na árvore da capital parametricada
        System.out.println("\n" + treeCapitais.higherEntry("SC").getKey() + " - " + treeCapitais.higherEntry("SC").getValue());

        // Exibe todas as capitais no console
        System.out.println("\n" + treeCapitais);

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        // Retorna a primeira capital no topo da árvore, removendo do map
        System.out.println("\n" + firstEntry.getKey() + " - " + firstEntry.getValue());

        // Retorna a primeira capital no final da árvore, removendo do map
        System.out.println("\n" + lastEntry.getKey() + " - " + lastEntry.getValue());

        // Exibe todas as capitais no console
        System.out.println("\n" + treeCapitais);

        // Navega em todas as chaves do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        System.out.println();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        System.out.println();

        for (String capital : treeCapitais.keySet()) {
            System.out.println(capital + " - " + treeCapitais.get(capital));
        }

        System.out.println();

        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + " - " + capital.getValue());
        }
    }
}
