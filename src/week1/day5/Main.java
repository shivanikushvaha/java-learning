package week1.day5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("aaa", 23);
        Student s2 = new Student("bbb", 30);
        Student s3 = new Student("kkk", 23);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);

        for (Student student : studentList) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }
    }
}
