
import java.util.Scanner;

///////////////////////////////////////////////////////////////////
// Student name: Carl Hannusch, Mark Smullen
// Course: COSC 4303
// Assignment: #2 - Object-Oriented Programming Review
// File name: Display.java
// Purpose: This class handles all the IO for the game.
//
// Limitations: None known.
//
// Development Computer: MacBook Pro 13"
// Operating System: Mac OS X 10.6.8 Snow Leopard
// Integrated Development Environment (IDE): NetBeans IDE 6.9.1
// Compiler: javac
// Build Directions: See the Bowling class
// Operational Status: Functional, untested.
///////////////////////////////////////////////////////////////////

public class Display {
    // Variables
    /**
     * The Display instance - there can only be one!
     */
    private static Display displayInstance;

    // Methods
    /**
     * Get your Display instance!
     * @return The instance of the Display.
     */
    // #################
    public static Display getInstance() {
        if (displayInstance == null)
            displayInstance = new Display();
        return displayInstance;
    }

    // #################
    static void displayScoreSheet() {
        System.out.println("NAME|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  | 10  |");
        System.out.println("----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----|");
        System.out.println("| * | |X| | |X| | |9|/| |7|2| |9|-| |8|/| |7|/| |X| | |6|/|9|/|7|");
        System.out.println("|#1 |  29 |  49 |  66 |  75 |  84 | 101 | 121 | 141 | 160 | 177 |");
        System.out.println("|---------------------------------------------------------------|");
        System.out.println("| * | |8|/| |8|/| |9|/| |8|-| |9|/| |8|1| |9|/| |9|/| |7|/|8|-| |");
        System.out.println("|#2 |  18 |  37 |  55 |  63 |  81 |  90 | 109 | 126 | 144 | 152 |");
        System.out.println("|---------------------------------------------------------------|");
    }

    /**
     * Ask the player if they want to play and return the result.
     * @return The option given by the player - to play or not to play.
     * Extra notes: Extensible for multiple modes of play later on.
     */
    // #################
    public int startGameInterface() {
        return 1;
    }

    // #################
    public int getNumberOfPlayers() {
        Scanner s = new Scanner(System.in);
        int numPlayers;

        System.out.print("Number of players? ");
        numPlayers = s.nextInt();
        System.out.println("");

        if (numPlayers < 1 || numPlayers > 99) {
            System.out.println("Too many players. Aborting.");
            return -1;
        }

        return numPlayers;
    }

    // #################
    public String getPlayerName() {
        String playerName;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        playerName = s.nextLine();
        System.out.println("");

        return playerName;
    }

    // #################
    private Display() {
    }
}
