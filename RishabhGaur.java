import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The RishabhGaur class represents special information about me via the deployment of audio and video and also uses a method to make my character move around. * 
 * @author Rishabh Gaur
 * @version 1.0 Sep 1, 2022
 */
public class RishabhGaur extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the RishabhGaur class.
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
    public RishabhGaur(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public RishabhGaur() {
        firstName="Rishabh";
        lastName="Gaur";
        mySeatX=1;
        mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the RishabhGaur actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I like to do robotics!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                circleClass();  // Rishabh Gaur's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
                sitDown();
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
     * This is a local method specific to the Rishabh Gaur class used to animate the character once the image is clicked on.
     * My character makes an infinity sign of movement after it is interacted with.
     */
    public void circleClass(){
        int current_x_location = 0;
        int current_y_location = 0;
        setLocation(0,0);
         Greenfoot.delay(10);
        //move down on left hand side
        for (int i=0;i<=9;i++){
            setLocation(0,i);
            Greenfoot.delay(10);
            current_x_location = getX();
            current_y_location = getY();
        }   
        //move right diagonally and exponentially
        setRotation(40);
        
        for (int i=0;i<=8;i++){
            setLocation(current_x_location+14/3/2,current_y_location-i/1/2);
            Greenfoot.delay(10);
            current_x_location = getX();
            current_y_location = getY();
        }      
        setRotation(0);
        //move down on right hand side
        for (int i=0;i<=6;i++){
            setLocation(current_x_location,current_y_location+i/2);
            Greenfoot.delay(10);
            current_x_location = getX();
            current_y_location = getY();
        }   
        //move left diagonally and exponentially
        setRotation(-40);
            for (int i=0;i<=7;i++){
            setLocation(current_x_location-16/3/2,current_y_location-i);
            Greenfoot.delay(10);
            current_x_location = getX();
            current_y_location = getY();
        }    
        setRotation(0);
           Greenfoot.delay(40);
           returnToSeat();
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