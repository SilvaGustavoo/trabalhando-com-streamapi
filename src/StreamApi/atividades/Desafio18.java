package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        
        // Desafio 18 - Verifique se todos os números da lista são iguais:


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        if(numeros.stream().allMatch(n -> numeros.get(0) == n)) {
            System.out.println("Todos os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }
    }
}
