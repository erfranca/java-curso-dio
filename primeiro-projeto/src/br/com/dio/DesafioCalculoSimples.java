package br.com.dio;

public class DesafioCalculoSimples {
    public static void main(String[] args) {
       int t = 5;
       int valorT = t - 1;
       int i = 0;
       int j = 0;
       int [] meuVetor = new int[50];
       for (i=0; i < meuVetor.length; i++){
           for(j=0; j < valorT; j=valorT){
               System.out.println(j);
           }
           System.out.println("N[" + i + "] = ");
       }
    }
}

