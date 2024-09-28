package week14.day98;

public class CountNoOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int i = countConsistentStrings(allowed, words);
        System.out.println(i);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            char[] charArray = words[i].toCharArray();
            int len = charArray.length;
            boolean flag = true;

            for (int j = 0; j < len; j++) {
                char c = charArray[j];
                if (!allowed.contains(String.valueOf(c))) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }

}