package week4.day25;

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Integer test = test2.test();
        System.out.println(test);
    }

    public Integer test(){
        String s = ".1";
        s = s.trim();

        if (s.isEmpty() ||
                Character.isLetter(s.charAt(0)))
            return 0;

        int[] array = s.chars().toArray();
        String str = "";
        if (s.charAt(0) == '+' || s.charAt(0) == '-' || s.charAt(0) == '.'){
            for (int i = 1; i < s.length(); i++){
                if (!Character.isDigit(array[i])){
                    str = s.substring(1, i);
                    long j = Long.parseLong(str);
                    if (j > Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                    else if (j < Integer.MIN_VALUE)
                        return Integer.MIN_VALUE;
                    return (int) j;
                }
            }
        } else {
            for (int i = 0; i < s.length(); i++){
                if (!Character.isDigit(array[i])){
                    str = s.substring(1, i);
                    long j = Long.parseLong(str);
                    if (j > Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                    else if (j < Integer.MIN_VALUE)
                        return Integer.MIN_VALUE;
                    return (int) j;
                }
            }
        }

        long j = Long.parseLong(s);
        if (j > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (j < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int) j;
    }
}
