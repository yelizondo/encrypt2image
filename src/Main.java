import java.util.Scanner;

public class Main
{
    private Scanner Reader;

    public Main()
    {
        Reader = new Scanner(System.in);
    }

    private void menu()
    {
        System.out.println();
        System.out.print("Write the name of the file you want to read > ");
        
        String input = this.Reader.nextLine();
        Reader.close();

        System.out.println(input);
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.menu();
    }
}
    ;  // Reading from System.in


