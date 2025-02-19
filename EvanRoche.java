import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The KilgoreTrout class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Evan Roche
 * @version 2.0 Aug 24, 2022
 */
public class EvanRoche extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the EvanRoche class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public EvanRoche(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public EvanRoche() {
        firstName="Evan";
        lastName="Roche";
        mySeatX=2;
        mySeatY=7;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage("evanTurnLeft.jpg");
        sitting=true;
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                //sitting=false;
                //setImage("evanLeft.jpg"); 
                // System.out.println(""); // Print a blank line to create space between any student output.
                // getName();
                sayName(soundFile);
            
                myHobby("I like playing chess!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                circleClass();  // Evan Roche's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
                //sitDown();
            }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */

   
    /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
        //Turns Left
         Greenfoot.delay(10);
         setLocation(1, 7);
         Greenfoot.delay(10);
         
        //Moves Up
         setImage("evanroche.jpg"); 
         Greenfoot.delay(10);
         setLocation(1, 6);
         Greenfoot.delay(10);
         setLocation(1, 5);
         
         //Turns Right
         setImage("evanTurnRight.jpg"); 
         Greenfoot.delay(10);
         for (int i=1; i<=6; i++) {
             setLocation(i+1, 5);
             Greenfoot.delay(10);
        }
        setLocation(7, 6);
        
        //Moves Down
        setImage("evanDown.jpg"); 
        Greenfoot.delay(10);
        setLocation(7, 7);
        Greenfoot.delay(10);
        setLocation(6, 7);
        setImage("evanroche.jpg");
        Greenfoot.delay(10);
        setImage("evanBig.jpg");
        setLocation(5,5);
        
        //Spins Image
        for (int i=0; i < 10; i++) {
            setRotation(90); //turns image 90 degrees 
            Greenfoot.delay(5); //time image is shown
            setRotation(180);
            Greenfoot.delay(5);
            setRotation(270);
            Greenfoot.delay(5);
            setRotation(360);
            Greenfoot.delay(5);
        }returnToSeat();
        setImage("evanroche.jpg");
        
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
}

}