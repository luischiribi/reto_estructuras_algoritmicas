package retos;
import java.util.*;

public class reto8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite cuantos nadadores va a agregar:");
        int cant=Integer.parseInt(entrada.nextLine());
        
        
        String[] nombre= new String[cant];
        double[] tiempo=new double[cant];
        double menor=tiempo[0];
        

        for (int i=0;i<cant;i++){

            System.out.println("Escriba nombre del competidor"+ (i+1));
            nombre[i]=entrada.next();

            System.out.println("Digite el tiempo del competidor");
            tiempo[i]=entrada.nextDouble();
        }
        for (int i = 0; i < cant; i++) {

            System.out.println(nombre[i]+"\t"+ tiempo[i]);
        }
        for (int i = 0; i < tiempo.length; i++) {
            if (tiempo[i]>=menor) {
                 menor=tiempo[i];
                 
            }else {
                menor=tiempo[i];
                System.out.println("El ganador es: " + menor);
            }
        }
       
        entrada.close();
    }
}
