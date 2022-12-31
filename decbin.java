public class decbin{
    public static void decibin(int decnum){
        int num=decnum;
        int pow=0;
        int binnum=0;
        while(decnum>0){
            int rem=decnum%2;
            binnum=binnum+(rem*(int)Math.pow(10,pow));
            pow++;
            decnum=decnum/2;
        }
        System.out.println("binary number of " + num + " is " + binnum);
    }
    public static void main(String args[]){
        decibin(5);
        
    }
}