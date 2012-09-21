
import java.util.ArrayList;

///////////////////////////////////////////////////////////////////
// Student name: Carl Hannusch, Mark Smullen
// Course: COSC 4303
// Assignment: #2 - Object-Oriented Programming Review
// File name: Controller.java
// Purpose: This is an instance of the running game of Spare Time
//          Bowling. This class manages rolling the die and
//          sending data to the scoresheet. It runs through the
//          turns and the players.
//
// Limitations: None known.
//
// Development Computer: MacBook Pro 13"
// Operating System: Mac OS X 10.6.8 Snow Leopard
// Integrated Development Environment (IDE): NetBeans IDE 6.9.1
// Compiler: javac
// Build Directions: See the Bowling class
// Operational Status: Working and tested.
///////////////////////////////////////////////////////////////////

public class Controller {

    private ArrayList<Player> playerList;
    private Die[] pinSet;
    // private int currentPlayer; -- This is player "p" in a foreach
    private int numPins;
    // private int turn; -- This is int "i" in a for 0 <= i < 10
    private ScoreSheet scoreSheet;
    private Display display;

    // #################
    public Controller(int numPlayers) {
        display = Display.getInstance();
        int firstRollScore;
        int secondRollScore;

        playerList = new ArrayList<Player>();
            
        for (int i = 0; i < numPlayers; i++) {
            String pName = "#" + (i+1);
            Player p = new Player(pName);
            playerList.add(p);
        }

        pinSet = new Die[10];
        for (int i = 0; i < 10; i++) {
            pinSet[i] = new Die();
        }

        scoreSheet = new ScoreSheet(numPlayers);

        for (int turn = 0; turn < 10; turn++) {
            for (int currentPlayer = 0; currentPlayer < numPlayers; currentPlayer++) {
                firstRollScore = 0;
                secondRollScore = 0;

                resetPins();
                numPins = 10;

                numPins = rollDice();
                firstRollScore = 10 - numPins;

                if (numPins > 0) {
                    numPins = rollDice();
                    secondRollScore = 10 - numPins;
                }

                scoreSheet.scoreRoll(firstRollScore, secondRollScore, currentPlayer, turn);
            }
        }
    }

    // #################
    private int rollDice() {
        int pinsStanding = 0;
        int side;

        for (int i = 0; i < 10; i++) {
            if (!pinSet[i].isStanding())
                continue;

            if (i == 9) {
                // Red-Circle Die Side
                side = Die.redSide[(int) (Math.random() * 6)];

                if (side == 2) {
                    if (pinsStanding > 0) {
                        pinsStanding++;
                    } else {
                        pinSet[i].setStanding(false);
                    }
                } else if (side == 1) {
                    pinsStanding++;
                } else {
                    pinSet[i].setStanding(false);
                }
            } else {
                // Normal die side
                side = Die.side[(int) (Math.random() * 6)];
                
                if (side == 1) {
                    pinsStanding++;
                } else {
                    pinSet[i].setStanding(false);
                }
            }
        }

        return pinsStanding;
    }

    // #################
    private void resetPins() {
        for (int i = 0; i < 10; i++) {
            pinSet[i].setStanding(true);
        }
    }
}
