import java.util.Scanner;

/**
 * Created by madroid on 23-06-2016.
 */
public class Sherlock {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int z = n;
            while(z%3!=0) {
                z -= 5;
            }
            if(z<0)
                System.out.println("-1");
            else{
                String s=new String(new char[z]).replace("\0", "5")+new String(new char[n-z]).replace("\0", "3");
                System.out.println(s);
            }

        }
    }
}
