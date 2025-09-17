import java.util.Scanner;

class Lab1P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a value for X: ");
            int x = input.nextInt();
            System.out.print("Enter a value for Y: ");
            int y = input.nextInt();
            
            var z = x + y;
            System.out.print("You entered: " + z);

        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}