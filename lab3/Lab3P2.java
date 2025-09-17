class Lab3P2 {
    // public static void main(String[] args)
    // {
    //     Lab3P2 l = new Lab3P2();
    //     l.highet(5, 7);
    //     l.highet(6);
    //     l.highet(8,9,3);
    // }
    // public static void highet(int a, int b)
    // {
    //     if(a>b)
    //     {
    //         System.out.println(a);
    //     }
    //     else
    //     {
    //         System.out.println(b);
    //     }
    // }
    // public static void highet(int c)
    // {
    //     System.out.println(c);
    // }
    // public static void highet(int d, int e, int f)
    // {
    //     System.out.println(d+e+f);
    // }
    public static void main(String...args) {
        Lab3P2 l = new Lab3P2();
        l.show(); l.show(10); l.show("String"); l.show(10, "String");
    }
    public void show()
    {
        System.out.println("Method without Params");
    }
    public void show(int x)
    {
        System.out.println("Method with int Params" + x);
    }
    public void show(String s)
    {
        System.out.println("Method with String Params" + s);
    }
    public void show(int x, String s)
    {
        System.out.println("Method with both int and String Params" + x + " " + s);
    }
}
