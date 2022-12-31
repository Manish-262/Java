import java.util.*;
public class binomial{
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int BinCoeff(int n, int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nr_fact=fact(n-r);
        int BinCoeff = n_fact/(r_fact*nr_fact);
        return BinCoeff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(BinCoeff(n,r));
    }
}