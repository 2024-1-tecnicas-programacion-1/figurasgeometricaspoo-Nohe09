package com.mycompany.figurasgeometricaspoo;


public class TrianguloIsoseles extends FiguraGeometrica{

    private final double lado1;
    private final  double lado2;
    private final  double lado3;

  
    public TrianguloIsoseles(double lado1, double lado2, double lado3, String nombre, String color) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double obtenerArea() {
       
        return (lado1 * lado2) / 2;
       
    }

    
    public double obtenerPerimetro() {
        return lado1 + lado2 + lado3;
        
    }
}
