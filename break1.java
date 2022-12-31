import java.util.*;
public class break1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
        }
    }