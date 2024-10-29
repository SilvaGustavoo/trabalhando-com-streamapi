package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        
        // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int total = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(0, (som, n) -> som += n);

        // Imprime o resultado
        System.out.println("Soma dos numeros divisiveis por 3 e 5: " + total);


    }
}
