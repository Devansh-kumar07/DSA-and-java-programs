package LOOPS;
import java.util.Scanner;
public class Print_one_to_n_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for( int i = 1 ; i <= n ; i++){
            System.out.println(i);
        }
    }
    
}
