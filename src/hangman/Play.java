package hangman;

import java.util.Scanner;

public class Play {

	public void playGame() {
		
		boolean loopRaspuns = true;
		
		Scanner scan = new Scanner(System.in);
		Set set = new Set();
		
		
		while(true) {
			set.setGame();
			
			System.out.println("\nVrei sa continui? \nRaspunde cu \"da\" sau \"nu\".");
						
			String raspunsUtilizator = scan.next();
			
			while(loopRaspuns) {
				if(raspunsUtilizator.equals("da")) {
					loopRaspuns = false;
				}
				else if (raspunsUtilizator.equals("nu")) {
					System.exit(1);
				}else {
					System.out.println("Raspunde cu \"da\" sau \"nu\".");
					 raspunsUtilizator = scan.next();
				}
			}
			loopRaspuns = true;
		}
	}
	
}
