import java.util.Scanner;

class Lab2P3
{
    public static void main(String...args)
    {
        Scanner s = new Scanner(System.in);
        // int a = s.nextInt();
        // int b = s.nextInt();

        String op = s.next();
        var str = switch(op)
        {
            case "++" -> "Hello";
            case "--", "+", "-", "~" -> "Bye";
            case "Integer" -> 25;
            case "Float" -> 25.5;
            case "Double" -> 25.3263;

            default -> "Sorry";
        };
        System.out.println("Result is:"+ str);
    }
}