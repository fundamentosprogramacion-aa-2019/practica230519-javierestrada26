
package estructurafor;
import java.util.Scanner;

public class Estructurafor {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensaje1="Reporte1";
        String mensajefinal="fin de reporte";
        int limite =10;
        System.out.printf("%s\n" ,mensaje1);
        for(int i=0;i<limite;i++){
            System.out.printf("contador %d\n", i);
        }
        System.out.printf("%s\n" ,mensajefinal);
    }
    
}
