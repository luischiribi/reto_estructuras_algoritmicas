package retos;
import java.util.*;

public class reto5 {
    public static void main(String[] args) {
        
        int ncantidad;
        int precios;
        int total=0;
        
        Scanner entrada=new Scanner(System.in);

        
        System.out.println("ingrese la cantidad de productos " );
        ncantidad=entrada.nextInt();

        
        for(int p = 0;p < ncantidad ; p++){

            System.out.println("precio del productos ");
            precios=entrada.nextInt();
            
            System.out.println("El total de los productos es "+ (total=precios+total ));
        }
        
        
        entrada.close();
    }
    
}
