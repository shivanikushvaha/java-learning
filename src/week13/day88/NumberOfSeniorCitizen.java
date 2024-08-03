package week13.day88;

public class NumberOfSeniorCitizen {
    public static void main(String[] args) {
        String[] details = {"7868190130M0522", "5303914400F9211", "9273338290F4010"};
        int i = countSeniors(details);
        System.out.println(i);
    }

    public static int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            String substring = detail.substring(11, 13);
            count = Integer.parseInt(substring) > 60 ? ++count : count;
        }
        return count;
    }
}
