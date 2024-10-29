package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {

        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        double somaDosQuadrados = numeros.stream().map(n -> n * n).reduce(0, (total, n) -> total += n);

        System.out.println(somaDosQuadrados);


    }
}
