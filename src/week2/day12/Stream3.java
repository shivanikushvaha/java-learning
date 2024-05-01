package week2.day12;

import week2.day11.Course;

import java.util.Map;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
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

        Predicate<Course> reviewScoreGreaterThan90 = course -> course.getReviewScore() > 90;
        courses.stream()
                .allMatch(reviewScoreGreaterThan90);
        Map<String, List<Course>> collect =
                courses.parallelStream().collect(Collectors.groupingBy(Course::getCategory));
        System.out.println(collect);

        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 5, 5);

        Map<Integer, Long> result = numbers.stream()
                .filter(val -> val > 3)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(result);

        Map<Integer, Long> collect1 = numbers.stream()
                .collect(Collectors.groupingBy(i -> i,
                        Collectors.filtering(val -> val > 3, Collectors.counting())));
        System.out.println(collect1);

        Blog blog1 = new Blog("1", List.of("Nice", "Very Nice"));
        Blog blog2 = new Blog("2", List.of("Disappointing", "Ok", "Could be better"));
        List<Blog> blogs = List.of(blog1, blog2);

        Map<String,  List<List<String>>> authorComments1 = blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName,
                        Collectors.mapping(Blog::getComments, Collectors.toList())));
        System.out.println(authorComments1);

        Map<String, List<String>> authorComments2 = blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName,
                        Collectors.flatMapping(blog -> blog.getComments().stream(),
                                Collectors.toList())));
        System.out.println(authorComments2);
    }
}
