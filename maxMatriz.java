package matriz;

public class maxMatriz {

	public static void main(String[] args) {
		int[][] matriz = {{29,23,13},{41,57,69},{17,28,39}};
		int numeroMayor = matriz[0][0];
		for (int x=0;x<matriz.length;x++) {
			  for (int y=0;y<matriz[x].length;y++) {
			    if (matriz[x][y] > numeroMayor) {
			      numeroMayor = matriz[x][y];
			    }
			  }                
			}
		System.out.println("El número mayor de la matriz es " + numeroMayor);

	}
}
