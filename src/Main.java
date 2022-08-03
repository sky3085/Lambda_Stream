import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    private static List<Student> list=Arrays.asList(
            new Student("홍길동", 90, 97),
            new Student("문영환", 100, 100)
            );

    public static void printString(Function<Student, String> function){
        for (Student stud : list) {
            System.out.print(function.apply(stud) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String m1 = "Lambda Practice ";
        String m2 = "Java 8";

        Consumer<String> cons = t -> System.out.println(t);
        cons.accept(m1);

        BiConsumer<String, String> bicons = (t1, t2) -> System.out.println(t1 + t2);
        bicons.accept(m1, m2);

        IntSupplier intSupplier = () -> {
            int num = (int)(Math.random()*6)+1;
            return num;
        };
        int num = intSupplier.getAsInt();
        System.out.println("num = " + num);

        System.out.println("[학생이름]");
        printString(t->t.getName());
    }


}
