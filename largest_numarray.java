import java.util.*;
public class largest_numarray{
    public static int getlargest(int num[]){
        int large=Integer.MIN_VALUE;//-infinite
        int small=Integer.MAX_VALUE;//+infinte
        for(int i=0;i<num.length;i++){
            if(large<num[i]){
                large=num[i];
            }
            if(small>num[i]){
                small=num[i];
            }
        }
        System.out.println("Smallest value is = " +small);
        return large;
    
    }
    public static void main(String args[]){
        int num[] = {2,4,1,8,111};
        System.out.println("Largest value in array is = " + getlargest(num));
    }
}