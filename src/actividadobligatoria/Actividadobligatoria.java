
package actividadobligatoria;

import java.util.Scanner;


public class Actividadobligatoria {

        
          
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Por favor ingrese apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese edad: ");
        String edad = sc.nextLine();
        System.out.println("Ingrese hobbie: ");
        String hobbie = sc.nextLine();
        System.out.println("Ingrese Editor de codigo preferido: ");
        String editordecodigo = sc.nextLine();
        System.out.println("Ingrese Sistema operativo que utiliza: ");
        String sistemaoperativo = sc.nextLine();
  
        
        System.out.println("Nombre: "+nombre + "\nApellido: "+apellido + "\nEdad: "+edad + "\nHobbie: " +hobbie + "\nEditor de codigo preferido: " +editordecodigo + "\nSistema operativo que utiliza: " + sistemaoperativo);
        
    }
      
}
