import java.util.*;
public class continue1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            if(i==6){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
        }
    }