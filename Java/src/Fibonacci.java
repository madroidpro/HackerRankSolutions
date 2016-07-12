import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by madroid on 23-06-2016.
 */
public class Fibonacci {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        int N = scan.nextInt();
       BigInteger b[] = new BigInteger[2];
        b[0]=A;
        b[1]=B;
        BigInteger result;
        for(int i=0;i<N-2;i++){
            result = b[1].pow(2).add(b[0]);
            b[0]=b[1];
            b[1] = result;
        }
        System.out.println(b[1]);
    }
}
