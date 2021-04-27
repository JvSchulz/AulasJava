import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int idade = 26;
		String nome = "Carlos";
		double renda = 3000.00;
		System.out.printf("%s tem %d recebe %.2f reais%n",nome, idade, renda);

		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b;
		System.out.println(resultado);
		
		String nome;
		nome = sc.next();
		System.out.println("Nome: " + nome);
		int y;
		y = sc.nextInt();
		System.out.println("valor: "+ y);
		char x;
		x = sc.next().charAt(0);
		System.out.println("valor: "+ x);
		
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		
		sc.close();
		
	}

}
