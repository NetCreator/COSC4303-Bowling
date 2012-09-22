
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
        ScoreFrame[][] ss = Controller.scoreSheet.getScoreCard();

        System.out.println("NAME|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  | 10  |");
        System.out.printf("----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----|\n");
        for(int i = 0; i < Controller.playerList.size(); i++) {
            System.out.printf("| * |");
            for (int j = 0; j < Controller.MAX_TURNS; j++) {
                if (ss[i][j].score == 10)
                    System.out.print(" |X| |");
                else
                    System.out.printf(" |%d| |", ss[i][j].score);
            }
            System.out.println("");
            System.out.printf("|%-3s|     |     |     |     |     |     |     |     |     |     |\n",
                    Controller.playerList.get(i).getName());
            System.out.println("|---------------------------------------------------------------|");
        }
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
    private Display() {
    }
}
