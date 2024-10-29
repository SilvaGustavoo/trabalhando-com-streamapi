package StreamApi.atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    
    public static void main(String[] args) {
        
        // Desafio 16 - Agrupe os números em pares e ímpares:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        List<Integer> par = numeros.stream().filter(n -> n %2 == 0).toList();

        List<Integer> impar = numeros.stream().filter(n -> n % 2 != 0).toList();

        List<List<Integer>> imparPar = new ArrayList<List<Integer>>();
        
        imparPar.add(par);
        imparPar.add(impar);

        System.out.println(imparPar);

    }
}
