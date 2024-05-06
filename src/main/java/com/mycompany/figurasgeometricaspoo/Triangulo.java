package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
     private double area;
    private double altura;
    public Triangulo(String nombre, String color,double area , double altura ) {
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
