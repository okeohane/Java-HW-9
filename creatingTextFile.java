package javaapplication2;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class JavaApplication2 
{
    public static void main(String[] args) throws java.io.IOException
    {
        File file = new File("C:\\Users\\okeohane01\\Desktop\\in.txt");
        if(file.exists())
        {
            System.out.println("File already exists");
            System.exit(0);
        }
        
        PrintWriter output = new PrintWriter(file);
        
        for(int i = 0; i < 20; i++)
        {
            int num = (int)(Math.random() * 100) + 1;   //num from [1, 101)
            
            output.print(num + " ");
        }
        
        output.close();
        
        Scanner input = new Scanner(file);
        //create array to store values in file
        //int[] nums = new int[20];
        ArrayList<Integer> nums = new ArrayList<>();
        
        //read file
        while(input.hasNext())
        {
            nums.add(input.nextInt());
        }
        
        //sorts numbers
        Collections.sort(nums);
        
        for(int i = 0; i < nums.size(); i++)
        {
            System.out.print(nums.get(i) + " ");
        }
    }
}
