public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = alternate(a);

        for (int x : b)
            System.out.print(x + " ");
    }

    static int[] alternate (int[] a) {
        int[] b = new int[a.length];
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                b[i] = a[count2];
                count2++;
            }
            else {
                b[i] = a[(a.length-1) - count];
                count++;
            }
        }

        return b;
    }
}