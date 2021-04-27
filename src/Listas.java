import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee_listas;
public class Listas {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee_listas> list = new ArrayList<>();
		
		String name;
		int id;
		double salary;
		
		System.out.print("How much employees will be registered: ");
		int employeeNum = sc.nextInt();
		for(int i = 1; i <= employeeNum;i++) {
			System.out.println();
			System.out.print("Employee #" + i + ": ");
			id = sc.nextInt();
			System.out.print("Enter your name: ");
			name = sc.nextLine();
			System.out.print("Enter your salary");
			salary = sc.nextDouble();
			list.add.
		}
		
		
		
		
		sc.close();
	}
	public static boolean hasId(List<Employee_listas> list, int id) {
		Employee_listas emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
