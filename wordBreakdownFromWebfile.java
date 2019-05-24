package javaapplication4;
import java.net.URL;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class JavaApplication4 
{
  public static void main(String[] args) 
  {
        try
        {
            URL website = new URL("https://turing.manhattan.edu/~ankur.agrawal/misc/count.txt");
            Scanner input = new Scanner(website.openStream());
            
            int numVowels = 0;
            int numCons = 0;
            int numWords = 0;
            while (input.hasNext()) 
            {
                numWords++;
                String line = input.nextLine().toLowerCase();
                
                for(int i = 0; i < line.length(); i++)
                {
                    char current = line.charAt(i);
                    
                    if(current == 'a' || current == 'e' || current == 'i'|| current == 'o'|| current == 'u')
                        numVowels++;
                    else if(current == ' ')
                        numWords++;
                    else
                        numCons++;
                }
            }
            System.out.println("The number of vowels is " + numVowels);
            System.out.println("The number of consonants is " + numCons);
            System.out.println("The number of words is " + numWords);
            
            //create file
            File file = new File("C:\\Users\\okeohane01\\Desktop\\output.txt");
            if(file.exists())
            {
                System.out.println("File already exists");
                System.exit(0);
            }
        
            PrintWriter output = new PrintWriter(file);
        
            output.println("The number of vowels is " + numVowels);
            output.println("The number of consonants is " + numCons);
            output.println("The number of words is " + numWords);
        
            output.close();
        }
        
        catch (java.net.MalformedURLException ex)
        {
            System.out.println("Invalid URL");
        }
        catch(java.io.IOException ex)
        {
            System.out.println("IO Errors");
        }
  }
}
