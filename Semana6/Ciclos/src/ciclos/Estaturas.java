
package ciclos;
import java.util.Scanner;

public class Estaturas {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         double estatura=0;
         int contador=0;
         boolean bandera=true;
         double prom=0;
         String reporte=String.format("%s\n","Estatura Estudiante"); 
                    
       
        while(bandera){
            System.out.printf("Ingrese la estatura del estudiante\n");
            estatura = entrada.nextDouble();
            if(estatura<=1.20){
                estatura=1.20;
            }
            
            prom=prom+estatura;
            contador=contador+1;
            reporte=String.format("%s%.2f\n",reporte,estatura); 
            
            entrada.nextLine(); 
            
            System.out.println("Ingrese si(salir)");
            String temporal = entrada.nextLine();
            if(temporal.equals("si")){
                bandera = false;
            }
        }
        prom=prom/contador;
        System.out.printf("Reporte Estaturas:\n%sPromedio de Estaturas: %.2f\nReporte generado por Deportes\n",reporte,prom);
        
            
     }
}
    
