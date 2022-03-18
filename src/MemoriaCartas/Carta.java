package MemoriaCartas;

import javax.swing.*;
import java.awt.*;

public class Carta {
    private int symbol;
    private int number;
    private ImageIcon img;
    private ImageIcon imgback;
    private boolean esGirada = true;
    private String name;

    //-------------------------------------------CONSTRUCTOR-------------------------------------------------

    public Carta(int symbol, int number) {
        this.symbol = symbol;
        this.number = number;

        if(this.symbol<=0){
            this.symbol =1;
        }
        if(this.symbol>=5){
            this.symbol =4;
        }
        if(this.number<=0){
            this.number =1;
        }
        if(this.number>=14){
            this.number =13;
        }
        this.name = number +symbolToString();

        this.img = new ImageIcon("image/MemoriaCartas/"+ name +".png");
        this.imgback = new ImageIcon("image/MemoriaCartas/Back.png");

        this.img = this.changeImgSize(img,172,250);
        this.imgback = this.changeImgSize(imgback,172,250);
    }

    //-----------------------------------------GETTER Y SETTER-----------------------------------------------


    public boolean esGirada() {
        return esGirada;
    }

    public void tglEsGirada() {
        this.esGirada = !this.esGirada;
    }

    public int getSymbol() {
        return symbol;
    }
    public void setSymbol(int symbol) {
        this.symbol = symbol;
        if(this.symbol<=0){
            this.symbol =1;
        }
        if(this.symbol>=5){
            this.symbol =4;
        }
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
        if(this.number<=0){
            this.number =1;
        }
        if(this.number>=14){
            this.number =13;
        }
    }

    public ImageIcon getImg() {
        return img;
    }
    public ImageIcon getImgback() {
        return imgback;
    }

    //---------------------------------------------METHODS---------------------------------------------------
    public String numberToString(){
        String numberString;
        if(this.number== 1){
            numberString ="As";
        }else if(this.number == 11){
            numberString ="Jack";
        }else if(this.number == 12){
            numberString ="Queen";
        }else if(this.number == 13){
            numberString ="King";
        }else {
            numberString = this.number + "";
        }
        return numberString;
    }
    public String symbolToString(){
        String symbolString;
        if(this.symbol == 1){
            symbolString ="C";
        }else if(this.symbol == 2){
            symbolString ="D";
        }else if(this.symbol == 3){
            symbolString ="H";
        }else if(this.symbol == 4){
            symbolString ="S";
        } else{
            symbolString ="None";
        }
        return symbolString;
    }
    @Override
    public String toString() {
        return name;
    }

    public ImageIcon changeImgSize(ImageIcon img, int width, int height){
        Image instImage = img.getImage(); // transform it
        Image newImg = instImage.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        img = new ImageIcon(newImg);  // transform it back
        return img;
    }
}
