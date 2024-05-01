package week2.day12;

import week2.day11.Course;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("dwd", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

        System.out.println(courses);

        System.out.println("-----------------------");

        Map<String, List<Course>> categoryMap =  courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory));
        System.out.println(categoryMap);

        System.out.println("------------------------");

        Map<String, Long> collect = courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()));
        System.out.println(collect);

        System.out.println("------------------------");

        List<Integer> integers = List.of(1, 2, 3, 4, 0, 1, -1);
        List<Integer> list = integers.stream().sorted().toList();
        System.out.println(list);

        System.out.println("===========================");

        List<Course> list1 = courses.stream()
                .sorted(Comparator.comparing(Course::getNoOfStudents))
                .toList();
        System.out.println(list1);

        System.out.println("-----------------------------");

        List<Course> list2 = courses.stream()
                .sorted(Comparator.comparing(Course::getNoOfStudents).reversed())
                .toList();
        System.out.println(list2);

        System.out.println("-----------------------------");

        List<Course> list3 = courses.stream()
                .sorted(Comparator.comparing(Course::getNoOfStudents)
                        .thenComparing(Course::getCategory)
                        .reversed())
                .toList();
        System.out.println(list3);

        System.out.println("--------------------------------");

        List<String> coursess = List.of("Spring", "Spring Boot", "API",
                "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        coursess.stream()
                .sorted(Comparator.comparing(String::length))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("-------------------------------------");

        String first = courses.stream()
                .filter(e -> e.getName().length() > 11)
                .map(i -> i.getName().toUpperCase())
                .findFirst().orElse("No value found!");
        System.out.println(first);

    }
}
