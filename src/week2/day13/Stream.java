package week2.day13;

import week2.day11.Course;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
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

        Map<String, List<Course>> categoryMap =  courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory));
        System.out.println(categoryMap);

        System.out.println("==================");

        Map<String, Long> count = courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()));
        System.out.println(count);

        System.out.println("-----------------");

        courses.stream()
                .sorted(Comparator.comparing(Course::getNoOfStudents))
                .toList()
                .forEach(System.out::println);

        System.out.println("-------------------");

        courses.stream()
                .sorted(Comparator.comparing(Course::getNoOfStudents).reversed())
                .toList()
                .forEach(System.out::println);

        System.out.println("-------------------");

        courses.stream()
                .sorted(Comparator.comparing(Course::getNoOfStudents)
                        .thenComparing(Course::getCategory)
                        .reversed())
                .toList()
                .forEach(System.out::println);

        List<String> list = List.of("aaa", "kkk", "lll", "SSSSS", "LOPiuj", "IIHUGHGU");
        list.stream()
                .sorted(Comparator.comparing(String::length))
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);

    }
}
