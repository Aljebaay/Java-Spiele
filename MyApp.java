import java.util.Scanner;

public class MyApp {
	
	static Scanner scan = new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
// Deklaration
		String anrede = null;
		int geschlecht = 0;
		int count = 0;
		int program_auswahl =0;
		int spiel_wahl;
		

//Prozessing
		
		// "do while" beginnt f�r Anrede
		do {
			
			System.out.println("Bitte w�hlen Sie die Anrede aus! \n\t- (1): Frau \n\t- (2): Herr \n\t- (0): Schlie�en");
			try { //um die falsche eingaben wie Strings in Integers zu finden und zu w�rnen (Notiz: catch wird unten gefunden)
				geschlecht = scan.nextInt();//Auswahl zw. Frau und Herr
			}catch(Exception nur_zahlen) { 	//F�r anrede: um die falsche eingaben wie Strings in Integers zu finden und zu w�rnen
					System.err.println("Falsche Eingabe!!! \nBei Anrede Auswahl d�rfen Sie keine Buchstaben sowie Symbole eingeben!\n\tTsch�ss!");
			break;}

			switch(geschlecht) {
				case 0:	System.out.println("Schade dass Sie uns verlassen!");
						System.out.println("\tAufwiedersehen! :)");
					break;
				case 1:	String anrede2 = "Frau";
						anrede = anrede2;
					break;	
				case 2:	String anrede3 = "Herr";
						anrede = anrede3;
					break;
				default: System.err.println("Falsche Eingabe!!! \nBei Anrede d�rfen Sie nur (1) oder (2) eingeben, oder (0) zu schlie�en!\n");
					break;
			}
				}while(geschlecht !=1 &&  geschlecht !=2 && geschlecht !=0);
			
		if (geschlecht != 0) { //if beginnen: um die App sofort schlie�en		
			Person person_1 = new Person(); // Opjekt von Person erstellen
			count =3; // f�r 3 mal versuchen einzugeben
	
			
			// beginnt Vorname "do while" schleife
			do{
				person_1.setVorname(null); // Vorname Eingeben
				// if statment beginnt (vorname <2, >30)
				if(person_1.getVorname().length()<2 || person_1.getVorname().length()>30 || person_1.ist_Buchstaben(person_1.getVorname()) == false){
					count--;
					// if statment beginnt f�r fehler runden
					if (count == 0) {
						System.err.println("Sorry: Sie haben den Vorname 3 mal Falsch eingegeben!\n"); // das kommt in dritte falsche Eingabe!
						geschlecht = 0;
					}
					else if (person_1.ist_Buchstaben(person_1.getVorname()) == false) {
						System.err.println("Es d�rfen keine Zahlen sowie !, /, _, ?, � Zeichen enthalten sein!\nBitte nochmal Ihren Vorname Eingeben! Sie haben noch nur ("+ count + ") mal zu versuchen!\n");
					}
					else{
					System.err.println("\nAchtung!! \nDer Vorname muss zwischen 2 und 30 Buchstaben!...\nBitte nochmal Ihren Vorname Eingeben! Sie haben noch nur ("+ count + ") mal zu versuchen!\n");
					}// if statment endet f�r fehler runden
				}
				else {
				}// if statment endet (vorname <2, >30)	
			}while(person_1.getVorname().length()<2 && count!=0 || person_1.getVorname().length()>30 && count!=0 || person_1.ist_Buchstaben(person_1.getVorname()) == false && count!=0);
				// ende Vorname "do while" schleife
			
				
			if (geschlecht != 0) { //if beginnen: um die App sofort schlie�en				
			count =3;// f�r 3 mal versuchen einzugeben

			
			// beginnt Nachname "do while" schleife
			do{
				person_1.setNachname(null);
				// if statment beginnt (Nachname <2, >30)
				if(person_1.getNachname().length()<2 || person_1.getNachname().length()>30 || person_1.ist_Buchstaben(person_1.getNachname()) == false){
					count--;
					 // if statment beginnt f�r fehler runden
					if (count == 0) {
						System.err.println("Sorry: Sie haben den Nachname 3 mal Falsch eingegeben!\n"); // das kommt in dritte falsche Eingabe!
						geschlecht = 0;
					}
					else if (person_1.ist_Buchstaben(person_1.getNachname()) == false) {
						System.err.println("Es d�rfen keine Zahlen sowie !, /, _, ?, � Zeichen enthalten sein!\nBitte nochmal Ihren Nachname Eingeben! Sie haben noch nur ("+ count + ") mal zu versuchen!\n");
					}
					else{
						System.err.println("\nAchtung!! \nDer Nachname muss zwischen 2 und 30 Buchstaben!...\nBitte nochmal Ihren Nachname Eingeben! Sie haben noch nur ("+ count + ") mal zu versuchen!\n");
					} // if statment endet f�r fehler runden
			
				}else { // if statment endet (Nachname <2, >30)
				}	
			}while(person_1.getNachname().length()<2 && count!=0 || person_1.getNachname().length()>30 && count!=0 || person_1.ist_Buchstaben(person_1.getNachname()) == false && count!=0);
			// ende Nachname "do while" schleife

			if (geschlecht != 0) { //if beginnen: um die App sofort schlie�en
				
			
			// Alter fragen
				try {	//F�r Alter: um die falsche eingaben wie Strings in Integers zu finden und zu w�rnen
				person_1.setAlter(0);
				
				
				 // if f�r Alter beginnen
				if(person_1.getAlter()<18){
					System.out.println("Sorry!! \nSie sind unter 18 Jahre alt!... \nWir d�rfen Ihre Anmeldung leider nicht akzeptieren.\n");
				}
				else if(person_1.getAlter()>80) {
					System.out.println("Sorry!! \nSie sind �lterer als 80 Jahre alt!... \nWir d�rfen Ihre Anmeldung leider nicht akzeptieren.\n");
				}
				else{
					System.out.println(); // nur eine Zeile runter
					int line =anrede.length() + person_1.getVorname().length() + person_1.getNachname().length(); // l�nge sammeln
					
					
					//Loop Um eine Linie �ber begr��ung auszugeben
					for(int i =0; i <= line+22; i++){
						System.out.print("*");
					} // ende loop f�r die erste Linie
					
					
					System.out.println("\nHerzlich Willkommen " + anrede + " " + person_1.getVorname().substring(0,1).toUpperCase() + person_1.getVorname().substring(1).toLowerCase() + " " + person_1.getNachname().substring(0,1).toUpperCase()+ person_1.getNachname().substring(1).toLowerCase() + "!");
					System.out.println("Sie sind " + person_1.getAlter() + " Jahre alt \nHerzlichen Gl�ckwunsch! \nIhre Anmeldung wurde akzeptiert");
							
					
					//Loop Um eine Linie unter begr��ung auszugeben
					for(int i =0; i <= line+22; i++){		
						System.out.print("*");
					}// ende loop f�r die zweite Linie
					
					System.out.println(); // nur eine Zeile runter
									
					
					// "do while" schleife beginnt f�r die Programm ausahl
					do{
						System.out.println("\nWelche Programm wollen Sie ausf�hren?\n \nBitte w�hlen aus! \n\t- (1): Multiplikation Tabelle \n\t- (2): Ratespiel \n\t- (3): Taschenrechner \n\t- (0): Schlie�en"); 
						try {  //F�r program_auswahl : um die falsche eingaben wie Strings in Integers zu finden und zu w�rnen	
							program_auswahl = scan.nextInt(); // input program_auswahl
						
						// switch beginnt f�r die Programm ausahl
						switch(program_auswahl) {
							case 0:		System.out.println("Schade dass Sie uns verlassen!");
										System.out.println("\tAufwiedersehen! :)");
								break;
							case 1: try {
										MultiplikationsTafel Multi_Tabelle_1 = new MultiplikationsTafel();
									}catch(Exception nur_zahlen) {	 //F�r spalte_anzahl und zeile_anzahl : um die falsche eingaben wie Strings in Integers zu finden und zu w�rnen
										System.err.println("Falsche Eingabe!! \nAchtung!! Sie d�rfen nur Positive Integer Zahlen eingeben.\n\tTsch�ss!");
										program_auswahl = 0;}
								break;
							case 2:
								System.out.println("Sie haben \"Ratespiel\" ausgew�hlt\n ");
								
								System.out.println("W�hlen Sie die Spielart aus!\n\t- (1): Ich rate Pcs Zahl\n\t- (2): PC ratet meine Zahl\n\t- (0): Zur Home Seite! ");
								spiel_wahl = scan.nextInt();
								switch(spiel_wahl) {
									case 0:
										break;
									case 1:
										try {
											Ratespiel spiel_1 = new Ratespiel();
											spiel_1.setInput_zahl(0);
											System.out.println("\tDie richtige Zahl ist: " + spiel_1.getRandom_zahl()+ "\n");
											}catch(Exception nur_zahlen) {	 //F�r spalte_anzahl und zeile_anzahl : um die falsche eingaben wie Strings in Integers zu finden und zu w�rnen
											System.err.println("Falsche Eingabe!!! \nSie d�rfen nur Zahlen zwischen(1) und (100) eingeben.\n\tTsch�ss!");
											program_auswahl = 0;}
										break;
									case 2: PC_Ratespiel PC_Ratespiel_1 = new PC_Ratespiel();
											program_auswahl = 0;
										break;
								}
								
								break;
							case 3: Taschenrechner Rechner_1 = new Taschenrechner();
								break;
							default: System.err.println("Sie d�rfen nur (1),(2),(3) eingeben oder (0) zu schlie�en.");
							
						} // switch ende f�r die Programm ausahl
						
						}catch(Exception nur_zahlen) {	 //F�r program_auswahl : um die falsche eingaben wie Strings in Integers zu finden und zu w�rnen
							System.err.println("Falsche Eingabe!!! \nSie d�rfen keine Buchstaben sowie Sympole eingeben!\n\t Tsch�ss!");
							break;}

					}while(program_auswahl !=0);

					// "do while" schleife ende f�r die Programm ausahl
				
				} //ende if f�r Alter
			}catch(Exception nur_zahlen) {	 //F�r Alter: um die falsche eingaben wie Strings in Integers zu finden und zu w�rnen
				System.err.println("Falsche Eingabe!! \nBei Alter d�rfen Sie nur Zahlen eingeben.\n\tTsch�ss!");
				}
			}//ende if: um die App sofort schlie�en
			}//ende if: um die App sofort schlie�en
		}//ende if: um die App sofort schlie�en
		
		scan.close();
		
		System.out.println("\n*******************************");
		System.out.println("Programming by \"Mehdi Aljebaay\"");
		System.out.println("*******************************");
		// Code endet Hier :)
	}
}