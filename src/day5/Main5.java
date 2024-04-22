package day5;

public class Main5 {
    public static void main(String[] args) {
        Student2 Student2 = new Student2();
        System.out.println(Student2);

        Student2 s1 = new Student2("Shivani", 23);
        System.out.println(s1);

        Student2 s2 = new Student2();
        s2.setName("Ankita");
        s2.setAge(23);
        System.out.println(s2);
        System.out.println(s2.getAge());
        System.out.println(s1.getName());
    }

}
