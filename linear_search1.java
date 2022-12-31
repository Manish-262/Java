import java.util.*;
public class largest_numarray{
    public static int largest(int num[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(large<num[i]){
                large=num[i];
            }
        return large;
    }

    }
    public static void main(String args[]){
        int num[] = {2,4,1,8,111};
        System.out.println("Largest value in array is = " + largest(num));
    }
}