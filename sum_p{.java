public class sum_p{
    public static int sumofdigits{int n}{
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        sumofdigits(121);
    }
}