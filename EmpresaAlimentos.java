
import java.util.Scanner; //libreria inputs

public class EmpresaAlimentos {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //en scanner caen los inputs
        
        System.out.println("-----------------------------------------");  //menu
        System.out.println("----------Empresa de Alimentos-----------");
        System.out.println("----------Ingrese la Información---------");
        System.out.println("-----------------------------------------");
        
        
        System.out.println("----------Ingrese sus datos personales---");
        System.out.print("Ingrese su nombre:      "); // ingreso de datos usuario y print de datos
	String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido:    ");
	String apellido = scanner.nextLine();
        System.out.print("Ingrese su edad:        ");
	int edad = scanner.nextInt();
      

        System.out.println("----------Ingrese datos del vehículo----"); 
        scanner.nextLine(); //esto evita el error de la siguiente linea entre int y string
        System.out.print("Ingrese la marca:                    ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo:                   ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese la cilindrada:               ");
        String cilindrada = scanner.nextLine();
        System.out.print("Ingrese el tipo de combustible:      ");
        String combustible = scanner.nextLine();   
        System.out.print("Ingrese la cantidad de pasajeros:    ");
        String pasajeros = scanner.nextLine();
              
            
         System.out.println("Ingrese la compra:                  "); //ingreso datos compra y distancia
         int compras = scanner.nextInt();
         System.out.println("Ingrese la distancia al despacho:   ");
         int distancia = scanner.nextInt();
         
                
             //if else para calcular total
            if (compras >= 50000) {
              System.out.println("------Boleta Cliente-------");
              System.out.println("Datos del cliente: " +nombre+ " " +apellido+ " edad: " +edad);
              System.out.println("Datos del vehículo : " +marca+ " " +modelo+ " Cil. " +cilindrada+ " Combus. "+combustible+" Pasajeros: "+pasajeros);  
              System.out.println("Despacho gratis");
              System.out.println("Total : " +compras);
              
              
            } else if (compras > 25000 && compras < 50000) {
              System.out.println("------Boleta Cliente-------");
              System.out.println("Datos del cliente: " +nombre+ " " +apellido+ " edad: " +edad);
              System.out.println("Datos del vehículo : " +marca+ " " +modelo+ " Cil. " +cilindrada+ " Combus. "+combustible+" Pasajeros: "+pasajeros);  
              System.out.println("Despacho X 150");
              distancia = distancia*150;
              int total= compras+distancia;
              System.out.println("Total : " +total);
              
            } else {
              System.out.println("------Boleta Cliente-------");
              System.out.println("Datos del cliente: " +nombre+ " " +apellido+ " edad: " +edad);
              System.out.println("Datos del vehículo : " +marca+ " " +modelo+ " Cil. " +cilindrada+ " Combus. "+combustible+" Pasajeros: "+pasajeros);  
              System.out.println("Despacho X 300");
              distancia = distancia*300;
              int total= compras+distancia;
              System.out.println("Total : " +total);
              
            } //final if
    }         //final main
    }         //final