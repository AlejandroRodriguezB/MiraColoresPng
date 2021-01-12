/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhe;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author alumno
 */
public class Mhe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream i = new FileInputStream("SPACECONFONDO.png");
        ImageInputStream ii = ImageIO.createImageInputStream(i);
        BufferedImage iL= ImageIO.read(ii);
        for(int o=0;o<iL.getHeight();o++){
            System.out.print("DC.L ");
            for (int j = 0; j <iL.getWidth(); j++) {
                int srPix=iL.getRGB(o, j);
                Color c = new Color(srPix);
                
                String r= Integer.toHexString(c.getRed()).toUpperCase();
                String g=Integer.toHexString(c.getBlue()).toUpperCase();
                String b= Integer.toHexString(c.getGreen()).toUpperCase();
                System.out.print("$"+b+g+r+",");
            }
            System.out.println(" ");
        
        }
        
    }
    
}
