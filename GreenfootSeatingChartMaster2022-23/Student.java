import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Student carries essential data for the student's location and activity.
 * 
 * @author Rishabh Gaur
 * @version version 2.0 Note: Method made by Rishabh, Johnny, Pranavi, and Sean can be found at the bottom of this file.
 */
public abstract class Student extends Actor
{
   //Instance variables
   public String firstName;
   public String lastName;
   public int mySeatX;         // rows start in the front of class (1), and end in the back of class
   public int mySeatY;        // seats are left to right, 1-8
   public boolean isActive;  // can you think of an algorithm that would allow you to use this
                             // variable to use keyboard entry for all the instance of a student
                             // that we will create?
   public boolean sitting;   // Is the student sitting or standing (default sitting)                         
   
 //  public String imgFile;   // These will be created in subclass as firstName.toLowerCase()+
   public String portraitFile; // image used when sitting
   public String standingFile; // image used when standing
   public String soundFile; //      firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)
   Classroom clas = (Classroom) getWorld();
   public void setSeatX(int r){
       mySeatX=r;
    }
    
    public void setSeatY(int s){
       mySeatY=s;
    }
    
    public abstract void  getName(); //This is an abstract methods. You will have to implement it
                                     // in your own class file. See KilgoreTrout for an example
 
    /**
     * Plays a sound file when called
     * @param String myNameFile  is the name of the sound file to play, ex "mySound.wav",
     */
    
    public int GetSeatX(){
        return mySeatX;
    }
    
    public int GetSeatY(){
        return mySeatY;
    }
    public String getFirstName(){
        return firstName;
    }
     public String getLastName(){
        return lastName;
    }
    
    public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
    }
    
    public void returnToSeat(){
        setLocation(mySeatX,mySeatY);
    }
    public void sitDown(){
        returnToSeat();
        setImage(portraitFile);
        sitting=true;
    }
    public void assignSeat(){
        mySeatX=getX();
        mySeatY=getY();
    }
    // THIS WAS THE FIRST OF THE METHODS THAT RISHABH, JOHNNY, PRANAVI, and SEAN worked on. The second can be found in Classroom.
    // Your character can now use this method for one of two purposes. 
    // Either, you can use this code to spin your character in the start of your movement (when icon is clicked) OR you can opt for only using it as 'finale' move before the character rests back at it's table pos.
    public void extraAnimateStudent(boolean forStartorEndMovement){
        if (forStartorEndMovement = true) { //movement when character is clicked
            setLocation(0,0);
            Greenfoot.delay(10);
        }
        for (int n=100;n>=0;n--){
            turn(60);
            move(1);
            Greenfoot.delay(1);
        }
    }
 
}
