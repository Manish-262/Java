import java.util.*;
public class tax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float income=sc.nextFloat();
        float tax;
        if(income<500000){
            tax=(float)income*0.00f;
        }
        else if(income>=500000 && income<1000000){
            tax=(float)income*0.20f;
        }
        else{
            tax=(float)income*0.30f;
        }
        System.out.println(tax);
    }
}