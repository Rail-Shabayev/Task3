import java.util.*;

public class Doctors {
	static List<String> doctors = new ArrayList<>();

	static void addDoctor(Scanner scanner) {
		System.out.println("Введите доктора: ");
		scanner.nextLine();
		String doc = scanner.nextLine();
		doctors.add(doc);
	}

}
