import java.util.*;
public class sum_integer{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int esum=0;
        int osum=0;
        do{
            System.out.println("Enter the number");
            number = sc.nextInt();
            if(number%2==0){
                esum+=number;
            }
            else{
                osum+=number;
            }
            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even numbers: "+esum);
        System.out.println("Sum of even numbers: "+osum);

    }
}