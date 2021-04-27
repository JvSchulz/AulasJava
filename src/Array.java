import java.util.Locale;
import java.util.Scanner;
import entities.rooms;
public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("How many students will rent a room?");
		rooms[] array = new rooms[10];
		int student_number = sc.nextInt();
		for(int i = 0;i<student_number;i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room_number = sc.nextInt();
			array[room_number] = new rooms(name, room_number, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
		if (array[i] != null) {
		System.out.println(i + ": " + array[i]);
		}
		sc.close();
}
}
}