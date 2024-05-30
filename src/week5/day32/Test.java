package week5.day32;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.appendCodePoint(65);
        sb.append("a");
        sb.append("b");
        sb.insert(0, "Z");
        sb.reverse();
        System.out.println(sb);
    }
}
