import java.util.Scanner;

public class Person {
	Scanner scan = new Scanner(System.in);
// Deklaration	
	private String vorname;
	private String nachname;
	private int alter;
	
	
	//für die Strings (nur Buchstaben)

	public boolean ist_Buchstaben(String text) {
		for (char c : text.toCharArray()) {
			// a - z
			if (c >= 'a' && c <= 'z')
				continue;
			// A - Z
			if (c >= 'A' && c <= 'Z')
				continue;
			// ö, ü, ä, ß
			if (c == 'ä' || c == 'Ä' || c == 'ö' || c == 'Ö' ||c == 'ü' || c == 'Ü' ||c == 'ß')
				continue;
			return false;
		}
		return true;
	}
	
// Setters
	//SetVorname
	public void setVorname(String vorname) {
		System.out.println("Wie ist Ihr Vorname?");
		vorname= scan.nextLine();
			this.vorname = vorname;
	}
	//SetNachname
	public void setNachname(String nachname) {
		System.out.println("Wie ist Ihr Nachname?");
		nachname= scan.nextLine();
		this.nachname = nachname;
	}
	//SetAlter
	public void setAlter(int alter) {
		System.out.println("Wie alt sind Sie?");
		alter = scan.nextInt();
		this.alter = alter;
	}
// Getters
	//GetVorname
	public String getVorname()
	{
		return vorname;
	}

	//GetNachname
	public String getNachname() {
		return nachname;
	}
	
	//GetAlter
	public int getAlter() {
		return alter;
	}

}