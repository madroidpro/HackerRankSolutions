import java.util.Scanner;

/**
 * Created by madroid on 21-06-2016.
 */
public class Example {

    public void ladder(int n){
        int i=0;
        while(i<n){
            int j;
            for(j=i;j<n-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }

    public int nibbler(int x){
        return (x << 4 | x >> 4);
    }

    public static void main(String args[]){
        Example e = new Example();
        e.ladder(12);
        System.out.println(e.nibbler(100));
        Scanner scan = new Scanner(System.in);
        int len=scan.nextInt();
        int matrix[][]=new int[len+1][len+1];

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                matrix[i][j]=scan.nextInt();
            }
        }

         int sum1=0;
        for(int i =0;i<len;i++){
            for(int j=0;j< len;j++){
                if(i == j){
                    sum1+=matrix[i][j];
                }
            }
        }
        int sum2 = 0;
        for(int i=0,j = len-1 ; i<len;i++,j--){
            System.out.println("("+i+","+j+")");
            sum2+=matrix[i][j];
        }
       /* for(int i=0;i<len;i++){1
            for(int j=len;j>0;j--){
             sum2+= matrix[i][j];
            }
        }*/



        System.out.println(sum1);
        System.out.println(sum2);
        /*String input = scan.nextLine();

        //Generate lexographic Strings
        List<String>list=new ArrayList<String>();
        int len1=input.length();
        for(int i=0;i<len1-1;i++){
            list.add(input.substring(i));
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-1));*/
    }


}