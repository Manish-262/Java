import java.util.*;
public class practice_set{
    public static void factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);

    }
}