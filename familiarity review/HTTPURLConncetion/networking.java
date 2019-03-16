package networking;
import java.util.Scanner;

public class networking {
    private static Scanner in;

    public static void main(String args[]){
        in = new Scanner(System.in);
        String email = null;
        String password = null;
        System.out.println("Please enter your email: ");
        email = in.next();

        System.out.println("Please enter your password: ");
        password = in.next(); 
    }
}