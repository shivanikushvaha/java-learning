package week2.day10;

import java.util.List;

public class Practice1Exercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,7,4,23,7,9);
		printOddNumberInListFunctional(numbers);
		printCubesOfOddNumberInListFunctional(numbers);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		printAllCoursesInListFunctional(courses);
		printCoursesContainsSpringInListFunctional(courses);
		printCoursesHavingFourLettersInListFunctional(courses);
		printCourseLengthsInListFunctional(courses);
	}

	private static void printOddNumberInListFunctional(List<Integer> integerList) {
		integerList.stream()
				.filter(i -> i % 2 == 1)
				.forEach(e -> System.out.println(e));
	}

	private static void printCubesOfOddNumberInListFunctional(List<Integer> integerList) {
		integerList.stream()
				.filter(i -> i % 2 == 1)
				.map(e -> e * e * e)
				.forEach(System.out::println);
	}

	private static void printAllCoursesInListFunctional(List<String> stringList) {
		stringList.stream()
				.forEach(System.out::println);
	}

	private static void printCoursesContainsSpringInListFunctional(List<String> stringList) {
		stringList.stream()
				.filter(e -> e.contains("spring"))
				.forEach(System.out::println);
	}

	private static void printCoursesHavingFourLettersInListFunctional(List<String> stringList) {
		stringList.stream()
				.filter(e -> e.length() > 4)
				.forEach(System.out::println);
	}

	private static void printCourseLengthsInListFunctional(List<String> stringList) {
		stringList.stream()
				.map(e -> e + " " + e.length())
				.forEach(System.out::println);
	}
}
