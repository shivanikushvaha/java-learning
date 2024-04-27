package week2.day11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

        Integer reduce = courses.stream().map(i -> i.getReviewScore()).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        List<String> list = courses.stream().map(i -> i.getName().toLowerCase()).toList();
        System.out.println(list);

        List<String> list1 = courses.stream().map(i -> i.getCategory().toUpperCase()).toList();
        System.out.println(list1);

        System.out.println("===================================");

        courses.stream().filter(e -> e.getReviewScore() > 95).forEach(System.out::println);

    }
}
