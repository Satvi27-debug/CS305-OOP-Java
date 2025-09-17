import java.util.Scanner;
class LAB2P1 {
    public static void main(String...args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = s.nextInt();
        System.out.println("Enter an operator (++, --, ~, +, -):");
        /*s.nextLine();
        String op = s.nextline();
        can use this instead of 
        String op = s.next();*/
        String op = s.next();
        switch(op)
        {
            case "++":
                System.out.println("Post Increment"+ (a++));
                System.out.println("Pre Increment"+ (++a));
                break;
            case "--":
                System.out.println("Post Decrement"+ (a--));
                System.out.println("Pre Decrement"+ (--a));
                break;
            case "~":
                a = ~a;
                System.out.println("Complement"+ a);
                break;
            case "+":
                a = +a;
                System.out.println("Unary +"+ a);
                break;
            case "-":
                a = -a;
                System.out.println("Unary -"+ a);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
