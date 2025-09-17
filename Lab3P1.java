import java.util.Scanner;

class Lab3P1 {
    public static void main(String...args) {
        /* Checking if given no. is prime
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a No.:");
        int a = s.nextInt();
        int i = 2;
        boolean isPrime = true;

        while (i <= a / 2)
        {
            if (a % i == 0) 
            {
                isPrime = false;
                break;
            }
            i++;
        }
        
        if (isPrime && a > 1) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }*/

        /* Printing prime no.s until n using while loop
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        while(i < n)
        {
            int j = 2, count = 0;
            if (i == 2) count++;
            while(j < i)
            {
                if (i % j == 0) 
                {
                    count = 0;
                    break;
                }
                else count++;
                j++;
            }
            if(count > 0)
            {
                System.out.println(i);
            }
            i++;
        }*/

        /* Printing prime no.s until n using for loop
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 2; i < n; i++)
        {
            int count = 0;
            if (i == 2) count++;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    count = 0;
                    break;
                }
                else count++;
            }
            if(count > 0)
            {
                System.out.println(i);
            }
        }*/
    
        //Printing prime no.s until n using do while loop
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        do
        {
            int j = 2, count = 0;
            do
            {
                if(i == 2)
                {
                    count++;
                    j++;
                    continue;
                }
                if(i % j == 0)
                {
                    count = 0;
                    break;
                }
                else count++;
                j++;
            }while(j < i);
            if(count > 0) System.out.println(i);
            i++;
        }while(i < n);
    }
}