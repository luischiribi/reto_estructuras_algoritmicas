package retos;
import java.util.*;;

public class reto7 {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite cuantas calificaciones desea agregar ");
        int cant=Integer.parseInt(entrada.nextLine());

        double calif[]= new double[cant];
        double suma=0;
        double promedio; 
        for(int i=0;i<cant;i++){
            
        System.out.println("Calificacion "+(i+1));
        calif[i]=entrada.nextDouble();
        suma+=calif[i];
        }
        promedio=(suma/cant);
        System.out.println("El promedio es:" + promedio);
        if(promedio<3){

            System.out.println("Reprobaste");

        }
        else if((promedio>3)&&(promedio<4.0)){

            System.out.println("Pasaste raspando");

        }
        else if(promedio>4.0){
            System.out.println("Aprobaste con buenos resultados");
        }
        entrada.close();
    }
    
}
