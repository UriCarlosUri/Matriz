package matriz;

import java.util.Scanner;

public class sumaDiagonal {
	
	static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                int numeroActual = matriz[y][x];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println();
        }
    }

    static int sumarDiagonal(int[][] matriz, String diagonal) {
        int suma = 0;
        if (diagonal.equals("p")) {
            int x = 0, y = 0;
            while (x < matriz.length && y < matriz[0].length) {
                suma += matriz[y][x];
                x++;
                y++;
            }
        } else {
            int x = 0, y = matriz.length - 1;
            while (x < matriz.length && y >= 0) {
                suma += matriz[y][x];
                x++;
                y--;
            }
        }
        return suma;
    }


    public static void main(String[] args) {
    	 int matriz[][] = new int [3][3];
         int i, j;
         
         Scanner dato = new Scanner (System.in);
         
         System.out.println("Datos de la Matriz :");
         
         for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matriz [i][j]= dato.nextInt();
                }
            }
    	
       
        System.out.println("La matriz es:");
        imprimirMatriz(matriz);
        int sumaPrincipal = sumarDiagonal(matriz, "p");
        System.out.printf("La suma de la diagonal principal es %d", sumaPrincipal);
    }

}
