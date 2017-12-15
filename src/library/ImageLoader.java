package library;
// Created by Yuberth Elizondo on 15/12/17.

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public class ImageLoader
{
    public Hashtable<String, Image> loadImages()
    {
        Hashtable images = new Hashtable();

        BufferedImage img = null;

        try
        {
            for (int i = 0; i < 26; i++)
            {
                img = ImageIO.read(new File( "pics/" + ("" + i) + ".png"));
                images.put(i,img);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return images;
    }
}
