package matriz;

import java.util.Random;
import java.util.Scanner;

public class trasponer {
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int[][] transpuesta = new int[matriz[0].length][matriz.length];
		int i, j;
        
        Scanner dato = new Scanner (System.in);
        
        System.out.println("Datos de la Matriz: ");
        
        for (i=0; i<=2; i++){
            for (j=0; j<=2; j++){
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matriz [i][j]= dato.nextInt();
               }
           }
		inicializar(matriz);
		System.out.println("\nMatriz original\n");
		visualizar(matriz);		
		transponerMatriz(matriz, transpuesta);
		System.out.println("\n\nMatriz transpuesta\n");
		visualizar(transpuesta);
	}
	
	static void transponerMatriz(int[][] matriz, int[][] transpuesta){
		for(int i=0; i < matriz.length; i++){
			for(int j=0 ; j < matriz[i].length; j++){
				transpuesta[j][i] = matriz[i][j];
			}
		}
	}
	
	static void inicializar(int[][] matriz){
		 Random r = new Random();
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j] = r.nextInt(25) + 1; 
			}
		}
	}

	static void visualizar(int[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	

}
