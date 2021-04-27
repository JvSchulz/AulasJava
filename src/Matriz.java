import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		System.out.println("Digite os valores da matriz:");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.printf("[%d][%d]: ",i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite um numero a ser verificado: ");
		int x = sc.nextInt();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(x == mat[i][j]) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
			}
		}
	}
}
	
}
