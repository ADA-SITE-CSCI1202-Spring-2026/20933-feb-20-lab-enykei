import java.util.Scanner;

public class maxmin {
    static int getMin(int[] a) {
        int m = a[0];
        for (int x : a) if (x < m) m = x;
        return m;
    }

    static int getMax(int[] a) {
        int m = a[0];
        for (int x : a) if (x > m) m = x;
        return m;
    }

    static int[] getBoth(int[] a) {
        return new int[]{getMin(a), getMax(a)};
    }

    public static void main(String[] args) {
        int[] c = new int[args.length];
        for (int i = 0; i < args.length; i++) c[i] = Integer.parseInt(args[i]);
        System.out.println(getMin(c) + " " + getMax(c));

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = s.nextInt();
        
        int[] res = getBoth(b);
        System.out.println(res[0] + " " + res[1]);
    }
}