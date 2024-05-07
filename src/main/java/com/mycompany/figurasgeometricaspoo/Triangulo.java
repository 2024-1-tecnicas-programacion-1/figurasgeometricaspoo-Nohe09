package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    private final double area;
    private final double altura;
    public Triangulo(double area, double altura, String nombre, String color) {
        super(nombre, color);
        this.area=area;
        this.altura=altura;
    }
    
    public double obtenerArea(){
        return this.area*this.altura/2;
    }
    public double obtenerPerimetro(){
        return this.area+this.altura;
    }
    
}
