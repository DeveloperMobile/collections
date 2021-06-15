package br.com.cursocollections.queue;

import javax.swing.*;
import java.util.*;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteAtendido = filaBanco.poll();

        System.out.println(clienteAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //filaBanco.clear();

        try {
            String primeiroClienteErro = filaBanco.element();

            System.out.println(primeiroClienteErro);

            System.out.println(filaBanco);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não há elementos na fila: " + e.getMessage());
        }

        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }

        System.out.println("");

        Iterator<String> filaBancoIterator = filaBanco.iterator();

        while (filaBancoIterator.hasNext()) {
            System.out.println(filaBancoIterator.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");

        System.out.println(filaBanco);
    }
}
