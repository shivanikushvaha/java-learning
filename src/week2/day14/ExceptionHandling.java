package week2.day14;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str = "My name is Shivani";
        System.out.println(str);
        int i = 90;
         try {
             System.out.println(i / 0);
         }

         catch (ArithmeticException p) {
             System.out.println(p.toString());
         }

        System.out.println("Hello");
    }
}
