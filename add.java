import java.util.*;
public class add{
    public static int sum(int num1 , int num2){//parameters or formal parameters
        int addition=num1+num2;
        return addition;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=sum(a,b);//arguments or actual parameters
        System.out.println(sum);
        
    }
}