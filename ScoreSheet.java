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
        scoreCard = new ScoreFrame[players][Controller.MAX_TURNS];

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < Controller.MAX_TURNS; j++) {
                scoreCard[i][j] = new ScoreFrame();
            }
        }
    }// End ScoreSheet

    // #################
    public void scoreRoll(int pinsFirstRoll, int pinsSecondRoll, int player, int turn) {
        scoreCard[player][turn].scoreFrame(pinsFirstRoll, pinsSecondRoll);
        if (turn == Controller.MAX_TURNS-1) {
            Display.displayScoreSheet();
        }
    }// End scoreRoll

    ScoreFrame[][] getScoreCard() {
        return scoreCard;
    }
}// End ScoreSheet

