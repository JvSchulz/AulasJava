import java.util.Scanner;
public class Exercicios1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*
	//---------------------------------------------------------------------------------------------
	//Exercicio 1
	//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
	
	int valor_1, valor_2;
	System.out.println("Digite dois valores inteiros: ");
	valor_1 = sc.nextInt();
	valor_2 = sc.nextInt();
	System.out.println("A soma dos valores é: "+(valor_1 + valor_2));
	
	//---------------------------------------------------------------------------------------------
	//Exercicio 2
	//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais
	
	double raio, area;
	System.out.println("Digite o valor do raio do circulo: ");
	raio = sc.nextDouble();
	area = 3.14159 * Math.pow(2, raio);
	System.out.printf("A area do circulo é %.4f%n",area);
	
	//---------------------------------------------------------------------------------------------
	//Exercicio 3
	//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
	
	int A, B, C, D, Diferenca;
	
	System.out.println("Digite os valores de A, B, C e D respectivamente: ");
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();
	D = sc.nextInt();
	Diferenca = (A * B - C * D);
	System.out.println("O valor de A*B-C*D é: "+ Diferenca);
	
	
	//---------------------------------------------------------------------------------------------
	//Exercicio 4
	//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
	
	int Numero_Func;
	double Horas, valor_hora;
	
	System.out.println("Digite o numero do funcionario: ");
	Numero_Func = sc.nextInt();
	System.out.println("Digite a quantidade de horas trabalhadas: ");
	Horas = sc.nextDouble();
	System.out.println("Digite o valor da hora de trabalho: ");
	valor_hora = sc.nextDouble();
	System.out.printf("Número do funcionário:%d, salário: R$%.2f%n",Numero_Func, (valor_hora * Horas));
	
	
	//---------------------------------------------------------------------------------------------
	//Exercicio 5
	//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

	int cod_p1, num_p1, cod_p2, num_p2;
	double valor_p1, valor_p2;
	System.out.println("Digite o codigo da peça, a quantidade de peças e o valor respectivamente, referente a peça 1: ");
	cod_p1 = sc.nextInt();
	num_p1 = sc.nextInt();
	valor_p1 = sc.nextDouble();
	System.out.println("Digite o codigo da peça, a quantidade de peças e o valor respectivamente, referente a peça 2: ");
	cod_p2 = sc.nextInt();
	num_p2 = sc.nextInt();
	valor_p2 = sc.nextDouble();
	System.out.printf("Valor a pagar: R$%.2f%n",(num_p1 * valor_p1 + num_p2 * valor_p2));

	
	//---------------------------------------------------------------------------------------------
	//Exercicio 6
	//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
	//	a) a área do triângulo retângulo que tem A por base e C por altura.
	//	b) a área do círculo de raio C. (pi = 3.14159)
	//	c) a área do trapézio que tem A e B por bases e C por altura.
	//	d) a área do quadrado que tem lado B.
	//	e) a área do retângulo que tem lados A e B.
	
	double A, B, C;
	System.out.println("Digite os valores de A, B e C respectivamente: ");
	A = sc.nextDouble();
	B = sc.nextDouble();
	C = sc.nextDouble();
	System.out.printf("Área do triângulo retângulo: %.2f%n",(A * C)/2);
	System.out.printf("Área do círculo: %.2f%n",(Math.PI *  Math.pow(C,2)));
	System.out.printf("Área do trapézio: %.2f%n", (A + B )/2 * C);
	System.out.printf("Área do quadrado: %.2f%n", Math.pow(2,B));
	System.out.printf("Área do retangulo: %.2f%n",A * B);
	
	*/
	sc.close();
	}

}
