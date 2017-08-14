                        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoprogestructurada;
import java.util.*;

/**
 *
 * @author nicol
 */
public class RepasoProgEstructurada {

      public static double calcularSalario(double valor, int horas){
      double salario;
      if (horas <= 40){
          salario = (horas * valor);
      }else{
          if (horas <= 48){
              salario = ((valor * 40) + (((horas) - 40) * (valor * 2)));
          }else{
              salario = (((valor * 40) + (8 * (valor * 2))) + (((horas) - 48) * (valor * 3)));
          }
      }
      return salario;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        String nombre = null;
        int horas  = 0;
        double valorHora = 0;
        double salario = 0;
        // Creacion del flujo de entrada
        Scanner flujoEntrada = new Scanner (System.in);
        // Lectura de datos
        System.out.println("Ingrese nombre del trabajador");
        nombre = flujoEntrada.next();
        System.out.println("Ingrese numero de horas trabajadas");
        horas = flujoEntrada.nextInt();
        System.out.println("Ingrese el valor normal de la hora trabajada");
        valorHora = flujoEntrada.nextDouble();
        // Invocando la funcion
        salario = calcularSalario(valorHora, horas);
        // Imprimir en pantalla la respuesta
        System.out.println("Salario de " + nombre + ": " + salario); 
        // TODO code application logic here
    }
    
}