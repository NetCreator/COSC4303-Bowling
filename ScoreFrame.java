///////////////////////////////////////////////////////////////////
// Student name:
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
public class ScoreFrame {
    int score;
    
    public ScoreFrame(){
       score = 0;
    }
    
    public void scoreFrame(int first, int second){
        if(first == 10){ //Strike
            //toDo strike scoring
            score = 10;
        }
        else if(first + second == 10){ // Spare
            //toDo spare scoring
            score = 10;
        }
        else{
            score = first + second;
        }
    }
}
