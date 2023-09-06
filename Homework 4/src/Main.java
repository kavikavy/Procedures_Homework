public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        System.out.println(equal(a, reverse(a)));
    }

    static int[] reverse (int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[(a.length-1)-i];
        }

        return b;
    }

    static boolean equal (int[] a, int[] b) {
        boolean equal = false;

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    equal = false;
                else
                    equal = true;
            }
        }

        return equal;
    }
}