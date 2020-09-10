import java.util.Random; 

public class Ratespiel {
//Deklaration
	int input_zahl;
	int random_zahl;
	int versuch;
	Random rand = new Random();
	
//Constructor
	public Ratespiel()
	{
		versuch = 6;
		random_zahl = rand.nextInt(100)+1;
	}

	
//Getter
	//GetInput_zahl
	public int getInput_zahl() {
		return input_zahl;
	}
	
	//GetRandom_zahl
	public int getRandom_zahl() {
		return random_zahl;
	}
	
//Setter
	//SetRandom_zahl
	public void setRandom_zahl(int random_zahl) {
		this.random_zahl = random_zahl;
	}
	
	//SetInput_zahl
	public void setInput_zahl(int input_zahl) {
		System.out.println("Sie haben \"ich rate Pcs Zahl\" ausgewählt\n ");

		// "do while" beginnt
		do {
			System.out.println("Raten Sie eine Zahl zwischen (1 und 100) dann geben Sie sie ein!, oder geben Sie (0) ein zu stoppen!");
			input_zahl = MyApp.scan.nextInt();
			this.input_zahl = input_zahl;
			versuch--;
			if(input_zahl == 0) {
				System.out.println("\n\tSie haben das Spiel gestoppt.\n");				
			}
			else if(input_zahl != random_zahl && versuch == 0) {
				System.out.println("\nSie haben leider alle Gewinnchancen benutzt. \n\tSie haben verloren :(");
			}
			else if(input_zahl == random_zahl && input_zahl != 0 || input_zahl == random_zahl && versuch == 0) {
				System.out.println("WOOOW!! \n\tHerzlichen Glückwunsch!! Sie haben die richtige Zahl nach geraten. ");
			}
			else if( input_zahl > 100 || input_zahl < 0) {
				versuch++;
				System.err.println("Achtung!! \n\tDie Zahl muss zwischen (1 und 100) sein\n\t versuchen Sie bitte nochmal eine Zahl einzugeben!\n");
			}
			else if(random_zahl > input_zahl  && versuch != 0) {
				System.out.println("\nUps!! Die richtige Zahl ist GRÖSER als Ihre Auswahl \n\tSie können noch (" + (versuch) + ") mal versuchen zu gewinnen... \n\tGeben Sie nicht auf!\n");
			}
			else if(random_zahl < input_zahl  && versuch != 0) {
				System.out.println("\nUps!! Die richtige Zahl ist KLERINER als Ihre Auswahl \n\tSie können noch (" + (versuch) + ") mal versuchen zu gewinnen... \n\tGeben Sie nicht auf!\n");
			}

			else {
				
			}

		}while(versuch!=0 && input_zahl != 0 && input_zahl != random_zahl);
		// "do while" ende	
	}
}
