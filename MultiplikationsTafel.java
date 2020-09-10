
public class MultiplikationsTafel {

// Deklaration
	private int[][] malti_tafel;
	private int zeile_anzahl = 0;
	private int spalte_anzahl = 0;
	private int zeile=0,spalte=0;	
	
	
//Prozessing
	public MultiplikationsTafel(){
		System.out.println("Sie haben die Multiplikation Tabelle ausgewählt\n ");
		System.out.println("\t- Bitte geben Sie die Anzahl der Zeilen von der Multiplikationstafel ein!");
		zeile_anzahl = MyApp.scan.nextInt(); // input Anzahl der Zeile
		System.out.println("\t- Bitte geben Sie die Anzahl der Spalten von der Multiplikationstafel ein!");
		spalte_anzahl = MyApp.scan.nextInt(); // input Anzahl der Spalte
		

		if(zeile_anzahl<=0 || spalte_anzahl<=0) { // if statement beginnt
			System.out.println("Achtung!! \nDie Zahl muss größer las (0) sein!\n");
		
		}else {
			System.out.println("\nGut gemacht! \nDie Multiplikationstafel wurde für Sie vorbereitet.\n");
			malti_tafel=new int[zeile_anzahl][spalte_anzahl]; //Array kreieren!
			
			zeile++; // auf 1 erhöhen
			spalte++; // auf 1 erhöhen
			
			//schleife_1 beginnt
			for(int i=0; i<malti_tafel.length; i++){
				
				//schleife_2 beginnt
			   for(int j=0; j<malti_tafel[i].length; j++){			   
				 malti_tafel[i][j]=zeile*spalte;
			     spalte=spalte+1;		     
			     System.out.print(" "+malti_tafel[i][j]+"\t| ");
			   } //schleife_2 endet
			   
			zeile ++;
			spalte = 1;	
			System.out.println();
			}//schleife_1 endet		
		} // if statement endet
	}
}