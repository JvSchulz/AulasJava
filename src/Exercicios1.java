import java.util.Scanner;
public class Exercicios1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*
	//---------------------------------------------------------------------------------------------
	//Exercicio 1
	//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros
	
	int valor_1, valor_2;
	System.out.println("Digite dois valores inteiros: ");
	valor_1 = sc.nextInt();
	valor_2 = sc.nextInt();
	System.out.println("A soma dos valores �: "+(valor_1 + valor_2));
	
	//---------------------------------------------------------------------------------------------
	//Exercicio 2
	//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro casas decimais
	
	double raio, area;
	System.out.println("Digite o valor do raio do circulo: ");
	raio = sc.nextDouble();
	area = 3.14159 * Math.pow(2, raio);
	System.out.printf("A area do circulo � %.4f%n",area);
	
	//---------------------------------------------------------------------------------------------
	//Exercicio 3
	//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
	
	int A, B, C, D, Diferenca;
	
	System.out.println("Digite os valores de A, B, C e D respectivamente: ");
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();
	D = sc.nextInt();
	Diferenca = (A * B - C * D);
	System.out.println("O valor de A*B-C*D �: "+ Diferenca);
	
	
	//---------------------------------------------------------------------------------------------
	//Exercicio 4
	//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
	
	int Numero_Func;
	double Horas, valor_hora;
	
	System.out.println("Digite o numero do funcionario: ");
	Numero_Func = sc.nextInt();
	System.out.println("Digite a quantidade de horas trabalhadas: ");
	Horas = sc.nextDouble();
	System.out.println("Digite o valor da hora de trabalho: ");
	valor_hora = sc.nextDouble();
	System.out.printf("N�mero do funcion�rio:%d, sal�rio: R$%.2f%n",Numero_Func, (valor_hora * Horas));
	
	
	//---------------------------------------------------------------------------------------------
	//Exercicio 5
	//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

	int cod_p1, num_p1, cod_p2, num_p2;
	double valor_p1, valor_p2;
	System.out.println("Digite o codigo da pe�a, a quantidade de pe�as e o valor respectivamente, referente a pe�a 1: ");
	cod_p1 = sc.nextInt();
	num_p1 = sc.nextInt();
	valor_p1 = sc.nextDouble();
	System.out.println("Digite o codigo da pe�a, a quantidade de pe�as e o valor respectivamente, referente a pe�a 2: ");
	cod_p2 = sc.nextInt();
	num_p2 = sc.nextInt();
	valor_p2 = sc.nextDouble();
	System.out.printf("Valor a pagar: R$%.2f%n",(num_p1 * valor_p1 + num_p2 * valor_p2));

	
	//---------------------------------------------------------------------------------------------
	//Exercicio 6
	//Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
	//	a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
	//	b) a �rea do c�rculo de raio C. (pi = 3.14159)
	//	c) a �rea do trap�zio que tem A e B por bases e C por altura.
	//	d) a �rea do quadrado que tem lado B.
	//	e) a �rea do ret�ngulo que tem lados A e B.
	
	double A, B, C;
	System.out.println("Digite os valores de A, B e C respectivamente: ");
	A = sc.nextDouble();
	B = sc.nextDouble();
	C = sc.nextDouble();
	System.out.printf("�rea do tri�ngulo ret�ngulo: %.2f%n",(A * C)/2);
	System.out.printf("�rea do c�rculo: %.2f%n",(Math.PI *  Math.pow(C,2)));
	System.out.printf("�rea do trap�zio: %.2f%n", (A + B )/2 * C);
	System.out.printf("�rea do quadrado: %.2f%n", Math.pow(2,B));
	System.out.printf("�rea do retangulo: %.2f%n",A * B);
	
	*/
	sc.close();
	}

}
