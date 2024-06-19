package week7.day44;

public class Test {
    public static void main(String[] args) {
        String str = "test";
        String replace = str.replace('t', 'o');
        StringBuilder sb = new StringBuilder();
        StringBuilder test = sb.replace(0, 2, "test");
        System.out.println(test);
    }

}
