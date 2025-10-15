import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lab4P1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        try
        {
            x = s.nextInt();
            y = s.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException ime)
        {
            System.out.println(ime.getClass().getName());
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getClass().getName() + ": / by zero");
        }
    }

}
