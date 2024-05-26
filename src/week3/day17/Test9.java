package week3.day17;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;

import static java.lang.StringTemplate.RAW;

public class Test9 {
    public static void main(String[] args) {
        String name = "pushpendra";
        Integer age = 23;
        String message = "My name is %s and age is %d".formatted(name, age);
        System.out.println(message);

        String format = MessageFormat.format("My name is {0} and age is {1}", name, age);
        System.out.println(format);

        String msg = STR."My name is \{name} and age is \{age}";
        System.out.println(msg);

        String s = STR."""
                My name is \{name}
                and age is \{age}
                """;
        System.out.println(s);

        String name1 = "Fred";
        int age1 = 42;
        StringTemplate template = RAW."Hello, \{name1}! Next year, you'll be \{age1 + 1}.";
        List<String> fragments = template.fragments();// ["Hello, ", "! Next year, you'll be ", "."]
        System.out.println(fragments);
        List<Object> values = template.values();// ["Fred", 43]
        System.out.println(values);
    }
}
