package week5.day35;

public class MinimumNumberOfChairInWaitingRoom {
    public static void main(String[] args) {
        int i = minimumChairs("ELELEEL");
        System.out.println(i);
    }

    public static int minimumChairs(String s) {
        if (!s.contains("L"))
            return s.length();

        int n = s.length();
        char[] charArray = s.toCharArray();
        int avl = 0;
        int k = 0;
        for (int i = 0; i < n; i++){
            if (charArray[i] == 'E') k++;
            else k--;

            if (k > avl)
                avl++;
        }
        return avl;
    }
}
