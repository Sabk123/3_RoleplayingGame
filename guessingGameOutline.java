import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessingGame();
    }
    public static void guessingGame(){
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int secret = (int) (Math.random() * 100) + 1;
        int tries = 0;
        System.out.println("You have to unlock a combination in order to proceed to unlock the locker to receive a clue.");
        System.out.println("You'll have infinite tries, it'll warn you if its higher or lower than your guess.");
        System.out.println("What is your guess for the combination?");
        while (secret != guess) {
            guess = scanner.nextInt();
            if (guess == secret) {
                System.out.println("You got it!");
            } else if (guess < secret) {
                System.out.println("Higher!");
            } else if (guess > secret) {
                System.out.println("Lower!");
            }
            tries++;
        }
        System.out.println("It took you " + tries + " tries.");
    }

    }
