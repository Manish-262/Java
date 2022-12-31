import java.util.*;
public class palindrome{
    public static void palin(int n){
        int r;
        int re=0;
        while(n>0){
            r=n%10;
            re=re*10+r;
            n=n/10;
        }
        System.out.println("Palindrome of" + n + "is" +re);
    }
    public static void main(String args[]){
    palin(121);
    }
}