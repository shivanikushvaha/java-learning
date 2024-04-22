package day4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("name");
        System.out.println(student);

        Student s2 = new Student(23);
        System.out.println(s2);

        Student s1 = new Student("Pushpendra", 23);
        System.out.println(s1);

        Student s3 = new Student("Shivani", 23);
        System.out.println(s3);

        Student s4 = new Student();
        s4.setName("AAA");
        s4.setAge(25);
        System.out.println(s4);

        System.out.println(s4.getName());
        System.out.println(s4.getAge());
        System.out.println(s1.getAge());
    }
}
