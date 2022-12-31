import java.util.*;
public class practice_set{
    public static void palindrome(int n){
        int p=0;
        int ld;
        while(n>0){
            ld=n%10;
            p=p*10+ld;
            n=n/10;
        }
        System.out.println(p);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        palindrome(n);

    }
}