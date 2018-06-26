package hangman;

public class ClasaPrint {

	public void printMistake(int number) {
		switch (number) {
		default:
		case 0:
			System.out.println("  _______     ");
			System.out.println("  |     |     ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			break;
			
		case 1:
			System.out.println("  _______     ");
			System.out.println("  |     |     ");
			System.out.println("  |     __    ");
			System.out.println("  |    |``|   ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			break;
		
		
		case 2:
			System.out.println("  _______     ");
			System.out.println("  |     |     ");
			System.out.println("  |     __    ");
			System.out.println("  |    |``|   ");
			System.out.println("  |     |     ");
			System.out.println("  |     |     ");
			System.out.println("  |     |     ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			break;
			
		case 3:
			System.out.println("  _______     ");
			System.out.println("  |     |     ");
			System.out.println("  |     __    ");
			System.out.println("  |    |``|   ");
			System.out.println("  |     |     ");
			System.out.println("  |    /|     ");
			System.out.println("  |   / |     ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			break;
			
		case 4:
			System.out.println("  _______     ");
			System.out.println("  |     |     ");
			System.out.println("  |     __    ");
			System.out.println("  |    |``|   ");
			System.out.println("  |     |     ");
			System.out.println("  |    /|\\   ");
			System.out.println("  |   / | \\  ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			break;
			
		case 5:
			System.out.println("  _______     ");
			System.out.println("  |     |     ");
			System.out.println("  |     __    ");
			System.out.println("  |    |``|   ");
			System.out.println("  |     |     ");
			System.out.println("  |    /|\\   ");
			System.out.println("  |   / | \\  ");
			System.out.println("  |    /      ");
			System.out.println("  |   /       ");
			break;
			
		case 6:
			System.out.println("  _______     ");
			System.out.println("  |     |     ");
			System.out.println("  |     __    ");
			System.out.println("  |    |``|   ");
			System.out.println("  |     |     ");
			System.out.println("  |    /|\\   ");
			System.out.println("  |   / | \\  ");
			System.out.println("  |    / \\   ");
			System.out.println("  |   /   \\  ");
			break;
		}		
	}	 
}
