public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++)
            System.out.print(sumUpTo(i) + " ");
    }

    static int sumUpTo (int n) {
        return (n*(n+1))/2;
    }
}