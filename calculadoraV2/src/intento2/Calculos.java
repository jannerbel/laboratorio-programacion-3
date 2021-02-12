/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento2;

/**
 *
 * @author User
 */
public class Calculos {
    
    
    public Calculos(){}
    
    
    public float suma(float num1, float num2){
        return num1+num2;
    }
    public float resta(float num1,float num2){
        return num1-num2;
    }
    public float multiplicacion(float num1, float num2){
        return num1*num2;
    }
    public float division (float num1, float num2){
        return num1/num2;
    }
    public boolean DivisionCero(float num1, float num2){
    if (num2==0){
        return false;
    }
    return true;
}
    public double potencia(double num, double potencia){
        return Math.pow(num, potencia);
    } 
    public double raiz (double num){
        return Math.sqrt(num);  
    }
    public double tan (double num){
        double anguloDeg;
        anguloDeg = Math.toRadians(num);
        return Math.tan(anguloDeg);
        
    }
    public boolean tan90grados(double num){
        if (num==90 || num==-90 ){
            return false;
        }
        return true;
    }
    public double sen (double num1){
        double anguloDeg;
        anguloDeg = Math.toRadians(num1);
        return Math.sin(anguloDeg);
    }
    public double cos (double num1){
        double anguloDeg;
        anguloDeg = Math.toRadians(num1);
        return Math.cos(anguloDeg);
    }
    public double iva (double num){
        double a;
        a=(num*0.19);
        return a;
    }
}
