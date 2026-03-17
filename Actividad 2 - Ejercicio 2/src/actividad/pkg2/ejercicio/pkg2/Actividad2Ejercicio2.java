/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg2.ejercicio.pkg2;
/*
import java.util.Scanner;

public class Actividad2Ejercicio2 {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
      
       System.out.print("Ingrese el primer nuúmero");
       int num1 = teclado.nextInt();
       
       System.out.print("Ingrese el primer nuúmero");
       int num2 = teclado.nextInt();
       
    if(num1>num2){
         System.out.print("Ingrese el primer nuúmero");
         System.out.println("El primer numero("+ num1 +")Es el mayor.");
    } else if (num1<num2){
        System.out.println("El segundo numero("+ num1 +")Es el mayor.");
       }
    }
}
*/

/*
import java.util.Scanner;

public class Actividad2Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int num2 = teclado.nextInt();

        int UltCifra1 = num1 % 10;
        int UltCifra2 = num2 % 10;

        if (UltCifra1 == UltCifra2) {
            System.out.println("Ambos numeros terminan igual (" + UltCifra1 + ") ");
        } else {
            System.out.println("No, sus últimas cifras son diferentes (" + UltCifra1 + " y " + UltCifra2 + ")");
        }

        teclado.close();
    }
}
*/
/*
import java.util.Scanner;

public class Actividad2Ejercicio2 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Ingrese un numero:");
     int num = teclado.nextInt();
     
     if (num % 3 == 0 && num % 5 == 0) {
         System.out.println("El ("+ num +") es divisible por 3 y 5");
     } else {
         System.out.println("El ("+ num +") no es divisible por 3 y 5");
     }
    }
}
*/

/*
import java.util.Scanner;

public class Actividad2Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                
         System.out.println("Ingrese Algun año");
         int num = teclado.nextInt();
         
         if (num % 4 == 0) {
             System.out.print("El año ("+ num +") es bisiesto");
         }else {
             System.out.print("El año ("+ num +") NO es bisiesto");
             
         }
         teclado.close();
    }
}
*/

/*
import java.util.Scanner;

public class Actividad2Ejercicio2 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
      
     System.out.println("Ingrese el primer numero:");
     int num1 = teclado.nextInt();
     
     System.out.println("Ingrese el segundo numero:");
     int num2 = teclado.nextInt();
     
     System.out.println("Ingrese el tercer numero:");
     int num3 = teclado.nextInt();
     int mayor = num1;
     if (num2> mayor);{
     mayor = num2;
     if(num3>mayor) {
     mayor = num3;
     System.out.println("El numero mayor es("+ mayor +")");  
     }
  }
     teclado.close();
    }
}
*/

import java.util.Scanner;

public class Actividad2Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese una nota (Del 0 al 10): ");
        int num = teclado.nextInt();
        
        // 1. Validamos que la nota esté en el rango permitido
        if (num < 0 || num > 10) {
            System.out.println("La calificación introducida no es válida.");
        } 
        // 2. Si es válida, empezamos a filtrar según la tabla
        else if (num < 5) {
            System.out.println("Insuficiente");
        } 
        else if (num < 6) {
            System.out.println("Suficiente");
        } 
        else if (num < 7) {
            System.out.println("Bien");
        } 
        else if (num < 9) {
            System.out.println("Notable");
        } 
        else {
            // Si llegó acá es porque es 9 o 10
            System.out.println("Sobresaliente");
        }
        
        teclado.close();
    }
}

