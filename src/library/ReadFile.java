package library;
// Created by Yuberth Elizondo on 15/12/17.

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile
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
}
