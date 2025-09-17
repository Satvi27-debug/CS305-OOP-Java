class Lab1P1{
    public static void main(String[] args){
        
        System.out.println("-----------------Byte---------------");

        byte b = 15;
        Byte bb = b; // autoboxing
        System.out.println(Byte.MAX_VALUE);
        System.out.println(bb.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.TYPE);
        System.out.println(Byte.BYTES);
        
        //int x = 200;
        //byte b = (byte)x;
        //System.out.println(b);
        
        System.out.println("-----------------Short---------------");
        
        short s = 100;
        short ss = s; // autoboxing
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Short.TYPE);
        System.out.println(Short.BYTES);
        
        System.out.println("-----------------Integer---------------");
        
        int in = 120;
        Integer ins = in;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);
        System.out.println(Integer.BYTES);
        
        System.out.println("-----------------Long----------------");
        
        long l = 1000L;
        Long ll = l;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.SIZE);
        System.out.println(Long.TYPE);
        System.out.println(Long.BYTES);

        System.out.println("-----------------Float---------------");
        float f = 10.5f;
        Float ff = f;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.SIZE);
        System.out.println(Float.TYPE);
        System.out.println(Float.BYTES);
    
        System.out.println("-----------------Double---------------");
        
        double db = 12.980;
        Double ddb = db;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.SIZE);
        System.out.println(Double.TYPE);
        System.out.println(Double.BYTES);
        
        System.out.println("-----------------Boolean---------------");

        boolean bl = true;
        Boolean bll = bl;
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        //System.out.println(Boolean.SIZE);
        System.out.println(Boolean.TYPE);
        //System.out.println(Boolean.BYTES);


    }
}
