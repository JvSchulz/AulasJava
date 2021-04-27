import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
public class Exercicios5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//-----------------------------------------------------------------------------------------------------------------------------------------------
//Exerc�cio 1
//Fazer um programa para ler os valores da largura e altura	de um ret�ngulo. Em seguida, mostrar na tela o valor de	sua �rea, per�metro e diagonal.
		/*
		Rectangle x;
		
		x = new Rectangle();
		
		System.out.println("Insert the width and the heigth of the rectangle: ");
		x.Width = sc.nextDouble();
		x.Heigth = sc.nextDouble();
		
		double area = x.area();
		
		double perimeter = x.perimeter();
		
		double diagonal = x.diagonal();
		
		System.out.printf("Area: %.2f%nPerimeter: %.2f%nDiagonal: %.2f",area, perimeter, diagonal);
		*/
//-----------------------------------------------------------------------------------------------------------------------------------------------
//Exerc�cio 1
//Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em	seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) e mostrar novamente os dados do funcion�rio
		Employee x;
		x = new Employee();
		
		System.out.println("Insert your name, gross salary and the tax: ");
		x.name = sc.nextLine();
		x.GrossSalary = sc.nextDouble();
		x.Tax = sc.nextDouble();
		
		double salary = x.NetSalary();
		
		System.out.printf("Employee: %s, $%.2f%n",x.name, salary);
		System.out.println("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: "+x);
		
		sc.close();
	}

}
