package library;
// Created by Yuberth Elizondo on 15/12/17.


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import library.Image;

public class ImageLoader
{
    public Hashtable<String, Image> loadImages()
    {
        Hashtable images = new Hashtable();
        String url = null;


        for (int i = 0; i < 26; i++)
        {
            url = "pics/" + ("" + i) + ".png";

            images.put(i, new Image(url));
        }

        return images;
    }
}
