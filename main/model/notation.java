package main.model;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;
import java.io.File;
import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//import javax.swing.JLabel;





public class notation {
    private String [] alphabet = {"A","B","C","D","E","F","G","H"};
    private String [] numberStng = {"0","1","2","3","4","5","6","7","8"};
    private String [][] notationalBoard = new String[9][9];
    private static String  notationFormat = "";
    private static int progression = 0;
    private static String gameName = "";
    private static String whiteName = "";
    private static String blackName = "";
    private static String hosted = "";
    private static String date = "";

     

    public notation() {


        for (int c = 0 ; c < notationalBoard[0].length ; c ++  ) {


            notationalBoard[0][c] =  numberStng[c];
   
        }
   
        for (int r = 0 ; r < notationalBoard.length ; r ++  ) {
   
            notationalBoard[r][0] =  alphabet[r];
   
        }
   




    }
   


    public void setup() {


       // boolean active = true;


        JFrame frame = new JFrame("QuantaChess");


        JLabel textDisplay = new JLabel("Enter ");


        JButton but1 = new JButton("Confirm");

        
       // text tle = new text();




        JTextField  t = new JTextField(16);



        JPanel placements = new JPanel();



    }


    public void pawnPromo() {




        notationFormat += "=";






    }
    //Use after and or during player move
    public void moveOnly(int selectedRow,int selectedCol,int row,int col, String type ) {


        String moveTo = notationalBoard[selectedRow][selectedCol];
        String piece = type;




        notationFormat += type + moveTo + " ";




    }
    //Use when castling occurs
    public void castlingOcc(boolean kingSide) {


        if (kingSide == false) {


            notationFormat += "O-O ";




        }


        else if (kingSide == true) {


            notationFormat += "O-O-O ";




        }


    }


    //Use at end of check method (If True)
    public void checkOcc(boolean checkMate) {


       
        if (checkMate == true) {
            notationFormat += "#";




        }
        else {
            notationFormat += "+";


        }


    }


    //Use After All moves are done
    public void nextPhase() {
        progression ++;


    }
    //Use Before Moves are added
    public void phase() {
        notationFormat += progression + ". ";
    }




    public void captureOcc() {


        notationFormat += "x";


    }

    public static void grabStartDetails(String event, String site, String nameB, String nameW , String dateOccur) {
        gameName = event;
        hosted  = site;
        date = dateOccur;
        whiteName = nameW;
        blackName = nameB;

        notation.details();

    }

    public static void details() {
       System.out.print(gameName + " " + hosted + " " + date + " " + whiteName + " " + blackName);
    
    }


}