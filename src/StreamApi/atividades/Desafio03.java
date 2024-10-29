package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio03 {

    public static void main(String[] args) {
        
        // Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream()
        .filter(num -> num < 0)
        .toList();

        if(numerosNegativos.size() == 0) {
            System.out.println("Todos os números são positivos");
        } else {
            System.out.println("Existem números negativos: " + numerosNegativos);
        }
    }
    
}
