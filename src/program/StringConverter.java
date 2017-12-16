package program;
// Created by Yuberth Elizondo on 15/12/17.

import library.Image;
import library.ImageLoader;

import java.io.InputStream;
import java.util.Hashtable;
import java.util.LinkedList;

public class StringConverter {
    private ImageLoader ImgLoader;
    private Hashtable Images;

    public StringConverter() {
        this.ImgLoader = new ImageLoader();
        this.Images = ImgLoader.loadImages();
    }

    public LinkedList<Image> getEncryptedMessage(String pMessage) {
        LinkedList<Image> message = new LinkedList<>();

        pMessage = pMessage.toLowerCase();

        for (int i = 0; i < pMessage.length(); i++)
        {
            char letter = pMessage.charAt(i);

            if (letter == 32)
                continue;

            message.add(getImageEqual(letter));
        }
        return message;
    }

    private Image getImageEqual(char pChar)
    {
        Image img = (Image) this.Images.get((pChar % 97));
        return img;
    }

}
