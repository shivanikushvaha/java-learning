package week2.day8;

public class Main {
    public static void main(String[] args) {
       // Teacher teacher = new Teacher("aaa", "bbb");
        // System.out.println(teacher);

        Teacher teacher = Teacher.getInstance();
        System.out.println(teacher);

        Teacher ins = Teacher.getInstance();
        System.out.println(ins);
    }

}
