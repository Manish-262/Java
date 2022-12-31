import java.util.*;
public class linear_search {
    public static int LinearSearch(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("Enter numbers");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter key");
        int key =sc.nextInt();
        int index = LinearSearch(num,key);
        if(index==-1){
            System.out.println("Not Founded");
        }
        else{
            System.out.println("Key founded at index " + index);
           }
    }
}
