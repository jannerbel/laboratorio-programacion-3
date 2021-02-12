
package intento2;
import java.util.Scanner;

public class Intento2 {

    
    public static void main(String[] args) {
        
        Calculos model = new Calculos();
        Scanner teclado = new Scanner (System.in);
    	System.out.println("BIENVENIDO A LA CALCULADORA");
    	
    	int opcion;
    	
    	do{
                System.out.println("Seleccione una opción");
        	System.out.println("1-suma");
            System.out.println("2-resta");
        	System.out.println("3-multiplicación");
            System.out.println("4-División");
        	System.out.println("5-potencia");
            System.out.println("6-raiz");
            System.out.println("7-tangente");
            System.out.println("8-Seno");
            System.out.println("9-coseno");
        	System.out.println("10-iva");
                System.out.println("11-Salir del programa");
            opcion=teclado.nextInt();
            float num1, num2;  
            double num, potencia, anguloDeg;
 
            switch(opcion){
            	
            	case 1: System.out.println("DIGITE EL PRIMER NUMERO:");
                num1=teclado.nextFloat();
                System.out.println("DIGITE EL SEGUNDO NUMERO:");
                num2=teclado.nextFloat();
                
                System.out.println(model.suma(num1,num2));
                    break;
            	case 2: System.out.println("INGRESE EL PRIMER NUMERO:");
                num1=teclado.nextFloat();
                System.out.println("DIGITE EL SEGUNDO NUMERO:");
                num2=teclado.nextFloat();
                System.out.println(model.resta(num1,num2));
                    break;
            	case 3:
                    System.out.println("INGRESE EL PRIMER NUMERO:");
                num1=teclado.nextFloat();
                System.out.println("DIGITE EL SEGUNDO NUMERO:");
                num2=teclado.nextFloat();
                System.out.println(model.multiplicacion(num1,num2));
                    break;
            	case 4:
                    System.out.println("INGRESE EL NUMERO DIVIDENDO:");
                num1=teclado.nextFloat();
                System.out.println("DIGITE EL NUMERO DIVISOR:");
                num2=teclado.nextFloat();
                if (num2==0){
                    System.out.println(model.DivisionCero(num1, num2));
                      }
                     System.out.println(model.division(num1,num2));
                    break;
            	case 5:
                     System.out.println("INGRESE EL NUMERO DE LA BASE:");
                num=teclado.nextFloat();
                System.out.println("DIGITE EL NUMERO DEL EXPONENTE:");
                potencia=teclado.nextFloat();
                System.out.println(model.potencia(num,potencia));
                    break;
            	case 6:
                    System.out.println("INGRESE UN NUMERO:");
                num=teclado.nextFloat();
                System.out.println(model.raiz(num));
                    break;
            	case 7:
                System.out.println("INGRESE UN NUMERO:");
                anguloDeg = teclado.nextDouble();
                if (!(anguloDeg == 90 || anguloDeg == -90)){
                    System.out.println(model.tan(anguloDeg));
                }
                System.out.println(model.tan90grados(anguloDeg));
                    break;
            	case 8:
                System.out.println("INGRESE UN NUMERO:");
                anguloDeg = teclado.nextDouble();
                System.out.println(model.sen(anguloDeg));
                    break;
            	case 9:
                System.out.println("INGRESE UN NUMERO:");
                anguloDeg = teclado.nextDouble();
                System.out.println(model.cos(anguloDeg));
                    break;
            	case 10:
                    double a;
                 System.out.println("INGRESE UN VALOR:");  
                 a=teclado.nextDouble();
                 System.out.println(model.iva(a));
                	break;
                case 11:
                    break;
            	default:
                    System.out.println("Opción digitada no valida");
        	}
         
 
    	}while(opcion != 11);
 	
    	
	}
	
}


    
    

