import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
* Neel Sharma's AP CSA Period 7 Final Project with an introduction to myself
* 
* @author Neel Sharma
* @version 9/8/2022
*/
public class NeelSharma extends Student implements SpecialInterestOrHobby
{
   public NeelSharma(String f, String l, int r, int s) {
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
     * Constructor for the NeelSharma class.
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
   public NeelSharma() {
       firstName="Neel";
       lastName="Sharma";
       mySeatX=2;
       mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
       setImage(portraitFile);
       sitting=true;
   }
   /**
    * Neel Sharma's method after clicking 'Act' or 'Run'
    * 
    */
   public void act()
   {
       if(Greenfoot.mouseClicked(this)){
         //  if (sitting){
               sitting=false;
               setImage(standingFile);
               System.out.println(""); // Print a blank line to create space between any student output.
               getName();
               sayName(soundFile);               
          
               myHobby("I like to play the piano and I also love playing tennis!");
           // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a
           // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
           // Call the sitDown() method to move back  to your seat
          
               circleClass();  // Neel Sharma's special method
         
               sitDown();
           }
   }
   /**
     * This is a local method specific to the NeelSharma class used to animate
     * the character once the image is clicked on to travel the classroom.
     */
   public void circleClass(){
       setLocation(0,11);
        Greenfoot.delay(10);
       // move right
       for (int i=1;i<=10;i++){
           setLocation(5,i);
           Greenfoot.delay(10);
       }
       for (int i=0;i<=10;i++){
           setLocation(i,5);
           Greenfoot.delay(10);
       }
       for (int i=0;i<=10;i++){
           setLocation(0,i);
           Greenfoot.delay(10);
       }
       for (int i=1;i<=10;i++){
           setLocation(i, 0);
           Greenfoot.delay(10);
       }
       returnToSeat();
   }
   /**
    * Prints the first and last name to the console
    */
   public void getName(){
       System.out.println("My name is " + firstName + " " + lastName);
   }
   /**
    * Prints my hobby onto the console
    */
   public void myHobby(String s) {
        System.out.println(s);
}
}