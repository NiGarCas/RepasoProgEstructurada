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
public class RepasoProgEstructurada2 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double [] rentaLiq = new double [10];
            double [] patrimonio = new double [10];
            int [] valorCred = new int [10];
            int creditos_a_cursar = 0;
            int cantidad_estudiantes = 0;
            int [] codigoEst = new int [10];
            double [] valorMatricula = new double [10];
            Scanner flujoEntrada = new Scanner(System.in);
            while(( cantidad_estudiantes >= 10)||( cantidad_estudiantes <= 1)){
            System.out.println ("Escriba cantidad de estudiantes que serán registrados. (máximo 10)");
            cantidad_estudiantes = flujoEntrada.nextInt();
            }
            for(int i = 1; i <= cantidad_estudiantes; i = i + 1){
                System.out.println ("Escriba el codigo del estudiante " + i);
                codigoEst[i-1] = flujoEntrada.nextInt();
                System.out.println ("Escriba el valor de la renta liquida del estudiante " + i);
                rentaLiq[i-1] = flujoEntrada.nextDouble();
                System.out.println ("Escriba el valor del patrimonio del estudiante " + i);
                patrimonio[i-1] = flujoEntrada.nextDouble();
                System.out.println ("Escriba la cantidad de creditos a cursar del estudiante " + i);
                creditos_a_cursar = flujoEntrada.nextInt();
                if ((rentaLiq[i-1]<= 25000)||(patrimonio[i-1]<= 100000)){
                    valorCred[i-1] = 130;
                }else {
                    if ((rentaLiq[i-1]<= 30000)||(patrimonio[i-1]<= 150000)){
                    valorCred[i-1] = 200;
                    }else{
                        valorCred[i-1] = 280;
                    }
                }
                valorMatricula[i-1] = valorCred[i-1] * creditos_a_cursar;
                
            }
            System.out.println ("REPORTE" + "\n" + "CODIGO      VALOR MATRICULA");
                for(int i = 1; i <= cantidad_estudiantes; i = i + 1){
                    System.out.println (codigoEst[i-1] + "     " + valorMatricula[i-1]);
                }     
        // TODO code application logic here
    }

}
