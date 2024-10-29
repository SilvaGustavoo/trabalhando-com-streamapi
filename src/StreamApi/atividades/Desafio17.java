package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    public static void main(String[] args) {
        
        // Desafio 17 - Filtrar os números primos da lista:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream().filter(n -> ePrimo(n)).toList();

        System.out.println(numerosPrimos);
        
    }

    public static boolean ePrimo(int n) {
        boolean ePrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ePrimo = false;
                return ePrimo;
            }
        }

        return ePrimo;
    }
}
