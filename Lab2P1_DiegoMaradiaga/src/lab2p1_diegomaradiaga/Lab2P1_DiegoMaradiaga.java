package lab2p1_diegomaradiaga;

import java.util.Scanner;
        
public class Lab2P1_DiegoMaradiaga {

    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    
    int opcion;
        do{
        System.out.println("---MENU---");
        System.out.println("1) MCD");
        System.out.println("2) Sumatoria");
        System.out.println("3) Supermercado");
        System.out.println("Ingrese su opción: ");
        opcion = leer.nextInt();
        
        if (opcion == 1) {
            int numeroA, numeroB;
            int MCD = 0;
            
            System.out.println("Ingresa A: ");
            numeroA = leer.nextInt();
            System.out.println("Ingresa B: ");
            numeroB = leer.nextInt();
            
            if (numeroA<=0){
                System.out.println("Los numeros ingresados deben ser positivos. ");
            }//Fin de else validacion numeroA
            int copiaA=numeroA;
            if (numeroB<=0) {
                 System.out.println("Los numeros ingresados deben ser positivos. ");
            }//Fin de else validacion numeroB
            else {    
            int copiaB= numeroB;
                do {
                   
                if (numeroA > numeroB){
                    MCD = numeroA - numeroB;
                    numeroA = MCD;
                }//Fin de validacion de mayorA   
                else if (numeroB > numeroA){
                    MCD = numeroB - numeroA;
                    numeroB = MCD;
                }//Fin de validacion de mayorA 
                }while (numeroA != numeroB);
            
            System.out.println("El MCD de "+copiaA+" y "+copiaB+" es: "+MCD);
            }//Fin de else opcion 1
        }//Fin de opcion 1
        
        else if (opcion == 2) {
            double K; 
            double n; 
            n = 1.0;
            double R = 0;
            
            System.out.println("Ingrese K: ");
            K = leer.nextDouble();
            
            if  (K <=0) {
                System.out.println("El numero que ha ingresado es negativo.");
            }//Fin de validacion
            else {
            while ( n <= K ){
            double base = n/(n+1);
            R =  R + Math.pow(base, n);
            n++;
            }//Fin de while
            
            System.out.println("El valor de la sumatoria es: "+R);
            }//Fin else
        }//Fin opcion 2
                
        else if (opcion == 3) {
            int tipocliente, cantidadproducto;
            double precioproducto, descuento=0.0, total;
            
            System.out.println("Ingrese el tipo de cliente (0,1,2): ");
            tipocliente = leer.nextInt();
            System.out.println("Ingrese el precio de la unidad del producto: ");
            precioproducto = leer.nextDouble();
            System.out.println("Ingrese la cantidad del producto: ");
            cantidadproducto = leer.nextInt();
                
            if (tipocliente == 0){
                if (cantidadproducto >= 10 && cantidadproducto <= 19){
                cantidadproducto = cantidadproducto - 2;
                }//fin if cantidad de producto TC0
                else if (cantidadproducto >= 20){
                cantidadproducto = cantidadproducto - 5;
                }//fin if cantidad de producto TC0
  
            }//fin if tipo de cliente 0
            else if (tipocliente == 1){
                if (cantidadproducto >= 20 && cantidadproducto <= 29){
                cantidadproducto = cantidadproducto - 2;
                }//fin if cantidad de producto TC1
                else if (cantidadproducto >= 30){
                cantidadproducto = cantidadproducto - 5;
                }//fin if cantidad de producto TC1
                descuento = (precioproducto*cantidadproducto)*0.1;
            }//fin if tipo de cliente 1
            else if (tipocliente == 2){
                if (cantidadproducto >= 30 && cantidadproducto <= 39){
                cantidadproducto = cantidadproducto - 2;
                }//fin if cantidad de producto TC2
                else if (cantidadproducto >= 40){
                cantidadproducto = cantidadproducto - 5;
                }//fin if cantidad de producto TC2
                descuento = (precioproducto*cantidadproducto)*0.3;
            }//fin if tipo de cliente 2
          total = (precioproducto*cantidadproducto)- descuento;
            
            System.out.println("El total a pagar es: "+total);       
        }//Fin opcion 3
                
        else if (opcion == 4) { 
            System.out.println("Saliendo...");
        }// fin else
        } while (opcion != 4);  //Fin del while menu 
    }//Fin del main
    
}//Fin de la clase
