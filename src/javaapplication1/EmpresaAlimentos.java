/*
 prueba de comit
 */
package javaapplication1;

/**
 *
 * @author agg
 */


import java.util.Scanner; //libreria inputs

public class EmpresaAlimentos {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //en scanner caen los inputs
        
        System.out.println("-----------------------------------------");  //menu
        System.out.println("----------Empresa de Alimentos-----------");
        System.out.println("----------Ingrese la Información---------");
        System.out.println("-----------------------------------------");
        
        System.out.println("----------Ingrese sus datos personales---");
        
        System.out.print("Ingrese su nombre:    "); // ingreso de datos y print de datos
	String nombre = scanner.nextLine();
        System.out.println(nombre);
        
        System.out.print("Ingrese su apellido:    ");
	String apellido = scanner.nextLine();
        System.out.println(apellido);
                
        System.out.print("Ingrese su edad:    ");
	int edad = scanner.nextInt();
        System.out.println(edad);

        System.out.println("----------Ingrese datos del vehículo----");
        
        
         System.out.println("Ingrese la compra:                  ");
         int compras = scanner.nextInt();
         System.out.println("Ingrese la distancia al despacho:   ");
         int distancia = scanner.nextInt();
         
                
                       //if else para calcular total
            if (compras >= 50000) {
              System.out.println("Despacho gratis");
              System.out.println("Total : " +compras);
              
              
            } else if (compras > 25000 && compras < 50000) {
              System.out.println("Despacho X 150");
              distancia = distancia*150;
              int total= compras+distancia;
              System.out.println("Total : " +total);
              
            } else {
              System.out.println("Despacho X 300");
              distancia = distancia*300;
              int total= compras+distancia;
              System.out.println("Total : " +total);
              
            }
         
    
    
    
    }
    }