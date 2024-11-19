import java.util.Scanner;

public class Main {
    public static int tries = 0;
    public static boolean isGameNotOver = true;

    public static void main(String[] args) {
        guessingGame();
    }
    public static void guessingGame(){
        System.out.println("What is your guess for the combination?");
        Scanner scanner = new Scanner(System.in);
        String guess = null;
        String word = "placeholder";
        if ((isGameNotOver)){
            tries = 0;
        }
        while (!word.equals(guess) && isGameNotOver) {
            tries++;
            guess = scanner.next();
            if (guess.equals(word)) {
                winner();
                isGameNotOver = true;
            } else if (!guess.equals(word)) {
                hangman();
                wordChecker(word, guess);
            }
        }
    }
    public static void wordChecker(String word, String guess) {
        System.out.println("Matching characters:");
        StringBuilder matching = new StringBuilder("_".repeat(word.length())); // basically converts string into char
        for (int i = 0; i < guess.length(); i++) {
            char guessedChar = guess.charAt(i);
            if (i < word.length() && word.charAt(i) == guessedChar) {
                matching.setCharAt(i, guessedChar);
            }
        }
        System.out.println("Letters in correct spot: " + matching);
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
        for (int i = 0; i<=15; i++ ){ // clears console
            System.out.println();
        }
        System.out.println("Game over, he is dead!");
        System.out.println("");
        isGameNotOver = true;
        guessingGame();
    }
    public static void winner(){
        System.out.println("You won! He survives!");
        // replace with the method that goes to the next game
    }

}
