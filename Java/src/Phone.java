import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by madroid on 30-06-2016.
 */
public class Phone {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> pd = new HashMap<String,Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            pd.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();

            if(pd.get(s) != null){
                System.out.println(pd.get(s));
            }else{
                System.out.println("not found");
            }
            // Write code here
        }
        in.close();
    }
}
