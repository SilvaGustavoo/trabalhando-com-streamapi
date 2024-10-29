package StreamApi.atividades;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Desafio01 {
    
    public static void main(String[] args) {

        // Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        // Maneira 1: Ordenar pelo Comparator personalizado
        numeros.sort(new OrdenarNumeros());

        System.out.println(numeros);

        // Maneira 2: Ordenar pelo Collections.sort()
        Collections.sort(numeros);

        System.out.println(numeros);

        // Maneira 3: Ordenar pelo Comparator de ordem natural
        numeros.sort(Comparator.naturalOrder());

        System.out.println(numeros);



    }
}

class OrdenarNumeros implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }


}