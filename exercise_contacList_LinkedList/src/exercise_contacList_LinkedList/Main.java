package exercise_contacList_LinkedList;

import java.util.LinkedList;
import java.util.List;

class Contact { //Crea un objeto llamado Contact con dos atributos: nombre y telefono
	String name;
	String phoneNumber;

	public Contact(String name, String phoneNumber) { //El constructor inicializa los atributos cuando se crea una instancia
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
}

class ContactList {

	List<Contact> contact_list = new LinkedList<>(); //Lista de objetos tipo Contact llamada contact_list

	public void addContact(String name, String phoneNumber) { //Metodo que anade contactos usando dos parametros: nombre y telefono
		Contact contact = new Contact(name, phoneNumber); //Crea un nuevo objeto tipo Contact llamado contacto con los valores proporcionados y lo agrega a la lista contact_list
		contact_list.add(contact);
	}

	public void searchContact(String name_search) { //Metodo que busca un contacto en la lista por el nombre
		
		for (Contact contact : contact_list) { //itera a traves de la lista contact_list por los contact de tipo Contact
			
			if (contact.name.equals(name_search)) {//si el contact.name coincide con el name_search proporcionado
				
				System.out.println(name_search + " ---- Contact found: "+contact.name + " "+contact.phoneNumber);//entonces lo imprime
				return;
			}
		} System.out.printf("Contact %s not found in your list.", name_search);
		System.out.println();//si no coincide muestra un mensaje de error
	}
	
	public void displayContact() {//metodo que muestra todos los contactos de la lista, no toma parametros
		System.out.println("Your contact list: ");
		for(Contact contact:contact_list) {//itera a traves de la lista
			System.out.println("Name: "+contact.name +" --- " + "Number: "+ contact.phoneNumber); //imprime nombre y telefono
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		ContactList contact_list = new ContactList(); //instancia de la clase ContactList llamada contact_list
		
		contact_list.addContact("Maria", "176555555");
		contact_list.addContact("Sofia","1315646");
		contact_list.addContact("Daniel", "646465168");
		contact_list.addContact("Adriana", "64645616");
		
		contact_list.displayContact();
		
		contact_list.searchContact("Maria");
		contact_list.searchContact("Marta");
		contact_list.searchContact("Adriana");

	}

}
