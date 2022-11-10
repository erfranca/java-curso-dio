public class Carro { //classe
    // criando atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Get e Set

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //método do total para encher o tanque

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
