import java.util.*;
public class age{
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("age belongs to adult person");
        }
        else{
            System.out.println("not adult");
        }
    }
}