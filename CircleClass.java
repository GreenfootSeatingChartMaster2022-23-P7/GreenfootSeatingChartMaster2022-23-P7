 public void circleClass(){

         Greenfoot.delay(5);

        // move right 

        for (int i=10;i>=1;i--){

            setLocation(9,3);

            turn(90);

            Greenfoot.delay(5);

        }

    // repeating it 7 times

         for (int i=7;i>=1;i--){

             Greenfoot.delay(5);

  // flip image vertically and horizontally

             getImage().mirrorVertically();

             getImage().mirrorHorizontally();

        }

//image turns upside down

           turn(180);

           Greenfoot.delay(5);

 

//image goes back to original position

           returnToSeat();

    }

  //@Panth Shah, Neel Sharma, Anisha Rao, Arjun Patel

 
