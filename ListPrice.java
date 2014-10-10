import java.util.Scanner;

import java.text.DecimalFormat;

import java.util.ArrayList;

public class Lab12
{
   
   /**
    * main() method
    */
   public static void main(String[]args)
   {
       thanksgiving();
       introduction();
       shoppingCart();
   }
   
   /**
    * Method to print out greetings
    */
   public static void thanksgiving()
   {
       System.out.println("             .★　*　★. ");  
       System.out.println(" .*★　*.　*..*　　　　  ★");
       System.out.println(" \n★ Happy Thanksgiving!  *\n");
       System.out.println("★　　 　&              *\n");
       System.out.println("‘*.　　Bon appetit!*");
       System.out.println("　　‘★　　　　　   ★\n");
       System.out.println("         *.★'");
   }
   
   /**
    * Method to print out an introduction to Shopping Cart
    */
   public static void introduction()
   {
       System.out.println("*****************************************");
       System.out.println("*                                       *");
       System.out.println("*           MSTU Shopping Cart          *");
       System.out.println("*                                       *");
       System.out.println("*****************************************");
   }
   
   /**
    * Asking users to input intem's price and delete an item.
    */
   public static void shoppingCart()
   {
       Scanner textReader = new Scanner (System.in);
       Scanner numberReader = new Scanner (System.in);
       DecimalFormat numberFormat = new DecimalFormat ("#0.00");
       ArrayList <Double> price = new ArrayList<Double>();
       System.out.print("\nWould you like to input item/s - y/n: ");
       String userChoice;
       userChoice = textReader.nextLine();
       
       while (!userChoice.equals("y") && !userChoice.equals("n"))
       {
            System.out.print("\nSorry - We need a y/n: ");
            userChoice = textReader.nextLine();
       }
 
       while(userChoice.equals("y"))
       {
           //often forget "ln" in "println" when leave a space line.(*>.<*)~
           System.out.println("");
           System.out.print("Please enter an item price, or -1 to exit: $");
           double input = 0;
           input = (numberReader.nextDouble());
           while(input != -1)
           {
               price.add(input);
               System.out.print("Please enter an item price, or -1 to exit: $");
               input = numberReader.nextDouble();
            }
           System.out.println("\n**********Here is your Items***********");
           System.out.println("");
           for (int i = 0; i < price.size();i++)
           {
               double number = price.get(i);
               System.out.println("Item #" + (i+1) + ": $" + number);
           }
           System.out.print("\nWould you like to delete an item - y/n : ");
           String userDelete;
           userDelete = textReader.nextLine();
           while (!userDelete.equals("y") && !userDelete.equals("n"))
           {
               System.out.print("\nSorry - We need a y/n: ");
               userDelete = textReader.nextLine();
            }
           System.out.println("");
           if(userDelete.equals("y"))
           {
                System.out.print("Provide an item number to delete: #");
                int deleteNumber = 0;
                deleteNumber = numberReader.nextInt();
                while(deleteNumber <0 ||deleteNumber > price.size())
                {
                    System.out.print("That number is out of range - try again: #");
                    deleteNumber = numberReader.nextInt();
                }
                price.remove(deleteNumber-1);
                System.out.println("Item #" + deleteNumber + " has been removed");
           }
           else
           {
               System.out.println("\nThanks - no items will be deleted");
            }
           System.out.println("\n*********** Here is Your Final List of Items ***********");
           System.out.println("");
           for (int j = 0; j < price.size();j++)
           {
               double finalNumber = price.get(j);
               System.out.println("Item #" + (j+1) + ": $" + finalNumber);
           }
           double plus = 0;
           for (double element : price)
           { 
               plus = plus + element;
           }
           double finalPrice = totalPlusTax(plus);
           System.out.println("\nTotal with 7.5% sales tax is " + numberFormat.format(finalPrice));
           System.out.println("");
           credit(finalPrice);
           System.out.println("");
           System.out.print("\nWould you like to input item/s - y/n: ");
           userChoice = textReader.nextLine(); 
           //p295:for loop may skip past the net element. While loop won't.
           int k = 0;
           while( k < price.size())
           {
               price.remove(k);
            }
        }
       System.out.print("\n*********** Thanks for using the Shopping Cart ***********");
   }
   
   /**
    * Method to count total price which includes 7.5% sales tax
    */
   public static double totalPlusTax(double total)
   {
        final double SALES_TAX = 0.075; 
        double finalPrice = total + (total * 0.075);
        return finalPrice;
   }
   
   /**
    * Method to print out credit line for card payment. 
    */
   public static void credit(double total)
   {
       if (total>100)
       {
           System.out.println("We see that your items have exceeded $100.00.");
           System.out.print("Please contact us if you would like to set up a line of credit.");
        }
        else
        {
            System.out.println("We see that your items have not exceeded $100.00.");
            System.out.print("We will therefore only accept cash.");
            
        }
    }
}
