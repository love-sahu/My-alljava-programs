import java.io.File;

import javax.imageio.ImageIO;

import java.util.*;
import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class imagePattern {
  public static void main(String[] args) {
    String characters = " :-+*@#%";

    File file = new File("C:\\Users\\lovev\\OneDrive\\Pictures\\psphoto.jpg");
    // File file = new File("D:\\Qspiders\\smile.jpg");
    try {
      BufferedImage image = ImageIO.read(file);
      for (int i = 0; i < image.getHeight(); i++) {
        for (int j = 0; j < image.getWidth(); j++) {
          Color cl = new Color(image.getRGB(j, i));
          int grey = (cl.getRed() + cl.getGreen() + cl.getBlue()) / 3;
          int index = grey * (characters.length() - 1) / 255;
          System.out.print(characters.charAt(index));

        }
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println(" Something went wrong " + e.getMessage());
    }
  }
}
