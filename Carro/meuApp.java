package Carro;

public class meuApp{

    public static void main(String[] args){
        //Observador
        carroPolicia carroPolicia = new carroPolicia();

        //Observado
        carroRoubado carroRoubado = new carroRoubado();

        //Adicionar observador ao observado
        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.para();

    }
}