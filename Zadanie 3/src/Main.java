import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File tekst = new File("tekst.txt");
        
        Scanner input = new Scanner(tekst);
        
        int[] wyniki = new int[3];
        char znak;
  
        while (input.hasNext())
        {
            String line = input.nextLine();
            for (int i =0; i<line.length(); i++)
            {
            	++wynik[0];
            	znak = line.charAt(i);
            	if (Character.isWhitespace(znak))
            	++wynik[1];
            }
        }
        
        int a = wynik[1];
        wyniki [2] = a + 1;
            
        System.out.println(Arrays.toString(wynik));
        
        input.close();
        }
}
