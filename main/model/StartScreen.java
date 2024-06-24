package main.model;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class StartScreen extends JFrame implements ActionListener {

        static boolean mainGame = false;
     
      // JTextField

     
      static JTextField t;
      static JTextField t2;
      static JTextField t3;
      static JTextField t4;
      static JTextField t5;

      // JFrame
      static JFrame f;
   
      // JButton
      static JButton b;
   
      // label to display text
      static JLabel l;
      static JLabel l2;
      static JLabel l3;
      static JLabel l4;
      static JLabel l5;
      static JLabel l6;
      static JLabel l7;
   
      // default constructor
      StartScreen() {

      }



    
      public static void Start() {

            mainGame = false;

            f = new JFrame("QuantaChess");

            try {
                
                File file = new File("main/img/QuantaChesslogo3Test2.png");
                BufferedImage logo = ImageIO.read(file);
                JLabel imageLogo = new JLabel(new ImageIcon(logo));
                f.add(imageLogo);

            }
            catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
            
           // FlowLayout Fl = new FlowLayout() ;
           
           
            // create a label to display text


             l = new JLabel("Event Name:");
             l2 = new JLabel("Site Name:" );
             l3 = new JLabel("Black Name:");
             l4 = new JLabel("White Name:");
             l5 = new JLabel("Date: ");
             l6 = new JLabel("                     (YYYY.MM.DD, ?? If None)  ");
             l7 = new JLabel("                                     ");

           


            // create a new button
            b = new JButton("Confirm");

            // create a object of the text class
            StartScreen te = new StartScreen();

            // addActionListener to button
            b.addActionListener(te);



            // create a object of JTextField with 16 columns
            // JTextField
             t = new JTextField(20);
             t2 = new JTextField(20);
             t3 = new JTextField(20);
             t4 = new JTextField(20);
             t5 = new JTextField(20);
             

            // create a panel to add buttons and textfield
            /*  JPanel p = new JPanel();
            JPanel p2 = new JPanel();
            JPanel p3 = new JPanel();
            JPanel p4 = new JPanel();
            JPanel p5 = new JPanel();
*/
           


            // add buttons and textfield to panel
           
            f.add(l);
             f.add(t);
            
            f.add(l2);
            f.add(t2);

            f.add(l3);
            f.add(t3);



            f.add(l4);
            f.add(t4);
            

            f.add(l5);
            f.add(t5);
            f.add(l6);


            f.add(l7);
            f.add(b);
            /*
            

            p.add(l);
            p.add(l2);
            p.add(l3);
            p.add(l4);
            p.add(l5);

            

            // add panel to frame
            f.add(p);
            f.add(p2);
            f.add(p3);
            f.add(p4);
            f.add(p5);*/
           
         //   f.add(Fl);
            

            // set the size of frame
            f.setLayout(new FlowLayout());
            f.setSize(350, 600);

          f.show();




      }

      

      public void actionPerformed(ActionEvent e)    {
          String s = e.getActionCommand();
          if (s.equals("Confirm")) {
              

                notation.grabStartDetails(t.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText() );
                f.dispose();
                //dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
              
          }
      }

    public static void ended(boolean start) {
         mainGame = start;

        
    }

    public static boolean getMainGame() {

        return mainGame;
    }
}
