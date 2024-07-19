import java.lang.*;
import java.util.*;

public class WhileAndDoWhile{
    
    public static void main(String[] args){
        //
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int n1 = sc.nextInt();

        while(n1 >= 0) {
            System.out.println(i);
            i = i*2;
            n1--;
        }

        int j = 1;
        int n2 = sc.nextInt();
        
        do {
            System.out.println(j);
            j = j*2;
            n2--;
        } while (n2 >= 0);



    }

}