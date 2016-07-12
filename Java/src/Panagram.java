import java.util.Scanner;

/**
 * Created by madroid on 01-07-2016.
 */
public class Panagram {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        Panagram p = new Panagram();
        System.out.println(p.pan(s.toLowerCase()));
    }

    private String pan(String s) {
        if(s.length() < 26)
            return "not pangram";
        else{
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s.indexOf(ch) < 0) {
                    return "not pangram";
                }
            }
            return "pangram";
        }

    }


}
