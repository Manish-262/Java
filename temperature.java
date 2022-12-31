import java.util.*;
public class temperature{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num=sc.nextDouble();
        if(num>=100.3){
            System.out.println("fever");
        }
        else{
            System.out.println("not fever");
        }
    }
}