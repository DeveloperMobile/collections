package br.com.cursocollections.optionals;

import java.util.Optional;

public class Exercicio {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor opcional");
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Está presente:");
        if (optionalString.isPresent()) {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        if (emptyOptional.isEmpty()) {
            System.out.println("Está vazio:");
            emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Opcional Vazio"));
        }

        if (!optionalNull.isPresent()) {
            System.out.println("Está nulo:");
            optionalNull.ifPresentOrElse(System.out::println, () -> optionalNull.orElseThrow(IllegalStateException::new));
        }
    }
}
