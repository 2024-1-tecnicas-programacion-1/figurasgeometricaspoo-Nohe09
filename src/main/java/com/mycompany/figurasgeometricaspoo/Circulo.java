package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    
     private final double radio;
    
    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio=radio;
    }
     @Override
    public double obetenerArea(){
        return Math.PI *this.radio *radio;
    }
    public double obtenerPerimetro(){
       return Math.PI*this.radio;
    }

    String obtenerArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
