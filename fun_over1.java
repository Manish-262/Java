public class fun_over1{
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;//return false
            }
        }
        return isPrime;//return true
    }
    public static void primesrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primesrange(16);
    }

}