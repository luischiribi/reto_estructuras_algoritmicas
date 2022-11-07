package retos;
import java.util.*;

public class reto1{
        public static void main(String[] args) 
{
    double f;

    Scanner entrada=new Scanner(System.in);

    System.out.println("Ingrese fahrenheits:");
    f = entrada.nextDouble();

    System.out.println("\nGrados celsius: " + ((f - 32)/1.8) );
    entrada.close();
}

}


