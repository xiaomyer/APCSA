package Unit5;
public class Homework212 {
    public static void pattern6() {
        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern7() {
        for (int i = 1; i <= 5; i++) {
            for (int k = i; k <= 5; k++) {
                System.out.print(k + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        pattern6();
        pattern7();
    }
}
