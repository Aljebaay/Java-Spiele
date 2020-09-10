import java.util.Scanner;
	public class PC_Ratespiel {

		public PC_Ratespiel() {
		// Scanner für input
				Scanner scan = new Scanner(System.in);

// Deklaration
				int input_zahl; // input 1-100
				int rand;	//Random Zahl
				int entscheidung = 0; // ist < , > oder == Random Zahl
				int count = 0; // der Counter
				int min = 1, max = 100;		// minimum - maximun für random zahl
				int fraud = 4; // wenn Benutzer versucht zu monobolieren 3 mal dann raus
				
				System.out.println("Sie haben \"PC ratet meine Zahl\" ausgewählt\n ");
				
				try {//um die falsche eingaben wie Strings in Integers zu finden und zu wärnen (Notiz: catch wird unten gefunden)
					
					do {  // do while beginnt: für input Zahl 1-100
						System.out.println("Looos!! Start the challenge!\nGeben Sie eine Zahl zwischen (1 und 100) ein!\nIch werde die Zahl in (1 bis 6) mal versuchen zu finden!");
						input_zahl = scan.nextInt();
		
						if(input_zahl>100) {
							System.err.println(" Die zahl ist größer als 100");
						}
						else if (input_zahl<1) {
							System.err.println("Die Zahl ist kleiner als 1");
						}
						
					}while(input_zahl < 1 || input_zahl > 100);// do while endet: für input Zahl 1-100
					
					
					
					do {  // do while beginnt: für entscheidung falls Zahl < oder > als Randum
						rand = min + (int)(Math.random() * ((max - min) + 1)); // Random 1-100
						
						System.out.println("\nVersuch Nr: (" + (count + 1) + " )\nHmmm...\nIch wede sagen...("+rand+") Ist das rechtig?\n");
						
						// Rate ist richtig
						if (rand == input_zahl) {
							System.out.println("Hurra!!...\nIch habe gewonnen!\nIhre eingegebne Zahl war ("+input_zahl+").");
							break;
						}
						else if(rand != input_zahl && count == 5){
							System.out.println("Ach!! \nich habe verloren,das war wirklich schwirig zu raten.\n");
						}
						else {
							System.out.println("Ist Ihre eingegebne Zahl richtg, kleiner oder größer als meine Ratezahl?\n\n\t- (0) stoppen\n\t- (1) kleiner \n\t- (2) größer");
							entscheidung = scan.nextInt();
						}
						
						// input Zahl ist kleiner als Random Zahl

						if (entscheidung == 1) {
							if (input_zahl<rand) {
								max = rand-1;
							}
							else {
								
								System.err.println("Versuchst du mich zu manipulieren?!, ich kann das wissen\r\n" + 
										"Bitte geben Sie nur Die Wahrheit ein :( \nSie haben noch (" + (fraud-1) + ") Chance die Wahrheit einzugeben! ");
								
								count--;
								fraud--;
							}
							
						}
						
						// input Zahl ist größer als Random Zahl
						else if(entscheidung == 2) {
							
							if (input_zahl>rand) {
								min = rand+1;
							}
							else {
								System.err.println("Versuchst du mich zu betrügen?!, ich kann das wissen\r\n" + 
										"Bitte geben Sie nur Die Wahrheit ein :( \nSie haben noch (" + (fraud-1) + ") Chance  die Wahrheit einzugeben! ");
								
								count--;
								fraud--;
							}
						}
						else if (entscheidung == 0) {
							System.out.println("\nbey");
						}
						else
						{	count--;
							System.out.println("Achtung!!\nSie dürfen nur (0), (1) oder (2) eingeben!\n");
						} 
						count++;
					}while(count <6 && entscheidung!=0 && rand != input_zahl && fraud != 0);   // do while endet: für entscheidung falls Zahl < oder > als Randum
					
			}catch(Exception nur_zahlen) {//um die falsche eingaben wie Strings in Integers zu finden und zu wärnen (Notiz: catch wird unten gefunden)
				System.err.println("\nAchtung!!\nSie dürfen nur Zahlen eingeben!\n");
			}
				
				scan.close();
		}
	}
