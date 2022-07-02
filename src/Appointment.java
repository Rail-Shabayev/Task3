import java.util.*;

public class Appointment {
	static Scanner scanner = new Scanner(System.in);
	static Map<String, List<String>> appoint = new LinkedHashMap<>();

	static void makeAppointment() {
		System.out.println("Введите пациента: ");
		String pat = scanner.nextLine();
		System.out.println("Введите доктора: ");
		String doc = scanner.nextLine();
		System.out.println("Введите дату: ");
		String date = scanner.nextLine();
		System.out.println("Выберите статус: ");
		System.out.println("1.Новый" + "\n2.В процессе" + "\n3.Отменен" + "\n4.Ожидает оплаты" + "\n5.Завершен");
		String stat = status(scanner.nextInt());
		appoint.put(pat, new ArrayList<>(Arrays.asList(doc, date, stat)));
	}

	static String status(int i) {
		switch (i) {
		case (0):
			return "Новый";
		case (1):
			return "В процессе";
		case (2):
			return "Отменен";
		case (3):
			return "Ожидает оплаты";
		case (4):
			return "Завершен";
		}
		return null;
	}

	static void editAppointment() {
		try {
			System.out.println("Введите пациента: ");
			String pat = scanner.nextLine();
			System.out.println("Выберите статус: ");
			System.out.println("1.Новый" + "\n2.В процессе" + "\n3.Отменен" + "\n4.Ожидает оплаты" + "\n5.Завершен");
			String stat = status(scanner.nextInt());
			appoint.get(pat).add(2, stat);
		} catch (NullPointerException e) {
			System.out.println("Приёмы отсутствуют");
		}

	}

	static void printAppointments() {
		try {
			int value = 0;
			int id = value++;
			String message = "%" + -5 + "s %" + -30.33 + "s %" + -10 + "s %" + 15 + "s\n";
			String message2 = "%" + -5 + "s %" + -30.33 + "s %" + -10 + "s %" + 15 + "s\n";
			@SuppressWarnings("resource")
			Formatter f = new Formatter(System.out);
			System.out.println("Введите ФИО пациента: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			f.format(message, "Id", "Доктор", "Дата", "Статус");
			f.format(message, "--", "------", "----", "------");
			String doc = appoint.get(name).get(0);
			String date = appoint.get(name).get(1);
			String stat = appoint.get(name).get(2);
			f.format(message2, id,  doc, date, stat);
		} catch(NullPointerException e) {
			System.out.println("Приёмы отсутствуют");
		}
		
	}
}
