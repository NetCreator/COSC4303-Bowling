///////////////////////////////////////////////////////////////////
// Student name: Carl Hannusch, Mark Smullen
// Course: COSC 4303
// Assignment: #2 - Object-Oriented Programming Review
// File name: Bowling.java
// Purpose:
//
// Limitations:
//
// Development Computer:
// Operating System:
// Integrated Development Environment (IDE):
// Compiler:
// Build Directions:
// Operational Status:
///////////////////////////////////////////////////////////////////

public class Bowling {
    public static void main(String[] args) {
        int numPlayers;

        if(args.length < 1) {
            System.out.println("java Bowling <number of computer players>");
            return;
        } else {
            numPlayers = Integer.parseInt(args[0]);

            if(numPlayers < 1 || numPlayers > 99) {
                System.out.println("java Bowling <number of computer players>");
                return;
            }
        }

        Display display = Display.getInstance();
        while (display.startGameInterface() != 0) {
            Controller gameController = new Controller(numPlayers);
        }
    }
}
