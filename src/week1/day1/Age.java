package week1.day1;

public class Age {
    public static void main(String[] args) {
        int age = 65;
        if (age <= 18)
            System.out.println("Child");

        else if (age >= 19 && age <= 60) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior");
        }
        System.out.println("=============================");

        int marks = 46;
        if (marks <= 10)
            System.out.println("fail");

        else if (marks >= 11 && marks <= 40)
            System.out.println("2 rank");

        else if (marks >= 41 && marks <= 80)
            System.out.println("1 Rank");

        else
            System.out.println("topper");
    }
}