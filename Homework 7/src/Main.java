public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (prime(i) == true)
                System.out.print(i + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 1; count < 100; i++) {
            if (prime(i) == true) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    static boolean prime (int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}