package week1.day6;

import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        List<Department> departmentList1 = new ArrayList<>();
        Department department1 = new Department(1, "Computer Science");
        Department department2 = new Department(2, "Mechanical");
        Department department3 = new Department(3, "Electrical");

        departmentList1.add(department1);
        departmentList1.add(department2);
        departmentList1.add(department3);

        List<Department> departmentList2 = new ArrayList<>();
        Department d1 = new Department(4, "plastic");
        Department d2 = new Department(5, "Civil");

        departmentList2.add(d1);
        departmentList2.add(d2);

        List<String> subjectList1 = new ArrayList<>();
        subjectList1.add("java");
        subjectList1.add("python");

        List<String> subjectList2 = new ArrayList<>();
        subjectList2.add("Networking");
        subjectList2.add("cpp");

        List<Teacher> teacherList = new ArrayList<>();
        Teacher t1 = new Teacher(
                1,
                "AAA",
                List.of(
                        new Department(100, "CSE"),
                        new Department(101, "ME"),
                        new Department(103, "Civi")
                ),
                List.of("Python", "Physics", "Electronics")
        );

        Teacher t2 = new Teacher(2, "BBB",
                List.of(
                        new Department(11, "DE"),
                        new Department(12, "LG"),
                        new Department(13, "POL")
                ),
                List.of("Maths", "Chemistry")
        );

        teacherList.add(t1);
        teacherList.add(t2);

        System.out.println(teacherList);

        // for (Teacher t : teacherList);
        // System.out.println(t);
    }
}
