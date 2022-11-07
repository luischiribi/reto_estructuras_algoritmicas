package retos;
import java.util.*;

public class reto2{
   public static void main(String[] args) 
{
    double pbebe;
    double mbebe;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el peso del bebe:");
    pbebe = entrada.nextDouble();

    System.out.println("Ingrese los meses  del bebe:");
    mbebe = entrada.nextDouble();

    System.out.println("\nDosis Vacuna: " + (((pbebe + 10)/mbebe * 10)*8) );

    entrada.close();
}

}