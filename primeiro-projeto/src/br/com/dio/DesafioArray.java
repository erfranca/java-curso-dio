package br.com.dio;

public class DesafioArray {
    public static void main(String[] args) {
        int numPares[] = {2, 3, 5, 9, 12, 34};
                for (int numPar : numPares){
                    if (numPar % 2 == 0 ) {
                        System.out.println(numPar);
                    }
                }
    }
}
