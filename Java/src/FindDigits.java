import java.util.Scanner;

/**
 * Created by madroid on 23-06-2016.
 */
public class FindDigits {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int i=n;
            int digits=0;
            while(i>0){
                if(n%(i%10)==0){
                    digits++;
                }
                i/=10;
            }
            System.out.println(digits);

        }
    }
}
