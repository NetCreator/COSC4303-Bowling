///////////////////////////////////////////////////////////////////
// Student name: Carl Hannusch, Mark Smullen
// Course: COSC 4303
// Assignment: #2 - Object-Oriented Programming Review
// File name: Display.java
// Purpose: This class handles all the IO for the game.
//
// Limitations:
//
// Development Computer:
// Operating System:
// Integrated Development Environment (IDE):
// Compiler:
// Build Directions: See the Bowling class
// Operational Status:
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
    public static Display getInstance() {
        if (displayInstance == null)
            displayInstance = new Display();
        return displayInstance;
    }

    /**
     * Ask the player if they want to play and return the result.
     * @return The option given by the player - to play or not to play.
     * Extra notes: Extensible for multiple modes of play later on.
     */
    public int startGameInterface() {
        return 0;
    }

    private Display() {
    }
}
