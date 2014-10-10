import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab11
{
    /**
     * main() method
     */
    public static void main (String[] args)
    {
        introduction();
        cubes();
        grades();
    }
    
    /**
     * Method to print out an introduction to Lab11
     */
    public static void introduction()
    {
        System.out.println("**********************************************************");
        System.out.println("*                           Lab 11                       *");
        System.out.println("**********************************************************");
    }
    
    /**
     * Method to generate cubes for number from 9-1
     */
    public static void cubes()
    {
        System.out.println("\n*****Step 1 : Using a for loop, an array, and the Math Class");
        System.out.println("to get the cubes from 9-1 *****\n");
        int [] number = {9,8,7,6,5,4,3,2,1};
        for (int counter = 0; counter < number.length;counter++)
        {
           double cube = Math.pow (number[counter],3);
           System.out.println(number[counter] +" cubed is " + cube);
        }
    }
    
    /**
     * Method to count average scores according to student's grades
     */
    public static void grades()
    {
        System.out.println("\n***** Step 2 : Grading with Arrays ***** ");
        System.out.print("\nWould you like to input grades (y/n): ");
        Scanner textReader = new Scanner (System.in);
        Scanner numberReader = new Scanner (System.in);
        DecimalFormat numberFormat = new DecimalFormat ("#0.00");
        String input;
        input = textReader.nextLine();
        while (!input.equals("y") && !input.equals("n"))
        {
            System.out.print("Sorry y/n needed: ");
            input = textReader.nextLine();
        }
        while (input.equals ("y"))
        {
        String name;
        System.out.print("\nStudent Name: ");
        name = textReader.nextLine();
        System.out.print("\nHow many grades are you submitting for " + name + ": ");
        int submitGrades = 0;
        submitGrades = numberReader.nextInt();
        System.out.println("\nLet's input those " + submitGrades + " grades.\n");
        double [] grades = new double [submitGrades];
        for (int i=0;i < grades.length;i++)
        {
            System.out.print("Submit grade #" + (i+1) +": ");
            grades[i] = numberReader.nextDouble();
            while(grades[i]<0 || grades[i]>100)
            {
                System.out.print("A grade between 0-100 needed: ");
                grades[i] = numberReader.nextDouble();
            }
        }
        double total = 0;
        for (int j = 0; j < grades.length;j++)
        {   //equals--> double element : values
            total= total + grades[j];
        }
        double avrgGrade = total / grades.length;
        System.out.println("\nAverage for " + name + ": " + numberFormat.format(avrgGrade));
        System.out.print("\nWould you like to input grades (y/n): ");
        input = textReader.nextLine();
        while (!input.equals("y") && !input.equals("n"))
        {
            System.out.print("Sorry y/n needed: ");
            input = textReader.nextLine();
        }
        }
        System.out.print("\n***** Grading now complete *****");
    }
}
    
    

