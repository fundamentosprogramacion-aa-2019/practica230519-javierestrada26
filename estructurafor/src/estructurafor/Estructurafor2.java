
package estructurafor;
import java.util.Scanner;

public class Estructurafor2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensaje1="Reporte1";
        String mensajefinal="fin de reporte";
        int limite =10;
        String mensajeReporte="";
        //System.out.printf("%s\n" ,mensaje1);
        mensajeReporte= String.format("%s%s\n", mensajeReporte, mensaje1);
        for(int i=1;i<limite;i++){
           mensajeReporte=String.format("%sContador%d\n", mensajeReporte, 
                   i);
        }
         mensajeReporte=String.format("%s%s\n", mensajeReporte, 
                   mensajefinal);
        System.out.printf("%s\n" , mensajeReporte);
    }
    
}
