public class subarray{
    public static void printsubarray(int num[]){
        int t=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+"");
                }
                t++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Totatl Subarray="+t);
    }
    public static void main(String args[]){
        int num[]={2,4,8,10};
        printsubarray(num);
    }
}