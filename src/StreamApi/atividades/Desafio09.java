package StreamApi.atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Desafio09 {
    public static void main(String[] args) {

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        System.out.println(obterRepetidos(numeros));
    }



    public static List<Integer> obterRepetidos(List<Integer> lista){
        Set<Integer> primeiraOCorrencia = new HashSet<>();  // set para guardar primeira ocorrencia de cada numero
        return lista.stream()  // percorre toda a lista
                .filter(e -> !primeiraOCorrencia.add(e))  // filtra pelos que não são adicionados à primeira ocorrencia (repetidos)
                .distinct()       // remove valores duplicados na lista de retorno
                .toList();   // adiciona à nova lista
    }

}