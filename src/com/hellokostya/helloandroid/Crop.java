import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



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
import javax.swing.JFrame;
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
import javax.swing.*;
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
//import marvin.gui.MarvinImagePanel; 
//import marvin.image.MarvinImage; 
//import marvin.io.MarvinImageIO;



public class Crop {
static ImageIcon Imagecrop;
    
    public  ImageIcon Crop(BufferedImage bufferedImage, int X1, int Y1, int X2, int Y2 ){
//void main(String []args){
      //  File imageFile = new File("Impulse.jpg");
       // BufferedImage bufferedImage =null;
       // try
         //   {
            
         //   bufferedImage = ImageIO.read(imageFile);
            BufferedImage image=bufferedImage.getSubimage(X1, Y1, X2, Y2);

   /*         int imageWidth = image.getWidth(null);
    int imageHeight = image.getHeight(null);
    System.out.println("Width:" + imageWidth);
    System.out.println("Height:" + imageHeight);      
*/       


            //Image 

            
        
         Imagecrop = new ImageIcon(image);
           //System.out.println("image" +  image + "   k =  "  );
         //  File pathFile = new File("Impulse1.jpg");
          //  ImageIO.write(image,"jpg", pathFile);
            //Imagecrop =  new ImageIcon("Impulsecropped.jpg");
            // new Crop();
           // return Imagecrop;
              
        //    }

       // catch (IOException e) 
         //   {
           //   System.out.println(e);
           // }    
       // Imagecrop = new ImageIcon(Imagecrop.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT));
        return Imagecrop;
  }
           
 
 //public ImageIcon Crop(){
        //ImageIcon ImagecropIcon = new ImageIcon(Imagecrop);
   // return Imagecrop;
 // }

}
