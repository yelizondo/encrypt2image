package library;
// Created by Yuberth Elizondo on 15/12/17.

import java.io.InputStream;

public class Image
{
    private String URL;

    public Image(String pURL)
    {
        this.URL = pURL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
