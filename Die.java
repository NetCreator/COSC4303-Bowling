///////////////////////////////////////////////////////////////////
// Student name: Carl Hannusch
// Course: COSC 4303
// Assignment: #2 - Object-Oriented Programming Review
// File name: Die.java
// Purpose:
//
// Limitations:
//
// Development Computer:
// Operating System:
// Integrated Development Environment (IDE):
// Compiler:
// Build Directions:
// Operational Status: Functional - untested
/////////////////////////////////////////////////////////////////// 
public class Die {
    public static final int[] side = {0,0,0,0,0,1};
    public static final int[] redSide = {0,0,0,0,1,2};
    private boolean standing;

    // #################
    public Die(){
        standing = true;        
    }// End Die

    // #################
    public boolean isStanding(){
        return standing;
    }// End isStanding

    // #################
    public void setStanding(boolean state){
        standing = state;
    }// End setStanding
}//End Die
