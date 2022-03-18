package MemoriaCartas;

import java.util.ArrayList;
import java.util.Collections;

public class Memoria {
    private ArrayList<Carta> mazoPosibles = new ArrayList<Carta>();
    private ArrayList<Carta> mazoUsadas = new ArrayList<Carta>();

    //CONSTRUCTOR
    public Memoria() {
        //RELLENO DEL MAZO DE POSIBLES
        for(int cardSymbol =1; cardSymbol<=4;cardSymbol++){
            for(int cardNumber =1; cardNumber<=13; cardNumber++){
                mazoPosibles.add(new Carta(cardSymbol,cardNumber));
            }
        }

        //RELLENO DEL MAZO DE USADAS
        Collections.shuffle(mazoPosibles);
        for(int i =0; i<6; i++){
            mazoUsadas.add(mazoPosibles.get(i));
            mazoUsadas.add(mazoPosibles.get(i));
        }
    }
    //GETTER Y SETTER
    public ArrayList<Carta> getMazoPosibles() {
        return mazoPosibles;
    }
    public void setMazoPosibles(ArrayList<Carta> mazoPosibles) {
        this.mazoPosibles = mazoPosibles;
    }
    public ArrayList<Carta> getMazoUsadas() {
        return mazoUsadas;
    }
    public void setMazoUsadas(ArrayList<Carta> mazoUsadas) {
        this.mazoUsadas = mazoUsadas;
    }
    //METHODS
    public void setIconToButton(){

    }
}
