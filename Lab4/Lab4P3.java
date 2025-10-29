import java.io.*;
import java.lang.reflect.*;
import java.util.*;

class Add {
    public void add(int... a) {
        int sum = 0;
        int count = 1;
        for (int i : a) {
            sum += i;
            System.out.print(i);
            if (count != a.length) {
                System.out.print("+");
            }
            count++;
        }
        System.out.println("=" + sum);
    }  
}

public class Lab4P3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());

            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);

            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;

            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());
            }

            if (overload) {
                throw new Exception("Overloading not allowed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}