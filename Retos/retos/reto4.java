package retos;
import java.util.*;

public class reto4 {
    public static void main(String[] args) {
        
        int jugador;
        int jugadasis;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Seleccione: \n0 :Piedra  \n1 :papel \n2 :Tijera");
        jugador=entrada.nextInt();

        jugadasis = (int)(Math.random()*3);
        System.out.println(jugadasis);

        if((jugador==0)&&(jugadasis==2)){
            System.out.println("Ganaste la maquina jugo Tijera y tu piedra");
        }
        else if((jugador==1)&&(jugadasis==0)){
            System.out.println("Ganaste la maquina jugo piedra y tu papel");
        }
        else if((jugador==2)&&(jugadasis==1)){
            System.out.println("Ganaste la maquina jugo papel y tu tijera");
        }

        if((jugadasis==0)&&(jugador==2)){
            System.out.println("Perdiste la maquina jugo piedra y tu tijera");
        }
        else if((jugadasis==1)&&(jugador==0)){
            System.out.println("Perdiste la maquina jugo papel y tu piedra");
        }
        else if((jugadasis==2)&&(jugador==1)){
            System.out.println("Perdiste la maquina jugo Tijeras y tu papel");
        }
        if(((jugadasis==0)&&(jugador==0))||((jugadasis==1)&&(jugador==1))||((jugadasis==2)&&(jugador==2))){
            System.out.println("Empate");

        }

        entrada.close();
    }
    
}
