package week1.day7;

public class Main6 {
    public static void main(String[] args) {
       // Teacher teacher1 = new Teacher("AAA", "CSE");
      //  System.out.println(teacher1);

        Teacher teacher = Teacher.getInstance();
        System.out.println(teacher);

        Teacher instance = Teacher.getInstance();
        System.out.println(instance);

    }
}
