package LOOPS;
import java.util.*;

public class highest_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hf = 1 ; 
        for (int i = n-1; i >= 1; i--) {
            if( n % i == 0 ){
                hf = i;
                break;
            }  
        }  
    System.out.println(hf);
    }    
}
