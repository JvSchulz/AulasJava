import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 1 
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		/*
		int Num;
		
		System.out.println("Digite um n�mero: ");
		Num = sc.nextInt();
		if(Num>0) {
			System.out.println("� positivo");
		}
		else {
			System.out.println("� negativo");
		}
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 2
		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

		int Numero; 
		System.out.println("Digite um n�mero: ");
		Numero = sc.nextInt();
		if(Numero%2 == 0) {
			System.out.println("O n�mero � par");
		}
		else {
			System.out.println("O n�mero � impar");
		}
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 3
		//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si
		
		int Numero1, Numero2;
		System.out.println("Digite um n�mero inteiro: ");
		Numero1 = sc.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		Numero2= sc.nextInt();
		if(Numero1%Numero2 == 0 || Numero2%Numero1 == 0) {
			System.out.println("S�o multiplos");
		}
		
		else {
			System.out.println("N�o s�o multiplos");
		}
		
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//Exercicios 4
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		 
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
		//Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

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
