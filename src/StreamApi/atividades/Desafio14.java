package StreamApi.atividades;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Desafio14 {
    public static void main(String[] args) {
        
        // Desafio 14 - Encontre o maior número primo da lista:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().filter(n -> ePrimo(n)).max(Comparator.naturalOrder()).get());

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
