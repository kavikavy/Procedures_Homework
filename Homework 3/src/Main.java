public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] b = {100, 11};
        int value = 3;
        System.out.println(contains(array, value));
        System.out.println(any(array, b));
    }

    static boolean contains (int[] array, int value) {
        boolean contains = false;
        for (int val : array) {
            if (val == value)
                contains = true;
        }
        return contains;
    }

    static boolean any (int[] a, int[] b) {
        boolean contains = false;
        for (int val : b) {
            if (contains(a, val) == true)
                contains = true;
        }
        return contains;
    }
}