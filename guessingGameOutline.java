import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        guessingGameConvo();
    }
    public static void guessingGameTitle(){
        System.out.println(" ___                                                      \n" +
                "-   ---___- ,,                -_____                      \n" +
                "   (' ||    ||                  ' | -,                    \n" +
                "  ((  ||    ||/\\\\  _-_         /| |  |` ,._-_  /'\\\\ -_-_  \n" +
                " ((   ||    || || || \\\\        || |==||  ||   || || || \\\\ \n" +
                "  (( //     || || ||/         ~|| |  |,  ||   || || || || \n" +
                "    -____-  \\\\ |/ \\\\,/         ~-____,   \\\\,  \\\\,/  ||-'  \n" +
                "              _/              (                     |/    \n" +
                "                                                    '     ");
    }
    public static void guessingGameAscii(){
        System.out.println(" ____________________\n" +
                "|        ____        |\n" +
                "|       |    |       |\n" +
                "|____________________|\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|   ENTER THE PIN    |\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|                    |\n" +
                "|____________________|\n" +
                "|         []         |\n" +
                "|____________________|");
    }
    public static void guessingGameConvo() throws InterruptedException {
        guessingGameTitle();
        Thread.sleep(2000);
        System.out.println("NARRATOR: YOU'RE INTERROGATING A WITNESS WHO THERE WHEN THE ARTIFACT WAS STOLEN");
        Thread.sleep(2000);
        System.out.println("NARRATOR: THE WITNESS HAS SPOTTY MEMORY, SO YOU NEED TO ASK IMPORTANT DETAILS YOURSELF...");
        Thread.sleep(2000);
        System.out.println("Detective: Did they leave any details of where they were going?");
        Thread.sleep(2000);
        System.out.println("Witness: I don't believe so... But they dropped a device.");
        Thread.sleep(2000);
        System.out.println("Detective: The device seems to be pin locked, we need to guess the pin correctly.");
        Thread.sleep(2000);
        System.out.println("Detective: The device seems to give hints for the pin, and it's only three digits, we can use this to our advantage.");
        guessingGame();
    }
    public static void guessingGame(){
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int secret = (int) (Math.random() * 100) + 1; // Generates number you need to guess
        guessingGameAscii();
        while (secret != guess) {
            guess = scanner.nextInt();
            if (guess == secret) {
                System.out.println("You cracked the pin!");
                // method for next game
            } else if (guess < secret) {
                System.out.println("The pin is higher!");
            } else if (guess > secret) {
                System.out.println("The pin is lower!");
            }
        }
    }

    }
