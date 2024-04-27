package week1.day6;

import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        Student s1 = new Student("AAA", 21);
        Student s2 = new Student("BBB", 23);
        Student s3 = new Student("MMM", 32);

        student.add(s1);
        student.add(s2);
        student.add(s3);

        System.out.println(student);

        for (Student s : student) {
            System.out.println(s.getName());
        }
    }
}
