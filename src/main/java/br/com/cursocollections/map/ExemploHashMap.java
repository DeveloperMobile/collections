package br.com.cursocollections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println("Mapa:");
        System.out.println(campeoesMundialFifa);

        // Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println("Atualiza Brasil:");
        System.out.println(campeoesMundialFifa);

        // Retorna a Argentina
        System.out.println("Retorna Argentina:");
        System.out.println(campeoesMundialFifa.get("Argentina"));

        // Retorna se existe ou não um campeão França
        System.out.println("França é campeã: ");
        System.out.println(campeoesMundialFifa.containsKey("França"));

        // Remove o campeão França
        campeoesMundialFifa.remove("França");

        // Retorna se existe ou não um campeão França
        System.out.println("França é campeã: ");
        System.out.println(campeoesMundialFifa.containsKey("França"));

        // Retorna se existe ou não alguma seleção hexa campeã
        System.out.println("Existe Seleção Hexa: ");
        System.out.println(campeoesMundialFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println("Tamanho Mapa: ");
        System.out.println(campeoesMundialFifa.size());

        System.out.println("Mapa:");
        System.out.println(campeoesMundialFifa);
        System.out.println();

        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println();

        // Navega nos registros do mapa
        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }

        System.out.println();
        System.out.println(campeoesMundialFifa);

        // Verifica se contém a chave Estados Unidos
        System.out.println("\nEsiste Estados Unidos: " + campeoesMundialFifa.containsKey("Estados Unidos"));

        // Vefifica se o mapa contém o valor 5
        System.out.println("\nEsiste Seleção Penta: " + campeoesMundialFifa.containsValue(5));

        //  Verifica o tamanho antes e depois de limpar o mapa
        System.out.println("\nItens no mapa: " + campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println("\nItens no mapa: " + campeoesMundialFifa.size());
    }
}
