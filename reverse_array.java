public class reverse_array{
    public static void reverse(int num[]){
        int f=0;
        int l=num.length-1;
        while(f<l){
            int temp=num[l];
            num[l]=num[f];
            num[f]=temp;
            f++;
            l--;
        }
    }
    public static void main(String args[]){
        int num[] = { 2,4,1,11};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}