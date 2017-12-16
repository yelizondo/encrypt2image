package program;
// Created by Yuberth Elizondo on 15/12/17.

import library.FileManager;
import library.Image;
import library.ImageLoader;

import java.util.LinkedList;

public class WordMessageBuilder
{
    private ImageLoader imageLoader;
    private FileManager manager;
    private final String RESULT_URL = "RESULTS/result.html";
    private String IMG_HTML_TEMPLATE = "<img src=\"__#@#__\" />";
    private final String ABSOLUTE_PATH = "/home/yuberth/Projects/encrypt2image/";


    public WordMessageBuilder()
    {
        imageLoader = new ImageLoader();
        manager = new FileManager();
    }

    public void genHTML(LinkedList<Image> pImage)
    {
        String finalHtml = "";

        for (Image img : pImage)
        {
            finalHtml += IMG_HTML_TEMPLATE.replaceAll("__#@#__", ABSOLUTE_PATH + img.getURL());
        }

        manager.writeFile(RESULT_URL, finalHtml);
    }
}
