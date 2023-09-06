public class Main {
    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int x = 4;
        int[] out = new int[in.length];

        int[] OUT = remove(in, x, out);
        for (int a : out)
            System.out.print(a + " ");
    }

    static int[] remove (int[] in, int x, int[] out) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == x) {
                out[i] = 0;
            }
            else
                out[i] = in[i];
        }

        int count = 0;
        for (int i = 0; i < out.length; i++)
            if (out[i] != 0) {
                out[count] = out[i];
                count++;
            }
        while (count < out.length) {
            out[count] = 0;
            count++;
        }
        return out;
    }
}