import java.util.Scanner;
class Lab2P2 {
    public static void main(String...args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a integer:");
        int x = s.nextInt();
        int y = x;
        System.out.println("Output is: "+ (x++ + ++x)); // Output is: 12, as we use () it is considered as sum.
        x = y;
        System.out.println("Output is: "+ x++ + ++x);   // Output is: 57,as we don't use () it is not considered as sum.
        x = y;
        System.out.println(x++ + ++x +" is output");    // 12 is output, as we put it before the string.
    }
}
/*This problem is baed on string and the problem of using + to concatinate.
 * In the first System.out.println when we used () these brackets, it is considered as sum and gave the value as we like.
 * In the second System.out.println we didn't use () so it considered the + as concatinater not as operator so the value was different than what we gussed.
 * In thr third System.out.println we wrote the sum before the main string so the + symbol is considered as sum.
 */
