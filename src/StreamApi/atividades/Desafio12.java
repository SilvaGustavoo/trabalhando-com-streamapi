package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        
        //Desafio 12 - Encontre o produto de todos os números da lista:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        long totalProduto = numeros.stream().reduce(numeros.get(0), (total, n) -> total = total * n);

        System.out.println(totalProduto);
    }
    
}
