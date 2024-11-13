import java.util.Scanner;

public class Main {
    public static int tries = 0;
    public static void main(String[] args) {
        guessingGame();
    }
    public static void guessingGame(){
        System.out.println("What is your guess for the combination?");
        Scanner scanner = new Scanner(System.in);
        String guess = null;
        String word = "placeholder";
        while (!word.equals(guess)) {
            tries++;
            guess = scanner.next();
            if (guess.equals(word)) {
                winner();
            } else if (!guess.equals(word)) {
                hangman();
            }
        }
    }
    public static void hangman(){
        if (tries == 1) {
            System.out.println(" O ");
        } else if (tries == 2) {
            System.out.println(" O ");
            System.out.println(" | ");
        } else if (tries == 3) {
            System.out.println(" O ");
            System.out.println("/| ");
        } else if (tries == 4) {
            System.out.println(" O ");
            System.out.println("/|\\");
        } else if (tries == 5) {
            System.out.println(" O ");
            System.out.println("/|\\");
            System.out.println("/  ");
        } else if (tries == 6) {
            System.out.println(" O ");
            System.out.println("/|\\");
            System.out.println("/ \\");
            gameOver();
        } else {
            gameOver();
        }
    }
    public static void gameOver(){
        System.out.println("Game over, he is dead!"); // most likely replace with whatever restarts the game
    }
    public static void winner(){
        System.out.println("You won! He survives!");
        // replace with the method that goes to the next game
    }

}
