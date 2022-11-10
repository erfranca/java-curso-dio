package br.com.dio;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exitba todas as notas em ordem em que foram informadas: ");
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){ // equanto tiver o próximo faça, verificar se tem o próximo (hasNext)
            Double next = iterator.next();
            soma += next; // somar o valor da variável soma + o valor do próximo
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size())); //método size para verificar a qtd de itens na lista


       /* Iterator<Double> iteratormedia = notas.iterator();
        Double soma1 = 0d;
        while (iteratormedia.hasNext()){
            Double next1 = iteratormedia.next();
            soma1 += next1;
        }
        Double media = soma1 / 8;
        System.out.println("Exiba a média das notas: " + media);*/

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){ //enquanto o interator1 tem próximo, faça.
            Double next = iterator1.next();
            if (next < 7.0) iterator1.remove(); //se o  meu próximo elemento for menor que 7, remova-o
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); // método isEmpty verifica se a lista está vazia.


    }
}
