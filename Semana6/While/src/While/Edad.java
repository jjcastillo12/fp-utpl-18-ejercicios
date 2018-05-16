
package pkgwhile;
import java.util.Scanner;

public class Edad {
                public static void main(String[] args){
                    int suma=0;
                    int edad=0;
                    int contador=1;
                    String cadena_final;
                    
                    cadena_final=String.format("%s\t%s\n","edad","suma");
                    Scanner entrada=new Scanner(System.in);
                    while(contador<=5){
                    System.out.println("Ingrese el valor de edad:\n");
                    edad=entrada.nextInt();
                    suma=suma+edad;
                    cadena_final=String.format("%s%d\t%d\n",cadena_final,edad,suma);
                    contador=contador+1;
                    }
                    System.out.printf("%s",cadena_final);
                           
    
    }
}