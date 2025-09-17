import java.util.Scanner;

class Lab3P3 {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        s.nextLine();  // consume leftover newline
        String b = s.nextLine();

        Lab3P3 l = new Lab3P3();
        Lab3P3 l2 = new Lab3P3(a);
        Lab3P3 l3 = new Lab3P3(b);
        Lab3P3 l4 = new Lab3P3(a, b);

        l.show();
        l.show(10);
        l.show("String");
        l.show(10, "String");
    }

    // ✅ Constructors
    Lab3P3() {
        System.out.println("Constructor without Params");
    }

    Lab3P3(int x) {
        System.out.println("Constructor with int Params: " + x);
    }

    Lab3P3(String s) {
        System.out.println("Constructor with String Params: " + s);
    }

    Lab3P3(int x, String s) {
        System.out.println("Constructor with both int and String Params: " + x + " " + s);
    }

    // ✅ Method overloading
    public void show() {
        System.out.println("Method without Params");
    }

    public void show(int x) {
        System.out.println("Method with int Params: " + x);
    }

    public void show(String s) {
        System.out.println("Method with String Params: " + s);
    }

    public void show(int x, String s) {
        System.out.println("Method with both int and String Params: " + x + " " + s);
    }
}
