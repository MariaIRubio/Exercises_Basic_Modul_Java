package exercise_passingByReference_;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();

		Person person = new Person("Maria", 32);

		System.out.println("Before changes");
		main.displayInfo(person);
		main.changePerson(person);
		System.out.println("After changes");
		main.displayInfo(person);

	}

	private void displayInfo(Person person) {
		System.out.println(person);

	}

	private void changePerson(Person person) {
		person.setName("Daniel");
		person.setAge(41);

	}

}
