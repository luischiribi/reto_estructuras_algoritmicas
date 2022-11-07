package retos;
import java.util.*;

public class reto6 {
    public static void main(String[] args) {
        
        int caraosello;
        int caraosellosis;
        int apuesta;
        int res=1;
        int ganadas=0;
        int perdidas=0;
        int Partidasjugadas=0;
        int total=0;

        Scanner entrada = new Scanner(System.in);
        
       while (res==1) {

        System.out.println("Ingrese su apuesta");
        apuesta=entrada.nextInt();
        
        System.out.println("Seleccione: \n0 :cara  \n1 :sello");
        caraosello=entrada.nextInt();

        caraosellosis = (int)(Math.random()*2);
        System.out.println(caraosellosis);

       
        if((caraosello==0)&&(caraosellosis==0)){
            ganadas +=1;
            System.out.println(" HA GANADO la maquina lanzo  CARA y usted eligio CARA");
            System.out.println("GANO:"+(total=apuesta)*2);
            System.out.println("El total de dinero ganado es "+ (total=apuesta+total ));
            
        }
        else if((caraosello==1)&&(caraosellosis==1)){
            ganadas +=1;
            System.out.println(" HA GANADO la maquina lanzo SELLO y usted eligio SELLO");
            System.out.println("GANO:"+(total=apuesta)*2);
            System.out.println("El total de dinero ganado es "+ (total=apuesta+total ));
        }
        if((caraosellosis==0)&&(caraosello==1)){
            perdidas+=1;
            System.out.println(" HA PERDIDO la maquina lanzo  CARA y usted eligio SELLO");
            System.out.println("PERDIO:"+(total=apuesta-apuesta));
            System.out.println("El total de dinero perdido es "+ (total=apuesta-total ));
            
        }
        else if((caraosellosis==1)&&(caraosello==0)){
            perdidas+=1;
            System.out.println(" HA PERDIDO la maquina lanzo  SELLO y usted eligio CARA");
            System.out.println("PERDIO:"+(total=apuesta-apuesta));
            System.out.println("El total de dinero perdido es "+ (total=apuesta-total ));
            
        }
        System.out.println("Partidas ganadas" +ganadas);
        System.out.println("Partidas perdidas" +perdidas);
        Partidasjugadas+=1;

        System.out.println("El total de dinero  es "+ total);
        
        System.out.println("Partidas jugadas: " +Partidasjugadas);
        System.out.println("\nDesea continuar: \n1 :si  \n0 :no");
        res=entrada.nextInt();
       }
       entrada.close();  
    }
    
}
