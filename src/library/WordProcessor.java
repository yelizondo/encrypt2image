package library;
// Created by Yuberth Elizondo on 15/12/17.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.hwpf.model.StyleDescription;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFStyle;
import org.apache.poi.xwpf.usermodel.XWPFStyles;

import java.io.IOException;
import java.util.List;

public class WordProcessor
{

    public XWPFDocument writeWord(String pFileName)
    {

        XWPFDocument docx = null;
        try
        {
            docx = new XWPFDocument(new FileInputStream(pFileName));

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return docx;
    }

}
