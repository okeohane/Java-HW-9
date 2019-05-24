package javaapplication3;
import java.util.Scanner;
import java.net.URL;

public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        int count = 0;
        double total = 0;
        
        try
        {
            URL website = new URL("https://turing.manhattan.edu/~ankur.agrawal/misc/scores.txt");
            Scanner input = new Scanner(website.openStream());
            
            while(input.hasNext())
            {
                count++;
                total += input.nextDouble();
            }
            
            System.out.println("Total = " + total);
            System.out.println("Average = " + total/count);
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
