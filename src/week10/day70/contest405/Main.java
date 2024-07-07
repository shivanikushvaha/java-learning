package week10.day70.contest405;

public class Main {
    public static void main(String[] args) {
        String s = "aaa";
        int k = 1;
        String encryptedString = getEncryptedString(s, k);
        System.out.println(encryptedString);
    }

    public static String getEncryptedString(String s, int k) {
        int n = s.length();
        if (n == 0) return null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(s.charAt((i + k) % n));
        }
        return sb.toString();
    }
}
