/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Otaner
 */
public class Operaciones {

    private double num1;
    private double num2;

    //Getter y Setter
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //Constructor
    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //Operaciones
    
    public double sumar() {
        double suma = this.num1 + this.num2;
        return suma;
    }

    public double restar() {
        double resta = this.num1 - this.num2;
        return resta;
    }

    public double multiplicar() {
        double multiplicacion = this.num1 * this.num2;
        return multiplicacion;
    }

    public double dividir() {
        double division = this.num1 + this.num2;
        return division;
    }
    
    
    
}
