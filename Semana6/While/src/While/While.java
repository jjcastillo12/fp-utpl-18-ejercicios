
package pkgwhile;

public class While {

   
    public static void main(String[] args) {
                int suma=0;
                int contador=0;
                
                System.out.printf("%s\t%s\n","contador","suma");
                while(contador<=4){
                    suma=suma+contador;
                    System.out.printf("%d\t\t%d\n",contador,suma);
                    contador=contador+1;
                    
                }
    }
    
}
