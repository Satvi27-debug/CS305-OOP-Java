import java.util.Scanner;

class Lab2P4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("AND operator: "+ (a & b));
        System.out.println("OR operator: "+ (a|b));
        System.out.println("NOT operator: "+ (a^b));
        System.out.println("Right Shift operator: "+ (a>>2));
        System.out.println("Right Shift operator: "+ (b>>2));
        System.out.println("Left Shift operator: "+ (a<<2));
        System.out.println("Left Shift operator: "+ (b<<2));
        System.out.println("Right Most Shift operator: "+ (a>>>2));
        System.out.println("Right Most Shift operator: "+ (b>>>2));
    }
}
