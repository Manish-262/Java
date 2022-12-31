//import java.util.*;
public class swap{
    public static void swapping(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a= " +a);
        System.out.println("b= " +b);
    }
    public static void main(String args[]){
        int a = 5;
        int b = 2;
        swapping(a,b);
    }
}