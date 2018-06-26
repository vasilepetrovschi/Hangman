package hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Set {

	String line;

	public Set() {
		try {

			BufferedReader bufferreader = new BufferedReader(
					new FileReader("E:\\Workspace\\Hangman\\resedinte.txt"));
			line = bufferreader.readLine();

			while (line != null) {
				String[] wordsLine = line.split("\\|");
				if (wordsLine.length == 2) {

					wordOne.add(wordsLine[0]);
					wordTwo.add(wordsLine[1]);
				}

				line = bufferreader.readLine();

			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

	Random rand = new Random();
	int attempts = 0;
	boolean startplay = true;

	int WordTwoIndex = 0;
	char[] wordLetters;
	char[] guessed;
	String currentWordOne;
	String currentWordTwo;
	

	boolean isGameWon = false;

	ArrayList<String> wordOne = new ArrayList<>();
	ArrayList<String> wordTwo = new ArrayList<>();

	Scanner scan = new Scanner(System.in);
	ClasaPrint print = new ClasaPrint();

	public void setGame() {

		if (wordTwo.size() == 0) {
			System.out.println("Ai ghicit toate cuvintele. Jocul a luat sfarsit.");
			System.exit(-1);
		}

		loadLevel();

		while (!this.isGameLost() && !this.isGameWon) {
			boolean hasGuessedALetter = readLetter();

			printCurrentSolution();
			System.out.println();

			if (Arrays.equals(wordLetters, guessed)) {

				isGameWon = true;
			} else if (hasGuessedALetter) {
				attemptsMethod();
			} else {
				attempts++;
				attemptsMethod();
			}
		}

		if (this.isGameLost()) {
			System.out.println("\nHa, ha, ha, n-ai ghicit.");
			wordOne.add(currentWordOne);
			wordTwo.add(currentWordTwo);

		}

		if (this.isGameWon) {
			System.out.println("\nFelicitari ai ghicit, cuvantul este: " + currentWordTwo);
		}
	}

	public void loadLevel() {

		WordTwoIndex = rand.nextInt(wordTwo.size());
		System.out.println("Judetul este: " + wordOne.get(WordTwoIndex));
		currentWordOne=wordOne.remove(WordTwoIndex);
		
		currentWordTwo = wordTwo.remove(WordTwoIndex).toLowerCase();

		wordLetters = currentWordTwo.toCharArray();
		attempts = 0;
		isGameWon = false;

		guessed = new char[wordLetters.length];
		for (int i = 0; i < wordLetters.length; i++) {

			if (wordLetters[i] != ' ') {
				guessed[i] = '_';
			} else {
				guessed[i] = ' ';
			}

		}
		guessed[0] = wordLetters[0];
		guessed[wordLetters.length - 1] = wordLetters[wordLetters.length - 1];

		printCurrentSolution();

		System.out.println();
		print.printMistake(0);

	}

	public boolean isGameLost() {
		return attempts == 6;
	}

	public void attemptsMethod() {

		ClasaPrint print = new ClasaPrint();
		print.printMistake(attempts);
		if (attempts == 6) {
			startplay = false;
		}
	}

	public void printCurrentSolution() {
		
		for (char c : guessed) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public boolean readLetter() {
		boolean hasGuessedALetter = false;

		System.out.println();
		String letters = scan.next();
		while (letters.length() > 1) {
			System.out.println("Trebuie sa introduci cate o litera si sa dai enter");
			letters = scan.next();
		}
		char letter = letters.toLowerCase().charAt(0);

		for (int i = 0; i < wordLetters.length; i++) {
			if (letter == wordLetters[i]) {
				guessed[i] = letter;
				hasGuessedALetter = true;
			}
		}

		return hasGuessedALetter;
	}
}
