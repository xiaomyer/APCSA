package Midterm;

public class Midterm {
    public static void main(String[] args) {
        System.out.println(checkTriangular(10));
    }

    public static boolean checkTriangular(int num) {
        int i = 1;
        int check = 0;
        while (true) {
            check += i;
            i++;
            if (num == check) {
                return true;
            } else if (check > num) {
                return false;
            }
        }
    }
}
