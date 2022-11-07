package retos;
import java.util.*;

public class reto9 {
    public static void main(String[] args) {
        
        String [][] nombrepro=new String[4][4];
        int [][]precio = new int[4][4];
        int [][]codigo = new int[4][4];

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el codigo del producto 1");
        codigo[0][0]=entrada.nextInt();
        System.out.println("ingrese producto 1");
        nombrepro[0][0]=entrada.next();
        System.out.println("precio del producto 1");
        precio[0][0]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 2");
        codigo[0][1]=entrada.nextInt();
        System.out.println("ingrese producto 2");
        nombrepro[0][1]=entrada.next();
        System.out.println("precio del producto 2");
        precio[0][1]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 3");
        codigo[0][2]=entrada.nextInt();
        System.out.println("ingrese producto 3");
        nombrepro[0][2]=entrada.next();
        System.out.println("precio del producto 3");
        precio[0][2]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 4");
        codigo[0][3]=entrada.nextInt();
        System.out.println("ingrese producto 4");
        nombrepro[0][3]=entrada.next();
        System.out.println("precio del producto 4");
        precio[0][3]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 5");
        codigo[1][0]=entrada.nextInt();
        System.out.println("ingrese producto 5");
        nombrepro[1][0]=entrada.next();
        System.out.println("precio del producto 5");
        precio[1][0]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 6");
        codigo[1][1]=entrada.nextInt();
        System.out.println("ingrese producto 6");
        nombrepro[1][1]=entrada.next();
        System.out.println("precio del producto 6");
        precio[1][1]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 7");
        codigo[1][2]=entrada.nextInt();
        System.out.println("ingrese producto 7");
        nombrepro[1][2]=entrada.next();
        System.out.println("precio del producto 7");
        precio[1][2]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 8");
        codigo[1][3]=entrada.nextInt();
        System.out.println("ingrese producto 8");
        nombrepro[1][3]=entrada.next();
        System.out.println("precio del producto 8");
        precio[1][3]=entrada.nextInt();


        System.out.println("ingrese el codigo del producto 9");
        codigo[2][0]=entrada.nextInt();
        System.out.println("ingrese producto 9");
        nombrepro[2][0]=entrada.next();
        System.out.println("precio del producto 9");
        precio[2][0]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 10");
        codigo[2][1]=entrada.nextInt();
        System.out.println("ingrese producto 10");
        nombrepro[2][1]=entrada.next();
        System.out.println("precio del producto 10");
        precio[2][1]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 11");
        codigo[2][2]=entrada.nextInt();
        System.out.println("ingrese producto 11");
        nombrepro[2][2]=entrada.next();
        System.out.println("precio del producto 11");
        precio[2][2]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 12");
        codigo[2][3]=entrada.nextInt();
        System.out.println("ingrese producto 12");
        nombrepro[2][3]=entrada.next();
        System.out.println("precio del producto 12");
        precio[2][3]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 13");
        codigo[3][0]=entrada.nextInt();
        System.out.println("ingrese producto 13");
        nombrepro[3][0]=entrada.next();
        System.out.println("precio del producto 13");
        precio[3][0]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 14");
        codigo[3][1]=entrada.nextInt();
        System.out.println("ingrese producto 14");
        nombrepro[3][1]=entrada.next();
        System.out.println("precio del producto 14");
        precio[3][1]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 15");
        codigo[3][2]=entrada.nextInt();
        System.out.println("ingrese producto 15");
        nombrepro[3][2]=entrada.next();
        System.out.println("precio del producto 15");
        precio[3][2]=entrada.nextInt();

        System.out.println("ingrese el codigo del producto 16");
        codigo[3][3]=entrada.nextInt();
        System.out.println("ingrese producto 16");
        nombrepro[3][3]=entrada.next();
        System.out.println("precio del producto 16");
        precio[3][3]=entrada.nextInt();

        for(int fila=0;fila<4;fila++)
        {
        
        for(int columna=0;columna<4;columna++)
        {
        
        System.out.print(codigo[fila][columna]+ " \t " +nombrepro[fila][columna]+ " \t " +precio[fila][columna]);
        
        }
        System.out.println(" ");
        
        }   
        entrada.close();       
        }


  
}
