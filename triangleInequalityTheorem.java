package javaapplication1;
public class Triangle
{
    double side1, side2, side3;
   
    public Triangle(double s1, double s2, double s3) throws IllegalArgumentException
    {
        if(s1+s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1)
            throw new IllegalArgumentException("Triangular Inequality Theorem is not Satisfied");
        
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    
    @Override
    public String toString()
    {
        return "Side1 = " + side1 + "\nSide2 = " + side2 + "\nSide3 = " + side3;
    }
}

package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 
{
    public static void main(String[] args)
    {   
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        
        System.out.print("Side1: ");
        side1 = input.nextDouble();
        System.out.print("Side2: ");
        side2 = input.nextDouble();
        System.out.print("Side3: ");
        side3 = input.nextDouble();
        
        try 
        {
          Triangle t = new Triangle(side1, side2, side3);
          System.out.println(t.toString());
        }
        catch (IllegalArgumentException ex) 
        {
          System.out.println(ex.getMessage());
        }
   }
}
