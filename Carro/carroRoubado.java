package Carro;
import java.util.Observable;    //Implementação da classe Observable, aquele quem será vigiado.
                                //Essa interface é depreciada

public class carroRoubado extends Observable implements carro{

    private String acao = "";

    public void frente(){
        acao = "frente";
        System.out.println("Carro roubado segue em frente.");
        this.mudaEstado();
    }

    public void direita(){
        acao = "direita";
        System.out.println("Carro roubado vira a direita.");
        this.mudaEstado();
    }

    public void esquerda(){
        acao = "esquerda";
        System.out.println("Carro roubado vira a esquerda.");
        this.mudaEstado();
    }

    public void para(){
        acao = "para";
        System.out.println("Carro roubado parou.");
        this.mudaEstado();
    }

    public void mudaEstado(){
        setChanged();
        notifyObservers(acao);
    }



    
}
