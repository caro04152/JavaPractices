//import Scanner class to read user input
import java.util.Scanner;
//import Random class to select number between 0-9 randomly
import java.util.Random;
//create a class
public class Lab09
{
    //create individual method to format introduction section, method name is "introduction", parameter type is String and variable name is "contents"
    public static void introduction (String contents)
    {
        //calculate length of input string
        int n = contents.length();
        //using for loop to output * in the first line
        for (int i = 0;i<=n+32;i++) 
        {
            System.out.print("*");
        }
        //leave a space line between * line and contents
        System.out.println();
        //enter * to to create a rectangle
        System.out.println("*\t\t\t\t\t\t\t*");
        //enter contents by using "contents" as parameter
        System.out.println("*\t\t" + contents + "\t\t*" );
        //enter * to to create a rectangle
        System.out.println("*\t\t\t\t\t\t\t*");
        //using for loop to output * in the last line
        for (int i = 0; i<=n+32;i++) 
        {
            System.out.print("*");
        }
    }
    //(Q: where to use "game"? still unclear.)create individual method to ask users to play adding game. Method name is "addingGame", parameter type is String and variable name is "game"
    public static void addingGame (String game)
    {
       //prompt to welcome users 
       System.out.println("\n\n**************** Part 2 : Adding numbers ***************\n");
       //create a Scanner for user to input value
       Scanner inputReader = new Scanner (System.in);
       //create a Scanner for nextLine() data input to avoid Gotcha  
       Scanner nextLine = new Scanner (System.in);
       //create random object to select randomly
       Random randomNumbers = new Random(); 
       //initialize input string variable to save value
       String input; 
       //initialize result variable and save further input info
       int result;
       //create and save value in answer variable
       int answer;
       //ask users to play adding number games
       System.out.print("Add some numbers? (y/n) : ");
       //user input answers and save in input variable
       input = inputReader.nextLine();
       //add whille loop to range input in two values and remind users of two options
       while (!input.equals("y") && !input.equals("n"))
       {
           System.out.print("\nI need a y/n : ");  
           input = inputReader.nextLine();
       }
       //while loop for users who answer "y"
       while (input.equals("y"))
       {
           //randomly select a number between 0-9
           int number1 = randomNumbers.nextInt(10);
           //randomly select a number between 0-9,which may as the same as the former one
           int number2 = randomNumbers.nextInt(10);
           //space line 
           System.out.println();
           //print number adding question to user
           System.out.print(number1 + " + " + number2 + " = :");
           //user input
           result = inputReader.nextInt();
           //correct answer
           answer = number1 + number2;
           //compare user's answer with correct answer and print result for user
           if (result == answer )
           {
               System.out.println("Right! " + result + " is the correct answer!" );
           }
           else
           {
               System.out.println("Sorry - the answer is " + answer);
           }
           //ask user whether to go on game or quit the game
           System.out.print("\nPlay again?(y/n) : ");
           //user answer "y" or "n",may enter while loop if they answer "y"
           input = nextLine.nextLine();
           //prompt user to enter valid letters
           while (!input.equals("y") && !input.equals("n"))
           {
               System.out.print("\nSorry - I need a y/n : ");  
               input = nextLine.nextLine();
           }
           
       }
       //revised one. system.out.print instead of while loop and nested while loop
       System.out.print("\nThanks-let's move on to Part 3 ...\n");
    }
    //create individual method to calculate square of even numbers between 2 and 24. Method name is "square", parameter type is Int and variable name is "number"
    public static void squares (int number)
    {
        //welcome users to part 3
        System.out.println("\n**************** Part 3 : Squaring Numbers ***************\n");
        //for loop to count a given number of times sequence of even number squares
        for (number=2; number<=24;number++)
        {
            if( number%2 == 0) 
            {
                int square = number*number;
                System.out.println(number + " squared is " + square);
            }
        }
    }
    //print welcome introduction, play number game, and compute squares
    public static void main(String[] args)
    
    {
        introduction ("Part 1: Welcome to Lab 9");
        addingGame("y");
        squares (2);
    }
}
