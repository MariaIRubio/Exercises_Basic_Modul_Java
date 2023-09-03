package exercise_eventRegistration_HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Participant {
	String name;

	public Participant(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Participant: " + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participant other = (Participant) obj;
		return Objects.equals(name, other.name);
	}
}

	class EventRegistration {

		HashSet<Participant> participant_list = new HashSet<>();

		public void registerParticipant(String name) {

			Participant participant = new Participant(name);
			participant_list.add(participant);
		}

		public void displayParticipants() {
			System.out.println("Participants list: ");
			for (Participant participant : participant_list) {
				System.out.println(participant);
			}
		}
	}



public class Main {

	public static void main(String[] args) {

		EventRegistration eventRegistration = new EventRegistration();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce the name of a participant. To finish type exit: ");
		while(true) {
			System.out.println("Name: ");
			String name = scanner.nextLine();
			if(name.equals("exit")) {
				break;
			}eventRegistration.registerParticipant(name);
		}
		
		eventRegistration.displayParticipants();
		
		scanner.close();
		
	}

}
