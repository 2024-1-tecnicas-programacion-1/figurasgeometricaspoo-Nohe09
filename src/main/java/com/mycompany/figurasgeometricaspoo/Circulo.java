package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    
     private double radio;
    
    public Circulo(String nombre, String color , double radio) {
        super(nombre, color);
        this.radio=radio;
    }
    public double obetenerArea(){
        return Math.PI *this.radio *radio;
    }
    public double obtenerPerimetro(){
       return Math.PI*this.radio;
    }
}
