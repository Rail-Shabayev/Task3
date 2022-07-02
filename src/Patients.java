import java.text.SimpleDateFormat;
import java.util.*;

public class Patients {
	static Integer id= 0;
	static Date dateNow = new Date();
	static SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");
	static String date = formatForDateNow.format(dateNow);
	static Scanner scanner = new Scanner(System.in);
	static Map<String, List<String>> patients = new LinkedHashMap<>();

	static void add() {
		System.out.println("Кого добавить? " + "\n0.Пациента" + "\n1.Доктора");
		int i = scanner.nextInt();
		if (i == 0)
			addPatient();
		else if (i == 1)
			Doctors.addDoctor(scanner);
	}

	static void addPatient() {
		System.out.println("Введите пациента: ");
		scanner.nextLine();
		String pat = scanner.nextLine();
		System.out.println(pat);
		patients.put((id++).toString(), new ArrayList<>(Arrays.asList(pat, date)));
	}

	static void printPatients() {
		String message = "%" + -5 + "s %" + -30.33 + "s %" + 35 + "s\n";
		String message2 = "%" + -5 + "s %" + -30.33 + "s %" + 35 + "s\n";
		@SuppressWarnings("resource")
		Formatter f = new Formatter(System.out);
		f.format(message, "Id", "ФИО", "Дата регистрации");
		f.format(message, "--", "---", "----------------");
		Iterator<String> iter = patients.keySet().iterator();
		String name;
		while (iter.hasNext()) {
			name = iter.next();
			f.format(message2, name, patients.get(name).get(0), patients.get(name).get(1));
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	static void editPatient() {
		try {
			System.out.println("Введите id пациента: ");
			int id = scanner.nextInt();
			System.out.println("Введите новое ФИО пациента: ");
			String pat = scanner.nextLine();
			patients.get(id).add(0, pat);
		} catch (NullPointerException e) {
			System.out.println("Пациенты отсутствуют");
		} 
	}

	@SuppressWarnings("unlikely-arg-type")
	static void deletePatient() {
		try {
			System.out.println("Введите id пациента: ");
			int id = scanner.nextInt();
			patients.remove(id);
		} catch (NullPointerException e) {
			System.out.println("Пациенты отсутствуют");
		}
	}

}
