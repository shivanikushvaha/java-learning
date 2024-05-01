package week2.day13;

public class ExceptionHandling {
    public static void main(String[] args)  {
        int i = 10;
        System.out.println("Hello!!!");
        try{
            System.out.println(i / 0);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            System.out.println(e.getCause());
        }
        System.out.println("heelooo");
    }
}
