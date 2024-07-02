package week9.day63.contest404;

public class Main1 {
    public static void main(String[] args) {
        int red = 2;
        int blue = 4;
        int i = maxHeightOfTriangle(red, blue);
        System.out.println(i);
    }

    public static int maxHeightOfTriangle(int red, int blue) {
        if (red == 1 && blue == 1)
            return 1;

        int findBlueTopMax = findBlueTopMax(red, blue);
        int findRedTopMax = findRedTopMax(red, blue);

        return Math.max(findBlueTopMax, findRedTopMax);
    }

    private static int findRedTopMax(int red, int blue) {
        int total = red + blue;
        int sum = 0;
        int i = 1;
        int h = 0;

        while (sum <= total && (blue != 0 || red != 0)) {
            if (i % 2 != 0) {
                red = red - i;
                if (red < 0)
                    break;
            } else {
                blue = blue - i;
                if (blue < 0)
                    break;
            }
            sum += i;
            h++;
            i++;
        }

        return h;
    }

    private static int findBlueTopMax(int red, int blue) {
        int total = red + blue;
        int sum = 0;
        int i = 1;
        int h = 0;

        while (sum <= total && (blue != 0 || red != 0)) {
            if (i % 2 != 0) {
                blue = blue - i;
                if (blue < 0)
                    break;
            } else {
                red = red - i;
                if (red < 0)
                    break;
            }
            sum += i;
            h++;
            i++;
        }

        return h;
    }
}
