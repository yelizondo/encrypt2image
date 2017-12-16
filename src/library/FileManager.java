package library;
// Created by Yuberth Elizondo on 15/12/17.

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager
{
    public String readFile(String pFileName)
    {
        String content = null;

        try
        {
            content = new String(Files.readAllBytes(Paths.get(pFileName)));
        }
        catch(java.nio.file.NoSuchFileException e)
        {
            System.out.println("File does not exist");
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

    public void writeFile(String pURL, String pContent)
    {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(pURL), "utf-8"))) {
            writer.write(pContent);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
