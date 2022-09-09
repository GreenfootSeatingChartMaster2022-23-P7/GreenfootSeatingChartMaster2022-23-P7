import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ViswaChoudhary class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class ViswaChoudhary extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the ViswaChoudhary class.
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
    public ViswaChoudhary(String f, String l, int r, int s) {
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
    
     /**
     * Act - do whatever the ViswaChoudhary actor wants to do. This method is called whenever
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
            
                myHobby("I like to time travel!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
               
                
                circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
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
     * This is a local method specific to the ViswaChoudhary class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){ //changed this circle class a bit
        setLocation(0,0);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=9;i++){ //moving right by i which is 9 times
            Rotation(); // calling the rotation method, so it rotates while it moves
            setLocation(i,0); //the location that moves as i increments, y stays the same
            Greenfoot.delay(5);
        }
        // move back
        for (int i=1;i<=5;i++){ //moving back by i which is 5
            Rotation();//calling the rotation method, so it rotates while it is moving
            setLocation(9,i);//the location that keeps on changing as i increments, the x stays constant
            Greenfoot.delay(5);
        }   
        for (int i=1;i<=3;i++){//moving right by i which is 3
            Rotation();//calling the rotation method, so it rotates while it is moving
            setLocation(9+i,i+5);//the location starts at (9,5) but it added by i which increments
            Greenfoot.delay(5);
        }
         // move left
        for (int i=6;i>=0;i--){ // moving left by 6
            Rotation();//calling the rotation method, so it rotates while it is moving
            setLocation(12-i,8);//the location starts at (12,8) which is subtracted by i as it increments but 8 stays the same
            Greenfoot.delay(5);
        }      
              // move Forward
        for (int i=5;i>=0;i--){ //moving forward by 5
            Rotation();//calling the rotation method, so it rotates while it is moving
            setLocation(6,i);// the y part of location keeps on incrementing but 6 stayed the same
            Greenfoot.delay(5);
        } 
        for (int i=4;i>=0;i--){//moving foward by 4
            Rotation(); //calling the rotation method, so it rotates while it is moving
            setLocation(6,i+3);//the y part of location also increments but is also added by 3 after it increments while the x stays the same
            Greenfoot.delay(5);
        }     
          for (int i=4;i>=0;i--){ //moving left by 4
            Rotation(); //calling the rotation method, so it rotates while it is moving
            setLocation(i,5); // the y part of the location stays the same while the x increments 
            Greenfoot.delay(5);
        }        
           Greenfoot.delay(20);
           returnToSeat();
    }
    public void Rotation(){ //my abstract method on Rotation
        Greenfoot.delay(5); 
        for (int i=1; i<=18; i++){ //the amount of rotations is i
            setRotation((int)(20*i)); //set our rotation to 360 degrees
            Greenfoot.delay(5); 
        }
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
