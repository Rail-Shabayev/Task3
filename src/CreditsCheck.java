import java.util.Scanner;

public class CreditsCheck {
	static void check(Scanner scaner) {
		
		while (true) {
			System.out.print("Note: admin admin \nВведите логин: ");
			String log = scaner.next();
			if (!log.equals("admin"))
				System.out.println("Неправильный логин.");
			else
				break;
		}
		while (true) {
			System.out.print("Введите пароль: ");
			String pwrd = scaner.next();
			if (!pwrd.equals("admin"))
				System.out.println("Неправильный пароль.");
			else
				break;
		}
	}
}
