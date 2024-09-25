package Carro;
import java.util.Observable;
import java.util.Observer;


public class carroPolicia implements Observer, carro {  //A policia observa, portanto implementa a interface
    //Observer e implementa os métodos da classe Carro
    
    public void frente(){
        System.out.println("Viatura segue em frente");
    }

    public void direita(){
        System.out.println("Viatura vira a direita");
    }

    public void esquerda(){
        System.out.println("Viatura vira a esquerda");
    }

    public void para(){
        System.out.println("Viatura parou");
    }

    public void update(Observable arg0, Object arg1){   //método update pertence à interface Observer
            //Recebe como parâmetro um objeto observado e ação desse objeto observado
        carroRoubado carroObservado = (carroRoubado)arg0;
        String acao = String.valueOf(arg1);

        if(acao.equals("frente")){
            this.frente();
        }

        if(acao.equals("direita")){
            this.direita();
        }

        if(acao.equals("esquerda")){
            this.esquerda();
        }

        if(acao.equals("para")){
            this.para();
        }
    }

    
}
