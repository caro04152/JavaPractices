import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        //display the prompt "Welcome......"
        System.out.print("********** Welcome to the MSTU Change Counter **********");
        //display the prompt "This......"
        System.out.print("\n\nThis program will take your change and credit your account.");
        //create a Scanner object 
        Scanner inputReader = new Scanner (System.in);
        //ask the user for amount of pennies
        System.out.print("\n\nHow many pennies are you inputting:  ");
        //create pennies variable; read the input and store in the pennies variable
        int pennies = inputReader.nextInt();
        //ask the user for amount of nickels
        System.out.print("How many nickels are you inputting:  ");
        //create nickels variable; read the input and store in the nickels variable
        int nickels = inputReader.nextInt();
        //ask the user for amount of dimes
        System.out.print("How many dimes are you inputting:  ");
        //crate dimes variable; read the input and store in the dimes variable
        int dimes = inputReader.nextInt();
        //ask the user for amount of quarters
        System.out.print("How many quarters are you inputting:  ");
        //create quarters variable; read the input and store in the quarters variable
        int quarters = inputReader.nextInt();
        //create and initialize a varible to hold total pennies
        int total_pennies = (pennies + (nickels * 5) + (dimes * 10) + (quarters * 25));
        //create a variable to hold amount of dollars
        int dollar_coins = total_pennies / 100;
        //create a variable to hold amount of cents
        int cent_coins = total_pennies % 100;
        //display the prompt "Thank you"
        System.out.print("\n********** Thank you! **********\n\n");
        //display the resulte of calculation 
        System.out.printf("We will now credit your account with %d dollars %d cents.", dollar_coins, cent_coins);
    }
}
