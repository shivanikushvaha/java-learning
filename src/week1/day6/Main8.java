package week1.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main8 {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        List<String> skills1 = new ArrayList<>();
        skills1.add("java");
        skills1.add("cpp");

        List<String> skills2 = new ArrayList<>();
        skills2.add("Python");
        skills2.add("java");

        List<String> skills3 = new ArrayList<>();
        skills3.add("java");
        skills3.add("c++");

        Employee e1 = new Employee(1, "AAA", 10000.1f, List.of("Java", "CPP"));
        Employee e2 = new Employee(2, "BBB", 20000.2f, Arrays.asList("Python", "C"));
        Employee e3 = new Employee(3, "CCC", 11000.2f, skills3);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println(employeeList);

        for (Employee e : employeeList) {
            System.out.println(e);
            for (String s : e.getSkills())
                System.out.println("Skills " + s);
        }
    }
}
