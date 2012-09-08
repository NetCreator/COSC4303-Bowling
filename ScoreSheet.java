///////////////////////////////////////////////////////////////////
// Student name:Carl Hannusch
// Course: COSC 4303
// Assignment: #2 - Object-Oriented Programming Review
// File name:
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
public class ScoreSheet {

    private ScoreFrame[][] scoreCard;

    // #################
    public ScoreSheet(int players) {
        scoreCard = new ScoreFrame[players][10];
    }// End ScoreSheet

    // #################
    public void scoreRoll(int pinsFirstRoll, int pinsSecondRoll, int player, int turn) {
        scoreCard[player][turn].scoreFrame(pinsFirstRoll, pinsSecondRoll);
        if (turn == 10) {
            Display.displayScoreSheet();
        }
    }// End scoreRoll
}// End ScoreSheet

