import java.util.Scanner;

public class Operations {
	static void selectOp(Scanner scanner) {
		System.out.println("Доступные действия: " + "\n0.Выход" + "\n1.Добавить доктора\\пациента"
				+ "\n2.Создать приём пациента" + "\n3.Поменять статус приёма" + "\n4.Вывести все приёмы пациента"
				+ "\n5.Вывести всех пациентов" + "\n6.Редактировать ФИО пациента" + "\n7.Удалить пациента");
		int operation = scanner.nextInt();
		boolean p = true;
		while (p) {
			switch (operation) {
			case (0):
				p = false;
				break;
			case (1):
				Patients.add();
				break;
			case (2):
				Appointment.makeAppointment();
				break;
			case (3):
				Appointment.editAppointment();
				break;
			case (4):
				Appointment.printAppointments();
				break;
			case (5):
				Patients.printPatients();
				break;
			case (6):
				Patients.editPatient();
				break;
			case (7):
				Patients.deletePatient();
				break;
			}
			System.out.println("Выберите номер действия: ");
			operation = scanner.nextInt();
		}
	}
}
