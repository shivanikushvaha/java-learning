package week13.day85;

public class NumberOfTeam {
    public static void main(String[] args) {
        int[] rating = {1, 2, 3, 4};
        int i = numTeams(rating);
    }

    public static int helper2(int[] rating, int ind, int prev, int count){

        if(count == 0){
            return 1;
        }

        if(ind == rating.length){
            return 0;
        }

        int notPick = helper2(rating, ind+1, prev, count);

        int pick = 0;

        if(prev == -1 || rating[ind]<rating[prev]){
            pick = helper2(rating, ind+1, ind, count-1);
        }

        return pick + notPick;

    }

    public static int helper1(int[] rating, int ind, int prev, int count){

        if(count == 0){
            return 1;
        }

        if(ind == rating.length){
            return 0;
        }

        int notPick = helper1(rating, ind+1, prev, count);

        int pick = 0;

        if(prev == -1 || rating[ind]>rating[prev]){
            pick = helper1(rating, ind+1, ind, count-1);
        }

        return pick + notPick;

    }

    public static int numTeams(int[] rating) {

        int ans1 = helper1(rating, 0, -1, 3);

        int ans2 = helper2(rating, 0, -1, 3);

        return ans1+ans2;

    }
}
