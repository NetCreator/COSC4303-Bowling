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
        Display display = Display.getInstance();
        while (display.startGameInterface() != 0) {
            Controller gameController = new Controller();
        }
    }
}
