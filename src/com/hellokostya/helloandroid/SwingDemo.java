import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;  
import java.awt.event.*;  



import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;



import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.AbstractAction;
 
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.util.concurrent.TimeUnit;
import java.awt.GridBagLayout;
import java.lang.Math;   

import java.awt.image.BufferedImage;
//import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.image.AffineTransformOp;
import java.awt.geom.AffineTransform;
import javax.swing.WindowConstants;
import java.lang.Math;
import java.lang.Thread;  
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;  
import java.awt.event.*;
import java.util.Scanner;  

import java.awt.image.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
//import javax.swing.*;


//import javafx.scene.control.ScrollPane;  
//import com.sun.awt.AWTUtilities;

//import marvin.gui.MarvinImagePanel; 
//import marvin.image.MarvinImage; 
//import marvin.io.MarvinImageIO;
 


public class SwingDemo 
implements MouseMotionListener, KeyListener 
//extends JFrame 
//implements ActionListener 
{
 /*int  i=1;
 float X=100;
 float Y=50; 
int dX=0;
int dY=0;
int Xmax=0;
int Ymax=0;
int X1=0;
int Y1=0;
int X2=200;
int Y2=100;
int pp=0, ppp=0;



int  n, k, kk;
//Crop Crop1 = new Crop();
//Crop Crop1 = new Crop(); 


   private String[] imageFileNames = { "Impulse.jpg"};

 
 JButton btn = new JButton("DemoButton");




/**
 * @param args
 */

Scanner console = new Scanner(System.in);



public static void main(String[] args )   { 

          
          SwingDemo SwingDemo1 = new SwingDemo();
   
          SwingDemo1.SwingDemo();
                            
                                  
                                     }  


 JFrame     f[] = new JFrame[3];
 int mouse=0;
 int key=0;

 //JFrame f[0] = new JFrame();
 //JFrame f[1] = new JFrame();



public void SwingDemo() 
 {


  
 int  i=1;
 float X=100, XOLD=0;
 float Y=50, YOLD=0; 

 
int dX=0;
int dY=0;
int Xmax=0;
int Ymax=0;
int X1=0;
int Y1=0;
int X2=200;
int Y2=100;
int p=0, pp=0, ppp=0, label1=0;
int  n, k, kk, time=0;
int  xmouse=0, ymouse=0, xmouseold=0, ymouseold=0;
int scroll;
int keyboard;
long t2=0, t1=0;



//PointerInfo amouse;
Point xymouse;







String[] imageFileNames = { "Impulse-eq.jpg", "Impulse.jpg" };

 
 JButton btn = new JButton("DemoButton");






//if (ex==1) {System.out.println("SwingDemo ex = " + ex);         System.exit(0);}

 
n=3;
// JFrame     f[] = new JFrame[n];
 JPanel     panel[] = new JPanel[n];
JLabel photographLabel[] = new JLabel[n];
ImageIcon displayPhoto[] = new ImageIcon[n];
Crop Crop1[] = new Crop[n];

BufferedImage bufferedImage=null;
 
int w=0;
int h=0;
int wi=0;
int hi=0;
k=0;

ImageIcon icon;
Graphics g ;
Point Location=new Point(0,0);


System.out.println("k, n = " + k + " , " +  n );

for (k=0; k<=n-1; k++) {

 

  f[k] = new JFrame();
  

  panel[k] = new JPanel();
  
  Crop1[k] = new Crop();
  
  

 photographLabel[k] = new JLabel();
 displayPhoto[k]= new ImageIcon();



                        }



Dimension size
            = Toolkit.getDefaultToolkit().getScreenSize();
        
        // width will store the width of the screen
         w = (int)size.getWidth();
        
        // height will store the height of the screen
        h = (int)size.getHeight();
System.out.println("Screen  resolution w, h = " + w + " , " +  h );

       
  icon = new ImageIcon(imageFileNames[1]);
 bufferedImage = new BufferedImage(
    icon.getIconWidth(),
    icon.getIconHeight(),
    BufferedImage.TYPE_INT_RGB);
g = bufferedImage.createGraphics();

g.setColor(new Color(0,0,0,100));

// paint the Icon to the BufferedImage.
icon.paintIcon(null, g, 0,0);

g.dispose();




          wi =  bufferedImage.getWidth(null);
          hi =  bufferedImage.getHeight(null); 







   System.out.println("Image resolution wi, hi = " + wi + " , " +  hi );



            
                   
       displayPhoto[0] = new ImageIcon(new ImageIcon(imageFileNames[0]).getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
        displayPhoto[1] = new ImageIcon(new ImageIcon(imageFileNames[1]).getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
     
      icon = displayPhoto[1];
      
      bufferedImage = new BufferedImage(
   icon.getIconWidth(),
    icon.getIconHeight(),
   BufferedImage.TYPE_INT_RGB);
g = bufferedImage.createGraphics();
 


icon.paintIcon(null, g, 0,0);
 

g.dispose();




          wi =  bufferedImage.getWidth(null);
          hi =  bufferedImage.getHeight(null);
           
        

           f[0].setSize(w, h);
           f[0].setLocation(0,0);
          



           System.out.println("wi, hi = " + wi + " , " +  hi );
           //displayPhoto[0] =  Crop1[0].Crop( bufferedImage, 0, 0 , wi, hi);
















           
           

photographLabel[0].setIcon(displayPhoto[0]);
photographLabel[1].setIcon(displayPhoto[1]); 


 panel[0].setLayout( new BorderLayout() );
     panel[0].add(photographLabel[0]);
  
panel[1].setLayout( new BorderLayout() );
     panel[1].add(photographLabel[1]);



 //  panel[0].setOpaque(false);
    
 
//  panel[0].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));







 f[0].getContentPane().add(panel[0]);
 f[1].getContentPane().add(panel[1]); 

 f[0].setUndecorated(true);
 f[1].setUndecorated(true);


  
  f[0].setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 





  






             int r=3;
             Xmax = w - w/r;
             Ymax = h - h/r;
             //f[1].setUndecorated(true);
            // f[1].pack();

             f[1].setSize(w/r, h/r); 
           
         
         // f[1].addKeyListener(this);    
     //addMouseMotionListener(this);
     //f[1].addMouseMotionListener(this);  
        
           // panel[2].setOpaque(false);
           //  f[2].setUndecorated(true);
           //  f[2].setSize(w, h); 
           // f[2].setBackground(new Color(0, 0, 0, 0));
           // f[2].setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
           // f[2].setVisible(true);
           // f[2].addMouseMotionListener(this);  

      
  // f[0].addKeyListener(this);
   f[0].setVisible(true);  
    f[1].setVisible(true);  
     btn.doClick(1000);
  Location = f[0].getLocationOnScreen();
  

   System.out.println("Location = " + Location.x + Location.y);

  int d=w/300;
 


for (k=1; k<=k; k++) 
{                


            xymouse = MouseInfo.getPointerInfo().getLocation();
            xmouse = xymouse.x; ymouse = xymouse.y;

                
        //  System.out.println("keyboard =" + keyboard); 


 
 if (Math.abs(xmouse-xmouseold)>w/100 || Math.abs(ymouse-ymouseold)>h/100) {       
              
               System.out.println("xmouse = " + xmouse + "     ymouse = " + ymouse);
     //          System.out.println("key =" + key); 
                      
                  xmouseold=xmouse; ymouseold=ymouse; 
                 f[0].setVisible(false); 
                  f[1].setVisible(false); 
                    f[2].setVisible(false); 
                //f[1].setVisible(false);  
               //f[2].setVisible(false);      
                time=0; label1=1; key=0;
               // if(key==1) {key=0; btn.doClick(100); f[0].setSize(0, 0); f[0].setVisible(true); }
                                                                       
                
                                                                                       }


         

         if (time <=300) {
                       
                       
                       System.out.println("time =" + time);   
                       time=time + 1;
                       btn.doClick(1000);
                        
                       
                       
                    
                        } 

         
          if (time>300) {

 

          

 
                   if (label1==1)  { f[0].setSize(w, h);  f[0].setVisible(true);  f[1].setVisible(true); label1=0;  }
                   
                      

System.out.println("---------------------------------------------------------");   
                                  

XOLD=X; YOLD=Y;

              
if (X1<=XOLD && XOLD<=X2  && Y1<=YOLD && YOLD<=Y2)
  { p=1;                  
X=XOLD+d; 
Y = YOLD + d* Math.abs(Y2-Y1)/Math.abs(X2-X1);
 }

else             {

if (X1>=XOLD && XOLD>=X2  && Y1>=YOLD && YOLD>Y2)
  { p=2;                  
X=XOLD-d;
Y = YOLD - d* Math.abs(Y2-Y1)/Math.abs(X2-X1);
  }

  else       {

if (X1>=XOLD && XOLD>=X2  && Y1<=YOLD && YOLD<=Y2)
  {  p=3;                 
X=XOLD-d;
Y = YOLD + d* Math.abs(Y2-Y1)/Math.abs(X2-X1);
  }

    
else   {

if (X1<=XOLD && XOLD<=X2  && Y1>=YOLD && YOLD>Y2)
  {  p=4;                 
X=XOLD+d; 
Y = YOLD - d *  Math.abs(Y2-Y1)/Math.abs(X2-X1);
  }

        }

             }

                 }

 
    
if ( (p==1 && (X2<=X  || Y2<=Y)) || (p==2 && (X<=X2 || Y <= Y2 ))   
|| (p==3 && (X<=X2  ||   Y2<=Y)) || (p==4 && (X2<=X || Y <= Y2 ))   )


{ 
  

X1=X2; X=X2;
while (X1==X2) { X2 = (int)(Math.random()*(Xmax- Location.x/2+1 - 0+1) + 0);} 
Y1=Y2; Y=Y2; 
while (Y1==Y2) {Y2 = (int)(Math.random()*(Ymax -Location.y - 0+1) + 0);}   
 System.out.println("random" ); 
                        
                         }


            
             

displayPhoto[1] = Crop1[1].Crop(bufferedImage, (int)(X), (int)(Y), (int)(w/(r)), (int)(h/(r)));


//X = (int)(Math.random()*(Xmax- Location.x/2+1 - 0+1) + 0); 
//Y = (int)(Math.random()*(Ymax -Location.y - 0+1) + 0);   


//displayPhoto[2] = Crop1[2].Crop(bufferedImage, (int)(X), (int)(Y), (int)(w/(5)), (int)(h/(5)));


//btn.doClick(100);


displayPhoto[1] = new ImageIcon(displayPhoto[1].getImage().getScaledInstance(w/r, h/r, Image.SCALE_DEFAULT));






photographLabel[1].setIcon(displayPhoto[1]);
 

//panel[1].setLayout( new BorderLayout() );
panel[1].add(photographLabel[1]);

f[1].getContentPane().add(panel[1]);
 

 




//f[1].setVisible(false); // it's needed

   f[1].setLocation((int)(X) + Location.x+1, (int)(Y) + Location.y/2+1);    



//f[1].setVisible(true); 


 

 System.out.println("__________________________________" ); 
   System.out.println("X1, Y1 = " + X1 + " , " +  Y1 ); 
 
  System.out.println("X, Y = " + X + " , " +  Y ); 
  System.out.println("XOLD, YOLD = " + XOLD + " , " +  YOLD ); 
System.out.println("X2, Y2 = " + X2 + " , " +  Y2 ); 


try        
{
    Thread.sleep(200);
} 
catch(InterruptedException ex) 
{
    Thread.currentThread().interrupt();
}






  //t1 = System.currentTimeMillis();
  
//while (t2 - t1 < 200) { t2 = System.currentTimeMillis();}
 
//System.out.println("t2-t1 = " + (t2 - t1) );  


//btn.doClick(200);
 //f[1].setVisible(false); 

 

 
} 

   
}

 
                                                
    
    } 
  
  

    

public void mouseMoved(MouseEvent e) { mouse=1;}  
public void mouseDragged(MouseEvent e) {mouse=1;}



public void keyPressed(KeyEvent ee) {key=1;}
public void keyReleased(KeyEvent ee) {key=1;}
public void keyTyped(KeyEvent ee) {key=1;}





  }  

                 

 






   

  






















                 

                        

  
  





     


 
     
 

































    
