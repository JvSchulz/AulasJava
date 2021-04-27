import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 1 
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		/*
		int Num;
		
		System.out.println("Digite um número: ");
		Num = sc.nextInt();
		if(Num>0) {
			System.out.println("É positivo");
		}
		else {
			System.out.println("É negativo");
		}
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 2
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

		int Numero; 
		System.out.println("Digite um número: ");
		Numero = sc.nextInt();
		if(Numero%2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é impar");
		}
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 3
		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si
		
		int Numero1, Numero2;
		System.out.println("Digite um número inteiro: ");
		Numero1 = sc.nextInt();
		System.out.println("Digite outro número inteiro: ");
		Numero2= sc.nextInt();
		if(Numero1%Numero2 == 0 || Numero2%Numero1 == 0) {
			System.out.println("São multiplos");
		}
		
		else {
			System.out.println("Não são multiplos");
		}
		
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 4
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 
		System.out.println("Digite qual foi a hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.println("Digite qual foi a hora final: ");
		int horaFinal = sc.nextInt();
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
		
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 5
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

		int Quantidade, Codigo;
		double preco;
		System.out.println("Digite o codigo do produto: ");
		Codigo = sc.nextInt();
		System.out.println("Digite a quantidade de produtos: ");
		Quantidade = sc.nextInt();
		switch(Codigo) {
		case 1:
			preco = 4 * Quantidade;
			System.out.printf("Total: R$%.2f%n", preco);
			break;
		case 2:
			preco = 4.50 * Quantidade;
			System.out.printf("Total: R$%.2f%n", preco);
			break;
		case 3: 
			preco = 5 * Quantidade;
			System.out.printf("Total: R$%.2f%n", preco);
			break;
		case 4: 
			preco = 2 * Quantidade;
			System.out.printf("Total: R$%.2f%n", preco);
			break;
		case 5:
			preco = 1.50 * Quantidade;
			System.out.printf("Total: R$%.2f%n", preco);
			break;
		default:
			System.out.println("Codigo do produto invalido");
			break;
		}
		*/
	}

}
