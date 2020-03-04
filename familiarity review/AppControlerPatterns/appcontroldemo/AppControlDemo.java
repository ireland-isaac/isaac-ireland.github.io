package AppControlDemo;

import java.util.Scanner;


/** original work by chistianray */

public class AppControlDemo
{
    public static void main ( String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type Peanuts, Creed, or Spectere to go ot the oppropriate Review.");
        AppController app = new AppController();
        app.dispatchRequest(input.next());


    }

}