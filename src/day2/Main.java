package day2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Shivani", 23);
        System.out.println(student);
        System.out.println(student1);

        student.setName("AAA");
        student.setAge(23);
        System.out.println(student);

        System.out.println(student.getAge());
    }
}
