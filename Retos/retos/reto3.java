package retos;
import java.util.*;

public class reto3 {
    public static void main(String[] args) {
        
        int caraosello;
        int caraosellosis;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seleccione: \n0 :cara  \n1 :sello");
        caraosello=entrada.nextInt();

        caraosellosis = (int)(Math.random()*2);
        System.out.println(caraosellosis);

       
        if((caraosello==0)&&(caraosellosis==0)){
            System.out.println(" HA GANADO la maquina lanzo  CARA y usted eligio CARA");
        }
        else if((caraosello==1)&&(caraosellosis==1)){
            System.out.println(" HA GANADO la maquina lanzo  SELLO y usted eligio SELLO");
        }
        if((caraosellosis==0)&&(caraosello==1)){
            System.out.println(" HA PERDIDO la maquina lanzo  CARA y usted eligio SELLO");
        }
        else if((caraosellosis==1)&&(caraosello==0)){
            System.out.println(" HA PERDIDO la maquina lanzo  SELLO y usted eligio CARA");
        }
        
        entrada.close();
    }
    
}
