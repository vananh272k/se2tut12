package tut11.Mankind;

import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IllegalClassFormatException {
		Scanner sc = new Scanner(System.in);
		
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		String facultyNo = sc.nextLine();
		double weekSalary = sc.nextDouble();
		double workHourPerDay = sc.nextDouble();

		try {
			Student student = new Student(firstName, lastName, facultyNo);
			Worker worker = new Worker(firstName, lastName, weekSalary, workHourPerDay);

			Method[] studentDeclaredMethods = Student.class.getDeclaredMethods();
			Method[] workerDeclaredMethods = Worker.class.getDeclaredMethods();

			System.out.println(student.toString());
			System.out.println(worker.toString());

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
