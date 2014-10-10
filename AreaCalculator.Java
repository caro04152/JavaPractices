import java.util.Scanner;

import java.text.DecimalFormat;

public class Lab10
{
    /**
     * main() method
     */
    public static void main(String[] args)
    {
        
        introduction();
       
        areas();
        
    }
    
    /**
     * Method to print out an introduction
     */
    
    public static void introduction ()
    {
        
        System.out.println("*********************************************");
       
        System.out.println("*                                           *");
       
        System.out.println("*      Welcome to MSTU Area Culculator      *");
       
        System.out.println("*                                           *");
       
        System.out.println("*********************************************");
        
        
    }
    
    /**
     * Method to calculate areas
     */
    public static void areas ()
    {
        Scanner letterReader = new Scanner (System.in);
        
        Scanner numberReader = new Scanner (System.in);
        
        DecimalFormat numberFormat = new DecimalFormat("#0.00");
        
        System.out.print("\nSquare, Circle, or Quit - (s/c/q): ");
        
        String choiceReader = letterReader.nextLine();
        
    while(!choiceReader.equalsIgnoreCase("s") && !choiceReader.equalsIgnoreCase("c") && !choiceReader.equalsIgnoreCase("q"))
     {
         System.out.print("\nSORRY - s/c/q is needed: ");
         choiceReader = letterReader.nextLine();
     }
        
    while (choiceReader.equals("s"))
        
     {  System.out.print("\nTo calculate the area of a square, give us a side in feet: ");
        
        Double userNumber = numberReader.nextDouble();
        
        System.out.println("\n***** The area of a square with a side of " + userNumber + " feet is " + numberFormat.format (squareArea(userNumber)) + " feet." + " *****");
    
        System.out.print("\nSquare, Circle, or Quit - (s/c/q): ");
        
        choiceReader = letterReader.nextLine();
        
        while(!choiceReader.equalsIgnoreCase("s") && !choiceReader.equalsIgnoreCase("c") && !choiceReader.equalsIgnoreCase("q"))
        {
            System.out.print("\nSORRY - s/c/q is needed: ");
            choiceReader = letterReader.nextLine();
        }
        
    }
        
    while (choiceReader.equals("c"))
    {   System.out.print("\nTo calculate the area of a circle, give us a radius in feet: ");
        
        Double userNumber = numberReader.nextDouble();
        
        System.out.println("\n***** The area of a circle with a radius of " + userNumber + " feet is " + numberFormat.format (circleArea(userNumber)) + " feet." + " *****");
    
        System.out.print("\nSquare, Circle, or Quit - (s/c/q): ");
        
        choiceReader = letterReader.nextLine();
        
        while(!choiceReader.equalsIgnoreCase("s") && !choiceReader.equalsIgnoreCase("c") && !choiceReader.equalsIgnoreCase("q"))
        {
            System.out.print("\nSORRY - s/c/q is needed: ");
            choiceReader = letterReader.nextLine();
        }
    }
    
    System.out.print(" \nThank you for using our calculator! ");
    
   }
   
    /**
     * retures an area of a square
     * @return aSquare area of a square
     */
   public static double squareArea(double number)
   {
        Double aSquare = number * number;
        
        return aSquare;
        
   }
   
    /**
     * retures the area of a circle
     * @return aCircle area of a circle
     */
    public static double circleArea(double number2)
    {
        Double aCircle = Math.PI * number2 * number2;
        
        return aCircle;
        
   }
    
}
