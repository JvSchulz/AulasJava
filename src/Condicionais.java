import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//------------------------------------------------------------------------------------------
		//Exercicio 
		//Criar um programa que leia a altura e sexo de uma pessoa e retorne o peso ideal de uma pessoa:
		//	Sexo feminino : 62.1 * altura -  47.7
		//	Sexo masculino : 72.7 * altura - 58
		
		
		double altura, peso_ideal;
		char sexo;
		System.out.println("Digite a altura e o sexo respectivamente: ");
		altura  =  sc.nextDouble();
		sexo = sc.next().charAt(0);
		if(sexo == 'M') {
			peso_ideal = 72.7 * altura - 58;
		}
		else {
			peso_ideal = 62.1 * altura - 47.7;
		}
		System.out.printf("Sexo: %c, Altura: %.2f e peso ideal: %.2fkgs%n",sexo,altura,peso_ideal);
		sc.close();
	}

}
