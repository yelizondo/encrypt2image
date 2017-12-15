package program;
// Created by Yuberth Elizondo on 15/12/17.

import javafx.scene.image.Image;
import library.ImageLoader;

import java.util.Hashtable;
import java.util.LinkedList;

public class StringConverter
{
    private ImageLoader ImgLoader;
    private Hashtable Images;

    public StringConverter()
    {
        this.ImgLoader = new ImageLoader();
        this.Images = ImgLoader.loadImages();
    }

    public LinkedList<Image> getEncryptedMessage(String pMessage)
    {
        LinkedList<Image> message = new LinkedList<>();

        pMessage.toLowerCase();
        pMessage.replaceAll("\\s+","");

        for (int i = 0; i < pMessage.length(); i++)
        {
            message.add(getImageEqual(pMessage.charAt(i)));
        }
        return message;
    }

    private Image getImageEqual(char pChar)
    {
        return (Image) this.Images.get((pChar % 97));
    }

}
