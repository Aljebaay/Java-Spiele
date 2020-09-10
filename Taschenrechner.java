public class Taschenrechner {
//Setters
	//zwei Variabeln addieren
	public static double Set_add(double a, double b)
	{
		return a + b;
	}
	//drei Variabeln addieren
	public static double Set_add(double a, double b, double c)
	{
		return a + b + c;
	}
	//zwei Variabeln subtrahieren
	public static double Set_subtraction(double a, double b)
	{
		return a - b;
	}
	//drei Variabeln subtrahieren
	public static double Set_subtraction(double a, double b, double c)
	{
		return a - b - c;
	}
	
	//zwei Variabeln multiplizieren
	public static double Set_multi(double a, double b)
	{
		return a * b;
	}
	//drei Variabeln multiplizieren
	public static double Set_multi(double a, double b, double c)
	{
		return a * b * c;
	}
	
	//zwei Variabeln dividieren
	public static double Set_division(double a, double b)
	{
		return a / b;
	}
	//zwei Variabeln dividieren
	public static double Set_division(double a, double b, double c)
	{
		return a / b / c;
	}		
	
// Deklaration
	double num1 = 0, num2 = 0, num3 = 0;
	int auswahl = 0;
	int rechnen = 0;
		
		
	public Taschenrechner() {
		System.out.println("\nSie haben den Taschenrechner ausgewählt ");
		do {
			
		
		System.out.println("\nWählen Sie bitte aus: \n\t- (1): zwei Zahlen zu rechnen. \n\t- (2): drei Zahlen zu rechnen. \n\t- (0): schließen\n");
		try {
		auswahl = MyApp.scan.nextInt();
		}catch(Exception nur_zahlen) {
			System.err.println("Falsche Eingabe!!! \nSie dürfen keine Buchstaben sowie Symbole eingeben!\n\t Tschüss!");
		break;}
		
		
		if(auswahl < 0 || auswahl > 2){
			System.err.println("Falsche Eingabe!!! \nSie dürfen nur (1) oder (2) eingeben oder (0) zu schließen!\n");
		}
		else if(auswahl ==1 || auswahl == 2){
			try { // um die falsche eingaben wie Strings in Integers zu finden und zu wärnen
		switch(auswahl) {
		
				// für drei Zahlen zu rechnen
			case 1:	System.out.println("\tBitte die erste Zahl eingeben!");
					num1 = MyApp.scan.nextDouble();
					System.out.println("\tBitte die zweite Zahl eingeben!");
					num2 = MyApp.scan.nextDouble();
					
					System.out.println("\nWählen Sie bitte aus: \n\t- (1): addieren \n\t- (2): subtrahieren  \n\t- (3): multiplizieren \n\t- (4): dividieren \n\t- (0) zurüch zu Rechner Home!\n");
					rechnen = MyApp.scan.nextInt();
					
					switch(rechnen)
					{
					case 0: 
						break;
					case 1: 
						double sum = Set_add(num1, num2);
						System.out.println("Die Summe von "+ num1 +" + "+ num2 +" = "+sum);
						break;
					case 2:
						double sub = Set_subtraction(num1, num2);
						System.out.println("Die Subtraktion von " + num1 +" - "+ num2 +" = " +sub);
						break;
					case 3:
						double multi = Set_multi(num1, num2);
						System.out.println("die Multiplikation von " + num1 +" x "+ num2 + " = " +multi);
						break;
					case 4:
						double div = Set_division(num1, num2);
						System.out.println("Die Division von " + num1 +" ÷ "+ num2 +" = "+div);
						break;
					default:
						System.err.println("falsche Eingabe!! \nSie dürfen nur (1 bis 4) eingeben oder (0) zu schließen!");
						break;
					}
				break;
				
				// für drei Zahlen zu rechnen
			case 2:	System.out.println("\tBitte die erste Zahl eingeben");
					num1 = MyApp.scan.nextDouble();
					System.out.println("\tBitte die zweite Zahl eingeben");
					num2 = MyApp.scan.nextDouble();
					System.out.println("\tBitte die dritte Zahl eingeben");
					num3 = MyApp.scan.nextDouble();
					
					System.out.println("\nWählen Sie bitte aus: \n\t- (1): addieren \n\t- (2): subtrahieren  \n\t- (3): multiplizieren \n\t- (4): dividieren \n\t- (0) zurüch zu Rechner Home!\n");
					rechnen = MyApp.scan.nextInt();
					
					switch(rechnen)
					{
					case 0:
						break;
					case 1: 
						double sum = Set_add(num1, num2, num3);
						System.out.println("Die Summe von "+ num1 +" + "+ num2 + " + " + num3 +" = "+sum);
						break;
					case 2:
						double sub = Set_subtraction(num1, num2, num3);
						System.out.println("Die Subtraktion von "+ num1 +" - "+ num2 + " - " + num3 +" = "+sub);
						break;
					case 3:
						double multi = Set_multi(num1, num2, num3);
						System.out.println("die Multiplikation von "+ num1 +" x "+ num2 + " x " + num3 +" = "+multi);
						break;
					case 4:
						double div = Set_division(num1, num2, num3);
						System.out.println("Die Division" + num1 +" ÷ "+ num2 + " ÷ " + num3 +" = "+div);
						break;
					default:
						System.err.println("falsche Eingabe!! \nSie dürfen nur (1 bis 4) eingeben oder (0) zu schließen!");
						break;
					}
					
				break;
		}

		}catch(Exception nur_zahlen) {
			System.err.println("\nFalsche Eingabe!!! \nIn mathematischen Operationen dürfen Sie nur Zahlen eingeben!\n\tTschüss!");
			break;}// um die falsche eingaben wie Strings in Integers zu finden und zu wärnen
		}else {
			System.out.println("\nSchade dass Sie uns verlassen!");
			System.out.println("\tAufwiedersehen! :)");
		}
		System.out.println("******************************");
	}while(auswahl!=0);	
		
		MyApp.scan.close();
	}

}


