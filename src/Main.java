import library.FileManager;
import program.StringConverter;
import program.WordMessageBuilder;

import java.util.Scanner;

public class Main
{
    private Scanner Reader;
    private FileManager fileReader;
    private WordMessageBuilder wordBuilder;
    private StringConverter stringConverter;

    public Main()
    {
        Reader = new Scanner(System.in);
        fileReader = new FileManager();
        wordBuilder = new WordMessageBuilder();
        stringConverter = new StringConverter();
    }

    private void menu()
    {
        String input = "INPUT/entry_file.txt";
        wordBuilder.genHTML(stringConverter.getEncryptedMessage(fileReader.readFile(input)));
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.menu();



    }
}


