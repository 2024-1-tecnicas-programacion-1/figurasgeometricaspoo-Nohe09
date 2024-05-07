package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica {
    private final double lado1;
    private final double lado2;

    public Rectangulo(double lado1, double lado2, String nombre, String color) {
        super(nombre,color);
        this.lado1=lado1;
        this.lado2=lado2;
        
    }

    public double obtenerArea(){
        return this.lado1*this.lado2;
    }
    public double obtenerPerimetro(){
        return 2*( this.lado1+this.lado2);
    }
}
