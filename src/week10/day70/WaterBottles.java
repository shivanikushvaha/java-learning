package week10.day70;

public class WaterBottles {
    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 7;
        int i = numWaterBottles(numBottles, numExchange);
        System.out.println(i);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int maxBottles = 0;

        if (numExchange > numBottles) return numBottles;

        while (numBottles >= numExchange) {
            maxBottles = maxBottles + (numBottles / numExchange) * numExchange;
            numBottles = Math.abs(numBottles - (numBottles / numExchange) * numExchange + numBottles % numExchange);
        }
        return maxBottles;
    }
}
