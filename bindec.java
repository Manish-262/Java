public class bindec{
    public static void bindeci(int binnum){
        int num = binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int ld=binnum%10;
            decnum=decnum+(ld*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("decnum of " + num + " is " + decnum);
    }
    public static void main(String args[])
    {
        bindeci(101);
    }
}