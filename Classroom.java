import java.util.*;
import greenfoot.*;
//import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
//import java.util.List;
//import java.util.Arrays;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Classroom here.
 *
 * @author Mr. Kaehms
 * @version 2.0  Note: updated for new desk layout. Goal is to make setting seats easy
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(14, 14, 60);

        prepare();
    }

    /**
     * Prepare the classroom desk layout.  This method should not be chanaged!. Refactored from prepare method.
     */

    private void createDeskLayout(){
        StudentDesk studentdesk = new StudentDesk();
        addObject(studentdesk,2,3);
        StudentDesk studentdesk2 = new StudentDesk();
        addObject(studentdesk2,3,3);
        StudentDesk studentdesk3 = new StudentDesk();
        addObject(studentdesk3,2,4);
        StudentDesk studentdesk4 = new StudentDesk();
        addObject(studentdesk4,3,4);
        StudentDesk studentdesk5 = new StudentDesk();
        addObject(studentdesk5,2,6);
        StudentDesk studentdesk6 = new StudentDesk();
        addObject(studentdesk6,3,6);
        StudentDesk studentdesk7 = new StudentDesk();
        addObject(studentdesk7,2,7);
        StudentDesk studentdesk8 = new StudentDesk();
        addObject(studentdesk8,3,7);
        StudentDesk studentdesk9 = new StudentDesk();
        addObject(studentdesk9,5,3);
        StudentDesk studentdesk10 = new StudentDesk();
        addObject(studentdesk10,6,3);
        StudentDesk studentdesk11 = new StudentDesk();
        addObject(studentdesk11,5,4);
        StudentDesk studentdesk12 = new StudentDesk();
        addObject(studentdesk12,6,4);
        StudentDesk studentdesk13 = new StudentDesk();
        addObject(studentdesk13,5,6);
        StudentDesk studentdesk14 = new StudentDesk();
        addObject(studentdesk14,6,6);
        StudentDesk studentdesk15 = new StudentDesk();
        addObject(studentdesk15,5,7);
        StudentDesk studentdesk16 = new StudentDesk();
        addObject(studentdesk16,6,7);
        StudentDesk studentdesk17 = new StudentDesk();
        addObject(studentdesk17,8,3);
        StudentDesk studentdesk18 = new StudentDesk();
        addObject(studentdesk18,9,3);
        StudentDesk studentdesk19 = new StudentDesk();
        addObject(studentdesk19,8,4);
        StudentDesk studentdesk20 = new StudentDesk();
        addObject(studentdesk20,9,4);
        StudentDesk studentdesk21 = new StudentDesk();
        addObject(studentdesk21,8,6);
        StudentDesk studentdesk22 = new StudentDesk();
        addObject(studentdesk22,9,6);
        StudentDesk studentdesk23 = new StudentDesk();
        addObject(studentdesk23,8,7);
        StudentDesk studentdesk24 = new StudentDesk();
        addObject(studentdesk24,9,7);
        StudentDesk studentdesk25 = new StudentDesk();
        addObject(studentdesk25,8,9);
        StudentDesk studentdesk26 = new StudentDesk();
        addObject(studentdesk26,9,9);
        StudentDesk studentdesk27 = new StudentDesk();
        addObject(studentdesk27,8,10);
        StudentDesk studentdesk28 = new StudentDesk();
        addObject(studentdesk28,9,10);
        StudentDesk studentdesk29 = new StudentDesk();
        addObject(studentdesk29,5,9);
        StudentDesk studentdesk30 = new StudentDesk();
        addObject(studentdesk30,6,9);
        StudentDesk studentdesk31 = new StudentDesk();
        addObject(studentdesk31,5,10);
        StudentDesk studentdesk32 = new StudentDesk();
        addObject(studentdesk32,6,10);
        TeacherDesk teacherdesk = new TeacherDesk();
        addObject(teacherdesk,2,10);
        studentdesk31.setDeskGroup(1);
        studentdesk29.setDeskGroup(1);
        studentdesk30.setDeskGroup(1);
        studentdesk32.setDeskGroup(1);
        studentdesk25.setDeskGroup(2);
        studentdesk27.setDeskGroup(2);
        studentdesk26.setDeskGroup(2);
        studentdesk28.setDeskGroup(2);
        studentdesk21.setDeskGroup(3);
        studentdesk23.setDeskGroup(3);
        studentdesk22.setDeskGroup(3);
        studentdesk13.setDeskGroup(4);
        studentdesk15.setDeskGroup(4);
        studentdesk14.setDeskGroup(4);
        studentdesk16.setDeskGroup(4);
        studentdesk6.setDeskGroup(5);
        studentdesk8.setDeskGroup(5);
        studentdesk5.setDeskGroup(5);
        studentdesk7.setDeskGroup(5);
        studentdesk.setDeskGroup(6);
        studentdesk3.setDeskGroup(6);
        studentdesk4.setDeskGroup(6);
        studentdesk2.setDeskGroup(6);
        studentdesk9.setDeskGroup(7);
        studentdesk11.setDeskGroup(7);
        studentdesk10.setDeskGroup(7);
        studentdesk12.setDeskGroup(7);
        studentdesk17.setDeskGroup(8);
        studentdesk19.setDeskGroup(8);
        studentdesk18.setDeskGroup(8);
        studentdesk20.setDeskGroup(8);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {
        createDeskLayout();
 // Each student needs to create their specific instance following the KilgoreTrout example.
 // Your current seatX and seatY can be found by right clicking on the corresponding seat in the Classrom.
 // and then clicking on the inspect text
        KilgoreTrout kilgoretrout = new KilgoreTrout();
        addObject(kilgoretrout,2,3);
        kilgoretrout.assignSeat();
  

        RishabhGaur rishabhgaur = new RishabhGaur();
        addObject(rishabhgaur,9,3);
        rishabhgaur.assignSeat();

        TheoLeung theoleung = new TheoLeung();
        addObject(theoleung,3,6);
        theoleung.assignSeat();

        RyanLin ryanlin = new RyanLin();
        addObject(ryanlin,2,6);
        ryanlin.assignSeat();

        AnikaitSrivastav anikaitsrivastav = new AnikaitSrivastav();
        addObject(anikaitsrivastav,8,9);
        anikaitsrivastav.assignSeat();

        AlexanderSuen alexandersuen = new AlexanderSuen();
        addObject(alexandersuen,6,10);
        alexandersuen.assignSeat();

        KrithikTamilvanan krithiktamilvanan = new KrithikTamilvanan();
        addObject(krithiktamilvanan,5,10);
        krithiktamilvanan.assignSeat();
        
        SrirangSanthosh srirangsanthosh = new SrirangSanthosh();
        addObject(srirangsanthosh,6,7);
        srirangsanthosh.assignSeat();

        LukeZeng lukezeng = new LukeZeng();
        addObject(lukezeng,9,10);
        lukezeng.assignSeat();
        
        KennethNg kennethng = new KennethNg();
        addObject(kennethng,5,6);
        kennethng.assignSeat();

        SathvikaNadipalli sathvikanadipalli = new SathvikaNadipalli();
        addObject(sathvikanadipalli,6,6);
        sathvikanadipalli.assignSeat();

        HitarthShukla hitarthshukla = new HitarthShukla();
        addObject(hitarthshukla,6,9);
        hitarthshukla.assignSeat();

        AndresSilvera andressilvera = new AndresSilvera();
        addObject(andressilvera,5,9);
        andressilvera.assignSeat();

        JohnnyLei johnnylei = new JohnnyLei();
        addObject(johnnylei,9,4);
        johnnylei.assignSeat();

        SeanLee seanlee = new SeanLee();
        addObject(seanlee,8,4);
        seanlee.assignSeat();

        SreenidhiSreenivasan sreenidhisreenivasan = new SreenidhiSreenivasan();
        addObject(sreenidhisreenivasan,9,9);
        sreenidhisreenivasan.assignSeat();

        SaachiTuli saachituli = new SaachiTuli();
        addObject(saachituli,8,10);
        saachituli.assignSeat();

        PranaviGollanapalli pranavigollanapalli = new PranaviGollanapalli();
        addObject(pranavigollanapalli,8,3);
        pranavigollanapalli.assignSeat();

        WaleedRydhan waleedrydhan = new WaleedRydhan();
        addObject(waleedrydhan,3,7);
        waleedrydhan.assignSeat();

        EvanRoche evanroche = new EvanRoche();
        addObject(evanroche,2,7);
        evanroche.assignSeat();

        AnishaRao anisharao = new AnishaRao();
        addObject(anisharao,8,6);
        anisharao.assignSeat();

        AbhinithiJanardhanan abhinithijanardhanan = new AbhinithiJanardhanan();
        addObject(abhinithijanardhanan, 2, 4);
        abhinithijanardhanan.assignSeat();  
        
        ViswaChoudhary viswachoudhary = new ViswaChoudhary("Viswa", "Choudhary",6,3); //added this to call the method in ViswaChoudhary.java
        addObject(viswachoudhary,6,3); //added this to add an object and give it a row and column number
        viswachoudhary.assignSeat(); // assigned a seat pertained to the object I created        
        
        KatieCheng katiecheng = new KatieCheng();
        addObject(katiecheng,5,3);
        katiecheng.assignSeat();
        
        ArjunPatel arjunpatel = new ArjunPatel();
        addObject(arjunpatel,9,6);
        arjunpatel.assignSeat();
        
        MayankKumar mayankkumar = new MayankKumar();
        addObject(mayankkumar, 5, 4);
        mayankkumar.assignSeat();
        
        NeelSharma neelsharma = new NeelSharma();
        addObject(neelsharma,9,7);
        neelsharma.assignSeat();
    
        AnkitaKumar ankitakumar = new AnkitaKumar();
        addObject(ankitakumar,3,4); 
        ankitakumar.assignSeat();
        
        SahilSandasani sahilsandasani = new SahilSandasani();
        addObject(sahilsandasani,5,7);
        sahilsandasani.assignSeat();
        
        MirandaBecker mirandabecker = new MirandaBecker();
        addObject(mirandabecker,2,3);
        mirandabecker.assignSeat();
    
        PanthShah panthshah = new PanthShah();
        addObject(panthshah,8,7);
        panthshah.assignSeat();
        
        KaustubhKuruba kaustubhkuruba = new KaustubhKuruba();
        addObject(kaustubhkuruba,6,4);
        kaustubhkuruba.assignSeat();

    }

    public List<Student> getAllStudents(){
       List<Student> s = getObjects(Student.class);
       return s;
    }


    /**
     * gets a list of all students, and creates a new file that can be cut/pasted in as a prepare statement.
     *
     */
    public void createNewSeatingChart(){
        boolean lastWrite;
        String timestamp=DateFormatter.makeDate();

        String newChartFile="seatingchart-" + timestamp + ".txt";

        List<Student> students = getObjects(Student.class);

        for (Student s:students){
            String studentClassName=s.getFirstName()+s.getLastName();

            String studentInstanceVar=studentClassName.toLowerCase();
            String instantiate=studentClassName + " " + studentInstanceVar + " = new " + studentClassName + "(); \n";
            String placeStudent="addObject(" + studentInstanceVar + ","+ s.getX() + "," + s.getY()+"); \n";
            String assignSeat = studentInstanceVar + ".assignSeat();\n\n";

            appendFile(newChartFile,instantiate);
            appendFile(newChartFile,placeStudent);
            appendFile(newChartFile,assignSeat);

        }
        Greenfoot.ask("Your file has been saved as: "+newChartFile+"     -Press [Enter] to continue.");

    }



    // modified from https://beginnersbook.com/2014/01/how-to-append-to-a-file-in-java/


   public  void appendFile(String fname, String s){
   {
      try{

        //Specify the file name and path here
        File file =new File(fname);

        /* This logic is to create the file if the
         * file is not already present
         */
        if(!file.exists()){
           file.createNewFile();
        }

        //Here true is to append the content to file
        FileWriter fw = new FileWriter(file,true);
        //BufferedWriter writer give better performance
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        //Closing BufferedWriter Stream
        bw.close();

    System.out.println("Data successfully appended at the end of file");

      }catch(IOException ioe){
         System.out.println("Exception occurred:");
         ioe.printStackTrace();
       }
   }
}
}
