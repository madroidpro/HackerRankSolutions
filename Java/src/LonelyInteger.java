import java.util.Scanner;

/**
 * Created by madroid on 01-07-2016.
 */
public class LonelyInteger {

    private static int lonelyInteger(int[] a) {
        int len = a.length;
        int lon_num=0;
        for(int i=0;i<len;i++){
           lon_num ^=a[i];
            System.out.println(lon_num+"xor"+a[i]);
        }
        return lon_num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
