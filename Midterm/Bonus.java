package Midterm;

public class Bonus {
    public static void main(String[] args) {
        System.out.println(endsTheSame("abcooooooooooooabc"));
    }

    public static String endsTheSame(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.startsWith(str.substring(i))) {
                // System.out.println(str.substring(i));
                return str.substring(i);
            }
        }
        return "";
    }
}
