import java.util.Scanner;

public class Lab5P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char ch = st.charAt(0);
        ch = Character.toLowerCase(ch);
        for (Fruits fr : Fruits.values()) { // enum object in created 'fr'
            if (fr.get() == ch) {
                System.out.println(fr);
            }
        }
        sc.close();
    }
}

enum Fruits {
    Apple('a'), // , to be used to differentiate the different the types of values declared in the enum.
    Banana('b'),
    Cirtus('c'),
    DragonFruit('d'),
    Elegant('e'); // used ';' to terminate the enum inside the block.
    
    private char a; // error: requires enum constant in place of private
    // write it below the enum constants. To not get error, declare it as 'private char a;'
    
    Fruits(char a) {
        this.a = a; // constructor to initialize the value of 'a'
    }

    public char get() {
        return a;
    }

}
