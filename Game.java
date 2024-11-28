// Shibuya Incident
// Ashwika P., Rehan J., Saboor K.
// Purpose of the code is explained in the dialogue
// There is a detective who must find a hidden artifacts
// The detective encounters a series of challenges along the way

import java.util.Scanner;
import java.util.Random;
public class intro {
    public static void main(String[] args) {
        new intro().startGame();
    }
    // The following code is for time elapsed calculation.
    public static long start = System.currentTimeMillis();
    private static String storePlayerName; // This will store the player's name.

    // Method to get the name from the user
    public static String makePlayerName() {
        try {
            Thread.sleep(1500);
        }catch (InterruptedException ignored){
        }
        System.out.println("What's your name, detective? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine(); // Returns the name directly
    }

    // Method to initialize and store the player's name
    public static void getPlayername() {
        storePlayerName = makePlayerName(); // Calls playername() to get and store the name
    }

    // Method to retrieve the stored player's name
    public static String playerName() {
        return storePlayerName;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        displayAsciiArt();

        System.out.println("\u2728 WELCOME TO THE SHIBUYA INCIDENT \u2728"); // sparkles
        System.out.println("\u2618 By The Shibuya Sorcerers: Ashwika, Rehan, and Saboor"); // triskelion

        System.out.println("\n\u2605 You are a renowned detective known for solving high-stakes mysteries."); // star
        System.out.println("\u2694 This time, your mission takes you to the bustling streets of Shibuya, Japan."); // scissor
        System.out.println("\u26A1 A priceless artifact has been stolen, and the city's underworld syndicate is behind it."); // zap
        System.out.println("\u2622 Your job: infiltrate the syndicate, solve the mystery, and recover the artifact."); // radioactive
        System.out.println("\u26A0 But beware—Shibuya's underworld is a labyrinth of traps, puzzles, and danger."); // warning
        System.out.println("\n\uD83C\uDF0C Do you have what it takes to unravel the truth and outsmart the masterminds?"); // universe emoji
        System.out.println("\uD83D\uDD12 The future of Shibuya rests in your hands.\n"); // lock
        getPlayername();

        System.out.println("\u2744 " + playerName().toUpperCase() + ", ARE YOU READY? (Y/N) \u2757"); // snowflake


        String response = scanner.nextLine().trim().toUpperCase();
        try{
            if (response.equals("Y")) {
                System.out.println("\nGood. The adventure begins with an interrogation...\n");
                Thread.sleep(1500);
            } else {
                System.out.println("\nToo bad, detective. The mission awaits...\n");
                Thread.sleep(1500);
            }
            guessingGameConvo();
        }catch (InterruptedException ignored){
        }
    }

    public void displayAsciiArt() {
        System.out.println("                                                                                          \n" +
                "  -_-/  ,,       ,,                             _-_,                |\\                 ,  \n" +
                " (_ /   ||     ' ||                   _           //             '   \\\\               ||  \n" +
                "(_ --_  ||/\\\\ \\\\ ||/|, \\\\ \\\\ '\\\\/\\\\  < \\,         || \\\\/\\\\  _-_ \\\\  / \\\\  _-_  \\\\/\\\\ =||= \n" +
                "  --_ ) || || || || || || ||  || ;'  /-||        ~|| || || ||   || || || || \\\\ || ||  ||  \n" +
                " _/  )) || || || || |' || ||  ||/   (( ||         || || || ||   || || || ||/   || ||  ||  \n" +
                "(_-_-   \\\\ |/ \\\\ \\\\/   \\\\/\\\\  |/     \\/\\\\       _-_, \\\\ \\\\ \\\\,/ \\\\  \\\\/  \\\\,/  \\\\ \\\\  \\\\, \n" +
                "          _/                 (                                                            \n" +
                "                              -_-                                                         "+"\n  (\\\r\n" + //
                "  .'.\r\n" + //
                "  | |\r\n" + //
                "  | |\r\n" + //
                "  |_|");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ignored){

        }
    }

    public static void guessingGameTitle() { // Method for the title for number guessing game
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

    public static void guessingGameAscii() { // This method prints a phone ascii art prompting the user to enter the pin into the phone
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

    public static void guessingGameConvo() { // Conversation
        guessingGameTitle(); // Prints out the title
        try { // Try-Catch is to stop java from throwing an InterruptedException error when using Thread.sleep (printslow)
            Thread.sleep(2000); // Waits 2s after the title to start the conversation
            System.out.println("NARRATOR: YOU'RE INTERROGATING A WITNESS WHO WAS THERE WHEN THE ARTIFACT WAS STOLEN.");
            Thread.sleep(2000);
            System.out.println("NARRATOR: THE WITNESS HAS SPOTTY MEMORY, SO YOU NEED TO ASK IMPORTANT DETAILS YOURSELF...");
            Thread.sleep(2000);
            System.out.println(playerName() + ": Did they leave any details of where they were going?");
            Thread.sleep(2000);
            System.out.println("Witness: I don't believe so... But they dropped a device.");
            Thread.sleep(2000);
            System.out.println(playerName() + ": The device seems to be pin locked, we need to guess the pin correctly.");
            Thread.sleep(2000);
            System.out.println(playerName() + ": The device seems to give hints for the pin, and it's up to three digits, we can use this to our advantage.");
        } catch (Exception ignored) {
        }
        guessingGame(); // Starts the game
    }

    public static void guessingGame() {
        Scanner scanner = new Scanner(System.in);
        int guess = -1; // Guess is initialized as -1, in order to not immediately win the game in a rare-case the rng is above 0 < 100
        int secret = (int) (Math.random() * 100) + 1; // Generates number you need to guess
        guessingGameAscii(); // Prints out the phone ascii
        while (secret != guess) { // Whilst secret does not equal guess, do the following
            guess = scanner.nextInt(); // Check the user input
            if (guess == secret) { // If the user input is the same as the number you need to guess then you win
                System.out.println("You cracked the pin!");
                hangmanConversation();
            } else if (guess < secret) { // If your guess is lower than the number, then you will be prompted to re guess.
                System.out.println("The pin is higher!");
            } else if (guess > secret) { // If the guess is greater than the number, you will be prompted to re guess.
                System.out.println("The pin is lower!");
            }
        }
    }

    public static int hangManTries = 0; // Starts off the game with 0 tries, meaning the man is not hanging.
    public static boolean isGameNotOver = true; // The game isn't over.
    public static void hangmanAscii(){ // Hangman Title
        System.out.println(" ___                                                                                   <>                __ ,                       \n" +
                "-   ---___- ,,                -_____                 |\\           /\\\\,/\\\\,              )              ,-| ~                        \n" +
                "   (' ||    ||                  ' | -,          _     \\\\         /| || ||    _                        ('||/__,   _                  \n" +
                "  ((  ||    ||/\\\\  _-_         /| |  |`  _-_   < \\,  / \\\\        || || ||   < \\, \\\\/\\\\    _-_,       (( |||  |  < \\, \\\\/\\\\/\\\\  _-_  \n" +
                " ((   ||    || || || \\\\        || |==|| || \\\\  /-|| || ||        ||=|= ||   /-|| || ||   ||_.        (( |||==|  /-|| || || || || \\\\ \n" +
                "  (( //     || || ||/         ~|| |  |, ||/   (( || || ||       ~|| || ||  (( || || ||    ~ ||        ( / |  , (( || || || || ||/   \n" +
                "    -____-  \\\\ |/ \\\\,/         ~-____,  \\\\,/   \\/\\\\  \\\\/         |, \\\\,\\\\,  \\/\\\\ \\\\ \\\\   ,-_-          -____/   \\/\\\\ \\\\ \\\\ \\\\ \\\\,/  \n" +
                "              _/              (                                 _-                                                                  \n" +
                "                                                                                                                                    ");
    }
    public static void hangmanConversation() { // Conversation that starts hangman
        try {
            hangmanAscii(); // Title Ascii
            Thread.sleep(2000);
            System.out.println(playerName() + ": There seems to be a password-protected notepad in the device.");
            Thread.sleep(2000);
            System.out.println(playerName() + ": Maybe if I brute-force the password, I could access the content of the notepad.");
            Thread.sleep(2000);
            System.out.println(playerName() + ": Wait a minute... there seems to be a kill-switch if I get the password wrong more than 6 times.");
            Thread.sleep(2000);
            System.out.println(playerName() + ": If I get the password wrong more than six times, I'll surely be a dead man...");
            Thread.sleep(2000);
            System.out.println(playerName() + ": But there doesn't seem to be any other way to access the notepad, not unless if I get specialists on it.");
            Thread.sleep(2000);
            System.out.println(playerName() + ": But if I get specialists on it, then everyone at the station will know about it, and my gut tells me they'll mess something up.");
            Thread.sleep(2000);
            System.out.println(playerName() + ": Here goes nothing...");
            hangmanStarter(); // Starts game
        }catch(Exception ignored){
        }
    }
    public static void hangmanStarter() { // Starter/main code for hangman, the game basically runs off this
        System.out.println("What is your guess for the password? (Note: Put the full password in)");
        Scanner scanner = new Scanner(System.in);
        String guess = null; // User's guess on the password for the notepad
        String word = "password"; // This is the password for the notepad
        String revealed = "_".repeat(word.length()); // The amount of words that isn't revealed
        if ((isGameNotOver)){ // This resets the hangman tries once you restart if you mess up
            hangManTries = 0;
        }
        do { // Do-While loop, this checks if the guess is equal to the password
            hangManTries++;
            guess = scanner.next(); // Checks users guess
            if (guess.equals(word)) { // If guess is equal to password, then proceed to winning method
                winner();
                isGameNotOver = true;
            } else if (!guess.equals(word)) { // If hangman isn't equal to word, then proceed to the hangman hanging (based on # of tries)
                hangman();
                revealed = wordChecker(word, guess, revealed); // Goes to word check method and gives the method the guess, the correct word, and how much of the word is NOT revealed.
            }
        }while (!word.equals(guess) && isGameNotOver); // As long as these conditions are true, then this loop will continue.
    }

    public static String wordChecker(String word, String guess, String currentRevealed) {
        StringBuilder updatedRevealed = new StringBuilder(currentRevealed); // Stringbuilder is basically converting a string into a series of char
        for (int i = 0; i < guess.length(); i++) {
            char guessedHangmanChar = guess.charAt(i); // Check if any guessed character exists in the password
            if (word.indexOf(guessedHangmanChar) != -1) { // If the guessed character matches the word character at the same position
                for (int j = 0; j < word.length(); j++) { // Will check the following if j is under the length of the word
                    if (word.charAt(j) == guessedHangmanChar && updatedRevealed.charAt(j) == '_') { // If a char in guess is equal to a char in password and if there is no char in that spot
                        updatedRevealed.setCharAt(j, guessedHangmanChar); // Then it'll update the hangman to the correct char
                    }
                }
            }
        }

        System.out.println("Matching letters in the word: " + updatedRevealed);
        return updatedRevealed.toString();
    }
    public static void hangman() { // Hangman states based upon the amount of tries you've done.
        if (hangManTries == 1) {
            System.out.println(" O ");
        } else if (hangManTries == 2) {
            System.out.println(" O ");
            System.out.println(" | ");
        } else if (hangManTries == 3) {
            System.out.println(" O ");
            System.out.println("/| ");
        } else if (hangManTries == 4) {
            System.out.println(" O ");
            System.out.println("/|\\");
        } else if (hangManTries == 5) {
            System.out.println(" O ");
            System.out.println("/|\\");
            System.out.println("/  ");
        } else if (hangManTries == 6) {
            System.out.println(" O ");
            System.out.println("/|\\");
            System.out.println("/ \\");
            gameOver();
        } else {
            gameOver();
        }
    }
    public static void clearConsole(){
        for (int i = 0; i<=15; i++ ){ // clears console
            System.out.println();
        }
    }
    public static void gameOver() { // Game Over method
        clearConsole();
        System.out.println("Game over, you guessed wrong more than 6 times!");
        isGameNotOver = true; // Resets the game
        intro.playAgain();
    }
    public static void winner() { // Winner method, proceed to next game
        try {
            System.out.println("You got into the notepad!");
            System.out.println(playerName() + ": This seems to be an address not too far from here.");
            Thread.sleep(2000);
            System.out.println(playerName() + ": I'll go there right away.");
            new ShibuyaPokemon();
        } catch (Exception ignored){
        }
    }

    public static class ShibuyaPokemon {
        private static  Scanner scanner = new Scanner(System.in); // initiating scanner variable
        private static Random rand = new Random(); // initiating random variable



        public ShibuyaPokemon() throws InterruptedException { // nearly empty constructor
            pokemonAscii(); // calls upon the master method for running the entire task
            scanner.close(); // closes scanner
        }

        private static void FirstDialogue() throws InterruptedException { // method to display the introductory plot dialogue
            System.out.println("\nNarrator: You approach a neon-lit alley guarded by a figure in a dark trench coat.");
            Thread.sleep(2000); // extra feature to create a wait/reading time // extra feature to create a wait/reading time
            System.out.println("Narrator: The Syndicate Trainer steps forward, their expression smug, holding a Poké Ball.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: Well, well, looks like we've got a nosy little detective sniffing around where they shouldn't be.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: You think you can just waltz in here?");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: Prove it. If you want access, you'll have to get through me and my team first.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println(playerName() + ": I don't have time for games. Let me through or you'll regret it.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: Oh, I like your spirit. But talking tough won't get you anywhere here. ");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: Let's see if you can back it up in battle.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: If you win, maybe I'll consider letting you through.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            displayMenu(); // calls method to show user the options for the battle
        }

        private static void displayMenu() throws InterruptedException { // method to guide the user choice into the battle and to give the user more control
            System.out.println("\n1. Start Battle");
            System.out.println("2. Display Moves");
            System.out.println("3. Flee");

            char choice = inputChar("\nEnter your choice (1/2/3): ");
            switch (choice) { // switch case for the user input
                case '1':
                    initiate(); // initiates the pokemon battle
                    break;
                case '2':
                    moveDisplay(); // displays the moves
                    displayMenu(); // displays the options again
                    break;
                case '3':
                    System.out.println("\nYou chose to flee. This journey isn't that of a coward's.");
                    Thread.sleep(500); // extra feature to create a wait/reading time
                    gameOverAscii(); // calls method to show conclusory ascii art
                    break;
                default:
                    System.out.println("\nInvalid choice. Try again.");
                    displayMenu(); // displays the menu again for user choice
                    break;
            }
        }

        private static void initiate() throws InterruptedException { // initiates the pokemon battle
            int charizardHP = 266, venusaurHP = 286; // declares the health variables for the pokemon

            System.out.println("\nTrainer: Go Venusaur! I choose you!");
            Thread.sleep(1000); // extra feature to create a wait/reading time
            System.out.println("Trainer: If you think this is going to be an easy battle, you've got it coming.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            venusaurAscii(); // calls the method to display venusaur ascii art
            System.out.println(playerName() + ": Go Charizard! I choose you!");
            Thread.sleep(1000); // extra feature to create a wait/reading time
            charizardAscii(); // calls the method to display charizard ascii art

            while (charizardHP > 0 && venusaurHP > 0) { // the continuation of the pokemon battle is dependent on this while loop (ensures the battle goes on)
                System.out.println("\n--- Your Turn ---");
                System.out.println("1. Fire Fang");
                System.out.println("2. Dragon Tail");
                System.out.println("3. Flamethrower");

                char moveChoice = inputChar("Choose your move (1/2/3): "); // collects user input for move
                int playerDamage = useMove(moveChoice, true); // uses the useMove method to guide the move damage
                venusaurHP -= playerDamage; // calculates the damage
                System.out.println("You dealt " + playerDamage + " damage! Venusaur's HP: " + Math.max(0, venusaurHP)); // does not let venusaur's HP go into negatives

                if (venusaurHP <= 0) { // conclusory fight if statement
                    System.out.println("Venusaur fainted! You won the battle!");
                    pokemonOutro();
                    break;
                }

                System.out.println("\n--- Venusaur's Turn ---");
                int venusaurMoveChoice = rand.nextInt(3) + 1;
                int venusaurDamage = useMove((char)(venusaurMoveChoice + '0'), false); // gets the damage amount for the move chosen
                charizardHP -= venusaurDamage; // calculates the health
                System.out.println("Venusaur dealt " + venusaurDamage + " damage! Your HP: " + Math.max(0, charizardHP)); // does not let charizard's HP go below 0

                if (charizardHP <= 0) { // conclusory fight if statement
                    System.out.println("You fainted... Venusaur won the battle.");
                    displayMenu();
                }
            }
        }

        public static void pokemonAscii() throws InterruptedException { // method to display introductory title ascii art
            System.out.println("    __ ,                                                                                                                       \r\n" + //
                    "  ,-| ~           ,        ,,                                               /\\         -_-/  ,,       ,,                       \r\n" + //
                    " ('||/__,   _    ||        ||                                              ||         (_ /   ||     ' ||                   _   \r\n" + //
                    "(( |||  |  < \\, =||=  _-_  ||/\\  _-_   _-_  -_-_   _-_  ,._-_        /'\\\\ =||=       (_ --_  ||/\\\\ \\\\ ||/|, \\\\ \\\\ '\\\\/\\\\  < \\, \r\n" + //
                    "(( |||==|  /-||  ||  || \\\\ ||_< || \\\\ || \\\\ || \\\\ || \\\\  ||         || ||  ||          --_ ) || || || || || || ||  || ;'  /-|| \r\n" + //
                    " ( / |  , (( ||  ||  ||/   || | ||/   ||/   || || ||/    ||         || ||  ||         _/  )) || || || || |' || ||  ||/   (( || \r\n" + //
                    "  -____/   \\/\\\\  \\\\, \\\\,/  \\\\,\\ \\\\,/  \\\\,/  ||-'  \\\\,/   \\\\,        \\\\,/   \\\\,       (_-_-   \\\\ |/ \\\\ \\\\/   \\\\/\\\\  |/     \\/\\\\ \r\n" + //
                    "                                            |/                                                 _/                 (            \r\n" + //
                    "                                            '                                                                      -_-         ");
            Thread.sleep(3000); // extra feature to create a wait/reading time
            FirstDialogue(); // calls upon the method to display introductory plot dialogue
        }

        private static int useMove(char move, boolean isPlayer) throws InterruptedException { // method to guide the use of pokemon moves
            int damage = 0; // declares the damage variable to be 0 to begin with
            String attacker = isPlayer ? "You" : "Venusaur"; // extra feature (ternary operator) to identify the player

            switch (move) { // switch case to identify how each selected move would change the damage
                case '1':
                    System.out.println(attacker + " used Fire Fang!");
                    damage = rand.nextInt(20) + 10; // uses random to create some level of unique move damage
                    break;
                case '2':
                    System.out.println(attacker + " used Dragon Tail!");
                    damage = rand.nextInt(15) + 5; // uses random to create some level of unique move damage
                    break;
                case '3':
                    System.out.println(attacker + " used Flamethrower!");
                    damage = rand.nextInt(25) + 15; // uses random to create some level of unique move damage
                    break;
                default:
                    System.out.println("Invalid move.");
                    break;
            }
            return damage; // returns the specified damage amount
        }

        private static void moveDisplay() throws InterruptedException { // metho to display the available moves to the user
            System.out.println("\nAvailable Moves:");
            System.out.println("1. Fire Fang - Deals between 10 and 30 damage.");
            System.out.println("2. Dragon Tail - Deals between 5 and 20 damage.");
            System.out.println("3. Flamethrower - Deals between 15 and 40 damage.");
        }

        private static char inputChar(String message) throws InterruptedException { // helper method to collect a character from user input
            System.out.print(message);
            return scanner.next().toLowerCase().charAt(0);
        }

        public static void gameOverAscii() throws InterruptedException { // method to display game over ascii art
            System.out.print("    __ ,                                 __                      \r\n" + //
                    "  ,-| ~                                ,-||-,                    \r\n" + //
                    " ('||/__,   _                         ('|||  )  ;                \r\n" + //
                    "(( |||  |  < \\, \\\\/\\\\/\\\\  _-_        (( |||--)) \\\\ \\  _-_  ,._-_ \r\n" + //
                    "(( |||==|  /-|| || || || || \\\\       (( |||--)) || | || \\\\  ||   \r\n" + //
                    " ( / |  , (( || || || || ||/          ( / |  )  || | ||/    ||   \r\n" + //
                    "  -____/   \\/\\\\ \\\\ \\\\ \\\\ \\\\,/          -____-   \\\\/  \\\\,/   \\\\,  \r\n" + //
                    "                                                                 \r\n" + //
                    "                                                                 ");
            System.out.println();
            intro.playAgain();
        }

        public static void venusaurAscii() { // method to display venusaur ascii art
            System.out.println("                           _._       _,._\r\n" + //
                    "                        _.'   `. ' .'   _`.\r\n" + //
                    "                ,\"\"\"/`\"\"-.-.,/. ` V'\\-,`.,--/\"\"\".\"-..\r\n" + //
                    "              ,'    `...,' . ,\\-----._|     `.   /   \\\r\n" + //
                    "             `.            .`  -'`\"\" .._   :> `-'   `.\r\n" + //
                    "            ,'  ,-.  _,.-'| `..___ ,'   |'-..__   .._ L\r\n" + //
                    "           .    \\_ -'   `-'     ..      `.-' `.`-.'_ .|\r\n" + //
                    "           |   ,',-,--..  ,--../  `.  .-.    , `-.  ``.\r\n" + //
                    "           `.,' ,  |   |  `.  /'/,,.\\/  |    \\|   |\r\n" + //
                    "                `  `---'    `j   .   \\  .     '   j\r\n" + //
                    "              ,__`\"        ,'|`'\\_/`.'\\'        |\\-'-, _,.\r\n" + //
                    "       .--...`-. `-`. /    '- ..      _,    /\\ ,' .--\"'  ,'\".\r\n" + //
                    "     _'-\"\"-    --  _`'-.../ __ '.'`-^,_`-\"\"\"\"---....__  ' _,-`\r\n" + //
                    "   _.----`  _..--.'        |  \"`-..-\" __|'\"'         .\"\"-. \"\"'--.._\r\n" + //
                    "  /        '    /     ,  _.+-.'  ||._'   \"\"\"\". .          `     .__\\\r\n" + //
                    " `---    /        /  / j'       _/|..`  -. `-`\\ \\   \\  \\   `.  \\ `-..\r\n" + //
                    ",\" _.-' /    /` ./  /`_|_,-\"   ','|       `. | -'`._,   L  \\ .  `.   |\r\n" + //
                    "`\"' /  /  / ,__...-----| _.,  ,'            `|----.._`-.|' |. .` ..  .\r\n" + //
                    "   /  '| /.,/   \\--.._ `-,' ,          .  '`.'  __,., '  ''``._ \\ \\`,'\r\n" + //
                    "  /_,'---  ,     \\`._,-` \\ //  / . \\    `._,  -`,  / / _   |   `-L -\r\n" + //
                    "   /       `.     ,  ..._ ' `_/ '| |\\ `._'       '-.'   `.,'     |\r\n" + //
                    "  '         /    /  ..   `.  `./ | ; `.'    ,\"\" ,.  `.    \\      |\r\n" + //
                    "   `.     ,'   ,'   | |\\  |       \"        |  ,'\\ |   \\    `    ,L\r\n" + //
                    "   /|`.  /    '     | `-| '                  /`-' |    L    `._/  \\\r\n" + //
                    "  / | .`|    |  .   `._.'                   `.__,'   .  |     |  (`\r\n" + //
                    " '-\"\"-'_|    `. `.__,._____     .    _,        ____ ,-  j     \".-'\"'\r\n" + //
                    "        \\      `-.  \\/.    `\"--.._    _,.---'\"\"\\/  \"_,.'     /-'\r\n" + //
                    "         )        `-._ '-.        `--\"      _.-'.-\"\"        `.\r\n" + //
                    "        ./            `,. `\".._________...\"\"_.-\"`.          _j\r\n" + //
                    "       /_\\.__,\"\".   ,.'  \"`-...________.---\"     .\".   ,.  / \\\r\n" + //
                    "              \\_/\"\"\"-'                           `-'--(_,`\"`-` ");
        }

        public static void charizardAscii() { // method to display charizard ascii art
            System.out.println("                 .\"-,.__\r\n" + //
                    "                 `.     `.  ,\r\n" + //
                    "              .--'  .._,'\"-' `.\r\n" + //
                    "             .    .'         `'\r\n" + //
                    "             `.   /          ,'\r\n" + //
                    "               `  '--.   ,-\"'\r\n" + //
                    "                `\"`   |  \\\r\n" + //
                    "                   -. \\, |\r\n" + //
                    "                    `--Y.'      ___.\r\n" + //
                    "                         \\     L._, \\\r\n" + //
                    "               _.,        `.   <  <\\                _\r\n" + //
                    "             ,' '           `, `.   | \\            ( `\r\n" + //
                    "          ../, `.            `  |    .\\`.           \\ \\_\r\n" + //
                    "         ,' ,..  .           _.,'    ||\\l            )  '\".\r\n" + //
                    "        , ,'   \\           ,'.-.`-._,'  |           .  _._`.\r\n" + //
                    "      ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\\r\n" + //
                    "    .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`.\r\n" + //
                    "    |  '          ..         `-...-\"  |  `-'      / /        . `.\r\n" + //
                    "    | /           |L__           |    |          / /          `. `.\r\n" + //
                    "   , /            .   .          |    |         / /             ` `\r\n" + //
                    "  / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\\r\n" + //
                    " / .           \\\"`_/. `-_ \\_,.  ,'    +-' `-'  _,        ..,-.    \\`.\r\n" + //
                    ".  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\\r\n" + //
                    "' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L`\r\n" + //
                    "|'      _.-\"\"` `.    \\ _,'  `            \\ `.___`.'\"`-.  , |   |    | \\\r\n" + //
                    "||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|\r\n" + //
                    "||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||\r\n" + //
                    "|| '              V      / /           `   | `   ,'   ,' '.    !  `. ||\r\n" + //
                    "||/            _,-------7 '              . |  `-'    l         /    `||\r\n" + //
                    ". |          ,' .-   ,' ||               | .-.        `.      .'     ||\r\n" + //
                    " `'        ,'    `\".'    |               |    `.        '. -.'       `'\r\n" + //
                    "          /      ,'      |               |,'    \\-.._,.'/'\r\n" + //
                    "          .     /        .               .       \\    .''\r\n" + //
                    "        .`.    |         `.             /         :_,'.'\r\n" + //
                    "          \\ `...\\   _     ,'-.        .'         /_.-'\r\n" + //
                    "           `-.__ `,  `'   .  _.>----''.  _  __  /\r\n" + //
                    "                .'        /\"'          |  \"'   '_\r\n" + //
                    "               /_|.-'\\ ,\".             '.'`__'-( \\\r\n" + //
                    "                 / ,\"'\"\\,'               `/  `-.|\"");
        }

        public static void pokemonOutro() throws InterruptedException { // method to display plot conclusionary plot dialogue
            System.out.println("Narrator: The Syndicate Trainer stumbles back, visibly shaken.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Narrator: They recall their Pokémon, their smirk fading into a bitter scowl.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: You're better than I thought. But don't get cocky.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: You're still just a stray wandering into the lion's den.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Narrator: They hand over a sleek electronic pass, marked with the glowing insignia of the syndicate.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Guard: This pass gets you inside... but you'll need more than brute strength to make it any further.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println(playerName() + ": I'm not looking for ease. Just answers.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println(playerName() + ": And I'll tear this syndicate apart to get them.");
            Thread.sleep(1500); // extra feature to create a wait/reading time
            ShibuyaCourtCase.shibuyaCourtCase();
        }
    }
    public class ShibuyaCourtCase {
        public static int lifeMCQ = 1; // initiates the variable to track lives
        public static char choiceMCQ = 'z'; // initiates the variable to track the user choiceMCQ
        private static Scanner scanner = new Scanner(System.in); // initiates the scanner
        public static void main (String args[]) throws InterruptedException { // beginning the code (main)
            shibuyaCourtCase();
        }
        public static void shibuyaCourtCase() throws InterruptedException { // master method for running the program for the MCQ
            titleMCQAscii(); // calls the method responsible for the initiating ascii title
            introMCQ(); // calls the method responsible for the introductory plot dialogue
            System.out.println("\nYou will have 1 'life' and will gain one for each question answered correctly and vice versa.");
            System.out.println("You must end the game with at least 1 life. If you lose lives in the middle, you still have the option for redemption.");
            System.out.println("\n1. What did the witness from The Drop do/reveal?");
            print("The identity of the stolen artifact", "Cryptic details about our mysterious leader", // uses the helper method to easily arrange the MCQ answers
                    "The exact location of the syndicate's headquarters", "A device holding secrets");
            char result = ask(); // declares a variable by receiving character input using the helper method
            if (result != 'd') {lifeMCQ-=1; System.out.println("Incorrect! Lives: "+ lifeMCQ);} // simple if statement
            else {lifeMCQ+=1; System.out.println("Correct. Lives: " + lifeMCQ);}
            System.out.println("\n2. In The Dead Man's Game, what did the word search puzzle uncover?");
            print("Hidden names of our Pokemon", "Intel on the syndicate's structure and major players", // uses the helper method to easily arrange the MCQ answers
                    "A notebook with an address", "The passcode to our vault");
            result = ask(); // changes the variable value to accomodate for the new question
            if (result != 'c') {lifeMCQ-=1; System.out.println("Incorrect! Lives: "+ lifeMCQ);}
            else {lifeMCQ+=1; System.out.println("Correct. Lives: " + lifeMCQ);}
            System.out.println("\n3. What was the Guard guarding in Gatekeeper of Shibuya?");
            print("The artifact", "Access to the restricted area", // uses the helper method to easily arrange the MCQ answers
                    "A list of syndicate members", "The AI Gatekeeper");
            result = ask(); // changes the variable value to accomodate for the new question
            if (result != 'd') {lifeMCQ-=1; System.out.println("Incorrect! Lives: "+ lifeMCQ);}
            else {lifeMCQ+=1; System.out.println("Correct. Lives: " + lifeMCQ);}
            System.out.println("\n4. What was the Guard's parting warning?");
            print("\"Cerberus will hunt you down.\"", "\"You'll need more than brute strength.\"", // uses the helper method to easily arrange the MCQ answers
                    "\"You'll never find the artifact.\"", "\"This pass is worthless.\"");
            result = ask(); // changes the variable value to accomodate for the new question
            if (result != 'b') {lifeMCQ-=1; System.out.println("Incorrect! Lives: "+ lifeMCQ);}
            else {lifeMCQ+=1; System.out.println("Correct. Lives: " + lifeMCQ);}
            postMCQ(); // calls the method to begin the post MCQ plot dialogue routes
        }
        public static void introMCQ() throws InterruptedException { // method for the introductory plot dialogue
            System.out.println("\nNarrator: You step into a dimly lit room. ");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Narrator: The walls are lined with rows of filing cabinets, each drawer secured with intricate locks.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("Narrator: A holographic interface flickers to lifeMCQ, revealing a stern-looking AI gatekeeper.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("AI: Access to continue requires verification.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("AI: Only those with the intelligence to decode our operations may proceed.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("AI: You've encountered our associates, uncovered their secrets, and defeated their defenses. ");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            System.out.println("AI: Prove your understanding of our operations. Fail, and you will remain locked out of the truth forever.");
            Thread.sleep(2000); // extra feature to create a wait/reading time
            deviceMCQ(); // calls upon the method to display the ascii device
        }
        private static char ask()  throws InterruptedException { // helper method to ask the user for their answer
            choiceMCQ = inputChar("What would you like to do? (a/b/c/d) "); // assigns the universal variable the user choice value
            while (!AnswerChecker(choiceMCQ)) { // uses the helper method to check for a valid response
                System.out.print("That answer is invalid. Please submit an appropriate answer.\n");
                choiceMCQ = inputChar("What would you like to do? (a/b/c/d) ");
            }
            return choiceMCQ; // returns the answer from the user
        }
        private static boolean AnswerChecker(char answer)  throws InterruptedException { // helper method to identify the possible correct responses
            return (answer == 'a' || answer == 'b' || answer == 'c' || answer == 'd'); // returns the boolean for if it matches the possible answers very easily
        }
        private static char inputChar(String message)  throws InterruptedException { // helper method to collect the character from the user
            System.out.print(message);
            return scanner.next().toLowerCase().charAt(0);
        }
        private static void print(String option1, String option2, String option3, String option4)  throws InterruptedException { // helper method to print out the possible answers very easily
            System.out.print("Options: \na) " + option1 + "\nb) " + option2 + "\nc) " + option3 + "\nd) " + option4 + "\n");
        }

        public static void titleMCQAscii()  throws InterruptedException { // method to display the introductory ascii art
            System.out.println(" ___                           _                                                <>             ___                         \r\n" + //
                    "-   ---___- ,,                - - /, /,         ,       ,,     |\\                )            -   ---___-               ,  \r\n" + //
                    "   (' ||    ||                  )/ )/ )   _    ||       ||      \\\\          _                    (' ||                 ||  \r\n" + //
                    "  ((  ||    ||/\\\\  _-_          )__)__)  < \\, =||=  _-_ ||/\\\\  / \\\\  /'\\\\  / \\\\    _-_,         ((  ||     _-_   _-_, =||= \r\n" + //
                    " ((   ||    || || || \\\\        ~)__)__)  /-||  ||  ||   || || || || || || || ||   ||_.         ((   ||    || \\\\ ||_.   ||  \r\n" + //
                    "  (( //     || || ||/           )  )  ) (( ||  ||  ||   || || || || || || || ||    ~ ||         (( //     ||/    ~ ||  ||  \r\n" + //
                    "    -____-  \\\\ |/ \\\\,/         /-_/-_/   \\/\\\\  \\\\, \\\\,/ \\\\ |/  \\\\/  \\\\,/  \\\\_-|   ,-_-            -____-  \\\\,/  ,-_-   \\\\, \r\n" + //
                    "              _/                                          _/               /  \\                                            \r\n" + //
                    "                                                                          '----`                                           ");
        }
        public static void deviceMCQ() { // method to display the device ascii art in the game (MCQ)
            System.out.println("   _\r\n" + //
                    "  | |\r\n" + //
                    "  |_|\r\n" + //
                    "  /_\\    \\ | /\r\n" + //
                    ".-\"\"\"------.----.\r\n" + //
                    "|          U    |\r\n" + //
                    "| ________GF337 |\r\n" + //
                    "||   Welcome   ||\r\n" + //
                    "||             ||\r\n" + //
                    "||_____________||\r\n" + //
                    "|__.---\"\"\"---.__|\r\n" + //
                    "|---------------|\r\n" + //
                    "| ___  ___  ___ |\r\n" + //
                    "|[___][_A_][___]|\r\n" + //
                    "| ___  ___  ___ |\r\n" + //
                    "|[___][_B_][___]|\r\n" + //
                    "| ___  ___  ___ |\r\n" + //
                    "|[___][_C_][___]|\r\n" + //
                    "| ___  ___  ___ |\r\n" + //
                    "|[___][_D_][___]|\r\n" + //
                    "`---------------'");
        }
        public static void postMCQ() throws InterruptedException { // method to display the conclusionary plot dialogue based on results
            if (lifeMCQ>0) { // identifying the path the user will take based on their answers
                System.out.println("\n\nAI: Verification complete.");
                Thread.sleep(2000); // extra feature to create wait/reading time
                System.out.println("AI: You have demonstrated the intellect to navigate our labyrinth.");
                Thread.sleep(2000); // extra feature to create wait/reading time
                System.out.println("AI: Proceed, but know this: the path ahead is fraught with riddles far more treacherous.");
                Thread.sleep(2000); // extra feature to create wait/reading time
                System.out.println("Narrator: The holographic display flickers, revealing a secret door sliding open.");
                Thread.sleep(2000); // extra feature to create wait/reading time
                System.out.println(playerName() + ": Every step gets me closer to the truth.");
                Thread.sleep(2000); // extra feature to create wait/reading time
                System.out.println(playerName() + ": No turning back now.");
                Thread.sleep(2000); // extra feature to create wait/reading time
                riddle.main();
            }
            else if (lifeMCQ<=0) { // continuation of theif statement
                System.out.println("\n\nAI: This path is not for the unworthy.");
                Thread.sleep(2000); // extra feature to create wait/reading time
                System.out.println("AI: Begone you fool, you foreigner, you farce. ");
                Thread.sleep(2000); // extra feature to create wait/reading time
            }
        }
    }
    /**
     * Name: Riddle of The Eternal Flame
     * Date: 11/24/2024
     * Purpose: This program presents a riddle game where the user has up to 5 attempts to answer a riddle correctly.
     * The program includes dialogues, ASCII art, and responses for wrong answers.
     */

    public static class riddle {
        // main method to start program
        public static void main() {
            beginningDialogue(); // intro dialogue with ghost
            displayAsciiArt();   // ascii art
            game();              // game loop for solving riddle
        }

        // variables
        public static int attempts = 0;          // tracks number of attempts made
        private static boolean correctAnswer = false; // indicates if player solved riddle
        private static Scanner scanner = new Scanner(System.in); // scanner

        /**
         * Presenting riddle and processing user answers.
         */
        public static void game() {
            System.out.println("Riddle: I am tall when young and short when old. In the light, I bring calm and warmth to the heart, yet when spent, I leave only ashes behind.");

            // loop to allow up to 4-5 attempts for answering riddle
            while (!correctAnswer && attempts < 5) {
                System.out.print("\nEnter your answer: ");
                String answer = scanner.nextLine().trim().toLowerCase(); // user input
                attempts++;

                // if answer's correct
                if (answer.equals("a candle") || answer.equals("candle")) {
                    System.out.println("Wow. You've somehow managed to solve the riddle.");
                    correctAnswer = true;
                    followUpResponse(); // additional dialogue for correct answer
                } else {
                    riddleResponse(); // responses for incorrect answers
                }
            }

            // scenarios based on success/failure
            if (!correctAnswer) {
                deathDialogue(); // losing the game
            } else {
                endingDialogue(); // solving the riddle
            }
        }

        /**
         * Displays the opening dialogue with the ghost character.
         */
        public static void beginningDialogue() {
            try {
                System.out.println("*The air around you thickens, and a faint whisper echoes in the distance*");
                Thread.sleep(2000);
                System.out.println("*A flicker of light reveals a spectral figure hovering ahead*");
                Thread.sleep(2000);
                System.out.println("Ghost: Boo! I am the guardian of this domain. Solve my riddle, and I shall let you pass.");
                Thread.sleep(2000);
                System.out.println("Ghost: Fail, and you'll wander this labyrinth forever.");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("A curse occurred during the dialogue...");
                Thread.currentThread().interrupt();
            }
        }

        /**
         * Handles the follow-up response after the riddle is solved.
         */
        public static void followUpResponse() {
            System.out.print("\nDid you think you could get away so fast? (yes/no): ");
            String followUpAnswer = scanner.nextLine().trim().toLowerCase();

            // responses based on input
            if (followUpAnswer.equals("yes")) {
                System.out.println("The riddle was too easy for you, huh? Well, now there’s a real riddle you need to play to obtain the artifact!");
            } else if (followUpAnswer.equals("no")) {
                System.out.println("Just as I expected. Now, prepare yourself – the real final game awaits if you want the artifact!");
            } else {
                System.out.println("I'll take that as a 'no'. Now, onto the real final game to earn the artifact!");
            }
        }

        /**
         * Displays the ending dialogue if the player wins.
         */
        public static void endingDialogue() {
            try {
                System.out.println("\n\n*The spectral figure begins to fade, its laugh echoing softly*");
                Thread.sleep(2000);
                System.out.println("Ghost: You have proven your wit... for now.");
                Thread.sleep(2000);
                System.out.println("Ghost: But beware, the riddles ahead are even trickier.");
                Thread.sleep(2000);
                System.out.println("*You gently open the door... revealing a passage bathed in eerie light*");
                Thread.sleep(2000);
                System.out.println(playerName() + ": Each challenge gets me closer to uncovering the truth. There's no turning back.");
                Thread.sleep(2000);
                potionsriddle.potionRiddleStart();
            } catch (InterruptedException e) {
                System.err.println("An interruption occurred during the ending dialogue.");
                Thread.currentThread().interrupt();
            }
        }

        /**
         * Displays the dialogue for when the player fails the game.
         */
        public static void deathDialogue() {
            try {
                System.out.println("\n\n*The ghost cackles as the room grows darker*");
                Thread.sleep(2000);
                System.out.println("Ghost: Fifth time and you're gone! Farewell, foolish wanderer!");
                Thread.sleep(2000);
                System.out.println("*The ground crumbles beneath your feet, and the darkness swallows you whole...*");
                Thread.sleep(2000);
                System.out.println("Game Over.");
            } catch (InterruptedException e) {
                System.err.println("An interruption occurred during the death dialogue.");
                Thread.currentThread().interrupt();
            }
        }

        /**
         * Provides responses for incorrect answers based on attempt count.
         */
        public static void riddleResponse() {
            // feedback made to attempt number
            switch (attempts) {
                case 1 -> System.out.println("Of course you got it wrong, try again.");
                case 2 -> System.out.println("Oh, I forgot. You only have two tries left.");
                case 3 -> System.out.println("Perhaps, third time’s the artifact?");
                case 4 -> System.out.println("Really? Do you have a death wish?!");
                case 5 -> System.out.println("Ghost: Fifth time and you're gone! Brace yourself!");
            }
        }

        /**
         * Displays ASCII art.
         */
        public static void displayAsciiArt() {
            System.out.println("" +
                    "\n" +
                    "                                                                                                            \n" +
                    "                        -__ /\\       |\\    |\\   ,,                     /\\                                   \n" +
                    "                          || \\,   '   \\\\    \\\\  ||                    ||                                    \n" +
                    "                         /|| /   \\\\  / \\\\  / \\\\ ||  _-_         /'\\\\ =||=                                   \n" +
                    "                         \\||/-   || || || || || || || \\\\       || ||  ||                                    \n" +
                    "                          ||  \\  || || || || || || ||/         || ||  ||                                    \n" +
                    "                        _---_-|, \\\\  \\\\/   \\\\/  \\\\ \\\\,/        \\\\,/   \\\\,                                   \n" +
                    "                                                                                                            \n" +
                    "                                                                                                            \n" +
                    " ___                                                                             _ ,                        \n" +
                    "-   ---___- ,,                  ,- _~,   ,                          ,,         ,- - ,,                      \n" +
                    "   (' ||    ||                 (' /| /  ||                      _   ||        _||_  ||   _                  \n" +
                    "  ((  ||    ||/\\\\  _-_        ((  ||/= =||=  _-_  ,._-_ \\\\/\\\\  < \\, ||       ' ||   ||  < \\, \\\\/\\\\/\\\\  _-_  \n" +
                    " ((   ||    || || || \\\\       ((  ||    ||  || \\\\  ||   || ||  /-|| ||         ||   ||  /-|| || || || || \\\\ \n" +
                    "  (( //     || || ||/          ( / |    ||  ||/    ||   || || (( || ||         |,   || (( || || || || ||/   \n" +
                    "    -____-  \\\\ |/ \\\\,/          -____-  \\\\, \\\\,/   \\\\,  \\\\ \\\\  \\/\\\\ \\\\       _-/    \\\\  \\/\\\\ \\\\ \\\\ \\\\ \\\\,/  \n" +
                    "              _/                                                                                            ");
            System.out.println(".-.");
            System.out.println("(o o) boo!");
            System.out.println("| O \\");
            System.out.println(" \\   \\");
            System.out.println("  `~~~'");
            System.out.println("The ghost asks a riddle! ");
        }
    }
    /*
     * Name: The Mastermind’s Last Test
     * Date: 11/24/2024
     * Purpose: A riddle-based game where player must solve 5 riddles to determine which potion is safe to drink.
     */

    public static class potionsriddle {

        // riddles presented to player
        private static final String[] riddles = {
                "1) What can you catch but cannot throw? Do not use speech articles.",
                "2) Pick me up and scratch my head. I'll turn red and then black. What am I? Do not use speech articles.",
                "3) The more you have of me, the less you see. What am I?",
                "4) What has keys but can't open locks? Do not use speech articles.",
                "5) What comes once in a minute, twice in a moment, but never in a thousand years?"
        };

        // correct answers corresponding to riddles
        private static final String[] answers = {
                "cold", "match", "darkness", "piano", "m"
        };

        // track which potions are still considered dangerous
        private static boolean[] potions = {true, true, true, true, true};

        // main: entry point for program
        public static void potionRiddleStart()  {
            try{
                displayAsciiArt(); // ascii art intro
                Scanner scanner = new Scanner(System.in); // scanner for user input
                displayIntroduction(); // present intro
                if (openEnvelope()) { // ask if player wants to begin
                    displayBeginningDialogue(); // dialogue
                    startRiddleChallenge(scanner); // riddle-solving process
                    displayEndingDialogue(); // ending sequence
                } else {
                    // player opts out of task
                    System.out.println("You chose not to open the envelope. The case turns cold, you lost.");
                    intro.playAgain(); // Prompts if to restart
                }

                scanner.close(); // close
            }catch (InterruptedException Ignored){

            }
        }

        // method to display ascii art at the beginning
        private static void displayAsciiArt() throws InterruptedException {
            System.out.println("" +
                    "\n" +
                    " ___                                                                                          <>      \n" +
                    "-   ---___- ,,                  /\\\\,/\\\\,               ,                                 |\\    )      \n" +
                    "   (' ||    ||                 /| || ||    _          ||                        '         \\\\          \n" +
                    "  ((  ||    ||/\\\\  _-_         || || ||   < \\,  _-_, =||=  _-_  ,._-_ \\\\/\\\\/\\\\ \\\\ \\\\/\\\\  / \\\\    _-_, \n" +
                    " ((   ||    || || || \\\\        ||=|= ||   /-|| ||_.   ||  || \\\\  ||   || || || || || || || ||   ||_.  \n" +
                    "  (( //     || || ||/         ~|| || ||  (( ||  ~ ||  ||  ||/    ||   || || || || || || || ||    ~ || \n" +
                    "    -____-  \\\\ |/ \\\\,/         |, \\\\,\\\\,  \\/\\\\ ,-_-   \\\\, \\\\,/   \\\\,  \\\\ \\\\ \\\\ \\\\ \\\\ \\\\  \\\\/    ,-_-  \n" +
                    "              _/              _-                                                                      \n" +
                    "                                                                                                      \n" +
                    "                                                        ___                                           \n" +
                    "                        _-_-                  ,        -   ---___-               ,                    \n" +
                    "                         /,       _          ||           (' ||                 ||                    \n" +
                    "                         ||      < \\,  _-_, =||=         ((  ||     _-_   _-_, =||=                   \n" +
                    "                        ~||      /-|| ||_.   ||         ((   ||    || \\\\ ||_.   ||                    \n" +
                    "                         ||     (( ||  ~ ||  ||          (( //     ||/    ~ ||  ||                    \n" +
                    "                        (  -__,  \\/\\\\ ,-_-   \\\\,           -____-  \\\\,/  ,-_-   \\\\,                   \n");
            Thread.sleep(1500);
        }

        // method to set scene/describe environment
        private static void displayIntroduction() throws InterruptedException {
            System.out.println("You walk into the next room and feel the atmosphere shift. The air is damp, and the faint scent of herbs lingers.");
            Thread.sleep(1500);
            System.out.println("Your eyes land on a small wooden table at the center, where five potions sit in ornate bottles.");
            System.out.print(
                    "   ___\n" +
                            "    )_( \n" +
                            "    | |\n" +
                            "  .-'-'-. _                            __\n" +
                            " /-::_..-\\  _[_]_                   .-'. '-.\n" +
                            " )_     _( /_   _\\   [-]           /:;/ _.-'\\\n" +
                            " |;::    | )_``'_( .-'-'-.   (-)   |:._     |\n" +
                            " |;::1   | |;:   | :-...-: .-'-'-. |:._ 5   |\n" +
                            " |;::    | |;:2  | |;:3  | |-...-| |:._     |\n" +
                            " |;::-.._| |;:.._| |;:.._| |;:4..| |:._     |\n" +
                            " `-.._..-' `-...-' `-...-' `-...-' `-.____.-' ");
            Thread.sleep(1500);
            System.out.println("\nA sealed envelope rests beside them, the paper yellowed with age.");
            System.out.println("" +
                    "  __________________ \n" +
                    " |              .__.|\n" +
                    " | ._-..        | | |\n" +
                    " |     '    '       |\n" +
                    " |           -.,-_  |\n" +
                    " |__________________|\n");
            Thread.sleep(1500);
            System.out.println("The silence is broken only by the sound of your own breathing as you contemplate what to do next.");
        }

        // method to handle opening envelope decision
        private static boolean openEnvelope() throws InterruptedException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to open the envelope? (y/n) ");
            char open = scanner.nextLine().toLowerCase().charAt(0);
            if (open == 'y') {
                System.out.println("The envelope crinkles as you break the seal. Inside is a note written in flowing script:");
                Thread.sleep(1500);
                System.out.println("'There are 5 amongst us... 4 of which will kill, and only 1 will lend you safe passage.'");
                Thread.sleep(1500);
                System.out.println("'Choose the incorrect poison, and you will die. Answer the riddles to uncover the truth.'");
                return true;
            }
            return false; // player chooses not to open
        }

        // dialogue to transition into riddle-solving phase
        private static void displayBeginningDialogue() throws InterruptedException {
            System.out.println("\n*The room grows colder, and a faint whisper begins to echo:*");
            Thread.sleep(1500);
            System.out.println("\"Only the clever may proceed. Choose wisely, for death lurks in every misstep.\"");
            Thread.sleep(1500);
            System.out.println("*You clench your fists and take a deep breath.*");
            Thread.sleep(1500);
            System.out.println(playerName() + ": \"I won't let fear cloud my judgment. Let's begin.\"");
        }

        // main loop for presenting riddles
        private static void startRiddleChallenge(Scanner scanner) throws InterruptedException {
            for (int i = 0; i < riddles.length; i++) {
                askRiddle(scanner, i);
            }
            System.out.println("Now, for your final riddle... \nJust kidding! All riddles solved correctly! The final safe potion is...");
            Thread.sleep(1500);
            revealSafePotion();
        }

        // method to handle each individual riddle interaction
        private static void askRiddle(Scanner scanner, int i) throws InterruptedException {
            System.out.println(riddles[i]); // display riddle
            String userAnswer = scanner.nextLine().toLowerCase().trim();

            if (userAnswer.equals(answers[i])) {
                potions[i] = false; // mark the potion as safe
                System.out.println("Congratulations, you got the right answer! Bottle " + (i + 1) + " has been removed!");
            } else {
                // user fails riddle
                System.out.println("Incorrect answer! You must restart the game.");
                System.exit(0);
            }
        }

        // reveal safe potion at end
        private static void revealSafePotion() throws InterruptedException {
            System.out.println("The safe potion is bottle #5!");
            Thread.sleep(1500);
        }

        // method to display final scene/narrative
        private static void displayEndingDialogue() throws InterruptedException {
            System.out.println("You lift the safe potion and drink it. A surge of warmth spreads through your body, restoring your strength.");
            Thread.sleep(1500);
            System.out.println("As the potion takes effect, the room around you begins to dissolve, replaced by flickering shadows and fractured light.");
            Thread.sleep(1500);
            System.out.println("The air grows heavy with cursed energy, crackling like static against your skin. A low hum resonates in the distance.");
            Thread.sleep(2000);
            System.out.println("*Your vision clears, revealing the shattered remains of the Shibuya barrier, cloaked in an eerie blue glow.*");
            Thread.sleep(2000);
            System.out.println("Ahead, a figure stands amidst the ruins, their presence radiating power and malice. The faint pulse of a cursed artifact draws your gaze.");
            Thread.sleep(2000);
            System.out.println("You take a deep breath, steadying yourself for the trial to come. Whatever awaits, you know you cannot turn back now.");
            Thread.sleep(2000);
            System.out.println("\n--- PREPARE FOR WHAT IS TO COME ---");
            playGame();
        }

        public static void main() {
        }
    }
    public static void main() throws InterruptedException {
        playGame();
    }

    private static void playGame() {
        displayTitle();
        gameConclusion();
    }

    private static void displayTitle() {
        System.out.println("" +
                "\n" +
                "    __                             <>             _                    \n" +
                "   /  -,       ,,             _-_,  ) |\\         - - /, /,             \n" +
                "  ||   )   _   ||               //     \\\\          )/ )/ )  '          \n" +
                " ~||---)  < \\, ||/\\\\            ||    / \\\\         )__)__) \\\\ \\\\/\\\\    \n" +
                " ~||---,  /-|| || ||           ~||   || ||        ~)__)__) || || ||    \n" +
                " ~||  /  (( || || ||            ||   || ||         )  )  ) || || ||    \n" +
                "  |, /    \\/\\\\ \\\\ |/ <>       _-_,    \\\\/         /-_/-_/  \\\\ \\\\ \\\\ <> \n" +
                "-_-  --~         _/   )                                                \n");

        System.out.println("Welcome to the Shibuya Incident!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored){}
        System.out.println("" +
                "               .___\n" +
                "               @...V;\n" +
                "              P:   :|\n" +
                "         .___\"d `~\" P.\n" +
                "        .@ ..\"W     d;\n" +
                "        :P'  \"d     j#\n" +
                "         \\@`_#f  ~  W.\n" +
                "           \" #;    .@.\",\n" +
                "             P.     Pj n|\n" +
                "             @.     #;  \":\n" +
                "             n; ~   mZ   :;\n" +
                "             M.    .#     f.\n" +
                "        ___.f#     .\".   .d\n" +
                "      .\"    \":     .\";    ;f\n" +
                " .____P     L.      :     jh\n" +
                " h    \"     |      \\\"     ;Y\n" +
                "\"P    |    .nm    -j:     :P.\n" +
                " W   .n                    .Y\n" +
                " Z                        #8.\n" +
                ".P                         'Z\n" +
                " `f                       fj\n" +
                "  \":                      :d\n" +
                "   :p                    P;\n" +
                "    `v                  -l'\n");
    }
    private static void gameConclusion() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\nYou enter the shattered remains of the Shibuya barrier, \nwhere a mysterious figure stands before a glowing artifact.\n");
            Thread.sleep(2000);
            System.out.println("Mysterious Figure: \"You’ve come far. But do you understand the power you seek?\n");
            Thread.sleep(2000);
            System.out.println("*The figure steps forward, their cursed energy overwhelming the room. \nIt feels as though the very air is thick with danger.*");
            Thread.sleep(2000);
            System.out.print("\nMysterious Figure: \"Why are you here? What drives you to face such cursed danger?\" Enter your reason: ");
            String response = scanner.nextLine();
            Thread.sleep(2000);
            System.out.println("\nMysterious Figure: \"" + response.toUpperCase() + ", huh? Interesting. Let’s see if you’re worthy of this cursed power. \nDo you understand the price it demands?\"");
            Thread.sleep(2000);
            System.out.println("\n*Sukuna's Finger pulses with malevolent energy, glowing brighter with every beat, as if alive and aware of your presence. \nThe power it emanates feels almost unbearable.*");
            Thread.sleep(2000);
            System.out.print("\u26A1 Choose your action: \n" +
                    "\u2460 Swallow Sukuna's Finger \uD83D\uDC7F \n" +  // devil
                    "\u2461 Refuse the cursed power \u274C \n" +       // cross
                    "Enter your choice (\u2460 or \u2461): ");         // num circle
            int choice = scanner.nextInt();
            Thread.sleep(1500);
            if (choice == 1) {
                choice1();
            } else if (choice == 2) {
                choice2();
            } else {
                choice3();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();}
    }
    public static void choice1(){
        try{
            System.out.println("\n*You step forward and grasp Sukuna's Finger, feeling the dark energy surge through you. \nThe air grows cold, and a deep, unsettling voice fills your mind.*");
            Thread.sleep(2000);
            System.out.println("The voice echoes: \"There is a 1 in a million chance you might survive this... \nYou have chosen to embrace the unknown. Do you truly understand the cost?\"");
            Thread.sleep(3000);
            System.out.println("\n*The cursed energy crashes over you in waves. The pain is excruciating as you struggle to control the overwhelming power. \nIn the end, the force is too much for your body to handle, and you collapse.*");
            Thread.sleep(2000);
            System.out.println("\n--- YOU DIE! ---");
            timetoComplete();
            playAgain();
        } catch (InterruptedException ignored){
        }
    }
    public static void choice2(){
        try {
            System.out.println("\n*You hesitate, taking a step back and shaking your head. \nThe temptation of ultimate cursed power fades as you resolve to refuse Sukuna's Finger.*");
            Thread.sleep(2000);
            System.out.println("The voice rings out with a knowing tone: \"Wisdom in restraint... You have shown the strength to turn away, even when power beckons. \nPerhaps you are the true victor.\"");
            Thread.sleep(2000);
            System.out.println("\n*The cursed energy around you seems to settle as the air clears. You breathe a sigh of relief, knowing you’ve passed the test.*");
            Thread.sleep(2000);
            System.out.println("\n*You do not swallow the finger, instead, you take it and return it back to Gojo.*");
            System.out.println("\n*Shibuya's criminal underground is crippled by your findings, whilst you're praised as a hero detective.*");
            System.out.println("\n--- YOU WIN! ---");
            timetoComplete();
            playAgain();
        }catch (InterruptedException ignored){
        }
    }
    public static void choice3(){
        try {
            System.out.println("\n*Your hesitation costs you dearly. The moment of uncertainty proves fatal as Shibuya's Finger shatters in your hands. \nA shockwave of cursed energy erupts, tearing through the room.*");
            Thread.sleep(2000);
            System.out.println("The voice booms: \"You were never meant to take the power, yet your indecision has sealed your fate.\"");
            Thread.sleep(2000);
            System.out.println("\n*The cursed energy overwhelms you, and the room collapses as you are consumed by the force you could not control.*");
            System.out.println("\n--- YOU LOSE! ---");
            timetoComplete();
            playAgain();
        } catch (InterruptedException ignored){
        }
    }
    public static void timetoComplete() {
        long finish = System.currentTimeMillis(); // Time it took in miliseconds
        long timeElapsedMillis = finish - start; // Total elapsed time in milliseconds
        long timeElapsedSec = timeElapsedMillis / 1000; // Total elapsed time in seconds
        long minutes = timeElapsedSec / 60; // Total minutes
        long seconds = timeElapsedSec % 60; // Remaining seconds after minutes
        System.out.println("Time played: " + minutes + " minutes and " + seconds + " seconds.");
    }
    private static void playAgain() { // Play again method
        timetoComplete();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWould you like to play again? (y/n): ");
        char choice = scanner.next().charAt(0);
        if (choice == 'y') { // If it's y, restart
            new intro().startGame();
        }
        else { // Else, terminate the program
            System.out.println("Thanks for playing!");
            System.exit(0); // Game end
        }
    }
}

