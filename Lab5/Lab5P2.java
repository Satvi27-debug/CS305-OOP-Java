import java.lang.annotation.*;

public class Lab5P2 {
    @SuppressWarnings("Deprecated")
    public static void main(String[] args) {
        Class<?> ct = AnnoP.class;
        AnnoC ac = new AnnoC();
        ac.ovR();
        ac.display();

        System.out.println(ct.isAnnotationPresent(MyAnno.class));
        System.out.println(ct.getAnnotation(MyAnno.class));
        
    }
}

@MyAnno
class AnnoP {
    @Deprecated
    public void display() {
        System.out.println("Deprecated Method!...");
    }

    public void ovR() {
        System.out.println("Hello");
    }
}

@MyAnno
class AnnoC extends AnnoP {
    @Override
    public void ovR() {
        System.out.println("AnnoC");
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Bye World";
}